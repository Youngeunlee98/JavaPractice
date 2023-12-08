package method;

public class Method1Ref {
    //자바에서는 함수를 메서드(Method)
    //메서드도 함수의 한 종류라고 생각하면 된다.

    public static void main(String[] args) {
        int sum1 = add(5, 10); //add라는 메서드를 숫자 5,10을 전달하면서 호출

        System.out.println("결과1 출력:" + sum1);
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    //메서드 정의
    //add 메서드
    //메서드 선언(Method Declaration) ->  public static int add(int a, int b)
    public static int add(int a, int b) {
        //메서드 본문(Method Body)
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;

        return sum;
    }

    //public : 다른 클래스에서 호출할 수 있는 메서드
    //static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드
    //(int a, int b)` : 메서드를 호출할 때 전달하는 입력 값을 정의 -> 매개변수(파라미터)

    //메서드를 호출할 때는 다음과 같이 메서드에 넘기는 값과 매개변수(파라미터)의 타입이 맞아야 한다.
    //물론 넘기는 값과 매개변수(파라미터)의 순서와 갯수도 맞아야 한다.


}
