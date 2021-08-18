import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfGeneratorTutorial2 {
    pdfGeneratorTutorial2(){
        System.out.println("Aayush");
//
        Document document = new Document();
        try{
            PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("Aayush2.pdf"));
            document.open();
            document.add(new Paragraph("Sincerity. Respect Time."));
//table
            float [] pointColumnWidths = {150F, 150F, 150F};   
            PdfPTable table = new PdfPTable(pointColumnWidths);


            // Adding PdfPCells to the table       
            
            document.close();
            writer.close();

        }catch(DocumentException de){
            de.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        new pdfGeneratorTutorial2();
    }
}
