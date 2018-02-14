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
			<c:when test="${personalInformationBean.personalInfoId == 0}">
				<h1>Create Personal Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Personal</a></li>
					<li class="active">Personal Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Personal Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Personal</a></li>
					<li class="active">Personal Information</li>
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
				<form:form class="form-horizontal" modelAttribute="personalInformationBean"
					method="POST" action="${contextPath}/personal/savePersonalInformation">
					
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
					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="addmisionNo" class="col-sm-4 control-label">
							Admission No : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="addmisionNo" class="form-control"
								id="addmisionNo" name="addmisionNo" type="text"
								placeholder="Enter Admission No.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
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
					
					<!-- account Not -->
					<div class="form-group">
						<label for="placeOfbirth" class="col-sm-4 control-label">Place Of Birth
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="placeOfbirth" class="form-control" id="placeOfbirth"
								name="placeOfbirth" type="text" placeholder="Enter Place Of Birth.."
								required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="religion">
							Religion <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="religion" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Religion</option>
								<form:option label="Hindu" value="Hindu" />
								<form:option label="Muslim" value="Muslim" />
								<form:option label="Christian" value="Christian" />
								<form:option label="Sikh" value="Sikh" />
								<form:option label="Buddhist" value="Buddhist" />
								<form:option label="Jain" value="Jain" />
								<form:option label="Parsi" value="Parsi" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="cast">
							Cast <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="cast" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Cast</option>
								<form:option label="GM" value="GM" />
								<form:option label="2A" value="2A" />
								<form:option label="3B" value="3B" />
								<form:option label="SC/ST" value="SC/ST" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="subCast">
							Sub Cast <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="subCast" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Cast</option>
								<form:option label="GM" value="GML" />
								<form:option label="2A" value="2AB" />
								<form:option label="3B" value="3BC" />
								<form:option label="SC/ST" value="SC/STA" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="motherToungue">
							Mother Tongue <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="motherToungue" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Mother Tongue</option>
								<form:option label="Kannada" value="Kannada" />
								<form:option label="Hindi" value="Hindi" />
								<form:option label="English" value="English" />
								<form:option label="Telagu" value="Telagu" />
							</form:select>
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
						<label for="idMark2" class="col-sm-4 control-label">Id Mark 2
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:textarea path="idMark2" class="form-control" rows="3"
								id="idMark2" name="idMark2" type="text"
								placeholder="Enter Id Mark 2.." required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="disabilityYesno">
							Disability <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="disabilityYesno" class="form-control select2"
								style="width: 100%;" required="true">
								<!-- <option value="" disabled selected>Select Mother Tongue</option> -->
								<form:option label="Yes" value="Yes" />
								<form:option label="No" value="No" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="disabilityDetails" class="col-sm-4 control-label">Disability Details
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:textarea path="disabilityDetails" class="form-control" rows="3"
								id="disabilityDetails" name="disabilityDetails" type="text"
								placeholder="Enter Disability Details.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="medicalHistory" class="col-sm-4 control-label">Medical History
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:textarea path="medicalHistory" class="form-control" rows="3"
								id="medicalHistory" name="medicalHistory" type="text"
								placeholder="Enter Medical History.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="medicalTreatement" class="col-sm-4 control-label">Medical Treatement
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:textarea path="medicalTreatement" class="form-control"
								id="medicalTreatement" name="medicalTreatement" type="text" rows="3"
								placeholder="Enter Medical Treatement.." required="required" />
						</div>
					</div>
					
										
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="personalInfoId" />
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

