<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>Error</title>
</head>
<body bgcolor="#ffffff" text="000000">
<!-- Ÿ��Ʋ ���� -->
<table width="100%" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center" bgcolor="orange"><b>Error</b></td>
	</tr>
</table>

<!-- ���� �޽��� -->
<table width="100%" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td align="center">
		<br><br><br><br><br>
		Message : ${exception.message}
		<br><br><br><br><br>
		</td>
		
	</tr>
</table>
</body>
</html>