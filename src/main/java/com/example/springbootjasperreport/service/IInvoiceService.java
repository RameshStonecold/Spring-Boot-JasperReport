package com.example.springbootjasperreport.service;

import java.io.ByteArrayInputStream;

import com.example.springbootjasperreport.model.CenterAddressDetails;
import com.example.springbootjasperreport.model.MasterInvoice;

import io.vavr.control.Either;

public interface IInvoiceService {

	public Either<Exception,MasterInvoice> getById(String id);
	
	public Either<Exception, ByteArrayInputStream> generatePdf(String id,CenterAddressDetails centerDetails);
}
