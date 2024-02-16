package variable.ex;

public class VarEx1Question1 {
    public static void main(String[] args) {
        // 아래 4,3을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1, num2를 사용하도록 변경
        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);

        // 답
        // 변수의 리터럴만 변경하면 다른 값을 구할 수 있음
        int num1 = 4;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }
}
