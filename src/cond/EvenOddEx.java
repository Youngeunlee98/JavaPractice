package cond;

public class EvenOddEx {
    //문제: 홀수 짝수 찾기
    //정수 `x` 가 주어지면 `x` 가 짝수이면 "짝수"를,
    //`x` 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자 삼항 연산자를 사용

    public static void main(String[] args) {
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
