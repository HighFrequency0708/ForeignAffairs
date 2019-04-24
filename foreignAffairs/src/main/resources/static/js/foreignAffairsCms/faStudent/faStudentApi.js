/*访问后台的代码*/
layui.define([], function(exports) {
    var api={
            updateFaStudent:function(form,callback){
                Lib.submitForm("/foreignAffairsCms/faStudent/edit.json",form,{},callback)
            },
            addFaStudent:function(form,callback){
                Lib.submitForm("/foreignAffairsCms/faStudent/add.json",form,{},callback)
            },
            del:function(ids,callback){
                Common.post("/foreignAffairsCms/faStudent/delete.json",{"ids":ids},function(){
                    callback();
                })
            }
            ,
            exportExcel:function(form,callback){
                var formPara = form.serializeJson();
                Common.post("/foreignAffairsCms/faStudent/excel/export.json", formPara, function(fileId) {
                    callback(fileId);
                })
            }
		
    };
    exports('faStudentApi',api);
});