import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {
	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("abc.txt");
//		int i =fr.read();
//		while(i!=-1){
//			System.out.print((char)i);
//			i=fr.read();
//		}
		
		File f = new File("abc.txt");
		char[] ch = new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		fr.read(ch);
		for (char ch1:ch){
			System.out.print(ch1);
		}
		fr.close();
	}
}
