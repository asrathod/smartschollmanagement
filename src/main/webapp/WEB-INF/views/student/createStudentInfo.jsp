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
			<c:when test="${studentBean.studentId == 0}">
				<h1>Create Student Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Student</a></li>
					<li class="active">Student Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Student Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Student</a></li>
					<li class="active">Student Information</li>
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
				<form:form class="form-horizontal" modelAttribute="studentBean"
					method="POST" action="${contextPath}/student/saveStudent">

					<!-- account Not -->
					<div class="form-group">
						<label for="firstName" class="col-sm-4 control-label">FirstName
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="firstName" class="form-control" id="accountNo"
								name="accountNo" type="text" placeholder="Enter First Name.."
								required="required" />
						</div>
					</div>

					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="middleName" class="col-sm-4 control-label">
							MiddleName : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="middleName" class="form-control"
								id="middleName" name="middleName" type="text"
								placeholder="Enter Middle Name.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="lastName" class="col-sm-4 control-label">LastName
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="lastName" class="form-control"
								id="lastName" name="lastName" type="text"
								placeholder="Enter Last Name.." required="required" />
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
						<label class="col-sm-4 control-label requiredField" for="academicYear">
							Academic Year <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="academicYear" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select academicYear</option>
								<form:option label="2017-2018" value="2017-2018" />
								<form:option label="2016-2017" value="2016-2017" />
								<form:option label="2015-2016" value="2015-2016" />
								<form:option label="2014-2015" value="2014-2015" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="currentStandard">
							Current Standard <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="currentStandard" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select currentStandard</option>
								<form:option label="Nursary" value="Nursary" />
								<form:option label="UKG" value="UKG" />
								<form:option label="LKG" value="LKG" />
								<form:option label="I" value="I" />
								<form:option label="II" value="II" />
								<form:option label="III" value="III" />
								<form:option label="IV" value="IV" />
								<form:option label="V" value="V" />
							</form:select>
						</div>
					</div>

					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="currentSection">
							Current Section <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="currentSection" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select currentSection</option>
								<form:option label="A" value="A" />
								<form:option label="B" value="B" />
								<form:option label="C" value="C" />
								<form:option label="D" value="D" />
							</form:select>
						</div>
					</div>
					
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					 <input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="recCreatedById" />
					<form:hidden path="recCreatedDate" />
					<form:hidden path="recUpdatedById" />
					<form:hidden path="recUpdatedDate" />
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

