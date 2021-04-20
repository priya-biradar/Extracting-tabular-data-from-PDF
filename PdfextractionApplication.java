package com.tabula.pdfextraction;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class PdfextractionApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(PdfextractionApplication.class, args);
		PDFReader pdfReader=new PDFReader();
		try
		{
			pdfReader.extractPdfTable();
		 } 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
