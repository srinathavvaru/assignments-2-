import java.util.Scanner;

public class OddPosition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && i % 2 != 0) {
                res.append(text.charAt(i));
            }
        }

        System.out.println("Characters at odd positions (ignoring white spaces): " + res.toString());
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
