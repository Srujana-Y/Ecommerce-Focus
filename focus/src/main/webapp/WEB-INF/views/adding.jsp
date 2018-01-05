<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Focus</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container"><br>

<div class="page-header">
<div class="container">

<div class="row">
<div class="col-md-6">
<div class="panel width-nav-tabs panel-primary">
<div class="panel-heading">
   <ul class="nav nav-tabs">
     <li class="active"><a href="#tab1" data-toggle="tab">Category</a>
     <li><a href="#tab2" data-toggle="tab">Supplier</a>
     <li><a href="#tab3" data-toggle="tab">Product</a>
   </ul>
</div>

<div class="panel-body">
<div class="tab-content">

<div class="tab-pane fade in active" id="tab1">
 <form action="<c:url value="/admin/saveSupp"/>" method="post" class="form-signin">
   <span id="reauth-email" class="reauth-email"></span>
   <h4 class="input-title">Supplier ID</h4>
   <input class="form-control" type="number" name="sid" required/>
   <br>
   <h4 class="input-title">Supplier Name</h4>
   <input class="form-control" type="text" name="sname" required/>
   <br><br>
   <button role="button" class="btn btn-primary">Submit</button>
   <button role="button" class="btn btn-warning">Cancel</button>
 </form>
</div>

<div class="tab-pane fade" id="tab2">
 <form action="<c:url value="/admin/saveCat"/>" method="post" class="form-signin">
   <span id="reauth-email" class="reauth-email"></span>
   <h4 class="input-title">Category ID</h4>
   <input class="form-control" type="number" name="cid" required/>
   <br>
   <h4 class="input-title">Category Name</h4>
   <input class="form-control" type="text" name="cname" required/>
   <br><br>
   <button role="button" class="btn btn-primary">Submit</button>
   <button role="button" class="btn btn-warning">Cancel</button> 
 </form>
</div>

<div class="tab-pane fade" id="tab3">
 <form action="<c:url value="/admin/savePro"/>" method="post" class="form-signin" enctype="mutipart/form-data">
   <span id="reauth-email" class="reauth-email"></span>
   <h4 class="input-title">Product Name</h4>
   <input class="form-control" type="text" name="pName" required/>
   <br>
   <h4 class="input-title">Product Description</h4>
   <input class="form-control" type="text" name="pDescription" required/>
   <br>
   <h4 class="input-title">Product Price</h4>
   <input class="form-control" type="number" name="pPrice" required/>
   <br>
   <h4 class="input-title">Product Stock</h4>
   <input class="form-control" type="number" name="pStock" required/>
   
   <div class="form-group">
   <table>
   <tr>
     <td>Select Supplier</td>
     <td>
     <select class="form-control" name="pSupplier" required>
     <option value="">------Select Supplier----</option>
     <c:forEach items="${satList}" var="sat">
     <option value="${sat.sid}">${sat.suppliername }</option>
     </c:forEach>
     </select>
   </tr>
   </table>
   </div>
   
   <div class="form-group">
   <table>
   <tr>
     <td>Select Category</td>
     <td>
     <select class="form-control" name="pCategory" required>
     <option value="">------Select Category----</option>
     <c:forEach items="${catList}" var="cat">
     <option value="${cat.cid}">${cat.cname}</option>
     </c:forEach>
     </select>
   </tr>
   </table>
   </div>
   
   <div class="fileinput fileinput-new" data-provides="fileinput">
   <td><input class="form-control" type="file" name="file" accept="image/*"></td>
   
   
   </div>
   
   <br><br>
   <button role="button" class="btn btn-primary">Submit</button>
   <button role="button" class="btn btn-warning">Cancel</button> 
 </form>
</div>

</div>
</div>
</div>
</div>
</div>
</div>

</div>

</div>
</body>
</html>