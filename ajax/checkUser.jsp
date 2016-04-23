<%@ page language="java" contentType="text/json; charset=utf-8"
    pageEncoding="utf-8"%>

<% 
String name=request.getParameter("name");

String msg=null;
int code=0;
System.out.print(name);
if("admin".equals(name.trim())){
	msg="对不起！这个用户名字不可用！！"+name;
	code=0;
}else{
		
	msg="恭喜你 这个用户名可用！！"+name;	
	code=1;
}%>
{"code":<%=code%>,"msg":"<%=msg%>"}
    <%=name%>
    
    <html></html>