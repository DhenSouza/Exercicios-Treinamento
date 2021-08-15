<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de consultar id de produto e categoria</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

</head>
<body>

<form class="form" method="get" action="http://localhost:8083/LojadeGames/ProdutoController">


<label><i class="fa fa-user text-info"></i>BUscar pelo id do Produto:</label>
<input type="number" name="idProduto" placeholder="Digite o Id"
class="form-control">
<input type="hidden" name="cmd" value="consulta" class="form-control">
<br>
<button type="submit" class="btn btn-success btn-sm">Buscar
<i class="fas fa-save"></i></button>

</form>
</body>

<script type="text/javascript" 
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>
</html>