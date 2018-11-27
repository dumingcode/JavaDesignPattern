package cn.dm.factory;

public class FactoryMain {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IUser iUser = factory.createUser();
        iUser.insert("access user");
        iUser.getUser(1);

        IDepartment iDepart = factory.createDepart();
        iDepart.insert("access depart");
        iDepart.getDepartment(1);


        // sqlserver
        factory = new SqlserverFactory();
        iUser = factory.createUser();
        iUser.insert("sqlserver user");
        iUser.getUser(1);

        iDepart = factory.createDepart();
        iDepart.insert("sqlserver depart");
        iDepart.getDepartment(1);


    }
}
