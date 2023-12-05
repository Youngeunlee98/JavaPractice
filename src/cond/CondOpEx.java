package cond;

public class CondOpEx {
    //문제: 더 큰 숫자 찾기
    //두개의정수변수 `a` 와 `b`
    // `a` 의값은 `10` 이고, `b` 의값은 `20` 이다.
    //삼항 연산자를 사용하여
    //두 숫자 중 더 큰 숫자를 출력하는 코드를 작성

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
