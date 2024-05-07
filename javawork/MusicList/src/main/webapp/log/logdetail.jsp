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
<body>
<div style="margin: 20px;width: 300px;">
	<form action="./mcmbinsert.jsp" method="post">
		<table class="table table-bordered">
		<tr>
				<th width="100" class="table-danger">아이디</th>
				<td>
					<input type="text" name="id" class="form-control"
					required="required" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">비밀번호</th>
				<td>
					<input type="text" name="password" class="form-control"
					required="required" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" class="btn btn-outline-secondary btn-sm"
					style="width: 80px;"
					onclick="location.href='mcmbinsert.jsp'">로그인</button>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>