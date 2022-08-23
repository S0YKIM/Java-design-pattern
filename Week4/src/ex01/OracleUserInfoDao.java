package ex01;

public class OracleUserInfoDao extends UserInfoDao{
    UserInfo    userInfo;

    public void insertUserInfo(UserInfo temp) {
        userInfo = temp;
        System.out.println("");
    }

    public void updateUserInfo(UserInfo temp){
        userInfo = temp;
    }

    public void deleteUserInfo(UserInfo temp) {
        userInfo = null;
    }
}