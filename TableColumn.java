package com.tabula.pdfextraction;
import java.util.List;
public class TableColumn{
	private String columnName;
	private List<String> columnValueLst;
	public List<String> getColumnValueLst() {
		return columnValueLst;
	}
	public void setColumnValueLst(List<String> columnValueLst) {
		this.columnValueLst = columnValueLst;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
