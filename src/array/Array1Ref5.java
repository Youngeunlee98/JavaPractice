package array;

public class Array1Ref5 {
    //배열 리펙토링 - 간단한 배열 생성
    //배열은 `{}` 만 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공
    //단 이때는 예제와 같이 배열 변수의 선언을 한 줄에 함께 사용할 때만 가능

    public static void main(String[] args) {
        //배열 생성 간략 버전, 배열 선언과 함께 사용시 new int[] 생략 가능
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
