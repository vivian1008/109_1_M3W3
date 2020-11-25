import java.util.Scanner;

public class M3Q10{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] dataA = new int[4];
        for(int i = 3 ; i >= 0 ; i--){
            dataA[i] = a % 10;
            a /= 10;
        }
        String[][] data ={
            {
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"},
            {
                "    *",
                "    *",
                "    *",
                "    *",
                "    *"},
            {
                "*****",
                "    *",
                "*****",
                "*    ",
                "*****"},
            {
                "*****",
                "    *",
                "*****",
                "    *",
                "*****"},
            {
                "*   *",
                "*   *",
                "*****",
                "    *",
                "    *"},
            {
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"},
            {
                "*****",
                "*    ",
                "*****",
                "*   *",
                "*****"},
            {
                "*****",
                "    *",
                "    *",
                "    *",
                "    *"},
            {
                "*****",
                "*   *",
                "*****",
                "*   *",
                "*****"},
            {
                "*****",
                "*   *",
                "*****",
                "    *",
                "*****"}};
        for(int j=0 ; j<5 ; j++){
            for(int i=0 ; i<4 ; i++){
                System.out.print(data[dataA[i]][j]+"\t");
            }
            System.out.println();
        }
    }

}
