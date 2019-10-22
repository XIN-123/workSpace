package cn.com.kgc.tancoo.businessmanager.dao;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import lombok.Getter;

public class BaseDao {
	
	public static DataSource ds = new ComboPooledDataSource();
	public static DataSource getDs() {
		return ds;
		
	}
}
