import java.util.Scanner;

public class RecursiveFirstOccurance {

    private static int FirstOccur(int a[],int key,int n){

        if(n==a.length) return -1;

        
        if(a[n]==key) return n;
        else {
            int ans =FirstOccur(a, key, n+1);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();

        }

        int key=ip.nextInt();


        int ans =FirstOccur(a,key,0);
        System.out.println(ans);
        ip.close();

    }
}
