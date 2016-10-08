<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
</head>
<body>
  <center>
   <form action="lookesfrom.jsp" method="post">
         编号：<input type="text" name="empno"/><br>
         姓名：<input type="text" name="ename"/><br>
         职位：<input type="text" name="job"/><br>
         日期：<input type="text" name="hiredate"/><br>
         工资： <input type="text" name="sal"/><br>
      <input type="submit" value="添加"/>
      <input type="reset" value="重置"/>
   </form>
   </center>
</body>
</html>