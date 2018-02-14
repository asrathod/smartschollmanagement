<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application" />
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/font-awesome.css">
<link rel="stylesheet" href="${contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/dataTables.bootstrap.css">
<script src="${contextPath}/resources/js/jquery-3.2.1.min.js"></script> 
<script src="${contextPath}/resources/js/bootstrap.min.js" ></script>
<script src="${contextPath}/resources/js/jquery.dataTables.min.js"></script>

<div class="content-wrapper">
	<!-- <section class="content-header">
		<h1>List Invalid Deals List</h1>
	</section> -->
	<!-- <body> -->
	<section class="content">
		<div class="box">
			<div class="box-body">
				<c:if test="${!empty invalidDealsList}">
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

					<div class="row">
						<form class="form-horizontal" method="GET"
							action="${contextPath}/Bloomberg/invalidDeals">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-5 control-label">Select
									File<span class="text-red">*</span>
								</label>
								<div class="col-sm-4">
									<select class="form-control select2" id="fileId" name="fileId"
										style="width: 100%;">
										<c:forEach items="${fileList }" var="file">
											<option value="${file.id}">${file.fileName}</option>
											<%-- <c:if test="${fileName eq fileList}">selected="selected"</c:if>>${fileName}</option> --%>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="col-sm-2 col-sm-offset-6">
								<button type="submit" class="btn btn-success btn-block btn-flat">Search
								</button>
							</div>
						</form>
					</div>

					<!-- <table align="left" border="1"> -->
					<table id="example1" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Id</th>
								<th>From Currecncy</th>
								<th>To Currecncy</th>
								<th>Amount</th>
								<th>Date</th>
								<th>Reason</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${invalidDealsList}" var="invalidDealsBean">
								<tr>
									<td align="center">${invalidDealsBean.id}</td>
									<td align="center">${invalidDealsBean.fromCurrecncy}</td>
									<td align="center">${invalidDealsBean.toCurrecncy}</td>
									<td align="center">${invalidDealsBean.amount}</td>
									<td align="center">${invalidDealsBean.date}</td>
									<td align="center">${invalidDealsBean.reason}</td>
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

<script>
  $(function () {
    $("#example1").DataTable({
    	
    	"scrollX": true,
    	"iDisplayLength" : 10
    });    
  });
</script>
