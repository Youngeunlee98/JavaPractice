package array;

public class Array1Ref4 {
    //배열 리펙토링 - 초기화
    //배열은 `{}` 를 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공한다.
    public static void main(String[] args) {
        int[] students;

        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

        //배열 변수 선언, 배열 생성과 초기화
        //int[] students = new int[]{90, 80, 70, 60, 50};
    }
}
