package ex02.userinfo.web;

import ex02.UserInfo;
import ex02.dao.UserInfoDao;
import ex02.dao.mysql.UserInfoMySqlDao;
import ex02.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) {
        UserInfo kim = new UserInfo();
        UserInfoDao dao;
        kim.setUserId("12345");
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("/Users/soyeon/Desktop/Coding/Java-design-pattern/Week2/src/ex02/userinfo/web/db.properties"));
            String dbType = prop.getProperty("DBTYPE");
            if (dbType.equals("MYSQL")) {
                dao = new UserInfoMySqlDao();
                dao.insert(kim.getUserName());
                dao.update(kim.getUserName());
                dao.delete(kim.getUserName());
            } else {
                dao = new UserInfoOracleDao();
                dao.insert(kim.getUserName());
                dao.update(kim.getUserName());
                dao.delete(kim.getUserName());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}