package com.example.springbootjasperreport.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootjasperreport.model.MasterInvoice;

@Repository
public interface InvoiceJPARepository extends MongoRepository<MasterInvoice, String>{

}
