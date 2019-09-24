import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BuuferedWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(65);
		bw.newLine();
		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("What happend to you tell me");
		bw.newLine();
		bw.write("I will solve it for you");
		bw.flush();
		bw.close();
	}

}
