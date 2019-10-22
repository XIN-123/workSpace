package cn.com.kgc.tancoo.businessmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Product {
	private int proId;//鍟嗗搧缂栧彿
	private String proName;//鍟嗗搧鍚嶇О
	private int proType;//鍟嗗搧绫诲瀷
	private String proDescription;//鍟嗗搧鎻忚堪
	private String proSimg;//鍟嗗搧灏忓浘鐗�
	private String proBimg;//鍟嗗搧澶у浘鐗�
	private double proPrice;//鍟嗗搧浠锋牸
	private String proParam;//鍟嗗搧鐨勭粏鑺傛弿杩� 鐢ㄨ嫳鏂�,鍒嗗紑
	private String ptypeName;//鍟嗗搧绫诲埆
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProType() {
		return proType;
	}
	public void setProType(int proType) {
		this.proType = proType;
	}
	public String getProDescription() {
		return proDescription;
	}
	public void setProDescription(String proDescription) {
		this.proDescription = proDescription;
	}
	public String getProSimg() {
		return proSimg;
	}
	public void setProSimg(String proSimg) {
		this.proSimg = proSimg;
	}
	public String getProBimg() {
		return proBimg;
	}
	public void setProBimg(String proBimg) {
		this.proBimg = proBimg;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProParam() {
		return proParam;
	}
	public void setProParam(String proParam) {
		this.proParam = proParam;
	}
	public String getPtypeName() {
		return ptypeName;
	}
	public void setPtypeName(String ptypeName) {
		this.ptypeName = ptypeName;
	}
	public Product(int proId, String proName, int proType, String proDescription, String proSimg, String proBimg,
			double proPrice, String proParam, String ptypeName) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proType = proType;
		this.proDescription = proDescription;
		this.proSimg = proSimg;
		this.proBimg = proBimg;
		this.proPrice = proPrice;
		this.proParam = proParam;
		this.ptypeName = ptypeName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
