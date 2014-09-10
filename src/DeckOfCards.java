import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class DeckOfCards {

	public static void main(String[] args) throws DocumentException,
			IOException {

		Document doc = new Document();
		BaseFont baseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
        Font black = new Font(baseFont, 40f, 0, BaseColor.BLACK);
        Font red = new Font(baseFont, 40f, 0, BaseColor.RED);

		PdfWriter.getInstance(doc, new FileOutputStream("Deck-of-Cards.pdf"));
		doc.open();
		
		PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(70);
        table.getDefaultCell().setFixedHeight(50);

		for (int i = 2; i <= 14; i++) {
			int temp = 0;
			if (i > 10) {
				switch (i) {
				case 11:
					table.addCell(new Paragraph("J"+"♣", black));
					table.addCell(new Paragraph("J"+"♦", red));
					table.addCell(new Paragraph("J"+"♥", red));
					table.addCell(new Paragraph("J"+"♠", black));
					break;
				case 12:
					table.addCell(new Paragraph("Q"+"♣", black));
					table.addCell(new Paragraph("Q"+"♦", red));
					table.addCell(new Paragraph("Q"+"♥", red));
					table.addCell(new Paragraph("Q"+"♠", black));
					break;
				case 13:
					table.addCell(new Paragraph("K"+"♣", black));
					table.addCell(new Paragraph("K"+"♦", red));
					table.addCell(new Paragraph("K"+"♥", red));
					table.addCell(new Paragraph("K"+"♠", black));
					break;
				case 14:
					table.addCell(new Paragraph("A"+"♣", black));
					table.addCell(new Paragraph("A"+"♦", red));
					table.addCell(new Paragraph("A"+"♥", red));
					table.addCell(new Paragraph("A"+"♠", black));
					break;
				}
			} else {
				switch (temp) {
				case 0:
					table.addCell(new Paragraph(i + "♣", black));
				case 1:
					table.addCell(new Paragraph(i + "♦", red));
				case 2:
					table.addCell(new Paragraph(i + "♥", red));
				case 3:
					table.addCell(new Paragraph(i + "♠", black));
					break;
				}
			}

		}
		doc.add(table);
		doc.close();

	}

}
