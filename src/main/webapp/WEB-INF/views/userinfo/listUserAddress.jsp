<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="content-wrapper">
	<section class="content-header">
		<h1>List Address Information</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Address</a></li>
			<li class="active">List Address Information</li>
		</ol>
	</section>
	<!-- <body> -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<c:if test="${!empty userAddressBeanList}">
					<c:if test="${not empty message}">
						<div class="alert alert-success alert-dismissible">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">×</button>
							<h4>
								<i class="icon fa fa-check"></i> ${message}
							</h4>
						</div>
					</c:if>
					<c:if test="${not empty error}">
						<div class="alert alert-warning alert-dismissible">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">×</button>
							<h4>
								<i class="icon fa fa-warning"></i> ${error}
							</h4>
						</div>
					</c:if>
					<!-- <table align="left" border="1"> -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Employee Name</th>
								<th>Primary Contact#</th>
								<th>Secondary Contact#</th>
								<th>Street No & Name</th>
								<th>City</th>
								<th>State</th>
								<th>Country</th>
								<th>Zip Code</th>		
								<th>Street No & Name2</th>
								<th>City2</th>
								<th>State2</th>
								<th>Country2</th>
								<th>Zip Code2</th>
								<th>Edit</th>
								<!-- <th></th> -->
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${userAddressBeanList}" var="userAddressBean">
								<tr>
									<td>${userAddressBean.userId}[${userAddressBean.userId}]</td>
									<td>${userAddressBean.primaryContactNo}</td>
									<td>${userAddressBean.secondaryContactNo}</td>
									<td>${userAddressBean.currentStreetNoName}</td>
									<td>${userAddressBean.currentCity}</td>
									<td>${userAddressBean.currentState}</td>
									<td>${userAddressBean.currentCountry}</td>
									<td>${userAddressBean.currentZipCode}</td>	
									<td>${userAddressBean.permanentStreetNoName}</td>
									<td>${userAddressBean.permanentCity}</td>
									<td>${userAddressBean.permanentState}</td>
									<td>${userAddressBean.permanentCountry}</td>
									<td>${userAddressBean.permanentZipCode}</td>
									
									<td align="center"><a
										href="${contextPath}/student/editStudentInformation?studentId=${userAddressBean.addressId}"
										class="btn btn-xs btn-primary"><i class="fa fa-edit"></i></a></td>

									<%-- <td align="center"><a href="#">
											<button class="btn btn-xs btn-danger"
												onclick="confirmDelete('${bankDetailsBean.bankId}');">
												<i class="fa fa-trash"></i>
											</button>
									</a></td> --%>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
				<!-- </body> -->
			</div>
		</div>
	</section>
</div>

<div class="modal fade bs-example-modal-lg" id="confrombox"
	tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h3 class="modal-title" id="myModalLabel">Are you sure you want
					to delete it?</h3>
			</div>
			<div class="modal-body">
				<div class="">
					<input type="hidden" id="deleteUserId">
					<button type="button" class="btn btn-success " id="deleteYesBtn">Yes</button>
					<button type="button" class="btn btn-danger" id="deleteNoBtn">No</button>
				</div>
			</div>
			<!-- modal-body-->

		</div>
		<!-- modal-content -->
	</div>
	<!-- modal-dialog -->
</div>

<script src="${contextPath}/resources/js/newui/jQuery-2.1.4.min.js"></script>
<script type="text/javascript">
	jQuery(document)
			.ready(
					function() {
						$("button#deleteYesBtn")
								.on(
										'click',
										function() {
											$('div#confrombox').modal('hide');
											document.location.href = "${contextPath}/login/deleteBankDetails?id="
													+ $(
															"div#confrombox input#deleteUserId")
															.val();
										});

						$("button#deleteNoBtn").on('click', function() {
							$('div#confrombox').modal('hide');
						});
					});

	function confirmDelete(UserId) {
		$("div#confrombox input#deleteUserId").val(UserId);
		$('div#confrombox').modal('show');
	}
</script>