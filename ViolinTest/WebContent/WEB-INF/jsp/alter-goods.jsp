<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员界面</title>
	 <link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
	  <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
</head>
<body>
<div class="container-fluid">
	<div class="banner">
		<div class="span1">
			Welcome christinaviolin.com 
		</div>
		<div class="span2">
			<ul class="breadcrumb">
				<li>
					Hi ${sessionScope["user_session"]["user_name"]}<span class="divider"></span>
				</li>
				<li>
					<a href="index">[Sign out]</a> <span class="divider"></span>
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

		</div>
	</div>
	<div class="content">
		<div class="span7">
			<div class="row-fluid">
				<div class="span8">
					<div class="row-fluid">
						<div class="alter-goods">
							<ul >
								<li class="active">
									Management-Products
								</li>
								<li>
								<a href="select_goods">
									All Productions
								</a>
								</li>
								<li>
								<a href="addGoods">
									Add Productions
								</a>
								</li>

							</ul>
							<ul >
								<li class="active">
									Management-Orders
								</li>
								<li>
								<a href="#">
									Order-detail
								</a>
								</li>
							</ul>	
							<ul >
								<li class="active">
									Management-Users
								</li>
								<li>
								<a href="#">
									All Users
								</a>
								</li>
							</ul>							
						</div>
					</div>

					<div class="span">

					</div>
				</div>
		<div class="text">
			<h1>Welcome Admin~</h1>
			<font color="red" size="5">${requestScope.message }</font>
		</div>
		<div class="span">	
		</div>
		
		<div class="span">

		</div>
		<div class="span">

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