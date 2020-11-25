import java.util.Scanner;
import java.util.Random;

public class M3Q12{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        random.setSeed(scn.nextLong());
        int[] data = new int[6];
        int i = 0;
        while(i < 6){
            boolean flag = true;
            data[i]=random.nextInt(42)+1;
            for(int j = 0; j < i ;j++){
                if(data[i]==data[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                i++;
            }
        }
        for(int k:data){
            if(k==data[data.length - 1]){
                System.out.print(k);
            }else{
                System.out.print(k + "\t");
            }
        }
        System.out.println();
 
 
       
    }
}

