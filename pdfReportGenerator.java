package com;

import org.springframework.stereotype.Component;

@Component
public class pdfReportGenerator implements ReportGenerator {

	@Override
	public void generator() {
		System.out.println("pdf");
		
	}
	
}
