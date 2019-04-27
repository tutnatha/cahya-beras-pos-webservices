package com.course.springbootstarter.dao;
import com.course.springbootstarter.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}