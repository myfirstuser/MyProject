package cn.zr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zr.dao.DeptMapper;
import cn.zr.entity.Dept;
import cn.zr.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	
	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Dept> findAll() {
		return deptMapper.findAll();
	}

}
