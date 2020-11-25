import java.util.Scanner;

public class M3Q9{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a = n;
        int b = m;
//============No.1=================
        while(m > 0){
            int x = n % m;
            n = m;
            m = x;
        }
        System.out.println(n);
//============No.2=================
        System.out.println(fun(a,b));
    }
    public static int fun(int a , int b){
        if(b > 0){
            return  fun(b , a % b);
        }
        else{
            return a;
        }
    }
}