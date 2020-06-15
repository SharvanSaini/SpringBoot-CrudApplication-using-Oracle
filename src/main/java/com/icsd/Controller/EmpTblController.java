package com.icsd.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.Model.EmpTblModel;
import com.icsd.Service.EmpTblService;


@RestController
@CrossOrigin(origins = "*")
public class EmpTblController {

	@Autowired
	EmpTblService empService;
	
	@CrossOrigin
	@GetMapping("/employeesTbl")
	public List<EmpTblModel> getEmployeeList()
	{
		System.out.println("fun called 10");
		return empService.getEmployeeList();
	}
	
	@PostMapping("/saveEmpTbl")
	public void addEmployee(@RequestBody EmpTblModel emp)
	{
		//json- ename in json is same as ename
		//variable in class emp
		
		System.out.println("heeeerreeerrrereeee");
		System.out.println(emp.getEmpno());
		System.out.println("Data recieved is :- "+emp);
		empService.addEmployee(emp);
	}
	
	@RequestMapping(value="/getAllEmps",method=RequestMethod.GET)
	public Map<String, Object> getAllEmps()
	{
		final HashMap<String, Object> map=new HashMap<>();
		
		map.put("empList", empService.getEmployeeList());
		
		System.out.println("get all emps controller called");
		
		return map;
	}
	
	
	@RequestMapping(value="/deleteEmpTbl",method=RequestMethod.GET)
	public void deleteEmp(@RequestParam(value="empno")int empno)
	{
	
	System.out.println("data recieve is :"+empno);
	empService.deleteEmp(empno);
		
	}
	
	
	
	//localhost:8901/getEmpByEmpno?empno=8903
	@RequestMapping(value="/getEmpByEmpno",method=RequestMethod.GET)
	public Map<String, Object> getEmpByEmpno(@RequestParam(value="empno")int empno)
	{
		final HashMap<String, Object> map=new HashMap<>();
		
		map.put("emp", empService.getEmployeeById(empno));
		System.out.println("get all emp by empno controller called");
		return map;
	}
}
