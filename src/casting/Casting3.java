package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648 }

        //기존 범위를 초과해서 표현하게 되면 전혀 다른 숫자가 표현되는데, 이런 현상을 오버플로우라 한다.
        //오버플로우 자체가 발생하지 않도록 막아야 한다.
    }
}
