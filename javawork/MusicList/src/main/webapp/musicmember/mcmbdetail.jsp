<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.McmbDto"%>
<%@page import="data.dao.McmbDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
    <link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <style>
        body *{
            font-family: 'Jua';
        }
    </style>
</head>
<%
	int member=Integer.parseInt(request.getParameter("member"));
	McmbDao dao=new McmbDao();
	McmbDto dto=dao.getData(member);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
<div style="margin: 20px;width: 500px">
	<table>
		<caption align="top">
			<h2><b><%=dto.getName() %> 회원정보</b></h2>
		</caption>
		<tr>
			<td>
				<h5>아이디 : <%=dto.getId() %></h5>
				<h5>비밀번호 : <%=dto.getPassword() %></h5>
				<h5>이름 : <%=dto.getName() %></h5>
				<h5>생년월일 : <%=dto.getBirthday() %></h5>
				<h5>번호 : <%=dto.getNumber() %></h5>
				<h5>나이 : <%=dto.getAge() %>세</h5>
				<h5>성 별 : <%=dto.getGender() %></h5>
				<h5>주 소 : <%=dto.getAddr() %></h5>				
				<h5>상세주소 : <%=dto.getDetailaddr() %></h5>
				<h5>이메일 : <%=dto.getEmail() %></h5>
			</td>
		</tr>
		<tr height="60">
			<td colspan="2" align="center">
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='mcmbform.jsp'">회원추가</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='mcmblist.jsp'">사원목록</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='mcmbupdateform.jsp?member=<%=dto.getMember()%>'">회원수정</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				id="delmcmb" member="<%=dto.getMember()%>"
				name="<%=dto.getName()%>">회원삭제</button>
			</td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	$("#delmcmb").click(function(){
		let member=$(this).attr("member");
		let name=$(this).attr("name");
		let a=confirm(name+" 회원정보를 삭제할까요?");
		if(a){
			location.href="mcmbdelete.jsp?member="+member;
		}
	});
</script>
</body>
</html>







































