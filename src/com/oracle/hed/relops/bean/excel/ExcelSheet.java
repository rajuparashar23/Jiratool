/**
 * 
 */
package com.oracle.hed.relops.bean.excel;

import java.util.List;

/**
 * @author raparash
 *
 */
public class ExcelSheet {
	private List<ExcelRow> excelRows;
	private String sheetName;
	private String fileName;
	/**
	 * @return the excelRows
	 */
	public List<ExcelRow> getExcelRows() {
		return excelRows;
	}

	/**
	 * @param excelRows the excelRows to set
	 */
	public void setExcelRows(List<ExcelRow> excelRows) {
		this.excelRows = excelRows;
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName the sheetName to set
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void parseExcelSheet(){
		
	}
}
