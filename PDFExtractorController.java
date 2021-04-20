package com.tabula.pdfextraction;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PDFExtractorController {
	@GetMapping("/index")
	public String createHTML(Model model) throws IOException, Exception {
		PDFReader pdfReader = new PDFReader();
		model.addAttribute("tablesPDF", pdfReader.convertPDFTableRow());
		return "index";
	}
}
