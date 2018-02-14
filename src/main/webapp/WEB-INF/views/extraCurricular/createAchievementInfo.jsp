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
			<c:when test="${achievementsInformationBean.achievInfoId == 0}">
				<h1>Create Achievements Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Achievements</a></li>
					<li class="active">Achievements Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Achievements Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Achievements</a></li>
					<li class="active">Achievements Information</li>
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
				<form:form class="form-horizontal" modelAttribute="achievementsInformationBean"
					method="POST" action="${contextPath}/extraCurricular/saveAchievementsInfo"
					enctype="multipart/form-data">
					
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
						<label for="file" class="col-sm-4 control-label">
							Upload Image : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="file" class="form-control"
								id="file" name="achievement1" type="file"
								 />
						</div>
					</div>
					
					<div class="form-group">
						<label for="achievement1" class="col-sm-4 control-label">
							Achievement 1 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="achievement1" class="form-control"
								id="achievement1" name="achievement1" type="text"
								placeholder="Enter Achievement 1.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="achievement2" class="col-sm-4 control-label">Achievement 2
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="achievement2" class="form-control"
								id="achievement2" name="achievement2" type="text"
								placeholder="Enter Achievement 2.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="achievement3" class="col-sm-4 control-label">Achievement 3
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="achievement3" class="form-control"
								id="achievement3" name="achievement3" type="text"
								placeholder="Enter Achievement 3.." required="required" />
						</div>
					</div>
												
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="achievInfoId" />
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
