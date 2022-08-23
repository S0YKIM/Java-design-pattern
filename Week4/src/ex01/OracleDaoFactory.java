package ex01;

public class OracleDaoFactory extends DaoFactory{
    public OracleDaoFactory() {
        System.out.println("Oracle dao factory constructed!");
    }
    @Override
    public UserInfoDao  createUserInfoDao() {
        return new OracleUserInfoDao(); }
    @Override
    public ProductDao   createProductDao() {
        return new OracleProductDao(); }
}
