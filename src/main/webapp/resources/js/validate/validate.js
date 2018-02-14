/**
 * @CreatedOn Jan 19, 2016
 * @author Chirag Loliyana
 */

//For Document Module
$(document).ready(function($) {
	
	if($("#externalUrl").val() != undefined && $("#externalUrl").val() != ""){
		$("div#systemDiv").hide();
		$("div#externalDiv").hide();
		$("#versionComment").parent().parent().hide();
		$("#optionsRadios_2").prop("checked", true);
	}else{
		$("#optionsRadios_1").prop("checked", true);
	}
	
	$("input[id^='optionsRadios_']").on('click', function(){
		$("#versionComment").val('');
		$("#versionComment").parent().parent().show();
		
		if($(this).val() == "SYSTEM" && $(this).is(":checked")){
			$("div#systemDiv").show();
			$("input#attachmentFile").attr("required",true);
			$("input#externalUrl").attr("required",false);
			$("div#externalDiv").hide();
		}else if($(this).val() == "EXTERNAL" && $(this).is(":checked")){
			$("div#systemDiv").hide();
			$("input#attachmentFile").attr("required",false);
			$("input#externalUrl").attr("required",true);
			$("div#externalDiv").show();
		}
	});
	
	$("form#documentForm").on("submit",function(){
		if($("#optionsRadios_1").is(":checked")){
			// TODO for file upload
		}else{
			$("#attachmentUrl").val($("#externalUrl").val());
			console.log($("#attachmentUrl").val());
		}
	});
	
	
	$("input[id^='edu_'], input[id^='train_'], input[id^='exp_']").on("blur",function(){
		var eid = $(this).attr("id");
		var rindex = eid.split("_")[1];
		var uid = "update_"+rindex;
		var update = isEmpSkillUpdated(rindex);
		if(update){
			$("input[id='"+uid+"']").val(true);
		}else{
			$("input[id='"+uid+"']").val(false);
		}
		
	});
	
	function isEmpSkillUpdated(rindex){
		var update = false;
		if($.trim($("input#edu_"+rindex).val()) != $("div#edu_"+rindex+"_old").text()){
			update = true;
		}
		if($.trim($("input#train_"+rindex).val()) != $("div#train_"+rindex+"_old").text()){
			update = true;
		}
		if($.trim($("input#exp_"+rindex).val()) != $("div#exp_"+rindex+"_old").text()){
			update = true;
		}
		return update;
	}
	
	// for TrainingSchedule form employee selection required valition
	if($("form#trainingscheduleForm select#employee :selected").length == 0){
		$("form#trainingscheduleForm select#bootstrap-duallistbox-nonselected-list_employee").attr("required",true);
	}
	
	$("form#trainingscheduleForm select#employee").change(function(){
		if($("form#trainingscheduleForm select#employee :selected").length == 0){
			$("form#trainingscheduleForm select#bootstrap-duallistbox-nonselected-list_employee").attr("required",true);
		}else{
			$("form#trainingscheduleForm select#bootstrap-duallistbox-nonselected-list_employee").attr("required",false);
		}
	});
	
	$("a.addCorrective").on("click",function(){
		var aid = $(this).data("aid");
		var cid = $(this).data("cid");
		var url = "getAddActivityPopup?capaid="+cid;
		if(aid != undefined && aid != ""){
			url = url+"&activityid="+aid;
		}
		$.ajax({
			method:"get",
			url:url,
			//data:{capaid:cid, activityid:aid},
			success:function(res){
				$("div#addcorrective").empty().html($.trim(res));
				$('div#addcorrective').modal('show');
				$('div#addcorrective #duedate').daterangepicker({minDate: moment(),timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
			}
		});
	});
	
	$("a.addRcaCorrective").on("click",function(){
		
		var rcaid = $(this).data("rcaid");
		var caid = $(this).data("caid");
		var url = "addCorrectivePopup?rcaId="+rcaid;
		if(caid != undefined && caid != ""){
			url = url+"&correctiveId="+caid;
		}
		$.ajax({
			method:"get",
			url:url,
			success:function(res){
				$("div#addrcacorrective").empty().html($.trim(res));
				$('div#addrcacorrective').modal('show');
				$('div#addrcacorrective #duedate').daterangepicker({minDate: moment(),timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
			}
		});
	});
	
	$("a.addRcaWhys").on("click",function(){
		
		var rcaid = $(this).data("rcaid");
		var whytype = $(this).data("whytype");
		
		var url = "addRcaWhysPopup?rcaId="+rcaid;
		
		if(whytype != undefined && whytype != ""){
			url = url+"&whyType="+whytype;
		}  
		
		$.ajax({
			method:"get",
			url:url,
			success:function(res){
				$("div#addrcawhys").empty().html($.trim(res));
				$('div#addrcawhys').modal('show');
			}
		});
	});
	
	$("a.addTask").on("click",function(){
		var rid = $(this).data("rid");
		var url = "addTaskPopup?reviewId="+rid;
		$.ajax({
			method:"get",
			url:url,
			success:function(res){
				$("div#addtask").empty().html($.trim(res));
				$('div#addtask').modal('show');
				$('div#addtask #taskStartDate').daterangepicker({minDate: moment(),timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
				$('div#addtask #taskEndDate').daterangepicker({minDate: moment(),timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
			}
		});
	});
	
	$("a.addAuditTrail").on("click",function(){
		var aid = $(this).data("aid");
		var url = "getAddAuditPopup?audid="+aid;
		$.ajax({
			method:"get",
			url:url,
			//data:{capaid:cid, activityid:aid},
			success:function(res){
				$("div#addaudittrail").empty().html($.trim(res));
				$('div#addaudittrail').modal('show');
				$('div#addaudittrail #planstartdate').daterangepicker({timePicker: true, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY h:mm A'});
			}
		});
	});
	
	$("a.addcapa").on("click",function(){
		var aid = $(this).data("aid");
		var url = "getAddCapaPopup?audid="+aid;
		$.ajax({
			method:"get",
			url:url,
			success:function(res){
				$("div#addcapa").empty().html($.trim(res));
				$('div#addcapa').modal('show');
			}
		});
	});
	
	$("a.addPlanItem").on("click",function(){
		
		var pid = $(this).data("pid");
		var itmid = $(this).data("itmid");
		var url = "addActionItemPopup?planid="+pid;
		if(itmid != undefined && itmid != ""){
			url = url+"&itemid="+itmid;
		}
		$.ajax({
			method:"get",
			url:url,
			success:function(res){
				$("div#addPlanItem").empty().html($.trim(res));
				$('div#addPlanItem').modal('show');
				$('#itemStartDate').daterangepicker({minDate:moment(), timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
				$('#itemEndDate').daterangepicker({minDate:moment(), timePicker: false, "singleDatePicker":true,  "opens": "center", format: 'MM/DD/YYYY'});
			}
		});
	});

	$("div[id^='collapseOne_']").on("show.bs.collapse",function(){
		$(this).parent().find("div.box-header").addClass("aheader");
	});
	
	$("div[id^='collapseOne_']").on("hidden.bs.collapse",function(){
		$(this).parent().find("div.box-header").removeClass("aheader");
	});
	
	//$('#characterLeft').text('200 characters left');
	$('.limited').keyup(function () {
	    var max = 200;
	    var len = $(this).val().length;
	    if (len >= max) {
	        $('#characterLeft').text(' you have reached the limit');
	    } else {
	        var ch = max - len;
	        $('#characterLeft').text(ch +' '+ $("#charleft").val());
	      
	    }
	});

	//To validate Objective select box
	$('select.yesNo').change(function(){
		var yesMessage=$("#yesMessage").val();
		if($(this).val() != yesMessage){
			$('#st_'+$(this).attr('id').split("_")[1]).attr('required',true);
		}else{
			$('#st_'+$(this).attr('id').split("_")[1]).attr('required',false);
		}
	});
	
	$("select.yesNo").each(function(index) {
		var yesMessage=$("#yesMessage").val();
		if($(this).val() != yesMessage){
			$('#st_'+$(this).attr('id').split("_")[1]).attr('required',true);
		}else{
			$('#st_'+$(this).attr('id').split("_")[1]).attr('required',false);
		}
	})
	
});