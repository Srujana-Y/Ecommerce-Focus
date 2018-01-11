<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<title>productDetails</title>
</head>


<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div class="container">
<div class="row">

<div class="col-sm-4 item-photo">
<img style="max-width::100%, margin-top:30px;"
src="${pageContext.request.contextPath }/resources/${prod.imgName}"/>
</div>

<div class="col-sm-5" style="border:0px solid gray">
<h3>${prod.pname }</h3>
<h4>${prod.description }</h4>
<h4>${prod.price }</h4>
<h5>${prod.supplierName }</h5>
<div class="section" style="padding-botton:20px;">

<form action="${pageContext.request.contextPath }/addToCart" method="post">
<input type="hidden" value="${prod.pid }" name="pid"/>
<input type="hidden" value="${prod.price }" name="pPrice"/>
<input type="hidden" value="${prod.pname }" name="pName"/>
<input type="hidden" value="${prod.imgName }" name="imgName"/>

<label>Quantity</label><input type="number" class="form-control" name=pQty require/><br><br>
<input class="btn btn-warning btn-lg" type="submit" value="Add To Cart">
<h6><span class="glyphicon-heart-empty" style="cursor:pointer"></span>Wish List</h6>
</form>
</div>
</div>
<hr>
<div class="col-sm-9">
<h3>Product Details</h3>
<ul class="menu-items">
<li>Get all the flexibility of interchangeable lenses with a lighter, smaller camera.</li>
<li>Mirrorless cameras allow you to take high-quality photos without the heft of a traditional DSLR.</li>
</ul>
</div>

<br><br>
<h6>We are Authorised Company by Indian Govt.</h6>
</div>
</div>
</body>
</html>