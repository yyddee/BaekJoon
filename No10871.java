import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10871 {

	public static void main(String[] args) throws IOException {
			
		
		//�Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] inStr1 = str.split(" ");
		int x = Integer.parseInt(inStr1[0]);
		int y = Integer.parseInt(inStr1[1]);
		
		String str2 = br.readLine();
		String[] inStr2 = str2.split(" ");
		
		String outStr = ""; //���ڿ� �ʱ�ȭ
		
		for (int i = 0 ; i < x ; i++) {
			if (Integer.parseInt(inStr2[i]) < y) {
				outStr += inStr2[i];
				outStr += " ";
			}
		}
			
		System.out.println(outStr);
		
		
		
	}

}
