//服务层
app.service('specificationService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../manager/v1/specification/all');
	}
	//分页 
	this.findPage=function(pageNum,pageSize){
		return $http.get('../manager/v1/specification/list/page?pageNum='+pageNum+'&pageSize='+pageSize);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../manager/v1/specification?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../manager/v1/specification',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.put('../manager/v1/specification',entity );
	}
	//删除
	this.delete=function(ids){
		return $http.delete('../manager/v1/specification/batch?ids='+ids);
	}
	//搜索
	this.search=function(pageNum,pageSize,searchEntity){
		return $http.post('../manager/v1/specification/list/page/condition?pageNum='+pageNum+"&pageSize="+pageSize, searchEntity);
	}    	
	//下拉列表
	this.selectOptionList=function(){
		return $http.get('../specification/selectOptionList.do');
	}
	
});
