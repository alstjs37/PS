import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String nums = br.readLine();
        String[] numsStr = nums.split(" ");

        int[] numArray = new int[numsStr.length];
        for(int i = 0; i < numArray.length; ++i) {
            numArray[i] = Integer.parseInt(numsStr[i]);
        }

        LinkedList<Integer> deque = new LinkedList<>();

        for(int i = 1; i <= n; ++i) {
            deque.add(i);
        }

        int count = 0;
        for(int target: numArray) {
            if(deque.peek() == target) {
                deque.remove();
                continue;
            }

            int idx = deque.indexOf(target);
            int halfIndex = deque.size() % 2 == 0 ? deque.size()/2 - 1: deque.size()/2;

            if(idx > halfIndex) {
                // 오른쪽
                while(deque.peek() != target) {
                    int temp = deque.removeLast();
                    deque.addFirst(temp);
                    count++;
                }
            } else {
                // 왼쪽
                while(deque.peek() != target) {
                    int temp = deque.removeFirst();
                    deque.addLast(temp);
                    count++;
                }
            }
            deque.removeFirst();

        }
        System.out.println(count);
    }
}