package com.example.springbootjasperreport.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MasterInvoice {

	@Id
	private String _id;
	private String invoiceCreatedDate;
	private String panNumber;
	private String gstNumber;
	private String centerId;
	private String centerName;
	private String billPeriodCreatedDate;
	private String billPeriodEndDate;
	
	private List<BatchDetails> batchInvoiceList;

	
	public MasterInvoice(String _id, String invoiceCreatedDate, String panNumber, String gstNumber, String centerId,
			String centerName, String billPeriodCreatedDate, String billPeriodEndDate,
			List<BatchDetails> batchInvoiceList) {
		super();
		this._id = _id;
		this.invoiceCreatedDate = invoiceCreatedDate;
		this.panNumber = panNumber;
		this.gstNumber = gstNumber;
		this.centerId = centerId;
		this.centerName = centerName;
		this.billPeriodCreatedDate = billPeriodCreatedDate;
		this.billPeriodEndDate = billPeriodEndDate;
		this.batchInvoiceList = batchInvoiceList;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getInvoiceCreatedDate() {
		return invoiceCreatedDate;
	}

	public void setInvoiceCreatedDate(String invoiceCreatedDate) {
		this.invoiceCreatedDate = invoiceCreatedDate;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getBillPeriodCreatedDate() {
		return billPeriodCreatedDate;
	}

	public void setBillPeriodCreatedDate(String billPeriodCreatedDate) {
		this.billPeriodCreatedDate = billPeriodCreatedDate;
	}

	public String getBillPeriodEndDate() {
		return billPeriodEndDate;
	}

	public void setBillPeriodEndDate(String billPeriodEndDate) {
		this.billPeriodEndDate = billPeriodEndDate;
	}

	public List<BatchDetails> getBatchInvoiceList() {
		return batchInvoiceList;
	}

	public void setBatchInvoiceList(List<BatchDetails> batchInvoiceList) {
		this.batchInvoiceList = batchInvoiceList;
	}
       
	


}
