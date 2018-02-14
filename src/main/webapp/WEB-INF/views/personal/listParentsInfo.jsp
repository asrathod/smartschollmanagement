<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="content-wrapper">
	<section class="content-header">
		<h1>List Parents Information</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Parents</a></li>
			<li class="active">List Parents Information</li>
		</ol>
	</section>
	<!-- <body> -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<c:if test="${!empty parentsInformationBeanList}">
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
					<p>
						<i class="fa fa-info-circle"></i> Father Details
					</p>
					<!-- <h4>Father Details</h4> -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Student Name</th>
								<th>Father First Name</th>
								<th>Father Last Name</th>
								<th>Qualification</th>
								<th>Employment</th>
								<th>Annual Income</th>
								<th>mobile No</th>
								<th>Edit</th>
								<!-- <th></th> -->
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${parentsInformationBeanList}" var="parentsInformationBean">
								<tr>
									<td>${parentsInformationBean.studentId}[${parentsInformationBean.studentId}]</td>
									<td>${parentsInformationBean.fatherFirstName}</td>
									<td>${parentsInformationBean.fatherLasttName}</td>
									<td>${parentsInformationBean.fatherQualification}</td>
									<td>${parentsInformationBean.fatherEmployment}</td>
									<td>${v.fatherAnnualIncome}</td>
									<td>${parentsInformationBean.mobileNo1}</td>
									
									<td align="center"><a
										href="${contextPath}/student/editStudentInformation?studentId=${parentsInformationBean.parentsInfoId}"
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
					<br />
					<h5>
						<i class="fa fa-info-circle"></i> Mother Details
					</h5>
					<!-- <h4>Mother Details</h4> -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Student Name</th>
								<th>Mother First Name</th>
								<th>Mother Last Name</th>
								<th>Qualification</th>
								<th>Employment</th>
								<th>Annual Income</th>
								<th>mobile No</th>
								<th>Edit</th>
								<!-- <th></th> -->
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${parentsInformationBeanList}" var="parentsInformationBean">
								<tr>
									<td>${parentsInformationBean.studentId}[${parentsInformationBean.studentId}]</td>
									<td>${parentsInformationBean.motherFirstName}</td>
									<td>${parentsInformationBean.motherLasttName}</td>
									<td>${parentsInformationBean.motherQualification}</td>
									<td>${parentsInformationBean.motherEmployment}</td>
									<td>${parentsInformationBean.motherAnnualIncome}</td>
									<td>${parentsInformationBean.mobileNo2}</td>
									
									<td align="center"><a
										href="${contextPath}/student/editStudentInformation?studentId=${parentsInformationBean.parentsInfoId}"
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