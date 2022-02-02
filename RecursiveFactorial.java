import java.util.Scanner;

public class RecursiveFactorial {

    private static int PF(int n){
        if(n==0) return 1;
        int ans = n*(PF(n-1));
        return ans;

    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int fact =PF(n);
        System.out.println(fact);
        ip.close(); 
        
    }
}
