package jdbc.vo;

import java.util.Date;

public class Vo {
  private int empno;
  private String ename;
  private String job;
  private Date hiredate;
  private float sal;
  
  public void setEmpno(int empno)
  {
	   this.empno=empno;
  }
  public void setEname(String ename)
  {
	  this.ename=ename;
  }
  public void setJob(String job)
  {
	  this.job=job;
  }
  public void sethiredate(Date hiredate)
  {
	  this.hiredate=hiredate;
  }
  public void setSal(float sal)
  {
	  this.sal=sal;
  }
  public int getEmpno()
  {
	  return this.empno;
  }
  public String getEname() {
		return ename;
	}
  public String getJob() {
		return job;
	}
  public Date getHiredate() {
		return hiredate;
	}
  public float getSal() {
		return sal;
	}
  
}
