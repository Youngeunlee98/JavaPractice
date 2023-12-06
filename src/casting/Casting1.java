package casting;

public class Casting1 {
    //형변환
    //**작은 범위에서 큰 범위로 대입은 허용한다**
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20000000000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        //intValue = 10
        //doubleValue = intValue
        //doubleValue = (double) intValue //형 맞추기
        //doubleValue = (double) 10 //변수 값 읽기
        //doubleValue = 10.0 //형변환
    }
}
