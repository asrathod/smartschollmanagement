<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- <body class="hold-transition skin-blue sidebar-collapse sidebar-mini"> -->
<header class="main-header">
	
	 <a href="#" class="navbar-brand logo-header"><b> Smart School
		</b>
			<h6>School management system</h6> 		
	</a>			
	<!-- <a href="#" class="logo">
      <span class="logo-mini">PayRoll</span>
      <span class="logo-lg"><b>PayRoll</b>HRM</span>
    </a> -->
   
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
      
      <div class="navbar-header pull-right">
		<a href="#" class="navbar-brand logo-header"> 
			<span style="color: #00a65a ; font-weight: bold">Smart</span><span style="color: #0000FF; font-weight: bold">School</span>
				<h6>
					School management system
				</h6> 
		</a>
	</div> 
     </nav>
</header>

<!-- Left side column. contains the sidebar -->
<aside class="main-sidebar">
    
    <section class="sidebar">
      
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${contextPath}/resources/img/avatar5.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p><%=session.getAttribute("firstName") %> <%=session.getAttribute("lastName") %></p>
          <a href="#"><i class="fa fa-map-marker"></i> ${locationName}</a>
        </div>
      </div>
     
      <ul class="sidebar-menu">
       
        <li class="treeview">
          <a href="../login/home">
            <i class="fa fa-home"></i> <span>Home</span>
          </a>
          
        </li>
        
        <li class="treeview">
          <a href="#">
            <i class="fa fa-user"></i>
            <span>Student Info</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../user/createUserPage"><i class="fa fa-circle-o"></i> Create Student</a></li>
			<li><a href="../user/listUserInfo"><i class="fa fa-circle-o"></i> List Student</a></li>
			<li><a href="../user/userListByManager"><i class="fa fa-circle-o"></i> My Reporting ManagerList</a></li>
          </ul>
        </li>
        
        <li class="treeview">
          <a href="#">
            <i class="fa fa-info"></i>
            <span>Personal Info</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../personal/createPersonalInfoPage"><i class="fa fa-circle-o"></i> Create/Edit Personal info</a></li>
            <li><a href="../personal/listPersonalInfo"><i class="fa fa-circle-o"></i> List Personal info</a></li>
          </ul>
        </li>
        
        <li class="treeview">
          <a href="#">
            <i class="fa fa-university"></i> <span>Bank Details</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../bank/createBankDetailsPage"><i class="fa fa-circle-o"></i> Create/Edit Bank Details</a></li>
			<li><a href="../bank/bankDetailsList"><i class="fa fa-circle-o"></i> List Bank Details</a></li>
          </ul>
        </li>
        
        <li class="treeview">
          <a href="#">
            <i class="fa fa-credit-card"></i> <span>Salary Info</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../salaryStructure/createSalaryStructuretPage"><i class="fa fa-circle-o"></i> Create/Edit Salary Info</a></li>
			<li><a href="../salaryStructure/salaryStructureList"><i class="fa fa-circle-o"></i> List Salary Info</a></li>
          </ul>
        </li>
        
        <li class="treeview">
          <a href="#">
            <i class="fa fa-building"></i> <span>Department</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../department/createDepartmentPage"><i class="fa fa-circle-o"></i> Create Department</a></li>
			<li><a href="../department/departmentList"><i class="fa fa-circle-o"></i> List Department</a></li>
            
          </ul>
        </li>
       
        <li class="treeview">
          <a href="#">
            <i class="fa fa-folder"></i> <span>Leave Management</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-right pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../leave/newLeavePage"><i class="fa fa-circle-o"></i> New Leave Request</a></li>
			<li><a href="../leave/leaveList"><i class="fa fa-circle-o"></i> My Leave List</a></li>
			<li><a href="../leave/requestedLeaveList"><i class="fa fa-circle-o"></i> Request Leave List</a></li>
			<li><a href="../leave/approvedLeaveList"><i class="fa fa-circle-o"></i> Approved/Requested Leave List</a></li>
          </ul>
        </li>
        
        <li class="treeview">
          <a href="${contextPath}/login/logout">
            <i class="fa fa-sign-out"></i> <span>Sign Out</span>
          </a>
        </li>
      </ul>
    </section>
  </aside> 
 <!--  </body> -->
<!-- <hr/>  --> 