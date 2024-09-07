import java.util.Scanner;

public class ReasonOfHappyPolitics{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a party (BJP, Congress, SP, TMC, JDU, TDP, EVM): ");
            String input = scanner.next();

            switch (input) {
                case "BJP":
                    System.out.println("We are happy because again we are the largest party.");
                    break;
                case "Congress":
                    System.out.println("We are happy because our seats are doubled.");
                    break;
                case "SP":
                    System.out.println("We are happy because of our excellent performance in UP.");
                    break;
                case "TMC":
                    System.out.println("We are happy because we stopped BJP in West Bengal.");
                    break;
                case "JDU":
                    System.out.println("We are happy because we will be part of central Government.");
                    break;
                case "TDP":
                    System.out.println("We are happy because we are forming state government and we will be part of central Government.");
                    break;
                case "EVM":
                    System.out.println("We are happy because no one will blame us.");
                    break;
                default:
                    System.out.println("Rare election result where everyone is happy!");
                    break;
            }
        }
    }
}