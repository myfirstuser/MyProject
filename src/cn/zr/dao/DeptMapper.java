package cn.zr.dao;

import java.util.List;

import cn.zr.entity.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
    
    List<Dept> findAll();
}