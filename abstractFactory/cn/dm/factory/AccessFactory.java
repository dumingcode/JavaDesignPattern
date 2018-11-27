package cn.dm.factory;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepart() {
        return new AccessDeparment();
    }
}
