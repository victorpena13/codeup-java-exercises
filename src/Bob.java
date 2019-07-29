import java.sql.SQLOutput;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat=true;
        do {
            System.out.print("Ask bob a question...");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.endsWith("?")) {
                repeat=true;
                System.out.println("sure");
            } else if (userInput.endsWith("!")) {
                repeat=true;
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("") || userInput.equals(" ")) {
                repeat=true;
                System.out.println("Fine, be that way!");
            } else if(userInput.equals("Fine")){
                repeat=false;
            }else {
                repeat=true;
                System.out.println("whatever");
            }
        }while(repeat);
    }
}

