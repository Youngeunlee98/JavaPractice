package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    //사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성
    //만약 첫번째 숫자 `num1` 이 두번째 숫자 `num2` 보다 크다면, 두 숫자를 교환
    //num1` 부터 `num2` 까지의 각 숫자를 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();
        // num1이 num2보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수:");

        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }

}
