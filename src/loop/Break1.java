package loop;

public class Break1 {
    //`break` 는 반복문을 즉시 종료하고 나간다.
    //`continue` 는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는 데 사용된다.
    //참고로 `while` , `do-while` , `for` 와 같은 모든 반복문에서 사용할 수 있다.

    //while(조건식) { 코드1;
    //break;     //즉시 while문 종료로 이동한다.
    //코드2; }
    //while문 종료

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum); break;
            }
            i++;
        } //-> 합이 10보다 크면 종료: i=5 sum=15
    }
}
