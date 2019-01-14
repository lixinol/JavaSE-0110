package day04;

import sun.awt.geom.AreaOp;

public class Human {
    public String name;
    protected int age;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void study()
    {
        test();
        System.out.println(name +"is working...");
    }

    public void work()
    {
        test();
        System.out.println(name+"is work...");
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void test()
    {

    }
}
