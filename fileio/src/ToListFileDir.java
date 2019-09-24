import java.io.File;


public class ToListFileDir {
	public static void main(String[] args) {
		File f = new File("F:\\abcdef\\desktopfiles\\filemanagementjsp\\WebContent");
		int count=0;
		String [] s=f.list();
		for(String s1 : s){
			File f1=new File(f,s1);
			if(f1.isDirectory()){
			count++;
			System.out.println(s1);
			}
		}
		System.out.println(count);
	}

}
