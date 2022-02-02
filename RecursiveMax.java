import java.util.Scanner;

public class RecursiveMax {

    private static int Max(int a[],int n){
        
        if(n==a.length-1) return a[n];
        int m1=Max(a, n+1);
        
        
        
        if(m1>a[n]){
            return m1;
        }
        else{
            return a[n];
        }


       
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=ip.nextInt();
        }

        int ans=Max(a,0);
        System.out.println(ans);
        ip.close();
    }

}
