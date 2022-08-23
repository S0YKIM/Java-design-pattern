package ex01;

public class UserInfo {
    String id;
    String pw;
    String name;

    public void setUserId(String temp){
        id = temp;
    }
    public String getUserId(){
        return id;
    }

    public void setPasswd(String temp){
        pw = temp;
    }
    public String getPasswd(){
        return pw;
    }

    public void setUserName(String temp){
        name = temp;
    }
    public String getUserName(){
        return name;
    }
}
