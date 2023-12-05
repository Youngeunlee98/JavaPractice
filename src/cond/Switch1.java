package cond;

public class Switch1 {
    //당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
    //이 프로그램은 `int grade` 라는 변수를 사용하며, 회원 등급( `grade` )에 따라 다음의 쿠폰을 발급해야 한다.
    //1등급: 쿠폰 1000
    //2등급: 쿠폰 2000
    //3등급: 쿠폰 3000
    //위의 등급이 아닐 경우: 쿠폰 500
    //각쿠폰이할당된후에는 `"발급받은 쿠폰 "+ 쿠폰값` 을출력해야한다.
    //2등급 사용자 출력 예)
    //발급받은 쿠폰 2000

    public static void main(String[] args) {

//        switch (조건식) { case value1:
//        // 조건식의 결과 값이 value1일 때 실행되는 코드
//            break;
//            case value2:
//        // 조건식의 결과 값이 value2일 때 실행되는 코드
//                break;
//            default:
        // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드 }

        //grade 1:1000, 2:2000, 3:3000, 나머지: 500

        int grade = 2;
        int coupon;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);


        //grade 1:1000, 2:3000(변경), 3:3000, 나머지: 500 int grade = 2;
        int coupon2;
        switch (grade) {
            case 1:
                coupon2 = 1000;
                break;
            case 2:
            case 3:
                coupon2 = 3000;
                break;
            default:
                coupon2 = 500;
                break; }
        System.out.println("발급받은 쿠폰 " + coupon2);

        // `swtich` 문 없이 `if` 문만 사용해도 된다. 하지만 특정 값에 따라
        // 코드를 실행할 때는 `switch` 문을 사용하 면 `if` 문보다 간결한 코드를 작성할 수 있다.
    }
}


