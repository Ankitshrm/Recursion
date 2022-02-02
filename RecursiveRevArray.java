import java.util.Scanner;

public class RecursiveRevArray {
    private static void printRevArray(int[] a,int n){
        if(n==a.length) return ;
        printRevArray(a, n+1);
        
        System.out.println(a[n]);
        
    }
    public static void main(String[] args) {
        
        Scanner ip =new Scanner(System.in);
        int a[]={10,20,30,40,50};
        printRevArray(a,0);
        ip.close();

    }
}
