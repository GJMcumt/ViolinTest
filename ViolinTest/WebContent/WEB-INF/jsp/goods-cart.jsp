<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My cart</title>
 	<link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
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
    
	<div class="content">
		<div class="cart">
			<form class="form-horizontal" action="delete_cart" method="post" id="loginForm">
				<table>
				<tr>
					<th>商品</th><th>商品名</th><th>价格</th><th>数量</th><th>选择</th>
				</tr>
					<c:forEach items="${requestScope.cart_list}" var="cart_list">
					<tr>
						<td><input type="hidden" name="image1" value="${cart_list.image1}"/><img src="images/${cart_list.image1}"/></td>
						<td>${cart_list.goods_sn}<br /><input type="text" size="50" name="goods_name" value="${cart_list.goods_name}" readonly/></td>
						<td><input type="text" name="price" value="${cart_list.price}" readonly></td>
						<td><input type="text" name="buy_count" value="${cart_list.buy_count}" readonly></td>
						<td><input type="radio" name="goods_sn" value="${cart_list.goods_sn}"/></td>
					</tr>
					</c:forEach>
				</table>
				<input type="submit" value="删除"/>
				<input type="hidden" name="user_id" value="${sessionScope.user_session.id}">
				<input type="hidden" name="address" value="${sessionScope.user_session.address}">
				<button type="submit" formaction="order" formmethod="post"> Buy it now</button>
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