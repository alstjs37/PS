import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer>[] stacks = new Stack[4];

        for(int i = 0; i < stacks.length; ++i) {
            stacks[i] = new Stack<>();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int n = Integer.parseInt(s);

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] array = new int[n];
        for(int i = 0; i < n; ++i) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int elem: array) {
            for(int i = 0; i < stacks.length; ++i) {
                if(stacks[i].empty() || stacks[i].peek() < elem) {
                    stacks[i].push(elem);
                    break;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < stacks.length; ++i) {
            cnt += stacks[i].size();
        }

        if(cnt != n) {
            System.out.println("NO");
        } else System.out.println("YES");

    }
}