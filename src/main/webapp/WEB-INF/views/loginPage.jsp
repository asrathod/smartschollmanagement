<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.3.11/css/AdminLTE.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
 
 <style type="text/css">
	.login-logo,
	.register-logo {
	  font-size: 35px;
	  text-align: center;
	  margin-bottom: 25px;
	  font-weight: 300;
	}
	.login-logo a,
	.register-logo a {
	  color: #444;
	}
	.login-page,
	.register-page {
	  /* background: #1e90ff; */
	  background: #f7beed;
	}
	.login-box,
	.register-box {
	  width: 420px;
	  margin: 7% auto;
	}
	@media (max-width: 768px) {
	  .login-box,
	  .register-box {
	    width: 90%;
	    margin-top: 20px;
	  }
	}
	.login-box-body,
	.register-box-body {
	  background: #fff;
	  padding: 20px;
	  border-top: 0;
	  color: #666;
	}
	.login-box-body .form-control-feedback,
	.register-box-body .form-control-feedback {
	  color: #777;
	}
	.login-box-msg,
	.register-box-msg {
	  margin: 0;
	  text-align: center;
	  padding: 0 20px 20px 20px;
	}
	.social-auth-links {
	  margin: 10px 0;
	}
</style>
</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo logoText">
			<a href="#">
				<b>Smart School</b>
				<!-- <h6>Human resource management system</h6> -->
			</a>
		</div>
		
		<div class="login-box-body">
			<%-- <a href="${contextPath}/homePage" class="backwelcome"><i class="fa fa-arrow-left"></i></a >--%>
			 <p class="login-box-msg">Log in to Smart School</p>
			 <form:form modelAttribute="userInformationBean" method="POST" action="${contextPath}/login/checkUserCredential" autocomplete="off" id="loginForm">
			 	<c:if test="${not empty error}">
			 		<div class="alert alert-danger alert-dismissable">
			 			<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
			 			<i class="icon fa fa-ban"></i> ${error}.
			 		</div>
			 	</c:if>
			 	<c:if test="${not empty message}">
	              <div class="alert alert-success alert-dismissible">
	              	<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
	                <h6><i class="icon fa fa-check"></i>  ${message}</h6>
	              </div>
            	</c:if>
            	
            	<div class="form-group has-feedback">
            		<form:input path="userEid" class="form-control" id="inputEmail3" placeholder="Enter Employee ID" required="required" title="Employee ID is required"/>
            		<span class="glyphicon glyphicon-user form-control-feedback"></span>
            	</div>
            	
            	<div class="form-group has-feedback">
	          		<form:password path="userPassword" class="form-control" id="inputEmail3" placeholder="Enter Employee Password" required="required" title="Employee Password is required"  />
	           		<span class="glyphicon glyphicon-lock form-control-feedback"></span>
	        	</div>
	        	
	        	<div class="row">
	        		<div class="col-xs-6 checkbox">
	        			<a href="${pageContext.request.contextPath}/login/forgotPassword">Recover password?</a>
	        		</div>	
	        	</div>
	        	
	        	<div class="row">
	        		<div class="col-xs-12">
	        			<button type="submit" class="btn btn-success btn-block btn-flat">Sign In</button>
	        		</div>
	        	</div>
			 </form:form>
		</div>
	</div>
	
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fastclick/1.0.6/fastclick.min.js"></script>
    
</body>
</html>
