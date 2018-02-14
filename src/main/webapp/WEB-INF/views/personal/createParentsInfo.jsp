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
			<c:when test="${parentsInformationBean.parentsInfoId == 0}">
				<h1>Create Parents Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Parents</a></li>
					<li class="active">Parents Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Parents Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Parents</a></li>
					<li class="active">Parents Information</li>
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
				<form:form class="form-horizontal" modelAttribute="parentsInformationBean"
					method="POST" action="${contextPath}/personal/saveParentsInfo">
					
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
						<label for="fatherFirstName" class="col-sm-4 control-label">
							Father First Name : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="fatherFirstName" class="form-control"
								id="fatherFirstName" name="fatherFirstName" type="text"
								placeholder="Enter First Name.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="fatherLasttName" class="col-sm-4 control-label">Father Last Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="fatherLasttName" class="form-control"
								id="fatherLasttName" name="fatherLasttName" type="text"
								placeholder="Enter Last Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="fatherQualification" class="col-sm-4 control-label">Qualification
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="fatherQualification" class="form-control"
								id="fatherQualification" name="fatherQualification" type="text"
								placeholder="Enter fatherQualification.." required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="fatherEmployment">
							Employment <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="fatherEmployment" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Employment</option>
								<form:option label="Abc" value="Abc" />
								<form:option label="B" value="B" />
								<form:option label="C" value="C" />
								<form:option label="D" value="D" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="fatherAnnualIncome" class="col-sm-4 control-label">Annual Income
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="fatherAnnualIncome" class="form-control"
								id="fatherAnnualIncome" name="fatherAnnualIncome" type="text"
								placeholder="Enter Annual Income.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="mobileNo1" class="col-sm-4 control-label">mobile No
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="mobileNo1" class="form-control"
								id="mobileNo1" name="mobileNo1" type="text"
								placeholder="Enter mobile No.." required="required" />
						</div>
					</div>
					
					<!-- Acc Holder Name -->
					<div class="form-group">
						<label for="motherFirstName" class="col-sm-4 control-label">
							Mother First Name : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="motherFirstName" class="form-control"
								id="motherFirstName" name="motherFirstName" type="text"
								placeholder="Enter First Name.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="motherLasttName" class="col-sm-4 control-label">Last Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="motherLasttName" class="form-control"
								id="motherLasttName" name="motherLasttName" type="text"
								placeholder="Enter Last Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="motherQualification" class="col-sm-4 control-label">Qualification
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="motherQualification" class="form-control"
								id="motherQualification" name="motherQualification" type="text"
								placeholder="Enter Qualification.." required="required" />
						</div>
					</div>
					
					<div class="form-group ">
						<label class="col-sm-4 control-label requiredField" for="motherEmployment">
							Employment <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="motherEmployment" class="form-control select2"
								style="width: 100%;" required="true">
								<option value="" disabled selected>Select Employment</option>
								<form:option label="Abc" value="Abc" />
								<form:option label="B" value="B" />
								<form:option label="C" value="C" />
								<form:option label="D" value="D" />
							</form:select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="motherAnnualIncome" class="col-sm-4 control-label">Annual Income
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="motherAnnualIncome" class="form-control"
								id="motherAnnualIncome" name="motherAnnualIncome" type="text"
								placeholder="Enter Annual Income.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="mobileNo2" class="col-sm-4 control-label">mobile No
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="mobileNo2" class="form-control"
								id="mobileNo2" name="mobileNo2" type="text"
								placeholder="Enter mobile No.." required="required" />
						</div>
					</div>
													
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="parentsInfoId" />
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
<script type="text/javascript">
	$("#toshipping_checkbox").on("click",function(){
	    var ship = $(this).is(":checked");
	    $("[id^='shipping_']").each(function(){
	      var tmpID = this.id.split('shipping_')[1];
	      $(this).val(ship?$("#"+tmpID).val():"");
	    });
	});
</script>


