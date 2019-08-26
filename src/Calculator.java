public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        String mathFunction;
        for (String s: args) {
            num1 = Integer.parseInt(s[0]);
            num2 = Integer.parseInt(s[1]);
            mathFunction = s[3];
        }

    }
}
