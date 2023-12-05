package loop;

public class DoWhile1 {
    //do-while` 문은 `while` 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
    //do { //코드
    //} while (조건식);

    //조건에 만족하지 않아도 한 번은 현재 값을 출력하고 싶다고 하자.
    // 먼저 `while` 문을 사용한 예제 ->
    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        } // -> `i=10` 이기 때문에 `while (i < 3)` 조건식은 거짓. 즉 출력 X

        do {
            System.out.println("현재 숫자는:" + i); i++;
        } while (i < 3);
        // -> `do-while` 문은 최초 한번은 항상 실행된다. 따라서 먼저 `현재 숫자는:10` 이 출력
        // 코드 블럭을 실행 후에 조건식을 검증하는데, `i=10` 이기 때문에
        //`while (i < 3)` 조건식은 거짓이 된다. 따라서 `do-while` 문을 빠져나온다.
    }
}
