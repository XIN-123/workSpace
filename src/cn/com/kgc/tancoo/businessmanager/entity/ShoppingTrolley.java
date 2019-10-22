package cn.com.kgc.tancoo.businessmanager.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ShoppingTrolley {
	private int troId;
	private int proId;
	private int userId;
	private Date troTime;
	public ShoppingTrolley(int troId, int proId, int userId, Date troTime) {
		super();
		this.troId = troId;
		this.proId = proId;
		this.userId = userId;
		this.troTime = troTime;
	}
	public ShoppingTrolley() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTroId() {
		return troId;
	}
	public void setTroId(int troId) {
		this.troId = troId;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getTroTime() {
		return troTime;
	}
	public void setTroTime(Date troTime) {
		this.troTime = troTime;
	}

}
