import java.util.Scanner;

public class RecursiveTOH {
    private static void TOH(int n,int a,int b,int c){
        
        if(n==0) return;
        TOH(n-1, a,c,b);
        System.out.println(n+"->"+a+" - "+b);
        TOH(n-1,c,b,a);
    }
    public static void main(String[] args) {
        Scanner  ip =new Scanner(System.in);
        int n=ip.nextInt();
        int source=ip.nextInt();
        int destination=ip.nextInt();
        int helper =ip.nextInt();

        TOH(n,source,destination,helper);

        ip.close();
    }
}
