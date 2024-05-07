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
    body * {
        font-family: 'Jua';
    }
        margin: 0;
            padding: 0;
            background-image: url('../image/watermelon2.png');
            background-size: 100%;
            background-repeat: no-repeat;
            background-position: center;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

       
		.search {
		  position: relative;
		  width: 300px;
		}
		
		input {
		position: relative;
		top: 100px;
		left: 450px;
		  width: 50%;
		  border: 1px solid #bbb;
		  border-radius: 8px;
		  padding: 10px 12px;
		  font-size: 14px;
		}
		
		img {
		  position : absolute;
		  width: 17px;
		  top: 10px;
		  right: 12px;
		  margin: 0;
		}
		
		button {
		position: relative; /* 상대적인 위치 설정 */
		top: 60px; /* 위로 20px 이동 */
		left: 1460px; /* 부모 요소의 가운데 정렬 */
		transform: translateX(-50%); /* 가로 가운데 정렬 */
		}
        	
    </style>
		</head>
			<body style="background-image:url('../image/watermelon2.png'); background-size : 100%; background-repeat : no-repeat; background-position: center;">
				<div style="margin: auto; margin-top: 300px; width: 300px;" >
				</div>
		<div class="search">
			<input type="text" placeholder="검색어 입력">
		</div>
	<table>
		<tr>
			<td colspan="1" align="right">
				<button type="button" class="btn btn-sm btn-warning"
						style="width: 80px ;"
						onclick="location.href='../song/songlist.jsp'">search</button>
			</td>
		</tr>
	</table>
</body>
</html>