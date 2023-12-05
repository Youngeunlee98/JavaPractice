package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        //"a + b = "(String) + 10(int) //문자열과 숫자 더하기
        //"a + b = "(String) + "10"(int -> String) //숫자를 문자열로 변경
        //"a+b="+"10"//문자열과 문자열 더하기
        //"a + b = 10" //결과

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
        //str(String) + num(int)
        //"a + b = "(String) + num(int) //str 변수에서 값 조회
        //"a + b = "(String) + 20(int) //num 변수에서 값 조회
        //"a + b = "(String) + "20"(int -> String) //숫자를 문자열로 변경
        //"a+b="+"20"//문자열과 문자열 더하기
        //"a + b = 20" //결과

        ////곱셈(*)이 연산자 우선순위가 높다. 따라서 먼저 계산한다.
        int sum1=1+2*3;//1+(2*3)과 같다.
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1); //sum1 = 7 System.out.println("sum2 = " + sum2); //sum2 = 9

        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
        int sum4=(2*2)+(3*3); //sum3과 같다.
        System.out.println("sum3 = " + sum3); //sum3 = 13
        System.out.println("sum4 = " + sum4); //sum4 = 13

        //연산자 우선순위
        //1. **괄호 ()**
        //2. **단항 연산자** (예: `++` , `--` , `!` , `~` , `new` , `(type)` )
        //3. **산술 연산자** (`*` , `/` , `%` 우선,그다음에 `+` , `-` )
        //4. **Shift 연산자** ( `<<` , `>>` , `>>>` )
        //5. **비교 연산자** ( `<` , `<=` , `>` , `>=` , `instanceof` )
        //6. **등식 연산자** (`==` , `!=` )
        //7. **비트 연산자** (`&` ,`^` ,`|` )
        //8. **논리 연산자** (`&&` , `||` )
        //9. **삼항 연산자** (`?:` )
        //10. **대입 연산자** (`=` , `+=` , `-=` , `*=` , `/=` , `%=` 등등)

    }
}
