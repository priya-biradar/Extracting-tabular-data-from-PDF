package com.tabula.pdfextraction;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class TableRow {
	private String subjectCode;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getInternal() {
		return internal;
	}
	public void setInternal(Integer internal) {
		this.internal = internal;
	}
	public Integer getExternal() {
		return external;
	}
	public void setExternal(Integer external) {
		this.external = external;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String val) {
		this.grade = val;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	private String subjectName;
	private Integer internal;
	private Integer external;
	private Integer total;
	private String grade;
	private Integer credits;
	
}
