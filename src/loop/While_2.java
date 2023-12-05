package loop;

public class While_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++; }

        //i` 가 `endNum` 이 될때 까지 반복해서 코드를 실행
        //`while` 문에서 `i <= endNum` 조건을 통해 `i` 가 `endNum` 이 될 때 까지 코드 블럭을 실행한다.
        //`i` 가 `endNum` 보다 크면 `while` 문을 종료
    }
}
