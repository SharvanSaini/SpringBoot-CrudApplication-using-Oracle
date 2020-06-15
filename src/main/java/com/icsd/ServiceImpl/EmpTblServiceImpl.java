package com.icsd.ServiceImpl;

import java.util.List;

//import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icsd.Model.EmpTblModel;
import com.icsd.Respository.EmpTblRepository;
import com.icsd.Service.EmpTblService;

@Service
public class EmpTblServiceImpl implements EmpTblService
{
	@Autowired
	EmpTblRepository empRepository;
	
	public List<EmpTblModel> getEmployeeList()
	{
		return empRepository.findAll();
	}
	
	public EmpTblModel getEmployeeById(int empid)
	{
		return empRepository.findById(empid).get();
	}
	
	public void addEmployee(EmpTblModel emp)
	{
		empRepository.save(emp);
		System.out.println("emp saved");
	}
	
	public void deleteEmp(int empid)
	{
		empRepository.deleteById(empid);
	}
	
	public void updateEmp(EmpTblModel emp)
	{
		empRepository.save(emp);
	}
}
