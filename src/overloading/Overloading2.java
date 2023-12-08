package overloading;

public class Overloading2 {
    //매개변수의 타입이 다른 오버로딩 예제
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 2);

        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }
    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }

    //첫 번째add메서드:두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b; }

    //두 번째add메서드:두 실수를 받아서 합을 반환한다.
    //첫 번째 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
