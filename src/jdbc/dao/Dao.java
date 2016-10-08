package jdbc.dao;

import java.util.List;

import jdbc.vo.Vo;

public interface Dao {
   public boolean doCreate(Vo vo)throws Exception;
   public List<Vo> findForm(String keyword)throws Exception;
   public boolean deleteFrom(String key)throws Exception;
   public boolean updateFroem(String update)throws Exception;
}
