package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        //1. 배열 생성
        int[] students = new int[5];

        //2. 변수 값 대입
        students[0] = 90;
        students[1] = 80;

        //3. 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);

        //기본형(Primitive Type): 우리가 지금까지 봤던 `int` , `long` , `double` , `boolean` 처럼
        //변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형(Primitive Type)

        //참조형(Reference Type): `int[] students` 와 같이
        //데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형(Reference Type)

        //배열은 왜 이렇게 복잡하게 참조형을 사용할까?
        //기본형은 모두 사이즈가 명확하게 정해져있다.
        int i; //4byte
        long l; //8byte
        double d; //8byte

        //그런데 배열은 다음과 같이 동적으로 사이즈를 변경할 수 있다.
//        int size=10000; //사용자가 입력한 값을 넣었다고 가정해보자.
//        new int[size]; //이 코드가 실행되는 시점에 배열의 크기가 정해진다.


        //####예를 들어서 `Scanner` 를 사용해서 사용자 입력에 따라
        //`size` 변수의 값이 변하고, 생성되는 배열의 크기도 달라질 수 있다.
        //이런 것을 동적 메모리 할당이라 한다.
        //기본형은 선 언과 동시에 사이즈가 정적으로 정해지지만,
        //참조형을 사용하면 이처럼 동적으로 크기가 변해서 유연성을 제공할 수 있다.
    }
}
