package in.hj.service;

import java.util.ArrayList;

import in.hj.dto.EmployeeDTO;
import in.hj.dto.EmployeeRequestDTO;

public interface EmployeeService {
	
	ArrayList<EmployeeDTO> getEmployeeList(EmployeeRequestDTO request);

}
