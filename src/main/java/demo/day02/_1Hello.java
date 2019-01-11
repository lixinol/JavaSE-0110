package demo.day02;

public class _1Hello {
    public static void main(String[] args) {

        String s1="hello";
        //String s2="Hello";

        String s2=new String("hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        boolean t=true;
        boolean f=false;
        System.out.println(t&f);//逻辑与
        System.out.println(t|f);
        System.out.println(t^f);
        System.out.println(t&&f);//条件与
        System.out.println(t||f);
        //逻辑“与或”和条件“与或”运算结果一样
    }
}
