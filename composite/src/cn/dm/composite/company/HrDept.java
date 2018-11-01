package cn.dm.composite.company;

/**
 * 叶子节点-人力部门
 */
public class HrDept extends Company {
    public HrDept(String name) {
        super(name);
    }

    @Override

    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + "    负责员工招聘管理培训");
    }
}
