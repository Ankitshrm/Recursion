import java.util.Scanner;

public class RecursiveInc {

    private static void RI(int n){
        if(n==0){
            
            return;
        }
        RI(n-1);
        System.out.println(n);  
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        RI(n);
        ip.close();
    }
}
