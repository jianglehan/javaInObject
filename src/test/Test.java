package test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import jdbc.factory.Factory;
import jdbc.vo.Vo;

public class Test {
    
	public static void main(String []args) throws Exception
     {
            Vo vo=new Vo();
            vo.setEmpno(4545);
            vo.setEname("���ֺ�");
            vo.sethiredate(new Date());
            vo.setJob("����Ա");
            vo.setSal(500);
            //��������ֵ
            //Factory.factoryDemo().doCreate(vo);
            //��������ֵ
            List<Vo> s=Factory.factoryDemo().findForm("");
            Iterator<Vo> it=s.iterator();
            Vo vot=null;
            while(it.hasNext())
            {
            	vot=it.next();
            	System.out.println(vot.getEmpno()+"  "+vot.getEname());
            }
            
     }
     
}
