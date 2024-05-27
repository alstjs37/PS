import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String[] nums = br.readLine().split(" ");
        String target = br.readLine();

        int answer = 0;
        for(String num: nums) {
            if(target.equals(num)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}