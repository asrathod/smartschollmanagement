<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="content-wrapper">
	<section class="content-header">
		<h1>List Achievements Information</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Achievements</a></li>
			<li class="active">List Achievements Information</li>
		</ol>
	</section>
	<!-- <body> -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<c:if test="${!empty achievementsInformationBeanList}">
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
					<table id="example99" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th></th>
								<th>Student Name</th>
								<th>Achievement 1</th>
								<th>Achievement 2</th>
								<th>Achievement 1</th>
								<th>Edit</th>
								<th></th>
							</tr>
						</thead>

						<%-- <tbody>
							<c:forEach items="${achievementsInformationBeanList}" var="achievementsInformationBean">
								<tr>
									<td><img src="${contextPath}/resources/img/${achievementsInformationBean.code}" ></td>
									<td>${achievementsInformationBean.studentId}[${achievementsInformationBean.studentId}]</td>
									<td>${achievementsInformationBean.achievement1}</td>
									<td>${achievementsInformationBean.achievement2}</td>
									<td>${achievementsInformationBean.achievement3}</td>

									<td align="center"><a
										href="${contextPath}/extraCurricular/editAchievements?id=${achievementsInformationBean.achievInfoId}"
										class="btn btn-xs btn-primary"><i class="fa fa-edit"></i></a></td>
										
									<td align="center"> <a href="${contextPath}/extraCurricular/deleteAchievements?id=${achievementsInformationBean.achievInfoId}" class="btn btn-xs btn-danger"><i class="fa fa-trash"></i></a></td>
									 
									 <td align="center"><a href="#">
											<button class="btn btn-xs btn-danger"
												onclick="confirmDelete('${achievementsInformationBean.achievInfoId}');">
												<i class="fa fa-trash"></i>
											</button>
									</a></td> 
								</tr>
							</c:forEach>
						</tbody> --%>
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
<script src="${contextPath}/resources/js/bootstrap.min.js" ></script>
<script src="${contextPath}/resources/js/jquey.dataTables.js" ></script>
<script type="text/javascript">
	jQuery(document)
			.ready(
					function() {
						$("button#deleteYesBtn")
								.on(
										'click',
										function() {
											$('div#confrombox').modal('hide');
											document.location.href = "${contextPath}/extraCurricular/deleteAchievements?id="
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
<script>
$(function() {
	// list of all products for admin
	var $example99 = $('#example99');
	
	
	if($example99.length) {
		
		var jsonUrl = ${contextPath} + '/extraCurricular/listAchievementsInfo';
		console.log(jsonUrl);
		
		$example99.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ], [ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 30,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [		
					           	
					           	{data: 'code',
					           	 bSortable: false,
					           		mRender: function(data,type,row) {
					           			return '<img src="' + ${contextPath}
										+ '/resources/img/' + data
										+ '.jpg" class="dataTableImg"/>';					           			
					           		}
					           	}	           		           	
					]
		
		});
	}
})

</script>