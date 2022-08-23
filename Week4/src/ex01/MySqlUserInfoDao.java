package ex01;

public class MySqlUserInfoDao extends UserInfoDao{
    UserInfo    userInfo;

    public void insertUserInfo(UserInfo temp) {
        userInfo = temp;
    }

    public void updateUserInfo(UserInfo temp){
        userInfo = temp;
    }

    public void deleteUserInfo(UserInfo temp) {
        userInfo = null;
    }
}
