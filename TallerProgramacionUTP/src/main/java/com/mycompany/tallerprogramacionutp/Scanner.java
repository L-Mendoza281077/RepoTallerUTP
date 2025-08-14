import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Tu edad es: " + edad);
        scanner.close();
    }
}