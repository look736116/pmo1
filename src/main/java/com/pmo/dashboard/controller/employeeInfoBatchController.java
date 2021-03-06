package com.pmo.dashboard.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pom.dashboard.service.EmployeeService;

@Controller
@RequestMapping(value="/employee")
public class employeeInfoBatchController {
	
	private static Logger logger = LoggerFactory
            .getLogger(employeeInfoBatchController.class);
	
	@Resource
    private EmployeeService employeeService;
	

    @RequestMapping("/employeeInfoBatch")
    public String employeeInfo(final HttpServletRequest request,final HttpServletResponse response)
    {
        return "employee/employeeInfoBatch";
    }
    
  
}


