package com.icsd.Service;

import java.util.List;

import com.icsd.Model.EmpTblModel;

public interface EmpTblService {

	public List<EmpTblModel> getEmployeeList();
	
	public EmpTblModel getEmployeeById(int empid);
	
	public void addEmployee(EmpTblModel emp);
	
	public void deleteEmp(int empid);
	
	public void updateEmp(EmpTblModel emp);
}
