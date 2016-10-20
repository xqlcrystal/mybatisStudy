package test;

import static org.junit.Assert.*;


import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.crystal.domain.User;
import org.junit.Ignore;
import org.junit.Test;

public class TestCRUDByAnnotationMapper {

	@Ignore
	@Test
	public void testAdd() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		UserMapperI userMapperI=session.getMapper(UserMapperI.class);
		User user=new User();
		user.setAge(34);
		user.setName("caocao");
		int add=userMapperI.add(user);
		session.close();
		System.out.println(add);
		
	}
	
	@Ignore
	@Test
	public void testdeleteById() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		UserMapperI userMapperI=session.getMapper(UserMapperI.class);
		int userid=5;
		int deleted=userMapperI.deleteById(userid);
		session.close();
		System.out.println(deleted);
		
	}
	
	@Ignore
	@Test
	public void testUpdate() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		UserMapperI userMapperI=session.getMapper(UserMapperI.class);
		User user=new User();
		user.setId(6);
		user.setAge(36);
		user.setName("caocao1");
		int add=userMapperI.update(user);
		session.close();
		System.out.println(add);
		
	}
	
	@Ignore
	@Test
	public void testgetById() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		UserMapperI userMapperI=session.getMapper(UserMapperI.class);
		int userid=6;
		User user=userMapperI.getById(userid);
		session.close();
		System.out.println(user);
		
	}
	
	@Test
	public void testgetAll() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		UserMapperI userMapperI=session.getMapper(UserMapperI.class);
		
		List<User> users=userMapperI.getAll();
		session.close();
		System.out.println(users);
		
	}

}
