package com.fresh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fresh.bean.Users;
import com.fresh.dao.UsersMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UsersMapper userMapper;
	
	/**
	 * 
	 */
	@Test
	public void test(){
		
//		Users user = new Users();
//		user.setuId(1);
//		user.setRealName("江泉");
//		user.setuName("admin");
//		user.setImgpath("dhakdhakdjlka");
//		user.setuEmail("2668750226@qq.com");
//		
//		int insert = userMapper.insert(user);
//		System.out.println(insert);
		Users selectByPrimaryKey = userMapper.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
		
	}
	
}
