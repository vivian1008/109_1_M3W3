import java.util.Scanner;

public class M3Q11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n) {
        if (n > 1) {
            return fun(n - 1) + fun((int)Math.floor(n / 2));
        }else {
            return n + 1;
        }
    }
    }
