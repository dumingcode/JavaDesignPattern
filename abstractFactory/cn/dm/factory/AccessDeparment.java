package cn.dm.factory;

public class AccessDeparment implements IDepartment {
    @Override
    public void insert(String department) {
        System.out.println("access department" + department);
    }

    @Override
    public String getDepartment(int id) {
        System.out.println("access getDepartment" + id);
        return null;
    }
}
