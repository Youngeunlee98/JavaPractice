package array;

public class ArrayDi3 {
    //초기화: 기존 배열처럼 2차원 배열도 편리하게 초기화 할 수 있다.
    //`for` 문에서 배열의 길이 활용
    // 다시 코드 리펙토링

    public static void main(String[] args) {
        // 2x3 2차원 배열, 초기화
        int[][] arr = {
        {1, 2, 3},
        {4, 5, 6}
        };

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
    }
    }

}
