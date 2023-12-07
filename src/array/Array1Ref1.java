package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

        //배열을 사용하려면 `int[] students;` 와 같이 배열 변수를 선언해야 한다.
        //일반적인 변수와 차이점은 `int[]` 처럼 타입 다음에 대괄호( `[]` )가 들어간다는 점
        //배열을 사용하려면 배열을 생성
        //`new` 는 새로 생성한다는 뜻이고, `int[5]` 는 `int` 형 변수 5개라는 뜻
        //new int[5]` 라고 하면 총 5개의 `int` 형 변수가 만들어진다. 자바는 배열을 생성할 때 그 내부값을 자동으로초기화한다.
        //숫자는 `0` , `boolean` 은 `false` , `String` 은 `null` (없다는 뜻이다.)로 초기화 된다.


        //배열은 변수와 사용법이 비슷한데, 차이점이 있다면 다음과 같이 `[]` 사이에 숫자 번호를 넣어주면 된다.
        //배열의 위치를 나타내는 숫자를 인덱스(index)라고 한다.
        //배열은 0부터 시작한다.
    }
}
