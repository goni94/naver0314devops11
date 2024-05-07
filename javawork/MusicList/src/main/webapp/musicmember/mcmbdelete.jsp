<%@page import="data.dao.McmbDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int member=Integer.parseInt(request.getParameter("member"));

	McmbDao dao=new McmbDao();
	
	dao.deleteMcmb(member);
	
	response.sendRedirect("mcmblist.jsp");
%>