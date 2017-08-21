/**
 * 
 */
package com.oracle.hed.relops.bean.excel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oracle.excel.util.helper.CommonUtil;

/**
 * @author raparash
 *
 */
public class ExcelRow {
	private static final Logger LOGGER=Logger.getLogger(ExcelRow.class.getName());
	private Map<ExcelColumnHeader, String> mapOfColums=new LinkedHashMap<ExcelColumnHeader, String>();
	private ExcelColumnPool columnPool;
	/**
	 * @return the columnPool
	 */
	public ExcelColumnPool getColumnPool() {
		return columnPool;
	}

	/**
	 * @param columnPool the columnPool to set
	 */
	public void setColumnPool(ExcelColumnPool columnPool) {
		this.columnPool = columnPool;
	}

	/**
	 * @return the mapOfColums
	 */
	public Map<ExcelColumnHeader, String> getMapOfColums() {
		return mapOfColums;
	}

	/**
	 * @param mapOfColums the mapOfColums to set
	 */
	public void setMapOfColums(Map<ExcelColumnHeader, String> mapOfColums) {
		this.mapOfColums = mapOfColums;
	}
	
	/**
	 * Gets the value by column index
	 * @param columnId
	 * @return
	 */
	public String getColumnValue(int columnId){
		ExcelColumnHeader columnHeader=getColumnPool().getColumn(columnId);
		String value=CommonUtil.safeTrim(mapOfColums.get(columnHeader));
		return value;
	}
	
	/**
	 * Gets the value by column name
	 * @param columnName
	 * @return
	 */
	public String getColumnValue(String columnName){
		ExcelColumnHeader columnHeader=getColumnPool().getColumn(columnName);
		String value=CommonUtil.safeTrim(mapOfColums.get(columnHeader));
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(Entry<ExcelColumnHeader,String> entry:mapOfColums.entrySet()){
			builder.append(entry.getKey().getName()+" : "+entry.getValue()+", ");
		}
		builder.deleteCharAt(builder.lastIndexOf(","));
		return builder.toString();
	}
	
	/**
	 * Code patched for row formatting
	 * @return
	 */
	public boolean isRowFormatted(){
		boolean isRowFormatted=true;
		for(Entry<ExcelColumnHeader,String> entry:mapOfColums.entrySet()){
			if(CommonUtil.safeTrim(entry.getValue()).isEmpty()){
				isRowFormatted=false;
				LOGGER.log(Level.INFO,"Found Empty Column: <"+entry.getKey().getName()+">");
			}
		}
		return isRowFormatted;
	}
	
	/**
	 * Code patched for empty row detection
	 * @return
	 */
	public boolean isRowEmpty(){
		boolean isRowEmpty=false;
		int countColumns=0;
		for(Entry<ExcelColumnHeader,String> entry:mapOfColums.entrySet()){
			if(CommonUtil.safeTrim(entry.getValue()).isEmpty()){
				countColumns++;
			}
		}
		if(countColumns==getColumnPool().getColumnPool().length)
			isRowEmpty=true;
	return isRowEmpty;	
	}
}
