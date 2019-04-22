<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录界面</title>
	</head>
	
	<body>
		<form action="user?action=login" method="post">
			Name:<input type="text" name="name" />
			Password:<input type="password" name="password" />
			
			<input type="submit" value="登录" />
		</form>
	</body>
</html>
