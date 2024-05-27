import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Deque<String> stack = new ArrayDeque<>();
        for(int i = 0; i < t; ++i) {
            String testCase = br.readLine();
            String[] testCaseArray = testCase.split("");

            for (String s : testCaseArray) {
                if (stack.isEmpty() || s.equals("(")) {
                    stack.push(s);
                } else if (stack.peek().equals("(") && s.equals(")")) {
                    stack.pop();
                } else {
                    stack.push(s);
                }
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            } else System.out.println("NO");

            stack.clear();
        }
    }
}