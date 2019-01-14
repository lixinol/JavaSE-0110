package day04;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr=new int [10];
        arr[0]=111;
        for (int n :arr){
            System.out.println(n);
        }
        String [] strings={"hello","hi"};
        for(String s :strings)
        {
            System.out.println(s);
        }
        Object [] obj={1,"hello",3};
        for(Object b :obj){
            System.out.println(b);
        }
    }


}
