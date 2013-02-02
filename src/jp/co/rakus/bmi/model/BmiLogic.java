package jp.co.rakus.bmi.model;
/**
 * BMIを計算するクラスです.
 * @author rks-user
 *
 */
public class BmiLogic {

	//BMIを計算するメソッド
	public double calcBmi(User user){
		//体重を取得
		Integer weight = user.getWeight();
		//身長を取得
		double height = user.getHeight();
		//BMI(体重÷身長の二乗)
		double bmi = weight / (height * height);
		//bmiの結果を戻す
		return bmi;
	}

}
