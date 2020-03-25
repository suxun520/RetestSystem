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
		<!-- <div style="float: left">
			<a href="javascript:void(0)" onclick="out()">将成绩排名Excel文件导出</a>
		</div> -->
		<div>
			<button type="button" id="btnExport" onclick="ExportToExcel('${username}')" >导出到EXCEL</button>
		</div>
		<br />
		<div align="right" class="div3">
			<button style="color:red" onclick="deleteList()">删除所选(在第一列选中复选框并修改相应成绩后点此处按钮实现修改多项数据)</button>
			<button style="color:red" onclick="updateList()">修改所选(在第一列选中复选框后点此处按钮实现删除多项数据)</button>
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
								<th><span>全选</span><br /><input type="checkbox" name="ids" value="" id="check01"
									onclick="checkAll()" /></th>
								<th onclick="IdSort(${sort})" style="cursor: pointer;"><span
									class="arrow asc">ID</span>
									<div>
										<img src="/images/107.svg" />
									</div>
									<div>
										<img src="/images/106.svg" />
									</div></th>
								<th>考生类型</th>
								<th onclick="KsbhSort(${sort})" style="cursor: pointer;">
								<span
									class="arrow asc">考生编号</span>
									<div>
										<img src="/images/107.svg" />
									</div>
									<div>
										<img src="/images/106.svg" />
									</div></th>
								<th>学院代码</th>
								<th>学院名称</th>
								<th>专业代码</th>
								<th>专业名称</th>
								<th>姓名</th>
								<th>政治理论</th>
								<th>外国语</th>
								<th>专业课一</th>
								<th>专业课二</th>
								<th onclick="sortScore(${sort})" style="cursor: pointer;"><span>初试成绩</span>
									<div>
										<img src="/images/107.svg" />
									</div>
									<div>
										<img src="/images/106.svg" />
									</div></th>
								<th>笔试成绩</th>
								<th>面试成绩</th>
								<th>口语成绩</th>
								<th>复试成绩</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${scoreList}" var="score">
								<tr style="text-align: center; vertical-align: middle;">
									<td><input type="checkbox" class="cb" name="cbname"
										value="${score.ksbh}" /></td>
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
									<td><input style="" type="text" name="kys"
										value="${score.ky}"></input></td>
									<td>${score.fs}</td>
									<td><a href="#" class="btn btn-primary btn-xs"
										data-toggle="modal" data-target="#customerEditDialog"
										onclick="editSingle('${score.ksbh}')">修改</a> <a href="#"
										class="btn btn-danger btn-xs"
										onclick="deleteSingle('${score.ksbh}')">删除</a></td>
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
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="customerEditDialog" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改学生成绩</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_customer_form">
						<input type="hidden" id="ksbh" name="ksbh" />
						<div class="form-group">
							<label for="edit_linkMan" class="col-sm-2 control-label">口语成绩</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="ky"
									placeholder="口语成绩" name="ky">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="updateSingle()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
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
    
	
	function KsbhSort(sort){
		if(typeof(sort)=="undefined"){
    		sort="1";
    	}
		 var keyWord="${keyWord}";
	    	var pageNo="${pageNo}";
	    	var totalRecord="${totalRecord}";
	    	var username="${username}";
		obj= document.getElementsByName("ksbhs");
	     ksbhs = [];
         for( k in obj){
   	    ksbhs.push(obj[k].innerHTML);
     }
window.location.href ="${pageContext.request.contextPath }/KsbhSort.action?pageNo="+pageNo+"&sort="+sort+"&username="+username+"&keyWord="+ keyWord+"&ksbhs="+ksbhs+"&totalRecord="+totalRecord;

		
	}
	function IdSort(sort){
		if(typeof(sort)=="undefined"){
    		sort="1";
    	}
		 var keyWord="${keyWord}";
	    	var pageNo="${pageNo}";
	    	var totalRecord="${totalRecord}";
	    	var username="${username}";
		obj= document.getElementsByName("ksbhs");
  	     ksbhs = [];
            for( k in obj){
      	    ksbhs.push(obj[k].innerHTML);
        }
   window.location.href ="${pageContext.request.contextPath }/IdSort.action?pageNo="+pageNo+"&sort="+sort+"&username="+username+"&keyWord="+ keyWord+"&ksbhs="+ksbhs+"&totalRecord="+totalRecord;

	}
	function  sortScore(sort){
    	if(typeof(sort)=="undefined"){
    		sort="1";
    	}
        var keyWord="${keyWord}";
    	var pageNo="${pageNo}";
    	var totalRecord="${totalRecord}";
    	var username="${username}";
    	 obj= document.getElementsByName("ksbhs");
    	  ksbhs = [];
        for( k in obj){
        	ksbhs.push(obj[k].innerHTML);
        }
        window.location.href ="${pageContext.request.contextPath }/sort.action?pageNo="+pageNo+"&sort="+sort+"&username="+username+"&keyWord="+ keyWord;

    }

		function editSingle(ksbh) {
			$.ajax({
				type:"get",
				url:"${pageContext.request.contextPath }/student/edit.action",
				data:{"ksbh":ksbh},
				success:function(data) {
					$("#ksbh").val(data.ksbh);
					$("#ky").val(data.ky);
				}
			});
		}
		 $(function(){
	         	$("#check01").click(function(){
	         		//prop方法是元素属性设置方法  在1.8版本之前可以用attr方法
	         		$(".cb").prop("checked",this.checked);
	         	});
	         });
			function updateList(){
				obj1=  document.getElementsByName("kys");
				obj = document.getElementsByName("cbname");
				    ksbhs = [];
				    for(k in obj){
				        if(obj[k].checked)
				        	ksbhs.push(obj[k].value+","+obj1[k].value);
				    }
				    layer.confirm('确定修改这'+ksbhs.length+'记录吗',{
						btn:['确定','取消']
					},function()
					{
						/* 关闭提示框 */
						layer.closeAll('dialog');
						$.ajax({
							type:"get",
							url:"${pageContext.request.contextPath }/student/updateListKy.action",
							data:{"ksbhs":ksbhs},
							success:function(data) {
								layer.msg("学生信息修改成功！");
								window.location.reload();
							}
						});
					}
					)
			}
		function deleteList(){
			   obj = document.getElementsByName("cbname");
			    ksbhs = [];
			    for(k in obj){
			        if(obj[k].checked)
			        	ksbhs.push(obj[k].value);
			    }
			
			    layer.confirm('确定删除这'+ksbhs.length+'记录吗',{
					btn:['确定','取消']
				},function()
				{
					/* 关闭提示框 */
					layer.closeAll('dialog');
					$.ajax({
						type:"get",
						url:"${pageContext.request.contextPath }/student/deleteList.action",
						data:{"ksbhs":ksbhs},
						success:function(data) {
							layer.msg("学生删除成功！");
							window.location.reload();
						}
					});
				}
				)
		}
		//serialize将表单数据序列化
		function updateSingle() {
			$.post("${pageContext.request.contextPath }/student/updateKy.action",$("#edit_customer_form").serialize(),function(data){
				layer.msg("修改成功！");
				window.location.reload();
			});
		}
		function deleteSingle(ksbh) {
			layer.confirm('确定删除此条记录吗',{
				btn:['确定','取消']
			},function()
			{
				/* 关闭提示框 */
				layer.closeAll('dialog');
				$.ajax({
					type:"get",
					url:"${pageContext.request.contextPath }/student/deleteSingle.action",
					data:{"ksbh":ksbh},
					success:function(data) {
						layer.msg("学生删除成功！");
						window.location.reload();
					}
				});
			}
			)
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


	</script>



</body>

</html>
