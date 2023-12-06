package casting;

public class Casting2 {
    //큰 범위에서 작은 범위 대입은 명시적 형변환이 필요하다
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력:1

        //`int` 형은 `double` 형보다 숫자의 표현 범위가 작다. 그리고 실수를 표현할 수도 없다. 따라서 이 경우 숫자가 손실되는 문제가 발생할 수 있다.
        // 쉽게 이야기해서 큰 컵에 담긴 물을 작은 컵에 옮겨 담으려고 하니, 손실이 발생할 수 있다
    }
}
