package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.crystal.domain.User;

public class Test {

	public static void main(String[] args) {
		try {
			SqlSession session = MyBatisUtil.getSqlSession();
			String statement="org.crystal.mapping.UserMapper.getUser";
			User user=session.selectOne(statement, 1);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
