package com.fresh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresh.bean.Users;
import com.fresh.bean.UsersExample;
import com.fresh.dao.UsersMapper;
import com.fresh.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {

	 @Autowired
	  UsersMapper usersMapper;

	  public boolean selectByUname(String uName)
	  {
	    UsersExample usersExample = new UsersExample();
	    UsersExample.Criteria createCriteria = usersExample.createCriteria();
	    createCriteria.andUNameEqualTo(uName);
	    List<Users> selectByExample = usersMapper.selectByExample(usersExample);

	    if (!selectByExample.isEmpty()) {
	      return true;
	    }
	    return false;
	  }

	  public void insert(Users record)
	  {
	    this.usersMapper.insert(record);
	  }

	  public boolean selectByUnameAndUpwd(Users record)
	  {
	    UsersExample example = new UsersExample();
	    UsersExample.Criteria createCriteria = example.createCriteria();
	    createCriteria.andUNameEqualTo(record.getuName());
	    createCriteria.andUPwdEqualTo(record.getuPwd());

	    List<Users> selectByExample = usersMapper.selectByExample(example);
	    if (!selectByExample.isEmpty()) {
	      return true;
	    }
	    return false;
	  }

}
