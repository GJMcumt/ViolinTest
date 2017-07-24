<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
						<div class="span9">
							<ul >
								<li class="active">
									Management-Products
								</li>
								<li>
								<a href="select_goods">
									Find Productions
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

					<div class="row-fluid">

					</div>
				</div>
		<div class="span12">
			
		<form class="form-horizontal" action="update_goods" method="post" >

			<div class="control-group">
			 <label class="control-label" for="inputId">goods_sn</label>
				<div class="controls">
					<input id="inputId" type="text" name="goods_sn" value="${sessionScope.goods_session.goods_sn}" readonly/>
				</div>
			</div>
			<div class="control-group">
				 <label class="control-label" for="inputName">goods_name</label>
				<div class="controls">
					<input id="inputName" type="text" name="goods_name" value="${sessionScope.goods_session.goods_name }"/>
				</div>
			</div>
			<div class="control-group">
				 <label class="control-label" for="inputType">type:${sessionScope.goods_session.type }</label>
				<div class="controls">
					<select size="1" name="type">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
					</select>
					说明：1(V-Junior)、2(V-Senior)、3(S-series)、4(EU-series)、5(EUMaster-series)、6(guita)、7(Bows)
				</div>
			</div>
			<div class="control-group">
				 <label class="control-label" for="inputPrice">price</label>
					<div class="controls">
					<input id="inputPrice" type="text" name="price" value="${sessionScope.goods_session.price }"/>
				</div>
			</div>		
			<div class="control-group">
				 <label class="control-label" for="inputOther">describe</label>
				<div class="controls">
					<input id="inputOther" type="text" name="describe" value="${sessionScope.goods_session.describe }"/>
				</div>
			</div>
			<div class="control-group">
				 <label class="control-label" for="inputImage">images(填写图片的名字，如果图片文件未上传，请在修改之后上传图片)</label>
				<div class="controls">
					<input id="inputImage" type="text" name="image1" value="${sessionScope.goods_session.image1 }"/>
					<input id="inputImage" type="text" name="image2" value="${sessionScope.goods_session.image2 }"/>
					<input id="inputImage" type="text" name="image3" value="${sessionScope.goods_session.image3 }"/>
					<input id="inputImage" type="text" name="image4" value="${sessionScope.goods_session.image4 }"/>
				</div>
			</div>
			<div class="control-group">
				 <label class="control-label" for="inputType">goods_status:${sessionScope.goods_session.goods_status }</label>
				<div class="controls">
					<select size="1" name="goods_status">
						<option>0</option>
						<option>1</option>
					</select>
					说明：1(已下架)、2(在销售)
				</div>
			</div>			
			<div class="control-group">
				 <label class="control-label" for="inputOther">inventory</label>
				<div class="controls">
					<input id="inputOther" type="text" name="inventory" value="${sessionScope.goods_session.inventory }"/>
				</div>
			</div>	
			<input type="submit" value="Submit">							
		</form>
		</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>
</div>
</body>
</html>