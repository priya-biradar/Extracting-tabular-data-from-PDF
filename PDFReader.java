package com.tabula.pdfextraction;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import technology.tabula.ObjectExtractor;
import technology.tabula.Page;
import technology.tabula.RectangularTextContainer;
import technology.tabula.Table;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;
public class PDFReader {
	final String FILENAME = "file_name.pdf";
	public List<List<String>>  extractPdfTable() throws Exception, IOException {
		List<List<String>> tableLst=new ArrayList<>();
		int extrcatTableNo=1;
		PDDocument pd = PDDocument.load(new File(FILENAME));
		int totalPages = pd.getNumberOfPages();
		//System.out.println("Total Pages in Document: " + totalPages);
		ObjectExtractor oe = new ObjectExtractor(pd);
		SpreadsheetExtractionAlgorithm spreadAlgorithm = new SpreadsheetExtractionAlgorithm();
		for (int pageNo = 1; pageNo <= totalPages; pageNo++) {
			Page page = oe.extract(pageNo);
			List<Table> tablelst = (List<Table>) spreadAlgorithm.extract(page);
			if(null!=tablelst && tablelst.size()>0) {
					List<List<RectangularTextContainer>> rowsLst = tablelst.get(extrcatTableNo).getRows();
					for (int rowNo = 0; rowNo < rowsLst.size(); rowNo++) {
						List<RectangularTextContainer> cellsLst = rowsLst.get(rowNo);
						List<String> cellLst=new  ArrayList<>();
						for (int cellNo = 0; cellNo < cellsLst.size(); cellNo++) {
							cellLst.add(cellsLst.get(cellNo).getText());
						}
						tableLst.add(cellLst);
					}	
			}

		}
		 return tableLst;
	}
	public List<TableRow> convertPDFTableRow() throws IOException, Exception {
		List<List<String>> tableLst=extractPdfTable();
		int columnLenght=tableLst.get(0).size();
		List<TableRow> tablePDFs= new ArrayList<TableRow>();
		for (int i = 1; i <= columnLenght; i++) {
			TableRow pdf = null;
				if (i == 1) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 2) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 3) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 4) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 5) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 6) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				} else if (i == 7) {
					pdf=new TableRow();
					pdf.setSubjectCode(tableLst.get(i).get(0));
					pdf.setSubjectName(tableLst.get(i).get(1));
					pdf.setInternal(Integer.valueOf(tableLst.get(i).get(2)));
					pdf.setExternal(Integer.valueOf(tableLst.get(i).get(3)));
					pdf.setTotal(Integer.valueOf(tableLst.get(i).get(4)));
					pdf.setGrade(tableLst.get(i).get(5));
					pdf.setCredits(Integer.valueOf(tableLst.get(i).get(6)));
				}
				tablePDFs.add(pdf);
			}
		return tablePDFs;
	}
	public List<TableColumn> convertPDFTableColumn() throws IOException, Exception {
		List<List<String>> tableLst=extractPdfTable();
		int tableLength = tableLst.size();
		int columnLenght=tableLst.get(0).size();
		List<TableColumn> tableInfoLst = new ArrayList<TableColumn>();
		TableColumn table = null;
		for (int ii = 0; ii < columnLenght; ii++) {
			table = new TableColumn();
			String columnName=tableLst.get(0).get(ii);
			columnName=columnName.replace("\r","").replace("\n","");
			columnName=columnName.replaceAll("\\s", "");
			table.setColumnName(columnName);
			tableInfoLst.add(table);
		}
		for (int i = 0; i <columnLenght; i++) {
				List<String> columnValueLst = new ArrayList<>();
				for (int j = 1; j <= tableLength-1; j++) {
					columnValueLst.add(tableLst.get(j).get(i));
				}
				tableInfoLst.get(i).setColumnValueLst(columnValueLst);	
		}
		return tableInfoLst;
	}	
}
