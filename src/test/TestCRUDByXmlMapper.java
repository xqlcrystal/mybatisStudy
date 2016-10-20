package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.crystal.domain.User;
import org.junit.Ignore;
import org.junit.Test;

public class TestCRUDByXmlMapper {

	@Ignore
	@Test
	public void testAdd() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		String statement="org.crystal.mapping.UserMapper.addUser";
		User user=new User();
		user.setName("zugeliang");
		user.setAge(56);
		int result=session.insert(statement, user);
		session.close();
		System.out.println(result);
	}
	
	@Ignore
	@Test
	public void testUpdate() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		String statement="org.crystal.mapping.UserMapper.updateUser";
		User user=new User();
		user.setId(4);
		user.setName("zhouyu");
		user.setAge(45);
		int result=session.update(statement, user);
		session.close();
		System.out.println(result);
	}
	
	@Ignore
	@Test
	public void testDelete() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		String statement="org.crystal.mapping.UserMapper.deleteUser";
		int userid=4;
		int result=session.update(statement, userid);
		session.close();
		System.out.println(result);
	}
	
	@Test
	public void testGetAll() throws IOException {
		SqlSession session=MyBatisUtil.getSqlSession();
		String statement="org.crystal.mapping.UserMapper.getAllUsers";
		
		List<User> listUser=session.selectList(statement);
		session.close();
		System.out.println(listUser);
	}


}
