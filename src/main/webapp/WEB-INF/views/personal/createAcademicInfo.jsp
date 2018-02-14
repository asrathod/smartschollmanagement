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
			<c:when test="${academicInformationBean.academicInfoId == 0}">
				<h1>Create Academic Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Academic</a></li>
					<li class="active">Academic Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Academic Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Academic</a></li>
					<li class="active">Academic Information</li>
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
				<form:form class="form-horizontal" modelAttribute="academicInformationBean"
					method="POST" action="${contextPath}/academic/saveAcademic">
					
					<div class="form-group ">
						<label class="col-sm-4 control-label" for="select"> Name
							 <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="studentId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Roles">
								<c:forEach var="studentList" items="${studenBeansList}">
									<form:option label="${studentList.studentId}"
										value="${studentList.studentId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="status">
							Status <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="status" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Status</option>
								<form:option label="Active" value="Active" />
								<form:option label="Non-Active" value="Non-Active" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="academicYear">
							Academic Year <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<%-- <form:select path="academicYear" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select academicYear</option>
								<form:option label="2017-2018" value="2017-2018" />
								<form:option label="2016-2017" value="2016-2017" />
								<form:option label="2015-2016" value="2015-2016" />
								<form:option label="2014-2015" value="2014-2015" />
							</form:select> --%>
							
							<form:select path="studentId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Roles" readonly="true">
								<c:forEach var="studentList" items="${studenBeansList}">
									<form:option label="${studentList.academicYear}"
										value="${studentList.studentId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="currentStandard">
							Current Standard <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<%-- <form:select path="currentStandard" class="form-control select2"
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
							</form:select> --%>
							
							<form:select path="studentId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Roles" readonly="true">
								<c:forEach var="studentList" items="${studenBeansList}">
									<form:option label="${studentList.currentStandard}"
										value="${studentList.studentId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>

					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="currentSection">
							Current Section <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<%-- <form:select path="currentSection" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select currentSection</option>
								<form:option label="A" value="A" />
								<form:option label="B" value="B" />
								<form:option label="C" value="C" />
								<form:option label="D" value="D" />
							</form:select> --%>
							
							<form:select path="studentId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Roles" readonly="true">
								<c:forEach var="studentList" items="${studenBeansList}">
									<form:option label="${studentList.currentSection}"
										value="${studentList.studentId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="academicStream">
							Academic Stream <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="academicStream" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Academic Stream</option>
								<form:option label="State Board" value="State Board" />
								<form:option label="CBSC" value="CBSC" />
								<form:option label="ICSC" value="ICSC" />
								<form:option label="Kendriya" value="Kendriya" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="medium">
							Medium <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="medium" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Medium</option>
								<form:option label="Kannada" value="Kannada" />
								<form:option label="Hindi" value="Hindi" />
								<form:option label="English" value="English" />
								<form:option label="Telagu" value="Telagu" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="admissionMode">
							Admission Mode <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="admissionMode" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Admission Mode</option>
								<form:option label="Day Scholer" value="Day Scholer" />
								<form:option label="Evening Scholer" value="Evening Scholer" />
								<form:option label="Ohter" value="Ohter" />
								<%-- <form:option label="Telagu" value="Telagu" /> --%>
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="transportReq">
							Transport Required <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="transportReq" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Transport Req</option>
								<form:option label="Yes" value="Yes" />
								<form:option label="No" value="No" />
							</form:select>
						</div>
					</div>
					
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					 <input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="academicInfoId" />
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

