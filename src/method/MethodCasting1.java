package method;

public class MethodCasting1 {
    //메서드를 호출할 때도 형변환이 적용

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); // double을 int형에 대입하므로 컴파일 오류
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환

        /*
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
        printNumber(1); // (double) 1.5 -> (int) 1로 변환
        void printNumber(int n=1) //int형 파라미터 변수 n에 int형 1을 대입
         */
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
