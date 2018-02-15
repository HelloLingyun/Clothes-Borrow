<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="./static/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="./static/css/index.css" />
<link rel="stylesheet" type="text/css" href="./static/bootstrap-fileinput/fileinput.min.css" />
<link rel="stylesheet" type="text/css" href="./static/easyui-1.4.1/themes/bootstrap/easyui.css" />
<link rel="stylesheet" type="text/css" href="./static/easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="./static/js/jquery.min.js"></script>
<script type="text/javascript" src="./static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./static/easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./static/easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="./static/bootstrap-fileinput/fileinput.min.js"></script>
<script type="text/javascript" src="./static/bootstrap-fileinput/zh.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-2 column">
					<!-- 左侧菜单 start -->
					<div class="panel panel-danger"  id="leftSide">
						<div class="panel-heading" style="background-color: #333333">
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">					
									<li class="dropdown">
										 <a href="#" class="dropdown-toggle" data-toggle="dropdown">
										 	<img alt="140x140" src="./static/img/headPic.jpeg" class="img-circle" style="width: 50px; height: 50px; " />
										 	<span style="color: #CCCC99">admin</span>
										 </a>
										<ul class="dropdown-menu">
											<li>
												 <a href="#">注销</a>
											</li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
						<div class="panel-body"  style="background-color: #9966CC; margin-left: -1px;">
							<div class="leftSide-item"  id="addClothes">
								<span>添加服装</span>
							</div>
							<div class="leftSide-item" id="pushOrder">
								<span>发布订单</span>
							</div>
							<div class="leftSide-item" id="unCheckOrder">
								<span>未完成订单</span>
							</div>
							<div class="leftSide-item" id="checkOrder">
								<span>已完成订单</span>
							</div>
							<div class="leftSide-item" id="realStock">
								<span>实时库存</span>
							</div>
							<div class="leftSide-item" id="recovery">
								<span>回收站</span>
							</div>
							<div class="leftSide-item" id="maintain">
								<span>账号维护</span>
							</div>
						</div>
						
						<div class="panel-footer"  style="background-color: #333333">
	    					<span id="nowTime"  style="color: #CCCC99"></span>
						</div>
					</div>
					<!-- 左侧菜单 end -->
				</div>
				<div class="col-md-10 column" >
					<div data-options="region:'center',title:''">
				    	<div id="tabs" class="easyui-tabs" style="width: 1024px;">
						    <div title="HOME" style="padding:10px;">
						        	
						    </div>
						</div>
				    </div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
$(function(){
	$('#addClothes').click(function(){
		addTags('initaddClothes.do','添加服装');
	});
	$('#pushOrder').click(function(){
		addTags('pushOrder.do','发布订单');
	});
	$('#unCheckOrder').click(function(){
		addTags('unCheckOrder.do','未完成订单');
	});
	$('#checkOrder').click(function(){
		addTags('checkOrder.do','已完成订单');
	});
	$('#realStock').click(function(){
		addTags('realStock.do','实时库存');
	});
	$('#recovery').click(function(){
		addTags('recovery.do','回收站');
	});
	$('#maintain').click(function(){
		addTags('maintain.do','账号维护');
	});

	
});

//添加标签方法
function addTags(url,title){
	var tabs = $("#tabs");
	var tab = tabs.tabs("exists",title);
	if(tab){
		tabs.tabs("select",title);
	}else{
		tabs.tabs('add',{
		    title:title,
		    href: url,
		    closable:true,
		    bodyCls:"content"
		});
	}
}

	setInterval("document.getElementById('nowTime').innerHTML=' 星期'+'日一二三四五六'.charAt(new Date().getDay())+'<br>'+new Date().toLocaleString();",1000);
</script>
</body>
</html>