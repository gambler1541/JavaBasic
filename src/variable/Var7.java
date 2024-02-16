package variable;

public class Var7 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억)
        long l = 9223372036754775807L; // -9,223,372,036,754,775,808 ~ 9,223,372,036,754,775,807 ( 숫자 뒤에 L을 붙혀줘야 함)

        // 실수
        float f = 10.0f; // 숫자 뒤에 f를 붙혀줘야 함
        double d = 10.0;

        // 실무에서 자주 사용하는 타입
        // 정수 : int, long
        // -> 파일을 다룰때는 byte
        // 실수 : double
        // -> float은 정밀도가 낮음
        // 불린형 : boolean
        // 문자열 : String
        // -> 문자 하나를 표현할때도 String a = "a" 처럼 문자열을 사용하는것이 좋음
    }
}
