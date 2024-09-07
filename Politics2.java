import java.util.Scanner;

public class Politics2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a party (Modi, Yogi, Shivraj, Kejriwal,Nitish, Dhruv): ");
            String input = scanner.next();

/////////////////////Important lessons we learned from 2024 election////////////

            switch (input) {
                case "Modi":
                    System.out.println("Overconfidence is harmful.");
                    break;
                case "Yogi":
                    System.out.println("Never take Anything for guaranteed.");
                    break;
                case "Shivraj":
                    System.out.println("Loyal friend never disappoint you.");
                    break;
                case "Kejriwal":
                    System.out.println("You must have return to your original place.");
                    break;
                case "Nitish":
                    System.out.println("It's alwayas the small pieces that make a Big picture.");
                    break;
                case "Dhruv":
                    System.out.println("German shephed is not an Indian Dog.");
                    break;
                default:
                System.out.println("People take advantages but never stand for you.");
                break;
            }
        }
    }
}