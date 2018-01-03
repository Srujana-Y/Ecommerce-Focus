<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form "%>

<html>
<head>
<title>Focus</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div class="container">

<h2>Registration Form</h2>

<div class="col-sm-8">
<div class="row">

<form:form modelAttribute="user" action="saveRegister" method="post">
<div class="form-group">
<lable>Name: </lable>
<form:input path="name" class="form-control placeholder="Enter Name"/>
</div>

<div class="form-group">
<lable>Email: </lable>
<form:input path="email" class="form-control placeholder="Enter Email"/>
</div>

<div class="form-group">
<lable>Password: </lable>
<form:input path="password" type="password" class="form-control placeholder="Enter Password"/>
</div>

<div class="form-group">
<lable>Address: </lable>
<form:input path="address" class="form-control placeholder="Enter Address"/>
</div>

<div class="form-group">
<lable>Mobile: </lable>
<form:input path="Mobile" class="form-control placeholder="Enter Mobile"/>
 </div>
 
 <br><br>
 <button type="submit" class="btn btn-lg btn-primary">SUBMIT</button>
 
 <button type="submit" class="btn btn-lg btn-info">CANCEL</button>
</form:form>
 
 </div>
</div>
</div>
</body>
</html>