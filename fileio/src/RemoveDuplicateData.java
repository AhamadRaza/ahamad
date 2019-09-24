import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class RemoveDuplicateData {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("output1.txt");
		BufferedReader br=new BufferedReader(new FileReader("output.txt"));
		String line=br.readLine();
		while(line!=null){
			boolean available=false;
			BufferedReader br1=new BufferedReader(new FileReader("output1.txt"));
			String targate=br1.readLine();
			while(targate!=null){
				if(line.equals(targate)){
					available=true;
					break;
				}
				targate=br1.readLine();
			}
			if(available==false){
				pw.println(line);
				System.out.println(line);
				pw.flush();
			}
			line=br.readLine();
		}
	}

}
