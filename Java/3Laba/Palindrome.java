import java.util.Scanner;
public class Palindrome {
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа для проверки палиндромов");

        while (true) {
            System.out.print("\nВведите слово или фразу (нажмите Enter для выхода): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("")) {
                break;
            }
            if (isPalindromeImproved(input)) {
                System.out.println(input + " - это палиндром!");
            }
            else {
                System.out.println(input + " - это не палиндром");
            }
        }

        scanner.close();
    }

    public static boolean isPalindromeImproved(String s) {
        // Убираем пробелы и приводим к нижнему регистру
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }
}

