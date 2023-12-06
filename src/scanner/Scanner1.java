package scanner;

import java.util.Scanner;

public class Scanner1 {
    // `Scanner scanner = new Scanner(System.in);
    //scanner.nextLine()` : 엔터( `\n` )을 입력할 때 까지 문자를 가져온다
    //scanner.nextInt()` : 입력을 `int` 형으로 가져온다. 정수 입력에 사용한다.
    //`scanner.nextDouble()` : 입력을 `double` 형으로 가져온다. 실수 입력에 사용한다.
    // 타입이 다르면 오류가 발생한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져옵니다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력을 int로 가져옵니다.
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); // 입력을 double로 가져옵니다.
        System.out.println("입력한 실수: " + doubleValue);

        //**print() vs println()**
        //print() : 출력하고 다음 라인으로 넘기지 않는다.
        //println() : 출력하고 다음 라인으로 넘긴다.
    }
}
