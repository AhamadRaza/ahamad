
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class MergeTwoFileData {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("abc.txt");
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		String line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("ab.txt"));
		line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
