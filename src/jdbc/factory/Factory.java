package jdbc.factory;

import jdbc.dao.Dao;
import jdbc.poxy.PoxyDemo;

public class Factory {
	public static Dao factoryDemo() throws Exception{
       return new PoxyDemo();
	}
}
