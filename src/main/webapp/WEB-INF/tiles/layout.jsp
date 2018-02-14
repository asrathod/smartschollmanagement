	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"
	scope="application" />
<html>
 
<head>
    
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/font-awesome.css">
<link rel="stylesheet" href="${contextPath}/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/fonts.css">
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap-timepicker.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/dataTables.bootstrap.css">
<link rel="stylesheet" href="${contextPath}/resources/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/datepicker3.css">
<link rel="stylesheet" href="${contextPath}/resources/css/jquery-ui.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/jquery-ui.css">
<link rel="stylesheet" href="${contextPath}/resources/css/daterangepicker-bs3.css">
<link rel="stylesheet" href="${contextPath}/resources/css/AdminLTE.css">
<link rel="stylesheet" href="${contextPath}/resources/css/newstyle.css">
<link rel="stylesheet" href="${contextPath}/resources/css/ionicons.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/select2.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/fileinput.css" media="all" type="text/css" />

<link rel="stylesheet" href="${contextPath}/resources/css/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet" href="${contextPath}/resources/css/AdminLTE.min.css">
<link rel="stylesheet" href="${contextPath}/resources/css/_all-skins.min.css">


<!-- Latest compiled and minified JavaScript -->
<%-- <script src="${contextPath}/resources/js/jQuery-2.1.4.min.js"></script> --%> 
<script src="${contextPath}/resources/js/jquery-3.2.1.min.js"></script> 
<script src="${contextPath}/resources/js/bootstrap.min.js" ></script>
<script src="${contextPath}/resources/js/bootstrap-datepicker.js" ></script>
<script src="${contextPath}/resources/js/bootstrap-timepicker.min.js" ></script>
<script src="${contextPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
<script src="${contextPath}/resources/js/dataTables.bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/language-icon-select.js"></script>
<script src="${contextPath}/resources/js/app.min.js"></script>
<script src="${contextPath}/resources/js/demo.js"></script>
<script src="${contextPath}/resources/js/morris.min.js"></script>
<script src="${contextPath}/resources/js/select2.full.min.js"></script>
<script src="${contextPath}/resources/js/fileinput.js" type="text/javascript"></script>
<script src="${contextPath}/resources/js/language-icon-select.js"></script>
<script src="${contextPath}/resources/js/language-menu-scroll.js"></script>

<script src="${contextPath}/resources/js/daterangepicker.js" ></script>
<script src="${contextPath}/resources/js/daterangepicker.js" ></script>
<script src="${contextPath}/resources/js/moment.min.js" ></script>

<script src="${contextPath}/resources/js/dashboard2.js" ></script> 
<%--<script src="${contextPath}/resources/js/jquery-jvectormap-1.2.2.min.js" ></script>
<script src="${contextPath}/resources/js/jquery-jvectormap-world-mill-en.js" ></script>
<script src="${contextPath}/resources/js/jquery.sparkline.min.js" ></script>--%>
<script src="${contextPath}/resources/js/fastclick.js" ></script>
<script src="${contextPath}/resources/js/jquery.slimscroll.min.js" ></script>
<script src="${contextPath}/resources/js/Chart.min.js" ></script>
</head>

<body>
	<div>
        <header id="header">
            <tiles:insertAttribute name="header" />
        </header>
     	
        <section id="site-content">
            <tiles:insertAttribute name="body" />
        </section>
        
        <footer id="footer">
            <tiles:insertAttribute name="footer" />
        </footer>
     </div>
 </body>  	
<script type="text/javascript">
$(function () {
	
        $("#datepicker").datepicker({
        	
        	minDate : 0,
            format: "dd/mm/yyyy",
            showOtherMonths: true,
            selectOtherMonths: true,
            autoclose: true,
            changeMonth: true,
            changeYear: true,
         //   gotoCurrent: true,
         	todayHighlight: true,
           orientation: "top" // add this
        });
});

$(function () {
    $("#resigndate").datepicker({
        format: "dd/mm/yyyy",
        showOtherMonths: true,
        selectOtherMonths: true,
        autoclose: true,
        changeMonth: true,
        changeYear: true,
        //gotoCurrent: true,
        todayHighlight: true,
       orientation: "top" // add this
    });
    
    $('#planstartdate').daterangepicker({
    	minDate : 0,
    	timePicker : true,
    	"singleDatePicker" : true,
    	"opens" : "center",
    	format : 'MM/DD/YYYY h:mm A'
	});

    $("#dateofbirth").datepicker({
    	maxDate: '0',
        format: "dd/mm/yyyy",
        showOtherMonths: true,
        selectOtherMonths: true,
        autoclose: true,
        changeMonth: true,
        changeYear: true,
        gotoCurrent: true,
       orientation: "top" // add this
    });
    
    $("#dateOfJoining").datepicker({
    	maxDate: '0',
        format: "dd/mm/yyyy",
        showOtherMonths: true,
        selectOtherMonths: true,
        autoclose: true,
        changeMonth: true,
        changeYear: true,
        gotoCurrent: true,
       orientation: "top" // add this
    });
    
	 $("#startDate").datepicker({
	    	minDate:new Date(),
	        format: "dd/mm/yyyy",
	        showOtherMonths: true,
	        selectOtherMonths: true,
	        autoclose: true,
	        changeMonth: true,
	        changeYear: true,
	        //gotoCurrent: true,
	       orientation: "top" // add this
	    });
	    
	    $("#endDate").datepicker({
	    	minDate:new Date(),
	        format: "dd/mm/yyyy",
	        showOtherMonths: true,
	        selectOtherMonths: true,
	        autoclose: true,
	        changeMonth: true,
	        changeYear: true,
	        //gotoCurrent: true,
	       orientation: "top" // add this
	    });
});

/* $(document).ready(function() {
	 $("#example1, .dynamictable").DataTable();
	});  */

</script>
<script>
$(document).ready(function(){
    $('#datepicker12').datepicker({
        format: 'mm-dd-yyyy',
        endDate: '+0d',
        autoclose: true
    });
});
</script>

<script>
  $(function () {
    $("#example1").DataTable({
    	
    	"scrollX": true,
    	"iDisplayLength" : 10
    });
    
    /* $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    }); */
    
  });
</script>
</html>