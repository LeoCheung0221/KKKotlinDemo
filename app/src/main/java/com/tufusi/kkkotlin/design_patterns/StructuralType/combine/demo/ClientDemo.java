package com.tufusi.kkkotlin.design_patterns.StructuralType.combine.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ClientDemo {
    public static void main(String[] args) {
        //CEO
        ConcreteCompany root = new ConcreteCompany("张三", "CEO", 100000);
        //部门经理
        ConcreteCompany devDep = new ConcreteCompany("李四", "研发部经理", 50000);
        ConcreteCompany saleDep = new ConcreteCompany("王五", "销售部经理", 60000);
        ConcreteCompany financeDep = new ConcreteCompany("马六", "财务部经理", 40000);

        //部门员工
        Employee e1 = new Employee("AA","研发部",3000);
        Employee e2 = new Employee("BB","研发部",4000);
        Employee e3 = new Employee("CC","研发部",5000);
        Employee e4 = new Employee("DD","研发部",6000);
        Employee e5 = new Employee("EE","销售部",2500);
        Employee e6 = new Employee("FF","销售部",3500);
        Employee e7 = new Employee("GG","销售部",4500);
        Employee e8 = new Employee("HH","财务部",1800);
        Employee e9 = new Employee("II","财务部",3800);

        // 生成树
        root.add(devDep);
        root.add(saleDep);
        root.add(financeDep);

        devDep.add(e1);
        devDep.add(e2);
        devDep.add(e3);
        devDep.add(e4);

        saleDep.add(e5);
        saleDep.add(e6);
        saleDep.add(e7);

        financeDep.add(e8);
        financeDep.add(e9);

        // 显示公司层次
        System.out.println(root.getInfo());

        display(root);
    }

    private static void display(ConcreteCompany root) {
        for (Company c : root.getCompanyList()) {
            if (c instanceof Employee){
                System.out.println(c.getInfo());
            }else{
                System.out.println(c.getInfo());
                display((ConcreteCompany) c);
            }
        }
    }
} 