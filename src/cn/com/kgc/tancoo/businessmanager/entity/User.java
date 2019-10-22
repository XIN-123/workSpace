package cn.com.kgc.tancoo.businessmanager.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class User {
	private int userId;//缂栧彿
	private String userName;//鐢ㄦ埛鍚�
	private String userPwd;//瀵嗙爜
	private String userAddr;//鍦板潃
	private String userPhone;//鐢佃瘽鍙风爜
	private String userTruename;//鐪熷疄濮撳悕
	private String userSex;//鎬у埆
	private String  userBirthday;//鍑虹敓骞存湀
	private Date userRegtime;//娉ㄥ唽鏃堕棿
	private int userType;//鐢ㄦ埛韬唤锛堜拱瀹�3锛屽崠瀹�4锛�
	private int userStatus;//鐧婚檰鐘舵�� 榛樿0姝ｅ父1绂佺敤
	private String userStatu;//鐢ㄦ埛韬唤鍏蜂綋鍚嶅瓧
	public User(int userId, String userName, String userPwd, String userAddr, String userPhone, String userTruename,
			String userSex, String userBirthday, Date userRegtime, int userType, int userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAddr = userAddr;
		this.userPhone = userPhone;
		this.userTruename = userTruename;
		this.userSex = userSex;
		this.userBirthday = userBirthday;
		this.userRegtime = userRegtime;
		this.userType = userType;
		this.userStatus = userStatus;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserTruename() {
		return userTruename;
	}
	public void setUserTruename(String userTruename) {
		this.userTruename = userTruename;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public Date getUserRegtime() {
		return userRegtime;
	}
	public void setUserRegtime(Date userRegtime) {
		this.userRegtime = userRegtime;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatu() {
		return userStatu;
	}
	public void setUserStatu(String userStatu) {
		this.userStatu = userStatu;
	}

}
