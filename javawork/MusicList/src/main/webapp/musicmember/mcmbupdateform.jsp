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
%>
<body>
<div style="margin: 20px;width: 300px;">
	<form action="./mcmbupdate.jsp" method="post">
		<input type="hidden" name="member" value="<%=member%>">
		
		<table class="table table-bordered">
			<caption align="top">
				<h5 class="alert alert-success">회원정보수정</h5>
			</caption>
			<tr>
				<th width="100" class="table-danger">아이디</th>
				<td>
					<input type="text" name="id" class="form-control"
					required="required" autofocus="autofocus" value="<%=dto.getId()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">비밀번호</th>
				<td>
					<input type="text" name="password" class="form-control"
					required="required" autofocus="autofocus" value="<%=dto.getPassword()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">이름</th>
				<td>
					<input type="text" name="name" class="form-control"
					required="required" autofocus="autofocus"
					value="<%=dto.getName()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">성별</th>
				<td>
					<label>
						<input type="radio" name="gender" value="남자" 
						<%=dto.getGender().equals("남자")?"checked":""%>>남자
					</label>
					<label>
						<input type="radio" name="gender" value="여자"
						<%=dto.getGender().equals("여자")?"checked":""%>>여자
					</label>
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">나이</th>
				<td>
					<input type="number" name="age" class="form-control"
					required="required" min="1" max="100" step="1" 
					value="<%=dto.getAge()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">생년월일</th>
				<td>
					<input type="date" class="form-control" name="birthday"
					value="<%=dto.getBirthday()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">번호</th>
				<td>
					<input type="text" name="number" class="form-control"
					required="required" autofocus="autofocus" value="<%=dto.getNumber()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">주소</th>
				<td>
					<input type="text" name="addr" class="form-control"
					required="required" value="<%=dto.getAddr()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">상세주소</th>
				<td>
					<input type="text" name="detailaddr" class="form-control"
					required="required" value="<%=dto.getDetailaddr()%>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">이메일</th>
				<td>
					<input type="text" name="email" class="form-control"
					required="required" autofocus="autofocus" value="<%=dto.getEmail()%>">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-outline-secondary btn-sm"
					style="width: 80px;">정보수정</button>
					
					<button type="button" class="btn btn-outline-secondary btn-sm"
					style="width: 80px;"
					onclick="location.href='./mcmblist.jsp'">회원목록</button>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>



































