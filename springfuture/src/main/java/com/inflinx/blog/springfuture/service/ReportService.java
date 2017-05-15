package com.inflinx.blog.springfuture.service;

import com.inflinx.blog.springfuture.domain.Report;

import java.util.concurrent.Future;

public interface ReportService {
	
	public Future<Report> generateReport();
	
}
