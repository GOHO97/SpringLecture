package com.ho.db.manager;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Abcdefu {
	public static SqlSession hi(String cfgFileName) throws IOException {
		InputStream is = Resources.getResourceAsStream(cfgFileName);
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(is);
		return ssf.openSession();
	}
}
