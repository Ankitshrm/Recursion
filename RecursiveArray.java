import java.util.Scanner;

public class RecursiveArray {
    private static void printArray(int[] a,int n){
        if(n==a.length) return;
        System.out.println(a[n]);
        printArray(a, n+1);
        
    }
    public static void main(String[] args) {
        
        Scanner ip =new Scanner(System.in);
        int a[]={10,20,30,40,50};
        printArray(a,0);
        ip.close();

    }
}
