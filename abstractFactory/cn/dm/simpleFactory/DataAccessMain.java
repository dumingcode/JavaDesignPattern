package cn.dm.simpleFactory;

import cn.dm.factory.IUser;

public class DataAccessMain {
    public static void main(String[] args) {
        IUser sqlServerUser = DataAccess.createUser();
        sqlServerUser.insert("sqlServer User");
        sqlServerUser.getUser(1);
    }
}
