import java.util.Scanner;

class Node {
    int input;
    String question;
    Node next;

    public Node(int input, String question) {
        this.input = input;
        this.question = question;
        this.next = null;
    }
}

public class Politics1 {
    static Node top = null;

    public static void push(int input, String question) {
        Node newNode = new Node(input, question);
        newNode.next = top;
        top = newNode;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        top = top.next;
    }

    public static String peek() {
        if (top == null) {
            return "Stack is empty.";
        }
        return top.question;
    }

    public static int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 10 and 80: ");
        int input = scanner.nextInt();

        if (input >= 10 && input <= 20) {
            push(input, "How much is your salary?");
        } else if (input > 20 && input <= 30) {
            push(input, "How many kids do you have?");
        } else if (input > 30 && input <= 40) {
            push(input, "What is your wealth?");
        } else if (input > 40 && input <= 50) {
            push(input, "What is your health status?");
        } else if (input > 50 && input <= 60) {
            push(input, "What is your BP and sugar level?");
        } else if (input > 60 && input <= 70) {
            push(input, "How much is your pension money?");
        } else if (input > 70 && input <= 80) {
            push(input, "How much is your remaining?");
        } else {
            System.out.println("Invalid input. Please enter a number between 10 and 80.");
        }

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }

        scanner.close();
    }
}