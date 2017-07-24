<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评价</title>
 	<link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
 	<link rel="stylesheet" type="text/css" href="stylesheet/css/star.css">

	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
    <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
    <style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}
</style>

</head>
<body>
	<div class="container-fluid">
    <div class="head">
	    <div class="banner">
	    	<div class="span1">
	    		Welcome christinaviolin.com 
	    	</div>
	    	<div class="span2">
	    		<ul class="breadcrumb">
		    		<li>
		    			Hi ${sessionScope["user_session"]["user_name"]} <span class="divider"></span>
		    		</li>
		    		<li>
		    			<a href="signUp">[Sign up]</a> <span class="divider"></span>
		    		</li>
				<li>
					<a href="my_cart">My cart</a> <span class="divider"></span>
				</li>
				<li>
					<a href="my_order">My order</a> <span class="divider"></span>
				</li>
			       	<li>
			    		<a href="#">Feedback</a> <span class="divider"></span>
			    	</li>
			    	<li>
					<a href="#">Helpcenter</a> <span class="divider"></span>
			       	</li>
								
		    	</ul>
		    </div>
    	</div>
    	<div class="logo">
	    	<div class="span3">
	    		<img alt="Christina" src="images/logo.png" />
	    	</div>
	        	<div class="span4">
		    	<form class="form-search">
		    		<input class="input-medium search-query" type="text" /> <button class="btn" type="submit"></button>
		    	</form>
	    	</div>
    	</div>
		<div class="nav">
		<div class="span5">
			<div class="btn-group">
				 <button class="btn">Items</button> <button class="btn dropdown-toggle" data-toggle="dropdown"><span class="caret"></span></button>
				<ul class="dropdown-menu">
					<li>
						<a href="goods">Violin</a>
					</li>
					<li>
						<a href="#">Guita</a>
					</li>
					<li>
						<a href="#">Bows</a>
					</li>
					<li class="divider">
					</li>
					<li class="dropdown-submenu">
						 <a tabindex="-1" href="#">More</a>
					</li>
				</ul>
			</div>
			
		</div>
		<div class="span6">
		<ul class="nav1">
			<li>
				<a href="welcome">Home</a>
			</li>
			<li>
				<a href="#">About</a>
			</li>
			<li>
				<a href="goods">Instruments</a>
			</li>
			<li>
				<a href="#">Wormanship</a>
			</li>
		</ul>
		</div>	
    </div>	
 <div>
<form action="addEvaluation" method="post" enctype="multipart/form-data">
<div>
<h3>请对此订单进行评价</h3>
<textarea rows="10" cols="100" name="evaluation">
宝贝满足您的期待吗？留下您的评价吧！
</textarea>
<br/>
添加图片(您可以选择两张图片上传)<input name="file" type="file"><br/>
<input name="file" type="file"><br/>
</div>
	<div class="row clearfix">
		<div class="col-md-3 column"></div>
		<div class="col-md-6 column">
        <div class="form-group">
     <div class="shop-rating">
	<span class="title">物流服务：</span>
	<ul class="rating-level" id="stars1">
		<li><a class="one-star" star:value="100" href="#">100</a></li>
		<li><a class="two-stars" star:value="200" href="#">200</a></li>
		<li><a class="three-stars" star:value="300" href="#">300</a></li>
		<li><a class="four-stars" star:value="400" href="#">400</a></li>
		<li><a class="five-stars" star:value="500" href="#">500</a></li>
	</ul>
	<span class="result" id="stars1-tips"></span>
	<input type="hidden" id="stars1-input" name="logistics" value="" size="2" />
	</div>
</div>


<!--
	# 星级评分
	# star:value = 分数
-->
<div class="shop-rating">
	<span class="title">商品质量：</span>
	<ul class="rating-level" id="stars2">
		<li><a class="one-star" star:value="1" href="#">1</a></li>
		<li><a class="two-stars" star:value="2" href="#">2</a></li>
		<li><a class="three-stars" star:value="3" href="#">3</a></li>
		<li><a class="four-stars" star:value="4" href="#">4</a></li>
		<li><a class="five-stars" star:value="5" href="#">5</a></li>
	</ul>
	<span class="result" id="stars2-tips"></span>
	<input type="hidden" id="stars2-input" name="quality" value="" size="2" />
</div>
<div class="shop-rating">
	<span class="title">服务：</span>
	<ul class="rating-level" id="stars3">
		<li><a class="one-star" star:value="1" href="#">1</a></li>
		<li><a class="two-stars" star:value="2" href="#">2</a></li>
		<li><a class="three-stars" star:value="3" href="#">3</a></li>
		<li><a class="four-stars" star:value="4" href="#">4</a></li>
		<li><a class="five-stars" star:value="5" href="#">5</a></li>
	</ul>
	<span class="result" id="stars3-tips"></span>
	<input type="hidden" id="stars3-input" name="service" value="" size="2" />
</div>
<div id="evaluate">
<input type="hidden" name="order_sn" value="${sessionScope.order.order_sn}">
<input type="hidden" name="description" value="">
<button class="btn btn-danger btn-log active">提交</button>
</div>
</div>
</div>
</form>
</div>
	<div class="row-fluid">
		<div class="foota">
			<img alt="140x140" src="images/PROSERIES_01.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_02.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_03.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_04.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_05.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_06.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_07.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_08.jpg" />
		</div>
		<div class="foota">
			<img alt="140x140" src="images/PROSERIES_09.jpg" />
		</div>
	</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>   
</div>
<script type="text/javascript">
var Class = {
	create: function() {
		return function() { this.initialize.apply(this, arguments); }
	}
}
var Extend = function(destination, source) {
	for (var property in source) {
		destination[property] = source[property];
	}
}
function stopDefault( e ) {
	 if ( e && e.preventDefault ){
		e.preventDefault();
	}else{
		window.event.returnValue = false;
	}
	return false;
} 
/**
 * 星星打分组件
 *
 * @author	Yunsd
 * @date		2010-7-5
 */
var Stars = Class.create();
Stars.prototype = {
	initialize: function(star,options) {
		this.SetOptions(options); //默认属性
		var flag = 999; //定义全局指针
		var isIE = (document.all) ? true : false; //IE?
		var starlist = document.getElementById(star).getElementsByTagName('a'); //星星列表
		var input = document.getElementById(this.options.Input) || document.getElementById(star+"-input"); // 输出结果
		var tips = document.getElementById(this.options.Tips) || document.getElementById(star+"-tips"); // 打印提示
		var nowClass = " " + this.options.nowClass; // 定义选中星星样式名
		var tipsTxt = this.options.tipsTxt; // 定义提示文案
		var len = starlist.length; //星星数量
		

		for(i=0;i<len;i++){ // 绑定事件 点击 鼠标滑过
			starlist[i].value = i;
			starlist[i].onclick = function(e){
				stopDefault(e);
				this.className = this.className + nowClass;
				flag = this.value;
				input.value = this.getAttribute("star:value");
				tips.innerHTML = tipsTxt[this.value]
			}
			starlist[i].onmouseover = function(){
				if (flag< 999){
					var reg = RegExp(nowClass,"g");
					starlist[flag].className = starlist[flag].className.replace(reg,"")
				}
			}
			starlist[i].onmouseout = function(){
				if (flag< 999){
					starlist[flag].className = starlist[flag].className + nowClass;
				}
			}
		};
		if (isIE){ //FIX IE下样式错误
			var li = document.getElementById(star).getElementsByTagName('li');
			for (var i = 0, len = li.length; i < len; i++) {
				var c = li[i];
				if (c) {
					c.className = c.getElementsByTagName('a')[0].className;
				}
			}
		}
	},
	//设置默认属性
	SetOptions: function(options) {
		this.options = {//默认值
			Input:			"",//设置触保存分数的INPUT
			Tips:			"",//设置提示文案容器
			nowClass:	"current-rating",//选中的样式名
			tipsTxt:		["1分-严重不合格","2分-不合格","3分-合格","4分-优秀","5分-完美"]//提示文案
		};
		Extend(this.options, options || {});
	}
}

var Stars1 = new Stars("stars1")
var Stars2 = new Stars("stars2")
var Stars3 = new Stars("stars3")
</script>
</body>
</html>