package com.example.springbootjasperreport.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springbootjasperreport.model.CenterAddressDetails;
import com.example.springbootjasperreport.model.MasterInvoice;
import com.example.springbootjasperreport.repository.InvoiceJPARepository;

import io.vavr.control.Either;

public class InvoiceServiceImpl implements IInvoiceService{
	
	@Autowired 
	private InvoiceJPARepository iRepo;

	@Override
	public Either<Exception, MasterInvoice> getById(String id) {
		
				Optional<MasterInvoice> invoice =iRepo.findById(id);
		if(invoice.isPresent()) {
			return Either.right(invoice.get());
		}
		
		return Either.left(new Exception("Id not found"));
		}
	
@Override
public Either<Exception, ByteArrayInputStream> generatePdf(String id, CenterAddressDetails centerDetails) {
	
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	
	
	// TODO Auto-generated method stub
	return null;
}
}
