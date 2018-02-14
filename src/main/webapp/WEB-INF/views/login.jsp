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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/font-awesome.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/ionicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/AdminLTE.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style/newstyle.css">
</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo logoText">
			<a href="#">
				<b>PayrollHRM</b>
				<h6>Human resource management system</h6>
			</a>
		</div>
		
		<div class="login-box-body">
			<a href="${contextPath}/homePage" class="backwelcome"><i class="fa fa-arrow-left"></i></a>
			 <p class="login-box-msg">Sign In</p>
			 <form:form modelAttribute="userBean" method="POST" action="${contextPath}/checkCredentials" autocomplete="off" id="loginForm">
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
            		<form:input path="userEid" class="form-control" id="inputEmail3" placeholder="Enter User Eid" required="required" title="User Eid is required"/>
            		<span class="glyphicon glyphicon-user form-control-feedback"></span>
            	</div>
            	
            	<div class="form-group has-feedback">
	          		<form:password path="userPwd" class="form-control" id="inputEmail3" placeholder="Enter Password" required="required" title="Password is required"  />
	           		<span class="glyphicon glyphicon-lock form-control-feedback"></span>
	        	</div>
	        	
	        	<div class="row">
	        		<a href="${pageContext.request.contextPath}/forgotPassword">I forgot my password</a>
	        	</div>
	        	
	        	<div class="row">
	        		<div class="col-xs-12">
	        			<button type="submit" class="btn btn-success btn-block btn-flat">Sign In</button>
	        		</div>
	        	</div>
			 </form:form>
		</div>
	</div>
	
	<script src="${pageContext.request.contextPath}/resources/js/newui/jQuery-2.1.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/newui/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/newui/fastclick.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/newui/demo.js"></script>
</body>
</html>