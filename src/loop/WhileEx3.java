package loop;

public class WhileEx3 {
    //문제: 누적 합 계산
    //반복문을 사용하여 1부터 `max` 까지의 합을 계산하고 출력하는 프로그램을 작성
    //이때, `sum` 이라는 변수를 사용하여 누적 합을 표현하고,
    // `i` 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행.
    // while문, for문 2가지 버전

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++; }
        System.out.println(sum);

        //for 문 버전
//        for (int i = 1; i <= max; i++) {
//            sum += i; }
//        System.out.println(sum);
    }
}
