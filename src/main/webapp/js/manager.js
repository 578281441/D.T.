function updateAction(i, id) {
	var name = $("#name" + i).val();
	if (name == "") {
		alert("管理员名称不能为空！");
		$("#name" + i).focus();
		return;
	}
	var password = $("#password" + i).val();
	if (password == "") {
		alert("管理员密码不能为空！");
		return;
	}
	var sysset = $("#sysset" + i).is(":checked") ? 1 : 0;
	var readerset = $("#readerset" + i).is(":checked") ? 1 : 0;
	var bookset = $("#bookset" + i).is(":checked") ? 1 : 0;
	var borrowback = $("#borrowback" + i).is(":checked") ? 1 : 0;
	var sysquery = $("#sysquery" + i).is(":checked") ? 1 : 0;
	if (id == null) {// 添加
		$(location).prop(
				"href",
				"addManager.do?name=" + name + "&password=" + password
						+ "&sysset=" + sysset + "&readerset=" + readerset
						+ "&bookset=" + bookset + "&borrowback=" + borrowback
						+ "&sysquery=" + sysquery);
	} else {// 修改
		$(location).prop(
				"href",
				"updateManager.do?id=" + id + "&name=" + name + "&password="
						+ password + "&sysset=" + sysset + "&readerset="
						+ readerset + "&bookset=" + bookset + "&borrowback="
						+ borrowback + "&sysquery=" + sysquery);
	}
}
function delAction(id) {
	if (id == null) {// 只在当前页面中删除
		var me = event.target || event.srcElement;
		$(me).parent().parent().remove();
	} else {// 从数据库中删除
		$(location).prop("href", "deleteManager.do?id=" + id);
	}
}
function addAction() {
	var count = $("#content_table").children("tr").length;
	var $mytr = $("<tr id='tr" + (count - 1) + "'></tr>");
	$mytr
			.append("<td><input style='width: 100%' type='text' placeholder='请输入名称' id='name"
					+ (count - 1) + "'></td>");
	$mytr
			.append("<td><input style='width: 100%' type='text' placeholder='请输入密码' id='password"
					+ (count - 1) + "'></td>");
	$mytr.append("<td align='center'><input type='checkbox'	id='sysset"
			+ (count - 1) + "'</td>");
	$mytr.append("<td align='center'><input type='checkbox'	id='readerset"
			+ (count - 1) + "'</td>");
	$mytr.append("<td align='center'><input type='checkbox'	id='bookset"
			+ (count - 1) + "'</td>");
	$mytr.append("<td align='center'><input type='checkbox'	id='borrowback"
			+ (count - 1) + "'</td>");
	$mytr.append("<td align='center'><input type='checkbox'	id='sysquery"
			+ (count - 1) + "'</td>");
	$mytr
			.append("<td align='center'><a href='javascript:void(0)' onClick='updateAction("
					+ (count - 1) + ",null)'>添加</a></td>");
	$mytr
			.append("<td align='center'><a href='javascript:void(0)' onClick='delAction(null)'>删除</a></td>");
	$("#content_table").append($mytr);
}