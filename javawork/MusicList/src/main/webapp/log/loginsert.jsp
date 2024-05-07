<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글 엔코딩
	request.setCharacterEncoding("utf-8");
%>    
<jsp:useBean id="dto" class="data.dto.McmbDto"/>
<jsp:useBean id="dao" class="data.dao.McmbDao"/>
<jsp:setProperty name="dto" property="*"/>
<%
	
	dao.insertMcmb(dto);
	
	response.sendRedirect("mcmblist.jsp");
%>