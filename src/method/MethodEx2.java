package method;

public class MethodEx2 {
    //문제 - 반복 출력 리펙토링
    /*
    public static void main(String[] args) {
     String message = "Hello, world!";
     for (int i = 0; i < 3; i++) {
         System.out.println(message);
     }
     for (int i = 0; i < 5; i++) {
         System.out.println(message);
     }
     for (int i = 0; i < 7; i++) {
         System.out.println(message);
     }
   }
    */

    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
