import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreate {
	public static void main(String[] args) throws IOException, DocumentException {
		Document doc =new Document();
		PdfWriter pd=PdfWriter.getInstance(doc, new FileOutputStream("a.pdf"));
		doc.open();
		doc.add(new Paragraph("Hello I m in What about you"));
		doc.close();
		pd.close();
	}

}
