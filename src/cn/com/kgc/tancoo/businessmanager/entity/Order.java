package cn.com.kgc.tancoo.businessmanager.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Order {
	private int orderId;//璁㈠崟缂栧彿
	private String orderPro;//璁㈣喘鍟嗗搧鍚嶇О
	private int userId;//鐢ㄦ埛缂栧彿
	private String delAddr;//鍙戣揣鍦板潃
	private String userAddr;//鏀惰揣鍦板潃
	private Date orderTime;//璁㈣揣鏃堕棿
	private String orderBz;//澶囨敞
	private int orderStatu;//璁㈠崟鐘舵��
	private String orderStatus;//璁㈠崟鐘舵��
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderPro() {
		return orderPro;
	}
	public void setOrderPro(String orderPro) {
		this.orderPro = orderPro;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDelAddr() {
		return delAddr;
	}
	public void setDelAddr(String delAddr) {
		this.delAddr = delAddr;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderBz() {
		return orderBz;
	}
	public void setOrderBz(String orderBz) {
		this.orderBz = orderBz;
	}
	public int getOrderStatu() {
		return orderStatu;
	}
	public void setOrderStatu(int orderStatu) {
		this.orderStatu = orderStatu;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Order(int orderId, String orderPro, int userId, String delAddr, String userAddr, Date orderTime,
			String orderBz, int orderStatu, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderPro = orderPro;
		this.userId = userId;
		this.delAddr = delAddr;
		this.userAddr = userAddr;
		this.orderTime = orderTime;
		this.orderBz = orderBz;
		this.orderStatu = orderStatu;
		this.orderStatus = orderStatus;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
