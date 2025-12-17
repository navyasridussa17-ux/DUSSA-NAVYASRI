import java.util.Scanner;
public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase(); 
        name = name.replace(" ", ".");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
             
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
                ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                sb.append(ch);  
            }
        }
        String username = sb.toString();
        System.out.println("Generated Username: " + username);
    }
}