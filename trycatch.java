public class trycatch { 
    public static void main(String[] args) {
        try {
            int a = 9 ;
            int b = 0;
        int result  = a/b ;
        System.out.println("Result: "+ result);
    } catch (Exception e) {
        System.out.println("Caught Exception: "+e.getMessage());
        } 
     }
 }
 
 