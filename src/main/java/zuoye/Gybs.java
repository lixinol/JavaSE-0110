package zuoye;
import java.util.Scanner;
public class Gybs {
    public static int yueshu(int a, int b) {
        int max, min;
        max = (a > b) ? a : b;
        min = (a < b) ? a : b;

        if (max % min != 0) {
            return yueshu(min,max%min);
        } else
            return min;

    }

    // 最小公倍数
    public static int beishu(int a, int b) {
        return a * b / yueshu(a, b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("(" + n1 + "," + n2 + ")" + "=" + yueshu(n1, n2));
        System.out.println("[" + n1 + "," + n2 + "]" + "=" + beishu(n1, n2));

    }
}
