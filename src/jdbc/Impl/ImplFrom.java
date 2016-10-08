package jdbc.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.dao.Dao;
import jdbc.vo.Vo;

public class ImplFrom implements Dao{
    private Connection con=null;
    private PreparedStatement ps=null;
    public ImplFrom(Connection con)
    {
    	this.con=con;
    }
	public boolean doCreate(Vo vos)throws Exception{
	   boolean flag=false;
       String sql="insert into emp(empno,ename,job,hiredate,sal) values(?,?,?,?,?)";		
	   ps=con.prepareStatement(sql);
	   ps.setInt(1, vos.getEmpno());
	   ps.setString(2, vos.getEname());
	   ps.setString(3, vos.getJob());
	   //利用此方法进行时间转化
	   ps.setDate(4,  new java.sql.Date(vos.getHiredate().getTime()));
	   ps.setFloat(5, vos.getSal());
	   int rs=ps.executeUpdate();
	   if(rs!=0)
	   {
		   flag=true;
	   }
	   ps.close();
	   return flag;
	}

	public List<Vo> findForm(String keyword)throws Exception {
		   Vo vos=null;
	       String sql="select empno,ename,job,hiredate,sal from emp where ename like ?";		
		   List<Vo> list=new ArrayList<Vo>();
	       System.out.println(con);
	       this.ps=this.con.prepareStatement(sql);
	       this.ps.setString(1, "%"+keyword+"%");
	       
		   ResultSet rs=this.ps.executeQuery();
		   while(rs.next())
		   {
			   vos=new Vo();
			   vos.setEmpno(rs.getInt(1));
			   vos.setEname(rs.getString(2));
			   vos.setJob(rs.getString(3));
			   vos.sethiredate(rs.getDate(4));
			   vos.setSal(rs.getFloat(5));
			   list.add(vos);
		   }
		   this.ps.close();
		return list;
	}

	public boolean deleteFrom(String key)throws Exception {
		boolean flag=false;
		String sql="delete from";
		return flag;
	}

	public boolean updateFroem(String update) throws Exception {
		
		return false;
	}
  
}
