<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Produto</title>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Produto CRUD</a>
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
				<h3 class="text-center">Cadastro de Produto</h3>
			</div>
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<s:form method="post" action="produto.cadastrar">
						<div class="card-body">
							<label class="form-label">Informe os dados do Produto para cadastrar</label>
							<div class="input-group mb-3">
								
								<input type="text" name="produto.nome" id="produto.nome" class="form-control"
									placeholder="Digite o nome do produto">
							</div>
							<div class="input-group mb-3">
								<input type="text" name="produto.descricao" id="produto.descricao" class="form-control"
									placeholder="Digite uma descrição">
							</div>
							<div class="input-group mb-3">
								<input type="number" name="produto.preco" id="produto.preco" class="form-control"
									placeholder="Informe o valor do produto">
							</div>
							
						</div>
						<div class="card-footer">
							<button type="submit" class="btn btn-success">Cadastrar</button>
							<div class="pt-2 pl-2">${msg}</div>
						</div>
					</s:form>
				</div>
			</div>
		</div>
		
		

</body>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
</html>