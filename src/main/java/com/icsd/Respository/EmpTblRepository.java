package com.icsd.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icsd.Model.EmpTblModel;

public interface EmpTblRepository extends JpaRepository<EmpTblModel, Integer>
{

}
