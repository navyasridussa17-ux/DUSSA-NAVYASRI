public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        String star="*" ;
        String space=" " ;
        for(int i=1;i<=n; i++) {
            System.out.print(star.repeat(i));
            System.out.print(space.repeat(2*(n-i)));
            System.out.println(star.repeat(i));
        }
        for(int i=n-1;i>=n; i--) {
            System.out.print(star.repeat(i));
            System.out.print(space.repeat(2*(n-i)));
            System.out.println(star.repeat(i));
        }
        
    }
}