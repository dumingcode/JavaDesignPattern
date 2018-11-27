package cn.dm.factory;

public class AccessUser implements IUser {
    @Override
    public void insert(String user) {
        System.out.println("access insert user" + user);
    }

    @Override
    public String getUser(int id) {
        System.out.println("access getUser" + id);
        return null;
    }
}
