package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface ReportService {
	
	public List<Customer> getReportOnSearch(String sqlQuery);
	
	public void downloadPDFReport(List<Customer> customer);
	
	public void downloadExcelReport(List<Customer> customer);



	
	

}
