/**
 * 
 */
package com.oracle.hed.relops.bean.excel;

/**
 * @author raparash
 *
 */
public class JiraSubtask implements ExcelBean{

	private String projectCode;
	private String story;
	private String subTaskSummary;
	private String assignee;
	private String components;
	private String description;
	private String originalEstimate;

	/**
	 * @return the projectCode
	 */
	public String getProjectCode() {
		return projectCode;
	}
	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	/**
	 * @return the story
	 */
	public String getStory() {
		return story;
	}
	/**
	 * @param story the story to set
	 */
	public void setStory(String story) {
		this.story = story;
	}
	/**
	 * @return the subTaskSummary
	 */
	public String getSubTaskSummary() {
		return subTaskSummary;
	}
	/**
	 * @param subTaskSummary the subTaskSummary to set
	 */
	public void setSubTaskSummary(String subTaskSummary) {
		this.subTaskSummary = subTaskSummary;
	}
	/**
	 * @return the assignee
	 */
	public String getAssignee() {
		return assignee;
	}
	/**
	 * @param assignee the assignee to set
	 */
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	/**
	 * @return the components
	 */
	public String getComponents() {
		return components;
	}
	/**
	 * @param components the components to set
	 */
	public void setComponents(String components) {
		this.components = components;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the originalEstimate
	 */
	public String getOriginalEstimate() {
		return originalEstimate;
	}
	/**
	 * @param originalEstimate the originalEstimate to set
	 */
	public void setOriginalEstimate(String originalEstimate) {
		this.originalEstimate = originalEstimate;
	}
	

	/*
	 * (non-Javadoc)
	 * @see com.oracle.excel.util.bean.ExcelBean#convertToBean(com.oracle.excel.util.bean.ExcelRow)
	 */
	@Override
	public JiraSubtask convertToBean(ExcelRow excelRow) {
		this.setProjectCode(excelRow.getColumnValue(0));
		this.setStory(excelRow.getColumnValue(1));
		this.setSubTaskSummary(excelRow.getColumnValue(2));
		this.setAssignee(excelRow.getColumnValue(3));
		//this.setComponents(excelRow.getColumnValue(4));
		this.setDescription(excelRow.getColumnValue(4));
		this.setOriginalEstimate(excelRow.getColumnValue(5));
		return this;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JiraSubtask [projectCode=" + projectCode + ", story=" + story + ", subTaskSummary=" + subTaskSummary
				+ ", assignee=" + assignee + ", components=" + components + ", description=" + description
				+ ", originalEstimate=" + originalEstimate + "]";
	}
	
	
	
}
