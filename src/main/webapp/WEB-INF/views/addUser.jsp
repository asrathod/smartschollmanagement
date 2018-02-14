<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Add User
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>PayrollHRM</a></li>
            <li><a href="${contextPath}/emp/listEmployees">User</a></li>
            <li class="active">Add User</li>
          </ol>
        </section>
        
        <!-- Main content -->
        <section class="content">

          <!-- Default box -->
          <div class="box">
            <div class="box-body">
               <form:form class="form-horizontal" modelAttribute="userBean" method="POST" action="${contextPath}/emp/saveEmployee" > 
	               <div class="row">
	               	<div class="col-md-6">
	               		
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">First Name</label>
			              <div class="col-sm-6">
		              		 <form:input path="firstName" type="text" class="form-control" id="" placeholder="First Name" required="required" />
			              </div>
			            </div>
			            
			            
			            
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Gender</label>
			              <div class="col-sm-6">
		              		 <form:input path="gender" type="text" class="form-control" id="" placeholder="Gender" required="required" />
			              </div>
			            </div>
			            
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Location</label>
			              <div class="col-sm-6">
		              		 <form:input path="location" type="text" class="form-control" id="" placeholder="Location" required="required" />
			              </div>
			            </div>
			            
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Status</label>
			              <div class="col-sm-6">
		              		 <form:input path="status" type="text" class="form-control" id="" placeholder="Status" required="required" />
			              </div>
			            </div>
			            
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Email Address:</label>
			              <div class="col-sm-6">
		              		 <form:input path="emailId" type="email" class="form-control" id="" placeholder="Email Address" />
			              </div>
			            </div>
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Reporting Manager</label>
			              <div class="col-sm-6">
		              		<form:input path="reportManager" class="form-control" placeholder="Reporting Manager" required="required" />
			              </div>
			            </div>
			            
			          <div class="form-group">
		              <label for="" class="col-sm-3 control-label">Date of Joining<span class="text-red">*</span></label>
		              <div class="col-sm-4">
		              <div class="input-group">
			                      <div class="input-group-addon">
			                        <i class="fa fa-calendar"></i>
			                      </div>
			                      <form:input path="doj" type="text" class="form-control pull-right active" id="planstartdate" 
			                      placeholder="Date of Joining" title="Date of Joining" required="required" />
		               </div>
		              </div>
		            </div>
		            
		            <div class="form-group">
		              <label for="" class="col-sm-3 control-label">Date of Resigning<span class="text-red">*</span></label>
		              <div class="col-sm-6">
		              <div class="input-group">
			                      <div class="input-group-addon">
			                        <i class="fa fa-calendar"></i>
			                      </div>
			                      <form:input path="dor" type="text" class="form-control pull-right active" id="planstartdate" 
			                      placeholder="Date of Joining" title="Date of Resigning" required="required" />
		               </div>
		              </div>
		            </div>
		            
		            <div class="form-group">
						<label for="retypePassword" class="col-sm-2 control-label">User Role: </label>
						<div class="col-sm-6">
							<form:select path="roleId" class="form-control select2"
								style="width: 14%;" id="roleId"
								data-placeholder="Choose User Roles">
								<c:forEach var="userRole" items="${roleBeansList}">
									<form:option label="${userRole.roleName}"
										value="${userRole.id}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
			        
			        <div class="form-group">
						<label for="retypePassword" class="col-sm-2 control-label">User Department: </label>
						<div class="col-sm-6">
							<form:select path="deptId" class="form-control select2"
								style="width: 14%;" id="deptId"
								data-placeholder="Choose User Department">
								<c:forEach var="userDept" items="${departmetBeansList}">
									<form:option label="${userDept.deptName}"
										value="${userDept.deptId}" />
								</c:forEach>
							</form:select>
						</div>
					</div>
					
	               	</div>
	               	<div class="col-md-6">
	               		<div class="form-group">
			              <label for="" class="col-sm-5 control-label">UserID</label>
			              <div class="col-sm-6">
		              		 <form:input path="userEid" type="text" class="form-control" id="EID" placeholder="EID" required="required" />
			              </div>
			            </div>
			            <div class="form-group">
			              <label for="" class="col-sm-5 control-label">Last Name</label>
			              <div class="col-sm-6">
		              		 <form:input path="lastName" type="text" class="form-control" id="" placeholder="Last Name" required="required" />
			              </div>
			            </div>
			            
	               	</div>
	               </div>
		           <div class="box-footer">
	              <div class="pull-right">
	              <button type="submit" class="btn btn-success">Add User</button>
	              <button type="reset" class="btn btn-default">Reset</button>
	              </div>
	            </div><!-- /.box-footer-->
	            <input type="hidden" value="${state}" name="state" />
	            <form:hidden path="userId"/>
	            <form:hidden path="recCreatedBy"/>
		        <form:hidden path="recCreatedDate"/>
		        <form:hidden path="recUpdatedBy"/>
		        <form:hidden path="recUpdatedDate"/>
		        <form:hidden path="roleId" />
				<from:hidden path="userPwd" />
				<from:hidden path="pwdSalt" />
		    </form:form>
            </div><!-- /.box-body -->
          </div><!-- /.box -->
          
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
<script type="text/javascript">
jQuery(document).ready(function() {
	<c:if test="${userBean.userId gt 0}">
		$('#EID').attr('readonly', true);
	</c:if>
});
</script>