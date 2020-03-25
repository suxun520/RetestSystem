function DeleteDatabase(){
			layer.confirm('确定删除吗?', {
				  btn: ['确定','取消'] //按钮
				}, function(){
					layer.closeAll('dialog');
					$.ajax({
						type:"get",
						url:"/deleteDatabase.action",
						success:function(data) {
							layer.msg("删除成功,请重新登录！");
							setTimeout(function(){
							
                          window.location.href="/index.action";
							},1000);

						}
					});
				});
			}