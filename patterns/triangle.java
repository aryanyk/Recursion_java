import java.lang.reflect.Array;
import java.util.Arrays;

public class triangle{

    static void pattern(int r , int c){
        if(r==0){
            return ;
        }

        if(c<r){
            System.out.print('X');
            pattern(r,c+1);
        }else{
            System.out.println();
            pattern(r-1,0);
        }
    }

    // normal triangle
    static void pattern2(int r , int c){
        if(r==0){
            return ;
        }

        if(c<r){
            pattern2(r,c+1);
            System.out.print('X');
            
        }else{
            pattern2(r-1,0);
            System.out.println();
            
        }
    }

    static void bubble(int[] arr ,int r , int c){
        if(r==0){
            return ;
        }
        if(c <r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] =arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }
    public static void main(String[] args) {
        pattern(5,0);
        pattern2(5,0);
        int[] arr ={1,5,3,6,2};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    

    }
