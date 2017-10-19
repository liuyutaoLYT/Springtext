package com;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("sss")
public class ReportService {
	ReportGenerator reprotGenerator;

	public ReportGenerator getReprotGenerator() {
		return reprotGenerator;
	}
	@Resource(name="pdfReportGenerator")
	public void setReprotGenerator(ReportGenerator reprotGenerator) {
		this.reprotGenerator = reprotGenerator;
	}
	public void runner(){
		System.out.println("aaa");
		System.out.println("bbb");
		reprotGenerator.generator();
	}
}
