<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>shopping</title>
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
				现在已有${applicationScope["count"]}人访问网站.
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
		<div class="span7">
			<div class="row-fluid">
				<div class="span8">
					<div class="row-fluid">
						<div class="span9">
							<ul >
								<li class="nav-header">
									Violin
								</li>
								<li class="active">
									<a href="#">V-Junior</a>
								</li>
								<li>
									<a href="#">V-Senior</a>
								</li>
								<li>
									<a href="#">V-Series</a>
								</li>
																<li>
									<a href="#">V-Series</a>
								</li>
																<li>
									<a href="#">EU-series</a>
								</li>
																<li>
									<a href="#">EUMaster-series</a>
								</li>
								<li class="nav-header">
									Others
								</li>
								<li>
									<a href="#">Guitar</a>
								</li>
								<li>
									<a href="#">Bows</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">More</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="span-height">
					<div></div>
					</div>
				</div>
				<div class="span12">
				
					<div class="goods-list">
					
						<ul class="thumbnails">
						<c:forEach items="${requestScope.goods_list}" var="goods_list">
							<li class="violin">
								<div class="thumbnail">
									<img alt="300x200" src="images/${goods_list.image1}" />
							
									<div class="caption">
										<p>
											${goods_list.goods_name}
										</p>
										<p>
											sale-price: ${goods_list.price} 
										</p>
									</div>
									<div class="caption">				
											<form action="goods1" method="post">
											<input type="radio" name="goods_name" value="${goods_list.goods_name}" checked>
											<input type="submit" value="浏览" />
											<input type="hidden" name="image1" value="${goods_list.image1}">
											<input type="hidden" name="user_id" value="${sessionScope.user_session.id }">
											<button class="btn btn-danger btn-log active" type="submit" formaction="Col" formmethod="post">收藏</button>
											</form>
														
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
						
					</div>	
					<div class="pagination">
						<font color="red" size="5">${requestScope.message }</font>
					</div>
				</div>
			</div>
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