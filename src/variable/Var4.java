package variable;

public class Var4 {
    //변수 선언과 초기화
    public static void main(String[] args) {
        //변수는 여러개를 동시에 선언할 수도 있다.
        int c,d;
        int e,f,g;

        //변수는 초기화와 선언도 동시에 할 수 있다.
        int a = 10;
        int b = 25;
        System.out.println(a);
        System.out.println(b);

        //지역 변수는 초기화를 하지 않으면 컴파일 에러가 생기기 떄문에 반드시 초기화 해야한다.
        //컴퓨터에서는 여러시 스템이 함께 사용하는 공간이기에 초기화하지 않으면 이상한 값이 출력될 수 있다.
        //자바에서는 변수를 초기화 하지 않으면 실행되지 않도록 강제한다!
    }
}
