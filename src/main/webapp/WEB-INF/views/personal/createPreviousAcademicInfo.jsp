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
			<c:when test="${previousAcademicInfoBean.previousAcaInfoId == 0}">
				<h1>Create Previous Academic Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Previous Academic</a></li>
					<li class="active">Previous Academic Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Previous Academic Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Previous Academic</a></li>
					<li class="active">Previous Academic Information</li>
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
				<form:form class="form-horizontal" modelAttribute="previousAcademicInfoBean"
					method="POST" action="${contextPath}/academic/savePreviousAcademic">
					
					<div class="form-group ">
						<label class="col-sm-4 control-label" for="select"> Name
							 <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="studentId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Roles">
								<c:forEach var="studentList" items="${studenBeansList}">
									<form:option label="${studentList.firstName}"
										value="${studentList.studentId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField"
							for="dateOfJoining"> Date of Joining <span
							class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-calendar"> </i>
								</div>
								<form:input path="dateOfJoining" class="form-control"
									id="dateOfJoining" name="date" placeholder="dd/MM/yyyy"
									type="text" />
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label for="previousSchool" class="col-sm-4 control-label">
							Previous School : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="previousSchool" class="form-control"
								id="previousSchool" name="previousSchool" type="text"
								placeholder="Enter Previous School Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="lastStdStudied">
							Last Std Studied <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="lastStdStudied" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Last Std Studied</option>
								<form:option label="Nursary" value="Nursary" />
								<form:option label="UKG" value="UKG" />
								<form:option label="LKG" value="LKG" />
								<form:option label="I" value="I" />
								<form:option label="II" value="II" />
								<form:option label="III" value="III" />
								<form:option label="IV" value="IV" />
								<form:option label="V" value="V" />
								<form:option label="None" value="None" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="leavingReason" class="col-sm-4 control-label">
							Leaving Reason : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="leavingReason" class="form-control"
								id="previousSchool" name="previousSchool" type="text"
								placeholder="Enter Leaving Reason.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="comments" class="col-sm-4 control-label">
							Comments : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="comments" class="form-control"
								id="comments" name="comments" type="text"
								placeholder="Enter Comments.." required="required" />
						</div>
					</div>
					
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					 <input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="previousAcaInfoId" />
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

