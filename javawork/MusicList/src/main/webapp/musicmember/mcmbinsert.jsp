<%@page import="data.dao.LogDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//한글 엔코딩
	request.setCharacterEncoding("utf-8");
%>    

<%
	String id = request.getParameter("id");
	int password = Integer.parseInt(request.getParameter("password"));
	System.out.println(id);
	LogDao dao = new LogDao();
	if(dao.loginCheck(id, password)){
		response.sendRedirect("../log/watermelon.jsp");
	}else{%>
		<script>
		alert("아이디 또는 비밀번호가 틀렸습니다")
		history.back();
		</script>
	<%}
%>