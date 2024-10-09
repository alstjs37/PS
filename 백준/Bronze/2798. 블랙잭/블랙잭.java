import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i = 0; i < n-2; ++i) {
            for(int j = i+1; j < n-1; ++j) {
                for(int k = j+1; k < n; ++k) {

                    int temp = cards[i] + cards[j] + cards[k];
                    if(temp > answer && temp <= m) {
                        answer = temp;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}