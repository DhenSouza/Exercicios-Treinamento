<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, br.com.stefanini.testelojagamesstruts.controller.*, br.com.stefanini.testelojagamesstruts.models.*"  %>
<!DOCTYPE html >
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Listar Categoria</title>
		<%@taglib prefix="s" uri="/struts-tags" %>
		
	</head>
	<body>
		
<s:form action="listagem">
	<s:select list="listaCategorias" name="listagem" headerKey="None" headerValue="Selecione a categoria"/>
</s:form>
	
	</body>
</html>