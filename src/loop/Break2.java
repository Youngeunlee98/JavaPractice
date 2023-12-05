package loop;

public class Break2 {
    //문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?** 1 + 2 + 3 ...
    // 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum); break;
            }
            i++; }
        //for (; ; )` 를 보면 조건식이 없다. for문은 조건이 없으면 무한 반복한다.
        //`sum > 10` 조건을 만족하면 `break` 를 사용해서 while문을 빠져나간다.
    }
}
