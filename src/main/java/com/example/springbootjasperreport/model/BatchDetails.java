package com.example.springbootjasperreport.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BatchDetails {

	@Id
	private String _id;
	private String batchName;
	private String courseName;
	private String batchStartDate;
	private String term;
	private String noOfStudents;
	private String totalAmount;
	private String remarks;

	
	public BatchDetails(String _id, String batchName, String courseName, String batchStartDate, String term,
			String noOfStudents, String totalAmount, String remarks) {
		super();
		this._id = _id;
		this.batchName = batchName;
		this.courseName = courseName;
		this.batchStartDate = batchStartDate;
		this.term = term;
		this.noOfStudents = noOfStudents;
		this.totalAmount = totalAmount;
		this.remarks = remarks;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
