import java.io.File;
import java.io.IOException;


public class CreateDire {
	public static void main(String[] args) throws IOException {
		File f =new File("raza123");
		//System.out.println(f.exists());
		//f.mkdir();
		//System.out.println(f.exists());
		File f1 =new File("raza123","abc.txt");
		f1.createNewFile();
		//f1.delete();
		File f2 = new File(f,"abcd.txt");
		f2.createNewFile();
	}

}
