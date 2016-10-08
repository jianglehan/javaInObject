<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.factory.Factory"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="jdbc.vo.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询界面</title>
</head>
<body>
  <% request.setCharacterEncoding("UTF-8"); %>>
  <%--   <jsp:useBean id="vo" scope="request" class="jdbc.vo.Vo"/>
         <jsp:setProperty name="vo" property="empno" /> --%>
  <%
     Vo vo=new Vo();
     Vo so=null;
     vo.setEmpno(Integer.parseInt(request.getParameter("empno")));
     vo.setEname(request.getParameter("ename"));
     vo.setJob(request.getParameter("job"));
     vo.sethiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
     vo.setSal(Float.parseFloat(request.getParameter("sal")));
     
     if(Factory.factoryDemo().doCreate(vo))
     {
    	 
     }else{
    	 
     }
     
     List<Vo> list=null;
     list=Factory.factoryDemo().findForm("");
     Iterator<Vo> it=list.iterator();
     %>
      <center>
    	    <table border="1" width="80%">
     <% 
     while(it.hasNext())
     {
    	 so=it.next();
    	 %>
    	
    	        <tr>
    	           <td><%=so.getEmpno() %></td>
    	           <td><%=so.getEname() %></td>
    	           <td><%=so.getJob() %></td>
    	           <td><%=so.getHiredate() %></td>
    	           <td><%=so.getSal() %></td><br>
    	        </tr>

    	 <%
     }
     %>
            </table>
    	 </center>
     <% 
  %>
</body>
</html>