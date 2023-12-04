package variable;

public class VarEx1 {
    public static void main(String[] args) {
        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);
        //1. num1 num2 사용해서 4,3을 다른 숫자로 한번에 변경할 수 있도록 하기
        //정답 :
        int num1;
        int num2;

        num1 = 4;
        num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        num1 = 10;
        num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        //2. num3 = 10, num4 = 20 그리고 합을 구하고 sum에 저장하고 출력하기
        //정답 :
        int num3 = 10;
        int num4 = 20;

        System.out.println(num3 + num4);

        int sum = num3 + num4;
        System.out.println(sum);

        //3. long 타입의 변수를 선언하고 백억으로 초기화 한 뒤 출력 + boolean 타입 변수 선언 후 true로 초기화 한후 출력하기.
        //정답 :

        long l= 10000000000L;
        System.out.println(l);

        boolean b = true;
        System.out.println(b);

    }
}
