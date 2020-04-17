package in.hj.controller;

import java.util.ArrayList;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import in.hj.service.EmployeeService;
import in.hj.dto.EmployeeDTO;
import in.hj.dto.EmployeeRequestDTO;

@Slf4j
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController{
	
	private EmployeeService service;
	
	@GetMapping("/getList")
	public ArrayList<EmployeeDTO> getEmployeeList(@RequestBody EmployeeRequestDTO request, BindingResult bindingResult){
		
		ArrayList<EmployeeDTO> response = new ArrayList<>();
		
		return response;
		
	}

    

}