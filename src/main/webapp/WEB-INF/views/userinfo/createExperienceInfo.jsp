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
			<c:when test="${experienceInfoBean.expInfoId == 0}">
				<h1>Create Experience Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Experience</a></li>
					<li class="active">Experience Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Experience Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Experience</a></li>
					<li class="active">Experience Information</li>
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
				<form:form class="form-horizontal" modelAttribute="experienceInfoBean"
					method="POST" action="${contextPath}/experience/saveExperience">
					
					<div class="form-group ">
						<label class="col-sm-4 control-label" for="select"> Employee Name
							 <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="userId" class="select form-control"
								id="userId" name="select" data-placeholder="Choose User Name">
								<c:forEach var="userList" items="${userBeansList}">
									<form:option label="${userList.firstName} ${userList.lastName}"
										value="${userList.userId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="yearOfExp" class="col-sm-4 control-label">
							Year Of Experience : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="yearOfExp" class="form-control"
								id="yearOfExp" name="yearOfExp" type="text"
								placeholder="Enter Year Of Exp.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="expDetails1" class="col-sm-4 control-label">Experience Details 1
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="expDetails1" class="form-control"
								id="expDetails1" name="expDetails1" type="text"
								placeholder="Enter Experience Details.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="expDetails2" class="col-sm-4 control-label">Experience Details 2
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="expDetails2" class="form-control"
								id="expDetails2" name="expDetails2" type="text"
								placeholder="Enter Experience Details.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="skillsDetails1" class="col-sm-4 control-label">Skills Details 1
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="skillsDetails1" class="form-control"
								id="skillsDetails1" name="skillsDetails1" type="text"
								placeholder="Enter Skills Details 1.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="skillsDetails2" class="col-sm-4 control-label">Skills Details 2
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="skillsDetails2" class="form-control"
								id="skillsDetails2" name="skillsDetails2" type="text"
								placeholder="Enter Skills Details2.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="skillsDetails3" class="col-sm-4 control-label">Skills Details 3
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="skillsDetails3" class="form-control"
								id="skillsDetails3" name="skillsDetails3" type="text"
								placeholder="Enter Skills Details3.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="currentSalary" class="col-sm-4 control-label">Current Salary
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentSalary" class="form-control"
								id="currentSalary" name="currentSalary" type="text"
								placeholder="Enter Current Salary.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="previousSalary" class="col-sm-4 control-label">Previous Salary
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="previousSalary" class="form-control"
								id="previousSalary" name="previousSalary" type="text"
								placeholder="Enter Previous Salary.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="dateOfJoining" class="col-sm-4 control-label">Date Of Joining
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="dateOfJoining" class="form-control"
								id="dateOfJoining" name="dateOfJoining" type="text"
								placeholder="dd/MM/yyyy" required="required" />
						</div>
					</div>
												
					<!--hidden variables  -->
					<%-- <c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" />  --%>
					<form:hidden path="expInfoId" />
					<form:hidden path="userId" />
					<form:hidden path="recCreatedById" />
					<form:hidden path="recCreatedDate" />
					<form:hidden path="recUpdatedById" />
					<form:hidden path="recUpdatedDate" />
					<%-- </c:if> --%>
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
