package loop;

public class While_1 {
    public static void main(String[] args) {
        //while (조건식) { // 코드}
        //조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
        //조건식이 참이면 코드 블럭을 실행한다.
        //이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사 한다.(무한 반복)

        int count = 0;
        while (count < 3) {
            count++;
            System.out.println("현재 숫자는:" + count); }
        //현재 숫자는:1
        //현재 숫자는:2
        //현재 숫자는:3
        //이라는 결과가 반환 된다.

        //**문제: 1부터 하나씩 증가하는 수를 3번 더해라 (1 ~ 3 더하기)**
        int sum = 0;

        sum = sum + 1; //sum(0) + 1 -> sum(1)
        System.out.println("i=" + 1 + " sum=" + sum); //i=1 sum=1

        sum = sum + 2; //sum(1) + 2 -> sum(3)
        System.out.println("i=" + 2 + " sum=" + sum); //i=2 sum=3

        sum = sum + 3; //sum(3) + 3 -> sum(6)
        System.out.println("i=" + 3 + " sum=" + sum); //i=3 sum=6

        // 위 식들이 계산상 맞지만 이렇게 하면 반복적으로 수정해야 할 것들이 늘어난다.
        // 그렇기 때문에 변수를 설정해서 보수가 쉽게 만들 수 있다.
        int i = 1;

        sum = sum + i; //sum(0) + i(1) -> sum(1)
        System.out.println("i=" + i + " sum=" + sum);
        i++; //i=2

        sum = sum + i; //sum(1) + i(2) -> sum(3)
        System.out.println("i=" + i + " sum=" + sum);
        i++; //i=3

        sum = sum + i; //sum(3) + i(3) -> sum(6)
        System.out.println("i=" + i + " sum=" + sum);

        //결과 ->
        //i=1 sum=1
        //i=2 sum=3
        //i=3 sum=6
    }
}
