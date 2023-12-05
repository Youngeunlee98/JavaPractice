package operator;

public class Comp1 {
    //**비교 연산자**
    //`==` : 동등성 (equal to)
    // `!=` : 불일치 (not equal to)
    //`>` : 크다 (greater than)
    //`<` : 작다 (less than)
    //`>=` : 크거나 같다 (greater than or equal to)
    //`<=` : 작거나 같다 (less than or equal to)

    //여기서 주의할 점은 `=` 와 `==` ( `=` x2)이 다르다는 점이다.
    //`=` : 대입 연산자, 변수에 값을 대입한다.
    //`==` : 동등한지 확인하는 비교 연산자
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b); // false, a와 b는 같지 않다
        System.out.println(a != b); // true, a와 b는 다르다
        System.out.println(a > b); // false, a는 b보다 크지 않다
        System.out.println(a < b); // true, a는 b보다 작다
        System.out.println(a >= b); // false, a는 b보다 크거나 같지 않다
        System.out.println(a <= b); // true, a는 b보다 작거나 같다
        //결과를 boolean 변수에 담기
        boolean result = a == b; //a == b: false
        System.out.println(result); //false
    }
}
