package com.fresh.service;

import com.fresh.bean.Users;

public interface IUsersService {

	public abstract boolean selectByUname(String paramString);

	public abstract void insert(Users paramUsers);

	public abstract boolean selectByUnameAndUpwd(Users paramUsers);

}
