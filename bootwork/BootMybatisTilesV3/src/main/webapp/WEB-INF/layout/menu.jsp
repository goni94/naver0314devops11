<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
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
       
       ul.menu{
  	       	list-style: none;
  	       	margin-left: 610px;
      }
       ul.menu li{
	       	float: left;
	       	width: 120px;
	       	font-size: 25px;
	       	border: 2px solid #00ced1;
	       	border-radius:20px;
	       	text-align: center;
	       	margin-right: 10px;
    		background-color: #ffc0cb;    		
       }
       ul.menu li a{
        font-family: 'Single Day'
       }
      
       ul.menu li:hover{
       		box-shadow: 5px 5px 5px gray;
       		background-color: #2e8b57;
       		color: white;
       }
       
       ul.menu li a:hover{
       		color: white;
       }
       
   </style>
</head>
<body>
<c:set  var="root" value="<%=request.getContextPath()%>"/>
<ul class="menu">
	<li>
		<a href="${root}/">Home</a>
	</li>
	<li>
		<a href="${root}/member/form">회원가입</a>
	</li>
	<li>
		<a href="${root}/member/list">회원목록</a>
	</li>
	<li>
		<a href="${root}/board/list">게시판</a>
	</li>
	<li>
		<a href="${root}/guest/list">방명록</a>
	</li>
</ul>
</body>
</html>



















