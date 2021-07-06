import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10871 {

	public static void main(String[] args) throws IOException {
			
		
		//입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력 추가
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] inStr1 = str.split(" ");
		int x = Integer.parseInt(inStr1[0]);
		int y = Integer.parseInt(inStr1[1]);
		
		String str2 = br.readLine();
		String[] inStr2 = str2.split(" ");
		
		//출력도 Buffer 이용해서 생략
		//String outStr = ""; //문자열 초기화
		
		for (int i = 0 ; i < x ; i++) {
			if (Integer.parseInt(inStr2[i]) < y) {
				bw.write(inStr2[i] + " ");
//				outStr += inStr2[i];
//				outStr += " ";
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
