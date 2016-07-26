<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/WdatePicker.js"></script>
</head>
<body>
	
	<div align="center">
		<form action="UserAction_regist.do" method="post">
			<table>
				<caption>用户注册</caption>
				<tr>
					<td>用户名:</td>
					<td>
						<input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td>密&nbsp;码:</td>
					<td>
						<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<td>年龄:</td>
					<td>
						<input type="number" name="age">
					</td>
				</tr>
				<tr>
					<td>日期:</td>
					<td>
						<input class="Wdate" type="text" onClick="WdatePicker()" name="birthday">
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="注册">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>