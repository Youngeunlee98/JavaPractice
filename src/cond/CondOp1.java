package cond;

public class CondOp1 {
    //삼항 연산자
    //(조건) ? 참_표현식 : 거짓_표현식
    //`if` 문을 사용할 때 다음과 같이 단순히 참과 거짓에 따라 특정 값을 구하는 경우
    //단순히 참과 거짓에 따라서 특정 값을 구하는 경우 **삼항 연산자** 또는 **조건 연산자**라고 불리는 `?:` 연산자를 사용

    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인"; } else {
            status = "미성년자"; }
        System.out.println("age = " + age + " status = " + status);

        int age2 = 18;
        String status2 = (age2 >= 18) ? "성인" : "미성년자";
        System.out.println("age2 = " + age2 + " status2 = " + status2);
    }
}
