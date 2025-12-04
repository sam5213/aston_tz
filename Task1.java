import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in) ) {
            System.out.println("Введите число а: ");
            int a = scanner.nextInt();
    
            System.out.println("Введите число b: ");
            int b = scanner.nextInt();
    
            if (a > b) {
                System.out.println(a + " > " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }

            System.out.println("Результат сложения a + b: " + (a + b));
            System.out.println("Результат вычитания a - b: " + (a - b));
            System.out.println("Результат умножения a * b: " + (a * b));
            if (b == 0) {
                throw new Exception("Деление на ноль");
            } else {
                System.out.println("Результат деления a / b: " + (a / b));
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            return;
        }
    }
}
