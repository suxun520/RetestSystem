<%@ page language="java"
	contentType="application/msexcel; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//Content-disposition  来到这个页面就下载数据
	response.setHeader("Content-disposition", "attachment; filename=test.xls");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 1000px;
	margin: 0 auto;
}

table, td, th {
	border: 1px solid black;
}

a {
	text-decoration: none;
	color: #333;
}

a:hover {
	color: #ff0000;
}
</style>
</head>



<body>

	<table style="table-layout: fixed" id="tableExcel">
		<!-- table-layout:fixed 防止table里的th td 设置宽度无效 -->
		<tr>
			            <th>bmddm</th>
						<th>kslx</th>
						<th>ksbh</th>
						<th>bkyxsm</th>
						<th>bkyxsmc</th>
						<th>bkzydm</th>
						<th>bkzymc</th>
						<th>xm</th>
						<th>zzll</th>
						<th>wgy</th>
						<th>ywk1</th>
						<th>ywk2</th>
						<th>cszf</th>
						<th>bs</th>
						<th>ms</th>
						<th>ky</th>
						<th>fs</th>
		</tr>
	<c:forEach items="${scoreList}" var="score">
								  <tr>
									<td>${score.bmddm}</td>
									<td>${score.kslx}</td>
									<td>${score.ksbh}</td>
									<td>${score.bkyxsm}</td>
									<td>${score.bkyxsmc}</td>
									<td>${score.bkzydm}</td>
									<td>${score.bkzymc}</td>
									<td>${score.xm}</td>
									<td>${score.zzll}</td>
									<td>${score.wgy}</td>
									<td>${score.ywk1}</td>
									<td>${score.ywk2}</td>
									<td>${score.cszf}</td>
									<td>${score.bs}</td>
									<td>${score.ms}</td>
									<td>${score.ky}</td>
									<td>${score.fs}</td>
								</tr>
							</c:forEach>
	</table>
</body>
</html>