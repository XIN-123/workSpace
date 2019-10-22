package cn.com.kgc.tancoo.businessmanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Admin {
	private int adminId;
	private String adminName;
	private String adminPwd;
	private int adminAuth;
	private String userStatus;
	public Admin(String adminName, String adminPwd, int adminAuth) {
		super();
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminAuth = adminAuth;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public int getAdminAuth() {
		return adminAuth;
	}
	public void setAdminAuth(int adminAuth) {
		this.adminAuth = adminAuth;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String adminName, String adminPwd, int adminAuth, String userStatus) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminAuth = adminAuth;
		this.userStatus = userStatus;
	}
	
	
	
}
