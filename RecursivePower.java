import java.util.Scanner;

public class RecursivePower {

    private static int RP(int n,int x){
        

        if(n==0) return 1;
        int ans = RP(n-1,x);
        int fans =ans*x;
        return fans;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int x=ip.nextInt();

        int ans=RP(n,x);
        System.out.println(ans);

        ip.close();
    }
}
