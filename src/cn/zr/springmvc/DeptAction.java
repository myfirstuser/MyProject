package cn.zr.springmvc;

import java.util.List;
import java.util.Map;

import javax.enterprise.inject.Specializes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zr.entity.Dept;
import cn.zr.service.DeptService;

@Controller
public class DeptAction {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("findAll")
	public String findAll(Map<String,Object> map){
		List<Dept> depts=deptService.findAll();
		map.put("depts", depts);
		return "deptShowAll";
	}
	
	
}
