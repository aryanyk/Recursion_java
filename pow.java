import java.util.Scanner;

public class pow{

    static int get_power(int x ,int n){
        if(n==0){
            return 1;
        }
        int xnm1 = get_power(x, n-1);
        int xn = xnm1*x;
        return xn;
    }

    static int log_power(int x ,int n){
        if(n==0){
            return 1;
        }
        int xpnb2 =log_power(x,n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1){
            xn = xn*x;
        }
        return xn;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val =sc.nextInt();
    int n =sc.nextInt();
    int ans = log_power(val, n);
    System.out.println(ans);
    sc.close();
    }
}
