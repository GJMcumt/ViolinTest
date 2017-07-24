<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Goods Detail</title>
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
									<a href="#">Boes</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">More</a>
								</li>
							</ul>
						</div>
					</div>


				</div>
				<div class="span12">
				
					<div class="goods-list">
						<div id="slide">
							<table>
								<tr>
									<td id="goods-pictures">
										<div class="carousel slide" id="carousel-645632">
											<ol class="carousel-indicators">
												<li class="active" data-target="#carousel-645632" data-slide-to="0">
												</li>
												<li data-target="#carousel-645632" data-slide-to="1">
												</li>
												<li data-target="#carousel-645632" data-slide-to="2">
												</li>
											</ol>
										<div class="carousel-inner">
										<div class="item active">
											<img alt="" src="images/${sessionScope.goods.image2}" />
										</div>
											<div class="item">
												<img alt="" src="images/${sessionScope.goods.image3}" />
											</div>
											<div class="item">
												<img alt="" src="images/${sessionScope.goods.image4}" />
											</div>
										</div> <a class="left carousel-control" href="#carousel-645632" data-slide="prev">‹</a> <a class="right carousel-control" href="#carousel-645632" data-slide="next">›</a>
										</div>
										
									</td>
									<td id="goods-imformation">
										<form action="cart" method="post">
											<h3>Product Name:</h3><input type="radio" name="goods_name" value="${sessionScope.goods.goods_name }" checked/>${sessionScope.goods.goods_name }
											<h3>Goods_sn:</h3><input type="radio" name="goods_sn" value="${sessionScope.goods.goods_sn }" checked/>${sessionScope.goods.goods_sn}
											<h3>describe:</h3>${sessionScope.goods.describe}
											
											<ul>
												<li><s>original price:${sessionScope.goods.price+300}</s></li>
												<li><input type="radio" name="price" value="${sessionScope.goods.price}" checked/>present price:${sessionScope.goods.price}</li>
												<li>save:300</li>
											</ul>
											<!-- 提示信息 -->
											<font color="red">${requestScope.message }</font>
											<lable>Buy_Count:</lable><input type="text" name="buy_count"><br />
											<input type="hidden" name="user_id" value="${sessionScope.user_session.id}">
											<input type="hidden" name="image1" value="${sessionScope.goods.image1}">
											
											<input type="submit" value="Add to Cart">
											<input type="hidden" name="address" value="${sessionScope.user_session.address}">
											<button type="submit" formaction="order" formmethod="post"> Buy it now</button>
										</form> 
									</td>
								</tr>
							</table>

						</div>
					</div>


				</div>	
					
			</div>
		</div>
	</div>
	</div>
	<div class="span">
	</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>
</div>
</body>
</html>