import java.io.FileWriter;
import java.io.IOException;


public class WriteData {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("a.txt" , true);
		fw.write(117);
		fw.write("Hi I am Ahamad Raza\nWho are you\n");
		char[] ch ={'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		
	}

}
