package cn.dm.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类树枝节点
 */
public class ConcreteCompany extends Company {
    public ConcreteCompany(String name) {
        super(name);
    }

    private List<Company> childrenCompany = new ArrayList<Company>();

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
        childrenCompany.stream().forEach((com) -> {
            com.display(depth + 1);
        });
    }

    @Override
    public void lineofDuty() {
        childrenCompany.stream().forEach((com) -> {
            com.lineofDuty();
        });
    }
}
