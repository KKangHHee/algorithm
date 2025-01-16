// 공백을 기준으로 입력 받기
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())); // 입력받은 배열 [0] +[1]
	}
}