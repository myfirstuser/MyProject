package cn.zr.entity;

import java.util.List;

public class Dept {
    private Long deptno;

    private String dname;
    
    private String dloc;
    
    private List<Emp> emps;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
    
    
}