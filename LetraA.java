import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe uma palavra ou frase: ");
        String input = scanner.nextLine();
        
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na palavra ou frase.");
        } else {
            System.out.println("A letra 'a' não está na palavra ou frase.");
        }
        scanner.close();
    }
}
