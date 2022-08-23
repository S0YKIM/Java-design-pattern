package ex01;

public abstract class UserInfoDao {
    abstract void   insertUserInfo(UserInfo temp);

    abstract void   updateUserInfo(UserInfo temp);

    abstract void   deleteUserInfo(UserInfo temp);
}
