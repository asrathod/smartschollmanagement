<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="content-wrapper">
	<section class="content-header">
		<h1>List Academic Information</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Academic</a></li>
			<li class="active">List Academic Information</li>
		</ol>
	</section>
	<!-- <body> -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<c:if test="${!empty academicInformationBeanList}">
					<c:if test="${not empty message}">
						<div class="alert alert-success alert-dismissible">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">�</button>
							<h4>
								<i class="icon fa fa-check"></i> ${message}
							</h4>
						</div>
					</c:if>
					<c:if test="${not empty error}">
						<div class="alert alert-warning alert-dismissible">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">�</button>
							<h4>
								<i class="icon fa fa-warning"></i> ${error}
							</h4>
						</div>
					</c:if>
					<!-- <table align="left" border="1"> -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Status</th>
								<th>Academic Year</th>
								<th>Current Standard</th>
								<th>Current Section</th>
								<th>Academic Stream</th>
								<th>Medium</th>
								<th>Admission Mode</th>
								<th>Transport Required</th>
								<th>Edit</th>
								<!-- <th></th> -->
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${academicInformationBeanList}" var="academicInformationBean">
								<tr>
									<td>${academicInformationBean.status}</td>
									<td>${academicInformationBean.academicYear}</td>
									<td>${academicInformationBean.currentStandard}</td>
									<td>${academicInformationBean.currentSection}</td>
									<td>${academicInformationBean.academicStream}</td>
									<td>${academicInformationBean.medium}</td>
									<td>${academicInformationBean.admissionMode}</td>
									<td>${academicInformationBean.transportReq}</td>
									
									<td align="center"><a
										href="${contextPath}/student/editStudentInformation?studentId=${academicInformationBean.studentId}"
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