package in.hj.dto;

import java.sql.Timestamp;
import java.util.Date;

public class EmployeeDTO {
    private Integer employeeID;
    private String nationalID;
    private Integer nationalIDTypeID;
    private Integer conactID;
    private String loginID;
    private String title;
    private Integer managerID;
    private Date DOB;
    private String martialStatus;
    private String gender;
    private Date hireDate;
    private Integer departmentID;
    private Integer currentFlag;
    private String modifiedBy;
    private Timestamp modifiedTS;
      
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Integer employeeID, String nationalID, Integer nationalIDTypeID, Integer conactID,
			String loginID, String title, Integer managerID, Date dOB, String martialStatus, String gender,
			Date hireDate, Integer departmentID, Integer currentFlag, String modifiedBy, Timestamp modifiedTS) {
		super();
		this.employeeID = employeeID;
		this.nationalID = nationalID;
		this.nationalIDTypeID = nationalIDTypeID;
		this.conactID = conactID;
		this.loginID = loginID;
		this.title = title;
		this.managerID = managerID;
		DOB = dOB;
		this.martialStatus = martialStatus;
		this.gender = gender;
		this.hireDate = hireDate;
		this.departmentID = departmentID;
		this.currentFlag = currentFlag;
		this.modifiedBy = modifiedBy;
		this.modifiedTS = modifiedTS;
	}
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public Integer getNationalIDTypeID() {
		return nationalIDTypeID;
	}
	public void setNationalIDTypeID(Integer nationalIDTypeID) {
		this.nationalIDTypeID = nationalIDTypeID;
	}
	public Integer getConactID() {
		return conactID;
	}
	public void setConactID(Integer conactID) {
		this.conactID = conactID;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getManagerID() {
		return managerID;
	}
	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public Integer getCurrentFlag() {
		return currentFlag;
	}
	public void setCurrentFlag(Integer currentFlag) {
		this.currentFlag = currentFlag;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getModifiedTS() {
		return modifiedTS;
	}
	public void setModifiedTS(Timestamp modifiedTS) {
		this.modifiedTS = modifiedTS;
	}
    
}