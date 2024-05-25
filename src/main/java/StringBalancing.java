import java.util.Stack;

public class StringBalancing {

    public static void main(String[] a) {
        String str = "[{{](}))}(";

        Stack<Character> stk = new Stack<Character>();

        // Pushing all opening brackets in Stack
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {

                stk.push(str.charAt(i));

            }

        }

        // Poping closing brackets in Stack for every opening bracket
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {

                stk.pop();

            }

        }

        if (stk.isEmpty()) {
            System.out.println("The string is Balanced");
        } else {
            System.out.println("The string is not Balanced");
        }

    }

}
