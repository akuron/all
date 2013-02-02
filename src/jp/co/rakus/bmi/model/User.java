package jp.co.rakus.bmi.model;
/**
 * ユーザーが入力した情報を格納するクラスです.
 * @author rks-user
 *
 */
public class User {

	/** 名前 */
	private String name;
	/** 体重 */
	private Integer weight;
	/** 身長 */
	private double height;
	/** bmi */
	private double bmi;


	//引数のないコンストラクタ
	public User(){

	}

	//引数あり
	public User(String name, Integer weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}



	/**
	 * @return bmi
	 */
	public double getBmi() {
		return bmi;
	}

	/**
	 * @param bmi セットする bmi
	 */
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return weight
	 */
	public Integer getWeight() {
		return weight;
	}
	/**
	 * @param weight セットする weight
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height セットする height
	 */
	public void setHeight(double height) {
		this.height = height;
	}



}
