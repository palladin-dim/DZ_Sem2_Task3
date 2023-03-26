/* 
Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций
*/
public class Task_3 {
    public static void main(String[] args) {
        String input1 = "Палиндром";
        String input2 = "ротор";
        System.out.println(input1 + " " + input2);
        System.out.println(isPalindrome(input1) + " " + isPalindrome(input2));
    }

    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) return false;
        }
        return true;
    }
}
