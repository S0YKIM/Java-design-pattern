package ex01;

public class MySqlDaoFactory extends DaoFactory {
    public MySqlDaoFactory() {
        System.out.println("MySql dao factory constructed!");
    }
    @Override
    public UserInfoDao  createUserInfoDao() {
        return new MySqlUserInfoDao(); }
    @Override
    public ProductDao   createProductDao() {
        return new MySqlProductDao(); }
}
