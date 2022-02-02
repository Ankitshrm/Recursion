import java.util.Scanner;

public class RecursiveDec{
    private static void Dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Dec(n-1);
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        Dec(n);
        ip.close();
    }
}