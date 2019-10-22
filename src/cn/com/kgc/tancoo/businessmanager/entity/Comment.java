package cn.com.kgc.tancoo.businessmanager.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Comment {
	private int comId;
	private String comName;
	private int userId;
	private String comTitle;
	private String comContent;
	private Date comTime;
	private double comScore;
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getComTitle() {
		return comTitle;
	}
	public void setComTitle(String comTitle) {
		this.comTitle = comTitle;
	}
	public String getComContent() {
		return comContent;
	}
	public void setComContent(String comContent) {
		this.comContent = comContent;
	}
	public Date getComTime() {
		return comTime;
	}
	public void setComTime(Date comTime) {
		this.comTime = comTime;
	}
	public double getComScore() {
		return comScore;
	}
	public void setComScore(double comScore) {
		this.comScore = comScore;
	}
	public Comment(int comId, String comName, int userId, String comTitle, String comContent, Date comTime,
			double comScore) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.userId = userId;
		this.comTitle = comTitle;
		this.comContent = comContent;
		this.comTime = comTime;
		this.comScore = comScore;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
