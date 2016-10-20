package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	public static SqlSession getSqlSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession session=sqlSessionFactory.openSession();
		return session;
	}
	
	public static SqlSession getSqlSession(Boolean isAutoCommit) throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession session=sqlSessionFactory.openSession(isAutoCommit);
		return session;
	}

	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource="conf.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
}
