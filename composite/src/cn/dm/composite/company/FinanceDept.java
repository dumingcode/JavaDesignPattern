package cn.dm.composite.company;

/**
 * 叶子节点财务部
 */
public class FinanceDept extends Company {
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
        System.out.println(name + "   负责公司财务收支管理");
    }

    public FinanceDept(String name) {
        super(name);
    }
}
