layui.define(['table', 'faStudentApi'], function(exports) {
    var faStudentApi = layui.faStudentApi;
    var table=layui.table;
    var view = {
        init:function(){
        },
        delBatch:function(){
            var data = Common.getMoreDataFromTable(table,"faStudentTable");
            if(data==null){
                return ;
            }
            Common.openConfirm("确认要删除这些FaStudent?",function(){
            var ids =Common.concatBatchId(data,"id");
            faStudentApi.del(ids,function(){
                Common.info("删除成功");
                    dataReload();
                })
            })
        }
    }
    exports('del',view);
	
});