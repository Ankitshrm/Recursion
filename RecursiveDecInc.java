import java.util.Scanner;

public class RecursiveDecInc {

    private static void PID(int n){
        if(n==0) return;
        System.out.println(n);
        PID(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        PID(n);
        ip.close();
    }
}
