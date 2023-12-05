package loop;

public class NestedEx1 {
//    중첩 for문을 사용해서 구구단을 완성

    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        //int rows` 를 선언
        //이 수만큼 다음과 같은 피라미드를 출력

        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
