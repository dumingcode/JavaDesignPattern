package cn.dm.factory;

public class SqlserverUser implements IUser {
    @Override
    public void insert(String user) {
        System.out.println("sql server insert user" + user);
    }

    @Override
    public String getUser(int id) {
        System.out.println("sqlserver getUser" + id);
        return null;
    }
}
