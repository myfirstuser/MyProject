package cn.zr.entity;

public class Emp {
    private Long empno;

    private String ename;

    private String ejob;

    private String esex;

    private Long eage;

    private Long deptno;
    
    private Dept dept;

    public Long getEmpno() {
        return empno;
    }

    public void setEmpno(Long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEjob() {
        return ejob;
    }

    public void setEjob(String ejob) {
        this.ejob = ejob;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public Long getEage() {
        return eage;
    }

    public void setEage(Long eage) {
        this.eage = eage;
    }

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
    
    
}