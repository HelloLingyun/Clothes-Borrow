<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

		<div class="col-md-12 column">
			<h3 class="text-center">
				添加服装信息
			</h3>

				<div class="col-md-12 column">
					<div class="col-md-2 column">
					</div>
					<div class="col-md-8 column">
						<form class="form-horizontal" role="form">
						<blockquote>
							<cite>服装分类</cite>
						</blockquote>
							<div class="form-group">
								 <label for="inputEmail3" class="col-sm-2 control-label">服装大类</label>
								<div class="col-sm-5">
									<select class="form-control" id="select_BigType" ></select>
								</div>
								<label for="inputPassword3" class="col-sm-2 control-label">服装小类</label>
								<div class="col-sm-3">
									<select class="form-control" id="select_SmallType" > </select>
								</div>
							</div>
							<blockquote>
							<cite>服装信息</cite>
							</blockquote>
							<div class="form-group">
								 <label for="inputEmail3" class="col-sm-2 control-label">服装名称</label>
								<div class="col-sm-5">
									<input type="text" class="form-control"  id="bigType" />
								</div>
								<label for="inputPassword3" class="col-sm-2 control-label">服装尺寸</label>
								<div class="col-sm-3">
									<select class="form-control" >
									  <option value ="S">S</option>
									  <option value ="M">M</option>
									  <option value="L">L</option>
									  <option value="XL">XL</option>
									  <option value ="XXL">XXL</option>
									  <option value ="XXXL">XXXL</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								 <label for="inputEmail3" class="col-sm-2 control-label">出租价格</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="bigType" onkeyup="value=value.replace(/[^\d.]/g,'')" placeholder="只能整数或小数"/>
								</div>
								<label for="inputPassword3" class="col-sm-2 control-label">库存数量</label>
								<div class="col-sm-3">
									<input type="text" class="form-control" id="samllType"  onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="只能整数"/>
								</div>
							</div>
							<blockquote>
								<cite>服装描述</cite>
							</blockquote>
							<div class="form-group">
								<div class="col-sm-12">
									<textarea rows="4" cols="8" class="form-control" placeholder="写点什么好呢?"></textarea>
								</div>
							</div>
							<blockquote>
								<cite>服装图片</cite>
							</blockquote>
							<input type="file" name="uploadPic" id="uploadPic" multiple >
						</form>
					</div>
					<div class="col-md-2 column">
					</div>
				</div>	
		</div>
<script type="text/javascript">
$(function(){
	var initAddColthesButtonObj = new initAddColthesButton();
	initAddColthesButtonObj.init();	
});

//初始化按钮事件
function initAddColthesButton(){
	this.init = function(){
		//准备附件上传的样式
		$("#uploadPic").fileinput({
		    language: 'zh',
		    showUpload: true, //是否显示上传按钮
		    //allowedFileExtensions: ['doc', 'docx', 'pdf']
		});
		//获取服装大分类
		initClothesBigType();
		//联动小分类
		$("#select_BigType").change(function(){
			var bigCode  = $("#select_BigType").val();
			$.ajax({
				dataType : "json",
				type : 'get',
				data:{bigCode:bigCode},
				url : 'initClothesSmallType.do',
				success : function(result) {
					$("#select_SmallType").empty();
					$.each(result, function(index, value) {
						$("#select_SmallType").append("<option value ="+value.smalltypeid+">"+value.smalltypename+"</option>")
					});
				},
				error : function(e) {
					console.log('请求失败')
				}
			});
		});
	};
}
	
	
	//获取服装大分类
	function initClothesBigType(){
		$.ajax({
			dataType : "json",
			type : 'get',
			url : 'initClothesBigType.do',
			success : function(result) {
				var type = JSON.stringify(result);
				console.log(type);
				$.each(result, function(index, value) {
					$("#select_BigType").append("<option value ="+value.bigtypeid+">"+value.bigtypename+"</option>")
					//alert(value.bigtypename);
				});
			},
			error : function(e) {
				console.log('请求失败')
			}
		});

	}
</script>
