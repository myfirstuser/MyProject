package cn.zr.dao;

import cn.zr.entity.Emp;

public interface EmpMapper {
    int insert(Emp record);

    int insertSelective(Emp record);
    
    Emp selectEmp(Long empno);
}