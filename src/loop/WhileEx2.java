package loop;

public class WhileEx2 {
    //문제: 짝수 출력
    //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성
    //이때, `num` 이라는 변수를 사용하여 수를 표현
    //while문, for문 2가지 버전

    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }

        //for 문 버전
        //for (int num = 2, count = 1; count <= 10; num += 2, count++) {
        //             System.out.println(num);
        //         }
    }
}
