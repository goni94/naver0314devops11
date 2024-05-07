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
					<th width="100">봄이와도</th>
				</tr>
				<tr>
					<th width="100">로이킴</th>
				</tr>
				<tr>
					<th width="100">발라드</th>
				</tr>
				<tr>
					<th width="100">앨범명: 봄이와도</th>
				</tr>
				<tr>
					<th width="100">발매일: 2024.03.04.</th>
				</tr>
				<tr>
					<td colspan="1" align="center">
    					<button type="button" style="width: 80px;" onclick="openYoutubeLink()">노래듣기</button>
					</td>
				</tr>
				<script>
			    function openYoutubeLink() {
			        // 유튜브 링크를 여기에 입력하세요
			        var youtubeLink = "https://www.youtube.com/watch?v=moVgOwYOXec"; // 예시 유튜브 링크
			
			        // 새 창에서 유튜브 링크 열기
			        window.open(youtubeLink);
			    }
				</script>
			</table>
		</form>
	</div>	
</body>
</html>