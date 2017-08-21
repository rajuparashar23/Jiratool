/**
 * 
 */
package com.oracle.hed.relops.bean.excel;

/**
 * @author raparash
 *
 */
public class ExcelColumnHeader {
	private String name;
	private int columnId;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name.toUpperCase();
		setColumnId(this.name.hashCode());
	}
	/**
	 * @return the columnId
	 */
	public int getColumnId() {
		return columnId;
	}
	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}
	
	
}
