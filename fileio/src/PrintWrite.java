import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("ab.txt");
		PrintWriter out=new PrintWriter(fw);
		out.write(65);
		out.println(65);
		out.println(100.5);
		out.println('a');
		out.println(true);
		out.println("Hello PrintWriter");
		out.flush();
		out.close();
	}

}
