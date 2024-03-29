package cn.com.kgc.tancoo.businessmanager.dao;

import java.util.List;

import cn.com.kgc.tancoo.businessmanager.entity.Admin;

public interface AdminDao {
	/**
	 * 获得所有管理用户
	 * @return 
	 */
	List<Admin> getAll();
	/**
	 * 添加新的管理员
	 * @param ad 要添加的管理员
	 * @return 返回0添加失败
	 */
	int add(Admin ad);
	/**
	 * 删除管理员
	 * @param id 要删除的管理员的编号
	 * @return
	 */
	int delete(int id);
	/**
	 * 修改管理员
	 * @param id 要修改的管理员的编号
	 * @return
	 */
	int update(Admin ad);
}
