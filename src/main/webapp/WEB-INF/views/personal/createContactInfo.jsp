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
			<c:when test="${contactInfoBean.contactInfoId == 0}">
				<h1>Create Contact Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Contact</a></li>
					<li class="active">Contact Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Contact Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Contact</a></li>
					<li class="active">Contact Information</li>
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
				<form:form class="form-horizontal" modelAttribute="contactInfoBean"
					method="POST" action="${contextPath}/personal/saveContactInfo">
					
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
						<label for="firstContactNo" class="col-sm-4 control-label">
							Primary Contact No : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="firstContactNo" class="form-control"
								id="firstContactNo" name="firstContactNo" type="text"
								placeholder="Enter Primary Contact No.." required="required" />
						</div>
					</div>
					
					<!-- Branch Name -->
					<div class="form-group">
						<label for="streetNoName1" class="col-sm-4 control-label">Street No & Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="streetNoName1" class="form-control"
								id="streetNoName1" name="streetNoName1" type="text"
								placeholder="Street No & Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="city" class="col-sm-4 control-label">City
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="city" class="form-control"
								id="city" name="city" type="text"
								placeholder="Enter City.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="state" class="col-sm-4 control-label">State
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="state" class="form-control"
								id="state" name="state" type="text"
								placeholder="Enter State.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="Country" class="col-sm-4 control-label">Country
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="Country" class="form-control"
								id="Country" name="Country" type="text"
								placeholder="Enter Country.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="ZipCode" class="col-sm-4 control-label">Zip Code
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="ZipCode" class="form-control"
								id="ZipCode" name="ZipCode" type="text"
								placeholder="Enter Zip Code.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="secondContactNo" class="col-sm-4 control-label">
							Secondary Contact No : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="secondContactNo" class="form-control"
								id="secondContactNo" name="secondContactNo" type="text"
								placeholder="Enter Secondary Contact No.." required="required" />
						</div>
					</div>
					
					<input type="checkbox" id="toshipping_checkbox" />
   					<em>Check this box if Shipping Address and Billing Address are the same.</em>
   					
					<div class="form-group">
						<label for="adharNo" class="col-sm-4 control-label">Street No & Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="streetNoName2" class="form-control"
								id="shipping_address_1" name="streetNoName2" type="text"
								placeholder="Enter Street No Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="city2" class="col-sm-4 control-label">City
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="city2" class="form-control"
								id="city2" name="city2" type="text"
								placeholder="Enter City.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="state2" class="col-sm-4 control-label">State
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="state2" class="form-control"
								id="state2" name="state2" type="text"
								placeholder="Enter State.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="Country2" class="col-sm-4 control-label">Country
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="Country2" class="form-control"
								id="Country2" name="Country2" type="text"
								placeholder="Enter Country.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="ZipCode2" class="col-sm-4 control-label">Zip Code
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="ZipCode2" class="form-control"
								id="ZipCode2" name="ZipCode2" type="text"
								placeholder="Enter Zip Code.." required="required" />
						</div>
					</div>
												
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="studentId" />
					<form:hidden path="contactInfoId" />
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


