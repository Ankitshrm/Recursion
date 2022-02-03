import java.util.Arrays;
import java.util.Scanner;

public class RecursiveAllOccurance {

    private static int [] AllOccur(int a[],int key,int n,int count){
        
        
        if(n==a.length) return new int[count];

        if(a[n]==key){
            int ans[]=AllOccur(a, key, n+1, count+1);
            ans[count]=n;
            return ans;
        }else{
            int ans[]=AllOccur(a, key, n+1,count);
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
        int ans[] =AllOccur(a,key,0,0);
        String s=Arrays.toString(ans);
        System.out.println(s);
        ip.close();

    }
}
