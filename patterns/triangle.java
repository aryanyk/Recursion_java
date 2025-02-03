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
    public static void main(String[] args) {
        pattern(5,0);
        pattern2(5,0);
    }

    

    }
