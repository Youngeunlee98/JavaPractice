package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        //int div1 = 1; //int / int이므로 int타입으로 결과가 나온다.
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2;
        //double div2 = 1; //int / int이므로 int타입으로 결과가 나온다.
        //double div2 = (double) 1; //int -> double에 대입해야 한다. 자동 형변환 발생
        //double div2 = 1.0; // 1(int) -> 1.0(double)로 형변환 되었다.
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2;
        //double div3 = 3.0 / (double) 2; //double / int이므로, double / double로 형변환이 발생한다.
        //double div3 = 3.0 / 2.0; //double / double -> double이 된다.
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2; ////명시적 형변환을 사용했다. (double) int / int
        //double div4 = (double) 3 / (double) 2; //double / int이므로,
        //double / double로 형변환이 발생한다.
        //double div4 = 3.0 / 2.0; //double / double -> double이 된다.
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
        //처리 과정
        //double result = (double) a / b; //(double) int / int
        //double result = (double) 3 / 2; //변수 값 읽기
        //double result = (double) 3 / (double) 2; //double + int 이므로 더 큰 범위로 형변환
        //double result = 3.0 / 2.0; //(double / double) -> double이 된다.
        //double result = 1.5;
    }
}
