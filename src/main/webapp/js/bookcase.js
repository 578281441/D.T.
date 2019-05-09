function updateAction(i,id){
	var name=$("#name"+i).val();
	if(name==""){
		alert("书架名称不能为空！");
		return;
	}
	if(id==null){//添加		
		$(location).prop("href","addBookCase.do?name="+name);
	}else{//修改		
		$(location).prop("href","updateBookCase.do?id="+id+"&name="+name);
	}	
}
function delAction(id){
	if(id==null){//只在当前页面中删除
		var me=event.target||event.srcElement;
		$(me).parent().parent().remove();
	}else{//从数据库中删除
		$(location).prop("href","deleteBookCase.do?id="+id);
	}
}
function addAction(){
	var count=$("#content_table").children("tr").length;
	var $mytr=$("<tr id='tr"+(count-1)+"'></tr>");
	$mytr.append("<td style='padding: 5px'><input style='width: 100%' type='text'	placeholder='请输入书架名称' id='name"+(count-1)+"'></td>");
	$mytr.append("<td align='center'><a href='javascript:void(0)' onClick='updateAction("+(count-1)+",null)'>添加</a></td>");
	$mytr.append("<td align='center'><a href='javascript:void(0)' onClick='delAction(null)'>删除</a></td>");
	$("#content_table").append($mytr);
}