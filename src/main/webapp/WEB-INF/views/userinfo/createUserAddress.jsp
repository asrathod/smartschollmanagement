<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<style type = "text/css">
	#hr {
		margin: 20px 0;
	}
	
	hr {
    height: 2px;
    /* border: none; */
    }
	
	strong, b {
    font-weight: bold;
    margin-left: 100px;
	}
</style>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<c:choose>
			<c:when test="${userAddressBean.addressId == 0}">
				<h1>Create Address Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Address</a></li>
					<li class="active">Address Information</li>
				</ol>
			</c:when>
			<c:otherwise>
				<h1>Update Address Information</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Address</a></li>
					<li class="active">Address Information</li>
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
				<form:form class="form-horizontal" modelAttribute="userAddressBean"
					method="POST" action="${contextPath}/user/saveAddress">
					
					<div class="form-group ">
						<label class="col-sm-4 control-label" for="select"> User Name
							 <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:select path="userId" class="select form-control"
								id="studentId" name="select" data-placeholder="Choose User Name">
								<c:forEach var="userList" items="${UserInformationBeansList}">
									<form:option label="${userList.firstName}"
										value="${userList.userId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
					<!-- User Address -->
					<div class="form-group">
						<label for="primaryContactNo" class="col-sm-4 control-label">
							Primary Contact# : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="primaryContactNo" class="form-control"
								id="primaryContactNo" name="primaryContactNo" type="text"
								placeholder="Enter Primary Contact No.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="secondaryContactNo" class="col-sm-4 control-label">
							Secondary Contact# : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="secondaryContactNo" class="form-control"
								id="secondaryContactNo" name="secondaryContactNo" type="text"
								placeholder="Enter Primary Contact No.." required="required" />
						</div>
					</div>
					<hr id="hr">
					<b>Current Address:</b>
					<!-- Branch Name -->
					<div class="form-group">
						<label for="currentStreetNoName" class="col-sm-4 control-label">Street No & Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentStreetNoName" class="form-control"
								id="currentStreetNoName" name="currentStreetNoName" type="text"
								placeholder="Street No & Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="currentCity" class="col-sm-4 control-label">City
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentCity" class="form-control"
								id="currentCity" name="currentCity" type="text"
								placeholder="Enter City.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="currentState" class="col-sm-4 control-label">State
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentState" class="form-control"
								id="currentState" name="currentState" type="text"
								placeholder="Enter State.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="currentCountry" class="col-sm-4 control-label">Country
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentCountry" class="form-control"
								id="currentCountry" name="currentCountry" type="text"
								placeholder="Enter Country.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="currentZipCode" class="col-sm-4 control-label">Zip Code
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="currentZipCode" class="form-control"
								id="currentZipCode" name="currentZipCode" type="text"
								placeholder="Enter Zip Code.." required="required" />
						</div>
					</div>
					
   					<hr id = "hr">
   					<b>Permanent Address:</b>
					<div class="form-group">
						<label for="permanentStreetNoName" class="col-sm-4 control-label">Street No & Name
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="permanentStreetNoName" class="form-control"
								id="permanentStreetNoName" name="permanentStreetNoName" type="text"
								placeholder="Enter Street No Name.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="permanentCity" class="col-sm-4 control-label">City
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="permanentCity" class="form-control"
								id="permanentCity" name="permanentCity" type="text"
								placeholder="Enter City.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="permanentState" class="col-sm-4 control-label">State
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="permanentState" class="form-control"
								id="permanentState" name="permanentState" type="text"
								placeholder="Enter State.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="permanentCountry" class="col-sm-4 control-label">Country
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="permanentCountry" class="form-control"
								id="permanentCountry" name="permanentCountry" type="text"
								placeholder="Enter Country.." required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="permanentZipCode" class="col-sm-4 control-label">Zip Code
							 : <span class="text-red">*</span>
						</label>
						<div class="col-sm-4">
							<form:input path="permanentZipCode" class="form-control"
								id="permanentZipCode" name="permanentZipCode" type="text"
								placeholder="Enter Zip Code.." required="required" />
						</div>
					</div>
												
					<!--hidden variables  -->
					<c:if test="${not empty studentBean.studentId }">
					<input type="hidden" value="${state}" name="state" /> 
					<form:hidden path="userId" />
					<form:hidden path="addressId" />
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


