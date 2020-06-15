package com.icsd.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblemp")
public class EmpTblModel
{
	public EmpTblModel()
	{
		
	}
	
	@Id
	@Column(name="empno")
	public int empno;
	
	public String ename;
	
	public int eage;
	
	public String eadd;
	
	public int esal;
	
	@Override
	public String toString() {
		return "EmpTblModel [empno=" + empno + ", ename=" + ename + ", eage=" + eage + ", eadd=" + eadd + ", esal="
				+ esal + "]";
	}

	public EmpTblModel(int empno, String ename, int eage, String eadd, int esal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.eage = eage;
		this.eadd = eadd;
		this.esal = esal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}
	
}
