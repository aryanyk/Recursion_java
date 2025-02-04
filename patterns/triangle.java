
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

    static void selection(int[] arr, int r, int c, int max) {
        // Base case: if r is 0, sorting is complete
        if (r == 0) {
            return;
        }
    
        // If c is less than r, we are still looking for the maximum in this pass
        if (c < r) {
            // Update max if current element is greater than current max
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c); // New max found
            } else {
                selection(arr, r, c + 1, max); // Keep current max
            }
        } else {
            // Swap the found maximum with the last element of the unsorted part
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
    
            // Recursively call for the next pass
            selection(arr, r - 1, 0, 0); // Reset c and start looking for new max
        }
    }
    
    

    public static void main(String[] args) {
        pattern(5,0);
        pattern2(5,0);
        int[] arr ={1,5,3,6,2};
        // bubble(arr, arr.length-1, 0);
        selection(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    

    }
