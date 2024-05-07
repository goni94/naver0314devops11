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
	//insert 메서드 호출
	dao.insertMcmb(dto);
	//사원목록으로 이동
	response.sendRedirect("../log/longform.jsp");
%>