<%@page import="data.dto.McmbDto"%>
<%@page import="data.dao.McmbDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="dto" class="data.dto.McmbDto"/>
<jsp:useBean id="dao" class="data.dao.McmbDao"/>
<jsp:setProperty property="*" name="dto"/>
<%
	dao.updateMcmb(dto);
	response.sendRedirect("mcmbdetail.jsp?member="+dto.getMember());
%>