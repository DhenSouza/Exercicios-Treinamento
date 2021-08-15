<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Gravar Produto</title>



		<link rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
		
		<link rel="stylesheet" href="style.css")>

	</head>

	<body>
	
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">GamesG</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Promoções</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Parceiros</a>
        </li>
      </ul>
      <span class="navbar-text">
        Seja Bem vindo ao nosso universo
      </span>
    </div>
  </div>
</nav>

	
	<div class="jumbotron col-md-6 offset-md-3 mt-5  text-uppercase text-light" id="jubo">
  			<h1 class="display-4">Loja de GamesG</h1>
 			 <p class="lead">Sistema interno da Loja GamesG</p>
  			<hr class="my-4">
  		
	</div>
		
		<div class="col-md-6 offset-md-3 mt-5">
			<div class="card">
				<div class="card-body">
					<form method="post" action="ProdutoController">
						<div class="row">
						  <div class="col">
							<input type="text" name="nome" class="form-control" placeholder="Insira o nome do Jogo">
						  </div>
						  <div class="col">
							<input type="text" name="descricao" class="form-control" placeholder="Informe a descrição do jogo">
						  </div>
						</div>
						
						
						<div class="row mt-3">
						  <div class="col">
							<input type="text" name="anoLancamento" class="form-control" placeholder="Insira data de lançamento do jogo">
						  </div>
						  <div class="col">
							<input type="number" name=preco class="form-control" placeholder="Informe o preço do jogo">
						  </div>
						  <div class="mt-2 justify-content-end">
						   <input type="hidden"  name="flag" value="gravar"/>
						  <input type="submit" value="Gravar" class="btn float-right login_btn" >
						  </div>
						</div>
					  </form>		
				</div>
			</div>
			
			
			
			<div class="card mt-5">
				<div class="card-body">
					<form method="post" action="CategoriaController">
						<div class="row">
						  <div class="col">
							<input type="text" name="nomeCategoria" class="form-control" placeholder="Insira o nome da Categoria do Jogo">
						  </div>
						  <div class="col">
							<input type="text" name="descricao" class="form-control" placeholder="Informe a plataforma ">
						  </div>
						</div>
						<div class="mt-2">
						   <input type="hidden"  name="flag" value="gravarCategoria"/>
						  <input type="submit" value="Gravar" class="btn float-right login_btn" >
						  </div>
						
					  </form>		
				</div>
			</div>
		</div>
		

	</body>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.0/js/bootstrap.min.js"></script>

	</html>