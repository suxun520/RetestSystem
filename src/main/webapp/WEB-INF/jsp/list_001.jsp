<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://page.way2a.com/tag" prefix="pager"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
.div3 {
	position: absolute;
	top: 70px;
	right: 30px;
	border: 2px;
}
</style>

<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
			<meta name="description" content="">
				<meta name="author" content="">

					<title>复试成绩表</title> <script src="/js/jquery-1.11.3.min.js"
						type="text/javascript"></script>
					<script type="text/javascript" src="/layer-v3.1.1/layer/layer.js"></script>

					<!-- Bootstrap Core CSS -->
					<link
						href="${pageContext.request.contextPath }/css/bootstrap.min.css"
						rel="stylesheet">

						<!-- MetisMenu CSS -->
						<link
							href="${pageContext.request.contextPath }/css/metisMenu.min.css"
							rel="stylesheet">

							<!-- DataTables CSS -->
							<link
								href="${pageContext.request.contextPath }/css/dataTables.bootstrap.css"
								rel="stylesheet">

								<!-- Custom CSS -->
								<link
									href="${pageContext.request.contextPath }/css/sb-admin-2.css"
									rel="stylesheet">

									<!-- Custom Fonts -->
									<link
										href="${pageContext.request.contextPath }/css/font-awesome.min.css"
										rel="stylesheet" type="text/css">
										<link
											href="${pageContext.request.contextPath }/css/boot-crm.css"
											rel="stylesheet" type="text/css">
</head>



<body>


	<div id="page-wrapper">
		<div style="float: left">
			<form class="excel" enctype="multipart/form-data"
				action="${pageContext.request.contextPath }/excel/import.action"
				method="post">
				导入excel表: <input type="file" name="file"> <input
					type="hidden" name="username" value="${username}"></input> <input
					type="hidden" name="pageNo" value="${pageNo}"></input> <input
					type="submit" value="导入">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			</form>
		</div>
	
	
		<br />
		<div align="right" class="div3">
		   <button onclick="DeleteDatabase()">清除数据库数据</button>
			<button type="button" id="btnExport" onclick="ExportToExcel('${username}')" >导出到EXCEL</button>
		</div>

		<div style="clear: left">
			<input type="text" value="${keyWord}" id="keyWord" />
			<button onclick="keyWord()">查询</button>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">复试成绩管理</div>
					<!-- /.panel-heading -->
					<table class="table table-bordered table-striped" id="tableSort">
						<thead>
							<tr>
								
								<th>ID
									</th>
								<th>考生类型</th>
								<th>考生编号
									</th>
								<th>学院代码</th>
								<th>学院名称</th>
								<th>专业代码</th>
								<th>专业名称</th>
								<th>姓名</th>
								<th>政治理论</th>
								<th>外国语</th>
								<th>专业课一</th>
								<th>专业课二</th>
								<th>初试成绩</th>
								<th>笔试成绩</th>
								<th>面试成绩</th>
								<th>口语成绩</th>
								<th>复试成绩</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${scoreList}" var="score">
								<tr style="text-align: center; vertical-align: middle;">
									<td>${score.bmddm}</td>
									<td>${score.kslx}</td>
									<td name="ksbhs">${score.ksbh}</td>
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
									<td><font name="bss">${score.bs}</font></td>
									<td><font name="mss">${score.ms}</font></td>
									<td><font name="kys">${score.ms}</font></td>
									<td>${score.fs}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div>
						<pager:page pageSize="50" pageNo="${pageNo}"
							url="/page.action?sort=${sort}" totalRecord="${totalRecord}" />
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<script src="${pageContext.request.contextPath }/js/deleteDatabase.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/jquery.table2excel.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/metisMenu.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/dataTables.bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/sb-admin-2.js"></script>
	<script type="text/javascript">
	/* 	单科达到一定条件标记下 */
	window.onload=function (){
        obj=    document.getElementsByName("kys");
		obj1 = document.getElementsByName("bss");
		obj2 = document.getElementsByName("mss");
		
       for(k in obj){
    	   if (obj[k].value<30){
    		   obj[k].style.color = "red";
    	   }
       }
       for(k in obj1){
    	   if (obj1[k].innerText<60){
    		   obj1[k].color = "red";
    	   }
       } 
       
       for(k in obj2){
    	   if (obj2[k].innerText<60){
    		   obj2[k].color = "red";
    	   }
       } 
}
	
	function keyWord(){
		obj=document.getElementById("keyWord");
		var keyWord=obj.value;

    	var username="${username}";
        window.location.href ="${pageContext.request.contextPath }/keyWord.action?keyWord="+keyWord+"&username="+username;

	}

		//导出
		function ExportToExcel(username) { 
		
			  layer.confirm('确定导出吗?', {
				  btn: ['确定','取消'] //按钮
				}, function(){
					layer.closeAll('dialog');
					 window.location.href ="${pageContext.request.contextPath }/export.action?username="+username; 
				});
			}
		
	/* 	function DeleteDatabase(){
			layer.confirm('确定删除吗?', {
				  btn: ['确定','取消'] //按钮
				}, function(){
					layer.closeAll('dialog');
					$.ajax({
						type:"get",
						url:"${pageContext.request.contextPath }/deleteDatabase.action",
						success:function(data) {
							layer.msg("删除成功");
							window.location.reload();
						}
					});
				});
			} */
		


	</script>



</body>

</html>
