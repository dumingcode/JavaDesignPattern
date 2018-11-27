package cn.dm.factory;

public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepart() {
        return new SqlserverDepartment();
    }
}
