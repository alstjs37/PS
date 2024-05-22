import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        String temp = br.readLine();

        StringTokenizer st = new StringTokenizer(temp);
        for(int i = 0; i < n; ++i) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        System.out.print(min + " " + max);
    }
}