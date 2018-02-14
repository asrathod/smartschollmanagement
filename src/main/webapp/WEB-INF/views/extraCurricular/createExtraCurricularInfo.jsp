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
			<c:when test="${extraCurricularInformationBean.extraCurrInfoId == 0}">
				<h1>Create Extra Curricular Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Extra Curricular</a></li>
					<li class="active">Extra Curricular Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Extra Curricular Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Extra Curricular</a></li>
					<li class="active">Extra Curricular Information</li>
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
				<form:form class="form-horizontal" modelAttribute="extraCurricularInformationBean"
					method="POST" action="${contextPath}/extraCurricular/saveExtraCurricularInfo">
					
					<div class="form-group ">
						<label class="col-sm-4 control-label" for="select"> Student Name
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
					
					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="sprorts" class="col-sm-4 control-label">
							Sports : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="sprorts" class="form-control"
								id="sprorts" name="firstContactNo" type="text"
								placeholder="Enter Sprorts.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="indoorGame" class="col-sm-4 control-label">Indoor Game
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="indoorGame" class="form-control"
								id="indoorGame" name="indoorGame" type="text"
								placeholder="Enter Indoor Game.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="outdoorGame" class="col-sm-4 control-label">Outdoor Game
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="outdoorGame" class="form-control"
								id="outdoorGame" name="outdoorGame" type="text"
								placeholder="Enter Outdoor Game.." required="required" />
						</div>
					</div>
												
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="extraCurrInfoId" />
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
