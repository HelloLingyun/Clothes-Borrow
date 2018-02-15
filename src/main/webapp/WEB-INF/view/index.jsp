<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./static/bootstrap/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="./static/bootstrap/css/bootstrap.css" />
<script type="text/javascript" src="./static/js/jquery.min.js"></script>
<script type="text/javascript" src="./static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./static/easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./static/easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-2 column">
					<!-- 左侧菜单 start -->
					<div class="panel panel-danger">
						<div class="panel-heading">
							<img alt="140x140" src="./static/img/headPic.jpeg" class="img-circle" style="width: 50px; height: 50px; " />
						</div>
						<div class="panel-body">
							Panel content
						</div>
						
						<div class="panel-footer" >
	    					<span id="nowTime"></span>
						</div>
					</div>
					<!-- 左侧菜单 end -->
				</div>
				<div class="col-md-10 column">
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	setInterval("document.getElementById('nowTime').innerHTML=' 星期'+'日一二三四五六'.charAt(new Date().getDay())+'<br>'+new Date().toLocaleString();",1000);
</script>
</body>
</html>