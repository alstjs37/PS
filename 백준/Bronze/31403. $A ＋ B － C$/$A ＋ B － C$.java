import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a+b-c);

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);

        int ab = Integer.parseInt(sb.toString());
        System.out.println(ab-c);
    }
}