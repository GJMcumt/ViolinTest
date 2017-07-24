<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp</title>
  	<link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
    <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
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
		    			<a href="loginForm">[Sign in]</a> <span class="divider"></span>
		    		</li>
		    		<li>
		    			<a href="signup">[Sign up]</a> <span class="divider"></span>
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
						<a href="shopping">Violin</a>
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
		<div class="signup">
			<form action="addUser" method="post" id="addUser">
				<div>
					 <label for="inputName">用户名</label>
					<div >
						<input id="inputName" type="text" name="user_name"/>
					</div>
				</div>
				<div>
					 <label for="inputEmail">邮箱</label>
					<div >
						<input id="inputEmail" type="text" name="email"/><br/>
						<font color="red">邮箱请不要为空，并请保证这是您使用中的邮箱!</font>
					</div>
				</div>
				<div >
					 <label for="inputPassword">密码</label>
					<div>
						<input id="inputPassword" type="password" name="password"/>
					</div>
				</div>
					<div>
					 <label for="inputSex">性别</label><br />
					<div>
						男<input id="inputSex" type="radio" name="sex" value="男"/>
						女<input id="inputSex" type="radio" name="sex" value="女"/>
					</div>
				</div>
				<div>
					 <label for="inputPhone">电话号码</label>
					<div >
						<input id="inputPhone" type="text" name="phone"/>
					</div>
				</div>
				<div>
					 <label for="inputAddress">地址</label>
					<div >
						<input id="inputAdress" type="text" name="address"/>
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
				     <span class="help-block">确定注册</span> 
                    <label class="checkbox"><input type="checkbox" /> 勾选同意<br />
						 <button class="btn" type="submit">提交</button>
					</div>
				</div>
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
</body>
</html>