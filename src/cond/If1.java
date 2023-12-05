package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }
        //age = 20
//        if (age >= 18) {"성인입니다"}
//        if (20 >= 18) {"성인입니다"} //age의 값은 20이다.
//        if (true) {"성인입니다"} //조건이 참으로 판명된다.
//        {"성인입니다"} //if문에 있는 코드 블록이 실행된다.

        if (age < 18) {
            System.out.println("미성년자 입니다.");
        }
        //if (age < 18) {"미성년자입니다"}
        //if (20 < 18) {"미성년자입니다"} //age의 값은 20이다.
        //if (false) {"미성년자입니다"} //조건이 거짓으로 판명된다.


        // 간결하게 사용하기
        //  if (age >= 18) { System.out.println("성인입니다."); //참일 때 실행
        //  } else {
        //      System.out.println("미성년자입니다.");//만족하는 조건이 없을 때 실행
        //     }
        //  }



        //else 문
        //if (condition) {
        //// 조건이 참일 때 실행되는 코드
        //} else {
        //// 만족하는 조건이 없을 때 실행되는 코드
        //}

        //ex ->
        //if (age >= 18) "성인입니다" else "미성년자입니다"
    }
}
