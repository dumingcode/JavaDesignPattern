package cn.dm.simpleFactory;

import cn.dm.factory.*;

public class DataAccess {
    private static final String db = "sqlserver";

    public static IUser createUser() {
        switch (db) {
            case "sqlserver":
                return new SqlserverUser();
            case "access":
                return new AccessUser();
            default:
                return null;
        }
    }

    public static IDepartment createDepart() {
        switch (db) {
            case "sqlserver":
                return new SqlserverDepartment();
            case "access":
                return new AccessDeparment();
            default:
                return null;
        }
    }


}
