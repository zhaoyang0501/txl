jQuery.adminGradesmanage = {
		gradesmanageDataTable:null,
		toSave:false,
		initSearchDataTable : function() {
			if (this.gradesmanageDataTable == null) {
				this.gradesmanageDataTable = $('#dt_table_view').dataTable({
					"sDom" : "<'row-fluid'<'span6'l>r>t<'row-fluid'<'span6'i><'span6'p>>",
					"sPaginationType" : "bootstrap",
					"oLanguage" : {
						"sLengthMenu" : "每页显示 _MENU_ 条记录",
						"sZeroRecords" : "抱歉， 暂时没有记录",
						"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
						"sSearch" : "",
						"sInfoEmpty" : "没有数据",
						"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
						"oPaginate" : {
							"sFirst" : "首页",
							"sPrevious" : "前一页",
							"sNext" : "后一页",
							"sLast" : "尾页"
						}
					},
					"bAutoWidth" : false,
					"iDisplayLength" : 10,
					"aLengthMenu" : [ 5, 10, 25, 50],
					"bServerSide" : true,
					"sServerMethod" : "POST",
					"bProcessing" : true,
					"bSort" : false,
					"sAjaxSource" : $.ace.getContextPath() + "/admin/gradesmanage/list",
					"fnDrawCallback" : function(oSettings) {
						$('[rel="popover"],[data-rel="popover"]').popover();
					},
					"fnServerData" : function(sSource, aoData, fnCallback) {
						var name = $("#_name").val();
						if (!!name) {
							aoData.push({
								"name" : "name",
								"value" : name
							});
						}
						$.ajax({
							"dataType" : 'json',
							"type" : "POST",
							"url" : sSource,
							"data" : aoData,
							"success" : function(data){
								fnCallback(data.resultMap);
							}
						});
					},
					"aoColumns" : [ {
						"mDataProp" : "id"
					},{
						"mDataProp" : "name"
					},{
						"mDataProp" : "remark"
					},{
						"mDataProp" : "applyman"
					},{
						"mDataProp" : "tel"
					},{
						"mDataProp" : "mans"
					}, {
						"mDataProp" : "createDate"
					}, {
						"mDataProp" : ""
					}],
					"aoColumnDefs" : [
						{
							'aTargets' : [2],
							'fnRender' : function(oObj, sVal) {
								if(sVal.length>10)
									return sVal.substring(0,10)+".....";
								else 
									return sVal;
							}
						},
						{
							'aTargets' : [7],
							'fnRender' : function(oObj, sVal) {
									return  "  <button class=\"btn2 btn-info\" onclick=\"$.adminGradesmanage.deleteit("+oObj.aData.id+")\">删除</button>";
							}
						},
					 {
						'aTargets' : [ '_all' ],
						'bSortable' : false,
						'sClass' : 'center'
					}]

				});
			} else {
				var oSettings = this.gradesmanageDataTable.fnSettings();
				oSettings._iDisplayStart = 0;
				this.gradesmanageDataTable.fnDraw(oSettings);
			}

		},
		deleteit :function(id){
			bootbox.confirm( "是否确认删除班级？", function (result) {
	            if(result){
	            	$.ajax({
	        			type : "get",
	        			url : $.ace.getContextPath() + "/admin/gradesmanage/delete?id="+id,
	        			dataType : "json",
	        			success : function(json) {
	        				if(json.resultMap.state=='success'){
	        					noty({"text":""+ json.resultMap.msg +"","layout":"top","type":"success","timeout":"2000"});
	        					$.adminGradesmanage.initSearchDataTable();
	        				}else{
	        					noty({"text":""+ json.resultMap.msg +"","layout":"top","type":"warning"});
	        				}
	        			}
	        		});
	            }
	        });
		},
		
};