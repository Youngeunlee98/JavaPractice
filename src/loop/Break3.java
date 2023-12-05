package loop;

public class Break3 {
    // `i` 를 `for` 문에 넣어서 관리하도록 변경하면 더 깔끔한 코드가 된 다.
    //for문이 없이 while문으로 모든 반복을 다를 수 있다. 하지만 카운터 변수가 명확하거나,
    // 반복 횟수가 정해진 경우에는 for문을 사용하는 것이 구조적으로 더 깔끔하고, 유지보수 하기 좋다.

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
