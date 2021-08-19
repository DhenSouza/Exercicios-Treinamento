<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, br.com.stefanini.testelojagamesstruts.controller.*, br.com.stefanini.testelojagamesstruts.models.*"  %>
<!DOCTYPE html >
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Listar Produtos</title>
		<%@taglib prefix="s" uri="/struts-tags" %>
		
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
	</head>
			<% List<Produto> produtos = (List<Produto>) session.getAttribute("lista"); %>	
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Struts CRUD</a>
				<div class="navbar-collapse">
					<ul class="navbar-nav me-auto mb-1">
						<li class="nav-item"><a href="sistema.jsp" class="nav-link active">Home</a></li>
						<li class="nav-item"><a href="sistema.jsp" class="nav-link"> Cadastro</a>
						<li class="nav-item"><a href="produto.alterar.action" class="nav-link">Alterar Produto</a></li>
						<li class="nav-item"><a href="produto.listar.action" class="nav-link">Listar</a></li>
						<li class="nav-item"><a href="produto.excluir.action" class="nav-link">exluir</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="container mt-5">
			<div class="jumbotron">
				<h3 class="text-center">Lista dos Produtos</h3>
			</div>
			<div class="col-md-10 offset-md-1">
				<div class="card">
					<div class="card-body">
					<s:form> 
						<table class="table table-hover table-striped">
							<thead>
								<tr class="bg-dark text-white">
									<td>Codigo</td>
									<td>Nome</td>
									<td>Descrição</td>
									<td>Preço</td>
								</tr>
								</thead>
								<tbody>
									
								<%
								
								try {
								for(Produto p : produtos){
									out.println("<tr>" +
											"<td>" + p.getIdProduto() + "</td>"
											+"<td>" + p.getNome() + "</td>"
											+"<td>" + p.getDescricao() + "</td>"
											+"<td>" + p.getPreco() + "</td>" +
					 						"</tr>");} 
								
								} catch (Exception ex) {
									ex.printStackTrace();
								} 
								
								%>
									
								</tbody>
							</table>
						</s:form>
					</div>
				</div>
			</div>
			
			<div class="col-md-10 offset-md-1 mt-5">
				<div class="card">
					<div class="card-body">
					<s:form action="produto.excluirFind" method="exluirFind"> 
							<select class="form-control" id="produto.idProduto"
						name="produto.idProduto">
						<option selected>Selecione qual prova deseja fazer</option>
						<%
							for (Produto p : produtos) {
									out.println("<option name=usuario.'" + p.getIdProduto() + "'>" + p.getNome() + "</option>");
								}
						%>
					</select>
					
					<div class="d-flex justify-content-center mt-5">
						<button type="submit" class="btn btn-success" style="width:150px">Deletar
						produto</button>
						<a class="btn btn-danger" style="width:150px" href="/sistema.jsp">Voltar</a>
					</div>
					
					<div class="pt-2 pl-2">${msg}</div>
					</s:form>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
</html>