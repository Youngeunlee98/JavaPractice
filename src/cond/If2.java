package cond;

public class If2 {
    //else if
    //elseif` 문은앞선 `if` 문의조건이거짓일때다음조건을검사한다.
    //만약앞선 `if` 문이참이라면 `elseif` 를실행 하지 않는다.
    public static void main(String[] args) {
        int age = 14;
        if(age <= 7) { //~7: 미취학 System.out.println("미취학");
        }
        if(age >= 8 && age <= 13) { //8~13: 초등학생 System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생"); }
        if(age >= 17 && age <= 19) { //17~19: 고등학생 System.out.println("고등학생");
        }
        if(age >= 20) { //20~: 성인
            System.out.println("성인"); }


        // else if 를 사용하면!
        if(age <= 7) { //~7: 미취학 System.out.println("미취학");
        } else if(age <= 13) { //8~13: 초등학생 System.out.println("초등학생");
        } else if(age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        } else if(age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        } else { //20~: 성인
            System.out.println("성인"); }

        //`if` 문에 `elseif` 를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다.
        // 그런데 서로 관련이 없는 독립 조건이면
        //`else if` 를 사용하지 않고 `if` 문을 각각 따로 사용해야 한다.

        //예제
        //온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
        //각각의 할인 조건은 다음과 같다.
        //아이템 가격이 10000원 이상일 때, 1000원 할인 나이가 10살 이하일 때 1000원 할인
        //이 할인 시스템의 핵심은 **한 사용자가 동시에 여러 할인을 받을 수 있다는 점**이다.
        //예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고,
        //동시에 나이가 10살 이하이면 추가로 1000원 더 할인을 받는다.
        //그래서 총 2000원 까지 할인을 받을 수 있다.

        int price = 10000;// 아이템 가격 int age = 10;//나이
        int discount = 0;
        if (price >= 10000) {
            discount = discount + 1000; System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount = discount + 1000; System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + "원");

        //결과:
        //price = 10000, age = 10
        //10000원 이상 구매, 1000원 할인

        //`if` 문을 각각 사용할지, `if` 와 `else if` 를 함께 묶어서 사용할지는 요구사항에 따라 다르다.
        //그렇기 때문에 각각의 요구사항을 확인하고 이해한 뒤에 작성해야 한다!
    }
}
