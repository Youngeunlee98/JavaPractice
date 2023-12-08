package method;

public class MethodCasting2 {
    //자동 형변환 : int < long < double

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int에서 double로 자동 형변환

        /*
        printNumber(number); // number는 int형 100
        printNumber(100); //메서드를 호출하기 전에 number 변수의 값을 읽음

        void printNumber(double n=100) //double형 파라미터 변수 n에 int형 값 100을 대입
        void printNumber(double n=(double) 100) //double이 더 큰 숫자 범위이므로 자동 형변환 적용
        void printNumber(double n=100.0) //자동 형변환 완료
        */
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
