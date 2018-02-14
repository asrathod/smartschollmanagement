<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<c:choose>
			<c:when test="${userInformationBean.userId == 0}">
				<h1>Create User Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> User</a></li>
					<li class="active">User Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update User Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> User</a></li>
					<li class="active">User Information</li>
				</ol>
			</c:otherwise>
		</c:choose>
	</section>


	<c:if test="${not empty error}">
		<div class="alert alert-danger alert-dismissible">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true">×</button>
			<h4>
				<i class="icon fa fa-warning"></i> ${error}
			</h4>
		</div>
	</c:if>

	<!-- Main content -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<form:form class="form-horizontal" modelAttribute="userInformationBean"
					method="POST" action="${contextPath}/user/saveUserInformation">

					<!-- account Not -->
					<div class="form-group">
						<label for="firstName" class="col-sm-4 control-label">FirstName
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="firstName" class="form-control" id="firstName"
								name="firstName" type="text" placeholder="Enter First Name.."
								required="required" />
						</div>
					</div>

					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="middleName" class="col-sm-4 control-label">
							Middle Name : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="midileName" class="form-control"
								id="middleName" name="middleName" type="text"
								placeholder="Enter Middle Name.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="lastName" class="col-sm-4 control-label">Last Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="lastName" class="form-control"
								id="lastName" name="lastName" type="text"
								placeholder="Enter Last Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="userEmail" class="col-sm-4 control-label">Email
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="userEmail" class="form-control"
								id="userEmail" name="userEmail" type="text"
								placeholder="Enter User Email.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-4 control-label" for="gender">Gender
							<span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<div class="radio">
								<label> <form:radiobutton id="optionsRadios_1"
										path="gender" value="Male" /> Male
								</label> <label> <form:radiobutton id="optionsRadios_2"
										path="gender" value="Female" /> Female
								<%-- </label> <label> <form:radiobutton id="optionsRadios_3"
										path="gender" value="Other" /> Other --%>
								</label>
							</div>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField"
							for="dateOfBirth"> Date of Birth <span
							class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-calendar"> </i>
								</div>
								<form:input path="dateOfBirth" class="form-control"
									id="dateofbirth" name="date" placeholder="dd/MM/yyyy"
									type="text" />
							</div>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="bloodGroup">
							Blood Group <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="bloodGroup" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Blood Group</option>
								<form:option label="A+" value="A+" />
								<form:option label="A-" value="A-" />
								<form:option label="AB+" value="AB+" />
								<form:option label="AB-" value="AB-" />
								<form:option label="B+" value="B+" />
								<form:option label="B-" value="B-" />
								<form:option label="O+" value="O+" />
								<form:option label="AO-" value="O-" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="idMark1" class="col-sm-4 control-label">Id Mark 1
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:textarea path="idMark1" class="form-control" rows="3"
								id="idMark1" name="idMark1" type="text"
								placeholder="Enter Id Mark 1.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="adharNo" class="col-sm-4 control-label">Aadhar No
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="adharNo" class="form-control"
								id="adharNo" name="adharNo" type="text"
								placeholder="Enter Aadhar No.." required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-3 control-label" for="select"> User
							Role <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="roleId" class="select form-control"
								id="roleId" name="select" data-placeholder="Choose User Roles">
								<c:forEach var="userRole" items="${roleBeansList}">
									<form:option label="${userRole.roleName}"
										value="${userRole.roleId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<!--hidden variables  -->
					<c:if test="${not empty userInformationBean.userId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="userId" />
					<form:hidden path="userEid" />
					<form:hidden path="recCreatedById" />
					<form:hidden path="recCreatedDate" />
					<form:hidden path="recUpdatedById" />
					<form:hidden path="recUpdatedDate" />
					<form:hidden path="userPassword" />
					<form:hidden path="passwordSalt" />
					<form:hidden path="roleId" />
					</c:if>
					<!--save button -->
					<div class="form-group">
						<div class="col-sm-offset-4 col-sm-4">
							<button type="submit" name="submit" class="btn btn-success">Save</button>
							<button type="reset" name="reset" class="btn btn-default">Reset</button>
						</div>
					</div>

				</form:form>
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->

	</section>
	<!-- /.content -->
</div>

