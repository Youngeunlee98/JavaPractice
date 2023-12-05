package loop;

public class For1 {
    //for문은 주로 반복 횟수가 정해져 있을 때 사용
    //for (1.초기식; 2.조건식; 4.증감식) { }

    public static void main(String[] args) {
        // 1 ~ 10 까지 출력하는 for문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }

    }
}
