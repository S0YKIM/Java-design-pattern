package ex02.dao.mysql;

import ex02.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    private String dbType = "MYSQL";

    @Override
    public void insert(String userName) {
        System.out.println("insert into " + dbType + " DB userName = " + userName);
    }

    @Override
    public void update(String userName) {
        System.out.println("update into " + dbType + " DB userName = " + userName);
    }

    @Override
    public void delete(String userName) {
        System.out.println("delete into " + dbType + " DB userName = " + userName);
    }
}
