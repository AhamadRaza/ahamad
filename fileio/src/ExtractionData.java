import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class ExtractionData {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line =br.readLine();
		while(line!=null){
			boolean available=false;
			BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
			String targate =br1.readLine();
			while(targate!=null){
				if(line.equals(targate)){
					available=true;
					break;
				}
				targate=br1.readLine();
			}
			if(available==false){
				pw.println(line);
				//for printing on console
				//System.out.println(line);
			}
			line=br.readLine();
			
			br1.close();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
