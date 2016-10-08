package jdbc.poxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.Impl.ImplFrom;
import jdbc.dao.Dao;
import jdbc.databaseConnection.DateBaseConnection;
import jdbc.vo.Vo;

public class PoxyDemo implements Dao{
	private DateBaseConnection dbc=null;
	//private Connection con=null;
	private Dao dan=null;
	public  PoxyDemo() throws Exception
	{
		this.dbc=new DateBaseConnection();
		//this.con=dbc.getDatebaseConnection();
		dan=new ImplFrom(this.dbc.getDatebaseConnection());
	}
	public boolean doCreate(Vo vos)throws Exception{
		   boolean flag=false;
            
		   flag=this.dan.doCreate(vos);
        	
	       this.dbc.CloseDatebaseConnection(this.dbc.getDatebaseConnection());
		   return flag;
		}     

		public List<Vo> findForm(String keyword)throws Exception {
			List<Vo> list=new ArrayList<Vo>();
			if(this.dan.findForm(keyword)!=null)
			{
              list=this.dan.findForm(keyword);
			}else{
				System.out.println("≤È’“≤ªµΩ");
			}
            //this.con.close();
			this.dbc.CloseDatebaseConnection(this.dbc.getDatebaseConnection());
			return list;
		}

		public boolean deleteFrom(String key)throws Exception {
			boolean flag=false;
			return flag;
		}

		public boolean updateFroem(String update) throws Exception {
			
			return false;
		}
	
}
