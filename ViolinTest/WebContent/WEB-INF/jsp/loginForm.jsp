<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
 	<link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
    <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
</head>
<body>
	<!--<form action="login" method="post" id="loginForm">
	<
	<font color="red">${requestScope.message }</font>
		用户名：<input type="text" name="user_name"><br />
		密码：<input type="password" name="password"><br />
		<input type="submit" value="确定">
	</form>-->
	<div class="container-fluid">
    <div class="head">
	    <div class="banner">
	    	<div class="span1">
	    		Welcome christinaviolin.com 
	    	</div>
	    	<div class="span2">
	    		<ul class="breadcrumb">
		    		<li>
		    			<a href="loginForm">[Sign in]</a> <span class="divider"></span>
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
				<a href="shopping">Instruments</a>
			</li>
			<li>
				<a href="#">Wormanship</a>
			</li>
		</ul>
		</div>	
    </div>	
    
	<div class="content">
		<div class="signin">
			<form class="form-horizontal" action="login" method="post" id="loginForm">
				<!-- 提示信息 -->
				<font color="red">${requestScope.message }</font>
				<div class="control-group">
					 <label class="control-label" for="inputName">用户名</label>
					<div class="controls">
						<input id="inputName" type="text" name="user_name"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input id="inputPassword" type="password" name="password"/>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						 <label class="checkbox"><input type="checkbox" id="remember" /> Remember me</label> <button class="btn" type="submit">登陆</button>
					</div>
			</div>
			<a href="modifyPassword">修改密码</a>
			<a href="findPwd">忘记密码</a>	
			</form>

		</div>
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
<script>
  window.onload = function(){
    var oForm = document.getElementById('loginForm');
    var oUser = document.getElementById('inputName');
    var oPswd = document.getElementById('inputPassword');
    var oRemember = document.getElementById('remember');
    //页面初始化时，如果帐号密码cookie存在则填充
    if(getCookie('inputName') && getCookie('inputPassword')){
      oUser.value = getCookie('inputName');
      oPswd.value = getCookie('inputPassword');
      oRemember.checked = true;
    }
    //复选框勾选状态发生改变时，如果未勾选则清除cookie
    oRemember.onchange = function(){
      if(!this.checked){
        delCookie('inputName');
        delCookie('inputPassword');
      }
    };
    //表单提交事件触发时，如果复选框是勾选状态则保存cookie
    oForm.onsubmit = function(){
      if(remember.checked){ 
        setCookie('inputName',oUser.value,7); //保存帐号到cookie，有效期7天
        setCookie('inputPassword',oPswd.value,7); //保存密码到cookie，有效期7天
      }
    };
  };
  //设置cookie
  function setCookie(name,value,day){
    var date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires='+ date;
  };
  //获取cookie
  function getCookie(name){
    var reg = RegExp(name+'=([^;]+)');
    var arr = document.cookie.match(reg);
    if(arr){
      return arr[1];
    }else{
      return '';
    }
  };
  //删除cookie
  function delCookie(name){
    setCookie(name,null,-1);
  };
</script>
</body>
</html>
</body>
</html>