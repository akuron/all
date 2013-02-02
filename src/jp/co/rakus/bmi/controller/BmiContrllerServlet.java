package jp.co.rakus.bmi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.rakus.bmi.model.BmiLogic;
import jp.co.rakus.bmi.model.User;

/**
 * Servlet implementation class BmiContrllerServlet
 */
public class BmiContrllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BmiContrllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// GETできたら入力画面を表示する
		// 入力画面を表示（ﾌｫﾜｰﾄﾞ）
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/view/input.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// doPOSTの中で処理を書く

		// requestデータの値が文字化けしないようにエンコードをセット
		request.setCharacterEncoding("UTF-8");
		// actionの値を取得
		String action = request.getParameter("action");

		// もしactionがcalcBmiだったらBMIの計算をし、出力画面を表示する
		if (action.equals("calcBmi")) {

			// リクエストの値を取得
			String name = request.getParameter("name");
			Integer weight = Integer.parseInt(request.getParameter("weight"));
			double height = Double.valueOf(request.getParameter("height"));

			// Userオブジェクトを生成し、値を詰める
			User user = new User(name, weight, height);

			// BMI計算ロジッククラスに値の詰まったuserオブジェクトを渡す
			BmiLogic bmiLogic = new BmiLogic();
			double bmi = bmiLogic.calcBmi(user);

			// bmiの結果をUserクラスに追加
			user.setBmi(bmi);

			// name、weight、height、bmiが詰まったuserオブジェクトをリクエストスコープに格納
			request.setAttribute("user", user);

			// 出力画面を表示
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/view/output.jsp");
			dispatcher.forward(request, response);

		}

	}

}
