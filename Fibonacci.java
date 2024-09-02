import java.util.Scanner;

public class Fibonacci {

    
    public static boolean isFibonacci(int number) {
    
        int previous = 0;
        int current = 1;

        
        if (number == 0 || number == 1) {
            System.out.println(number);
            return true;
        }

        
        while (current < number) {
            int next = previous + current; 
            System.out.println(next); 
            previous = current;
            current = next;
        }

        
        return current == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
