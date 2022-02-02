import java.util.Scanner;

public class RecursiveZigZag {
    private static void ZigZag(int n){

        if(n==0) return;
    
        System.out.println("Pre -"+n);
        ZigZag(n-1);
        System.out.println("In -"+n);
        ZigZag(n-1);
        System.out.println("Post -"+n);

    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        ZigZag(n);
        ip.close();
    }
}
