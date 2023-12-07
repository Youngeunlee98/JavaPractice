package array;

public class EnhancedFor1 {
    //향상된 for문
    //향상된 `for` 문은배열을사용할때기존 `for` 문보다더편리하게사용

    //향상된 for문 정의
    /*

    for(변수 : 배열 또는 컬렉션){
        // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
     }

    */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        //배열에 있는 값을 순서대로 읽어서 `number` 변수에 넣고, 출력
        //배열의 값을 하나 읽을 때 마다 인덱스를 하나씩 증
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];

            System.out.println(number);
        }

        //향상된 for문, for-each문
        //배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다.
        //단순히 해당 배열을 처음부터 끝 까지 탐색한다.
        //배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for(int i = 0; i < numbers.length; ++i) {
        System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }


}
