layui.define([ 'form', 'laydate', 'table' ], function(exports) {
    var form = layui.form;
    var laydate = layui.laydate;
    var table = layui.table;
    var faStudentTable = null;
    var view ={
        init:function(){
            this.initTable();
            this.initSearchForm();
            this.initToolBar();
            window.dataReload = function(){
                Lib.doSearchForm($("#searchForm"),faStudentTable)
            }
        },
        initTable:function(){
        	
            faStudentTable = table.render({
                elem : '#faStudentTable',
                height : Lib.getTableHeight(3) ,
                cellMinWidth: 100,
                method : 'post',
                url : Common.ctxPath + '/foreignAffairsCms/faStudent/list.json' // 数据接口
                ,page : Lib.tablePage // 开启分页
                ,limit : 10,
                cols : [ [ // 表头
                    {
                        type : 'checkbox',
                        fixed:'left',
                    },
	                {
	
	                    field : 'id', 
	                    title : 'id',
	                    fixed:'left',
	                    width : 60,
	                    sort : true
	                },
	                {
	
	                    field : 'studentId', 
                        title : '学生学号',
                        width : 150
	                },
	                {
	
	                    field : 'hostInstitution', 
                        title : '接受院校',
	                },
	                {
	
	                    field : 'name', 
                        title : '姓名',
	                },
	                {
	
	                    field : 'familyName', 
                        title : '姓',
	                },
	                {
	
	                    field : 'givenNames', 
                    	title : '名',
	                },
	                {
	
	                    field : 'nationality', 
                        title : '国籍',
	                },
	                {
	
	                    field : 'passportNo', 
                        title : '护照号码',
	                },
	                {
	
	                    field : 'sexText', //数据字典类型为 gender
	                        title : '性别',
	                },
	                {
	
	                    field : 'maritalStatus', 
	                        title : '婚否',
	                },
	                {
	
	                    field : 'dateOfBirth', 
	                        title : '出生日期',
	                },
	                {
	
	                    field : 'placeOfBirth', 
	                        title : '出生地点',
	                },
	                {
	
	                    field : 'homeAddr', 
	                        title : '家庭地址',
	                },
	                {
	
	                    field : 'telAddr', 
	                        title : '家庭电话',
	                },
	                {
	
	                    field : 'hado', 
	                        title : '最高学历',
	                },
	                {
	
	                    field : 'occupation', 
	                        title : '职业',
	                },
	                {
	
	                    field : 'eoia', 
	                        title : '所在单位',
	                },
	                {
	
	                    field : 'fosic', 
	                        title : '学习专业',
	                },
	                {
	
	                    field : 'fosicStart', 
	                        title : '开始年月',
	                },
	                {
	
	                    field : 'fosicEnd', 
	                        title : '结束年月',
	                },
	                {
	
	                    field : 'studentStatus', 
	                        title : '学生类别',
	                },
	                {
	
	                    field : 'dfrDay', 
	                        title : '注册截至日',
	                },
	                {
	
	                    field : 'reference', 
	                        title : '推荐人单位',
	                },
	                {
	
	                    field : 'referenceTel', 
	                        title : '推荐人电话',
	                },
	                {
	
	                    field : 'guarantorChina', 
	                        title : '在华担保人',
	                },
	                {
	
	                    field : 'guarantorTel', 
	                        title : '担保人电话',
	                },
	                {
	
	                    field : 'financialFunding', 
	                        title : '经费来源',
	                }
	
	        ] ]
	
	        });

            table.on('checkbox(faStudentTable)', function(obj){
                var faStudent = obj.data;
                if(obj.checked){
                    //按钮逻辑Lib.buttonEnable()
                }else{

                }
            })
        },

        initSearchForm:function(){
            Lib.initSearchForm( $("#searchForm"),faStudentTable,form);
        },
        initToolBar:function(){
            toolbar = {
                add : function() { // 获取选中数据
                    var url = "/foreignAffairsCms/faStudent/add.do";
                    Common.openDlg(url,"FaStudent管理>新增");
                },
                edit : function() { // 获取选中数目
                    var data = Common.getOneFromTable(table,"faStudentTable");
                    if(data==null){
                        return ;
                    }
                    var url = "/foreignAffairsCms/faStudent/edit.do?id="+data.id;
                    Common.openDlg(url,"FaStudent管理>"+data.studentId+">编辑");
                },
                del : function() {
                    layui.use(['del'], function(){
                        var delView = layui.del
                        delView.delBatch();
                    });
                }
            ,
                exportDocument : function() {
                    layui.use([ 'faStudentApi' ], function() {
                        var faStudentApi = layui.faStudentApi
                        Common.openConfirm("确认要导出这些FaStudent数据?", function() {
                            faStudentApi.exportExcel($("#searchForm"), function(fileId) {
                                Lib.download(fileId);
                            })
                        })
                    });
                },
                importDocument:function(){
                    var uploadUrl = Common.ctxPath+"/foreignAffairsCms/faStudent/excel/import.do";
                    //模板,
                    var templatePath= "/foreignAffairsCms/faStudent/faStudent_upload_template.xls";
                    //公共的简单上传文件处理
                    var url = "/core/file/simpleUpload.do?uploadUrl="+uploadUrl+"&templatePath="+templatePath;
                    Common.openDlg(url, "FaStudent管理>上传");
                }
        };
            $('.ext-toolbar').on('click', function() {
                var type = $(this).data('type');
                toolbar[type] ? toolbar[type].call(this) : '';
            });
        }
    }
    exports('index',view);

});