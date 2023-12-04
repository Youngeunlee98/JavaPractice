package variable;

public class Var3 {
    public static void main(String[] args) {
        //변수 명명 규칙
        //1. 숫자로 시작 X
        //2. 이름에는 공백이 들어갈수 X
        //3. 자바 예약어 사용 X
        //4. 영문자, 숫자, 달러 기호 또는 밑줄만 사용 가능
        // 관례 -> 카멜 표기법 사용 할 것!

        int a; //변수 선언
        a = 10; //변수 초기화

        System.out.println(10);
        System.out.println(a);

        a = 50; //변수 변경
        System.out.println(a);
        // -> 즉 전의 10은 사라지고 50으로 완전히 변경되어 출력되는 것이다.

        a = 20;
        int b;
        b = 10;
        System.out.println(a + b); // -> 20+10 = 30

        b = 50;
        System.out.println(a + b); // -> 20 + 50 = 70
    }
}
