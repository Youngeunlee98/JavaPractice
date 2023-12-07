package array;

public class Array1Ref3 {
    //배열 리펙토링 - 변수 값 사용
    //리펙토링(Refactoring)이란?
    //기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과
    //즉, 작동하는 기능은 똑같은데, 코드를 개선하는 것.
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
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]); }
    }
}
