package com.tabula.pdfextraction;
import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/json")
public class PDFextracterRestController {
	@GetMapping("/column")
	public List<TableColumn> createJsonColumn() throws IOException, Exception {
	       PDFReader pdfReader=new PDFReader();
	 return pdfReader.convertPDFTableColumn();
	}
	@GetMapping("/row")
	public List<TableRow> createJsonRow() throws IOException, Exception {
	       PDFReader pdfReader=new PDFReader();
	 return pdfReader.convertPDFTableRow();
	} 
}
