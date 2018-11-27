package cn.dm.factory;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(String department) {
        System.out.println("sql server insert" + department);
    }

    @Override
    public String getDepartment(int id) {
        System.out.println("sql server get department" + id);
        return null;
    }
}
