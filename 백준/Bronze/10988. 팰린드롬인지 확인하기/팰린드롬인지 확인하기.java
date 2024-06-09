import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
       int answer = 0;
       
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        
        if(sb.toString().equals(sb.reverse().toString())) {
            answer = 1;
        }
		
		System.out.println(answer);
		
	}
}