public class reverse{

    static int sum =0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum =sum*10+rem;
        rev(n/10);
    }

    static boolean palin(int n){
        sum=0;
        rev(n);
        return n == sum;
    }
    public static void main(String[] args) {
        
        int n = 12321;
        rev(n);
        System.out.println(sum);
        System.out.println(palin(n));
    }

}
