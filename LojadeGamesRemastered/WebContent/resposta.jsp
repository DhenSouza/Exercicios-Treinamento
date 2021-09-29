<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,br.com.stefanini.lojaR.controller.*, br.com.stefanini.lojaR.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

			
			<link rel="stylesheet"
				href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
			<link rel="stylesheet"
				href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>


		<div class="col-md-6 offset-md-3 mt-5">
			<div class="card">
				<div class="card-body">

	<form method="post" action="ProdutoCategoriaController">


		<%
			List<Produto> listaP = (List<Produto>) session.getAttribute("listaProdutos");
			List<Categoria> listaC = (List<Categoria>) session.getAttribute("listaCategorias");
		%>



		<div class="row">
			<div class="col">
				<input type="text" name="nome" class="form-control"
					placeholder="Insira o nome do Jogo">
			</div>
			<div class="col">
				<input type="text" name="descricao" class="form-control"
					placeholder="Informe a descrição do jogo">
			</div>
		</div>

		<div class="row mt-3">
			<div class="col">
				<input type="number" name=preco class="form-control"
					placeholder="Informe o preço do jogo">
			</div>
			<div class="mt-2 justify-content-end">
				<input type="hidden" name="flag" value="gravar" /> <input
					type="submit" value="Gravar" class="btn float-right login_btn">
			</div>
		</div>
		
		
		
		<table class="table table-hover table-striped">
							<thead>
								<tr class="bg-dark text-white">
									<td>isCategoria</td>
									<td>NomeCategoria</td>
								</tr>
								</thead>
								<tbody>
									
								<%
								
								try {
								for(Categoria p : listaC){
									out.println("<tr>" +
											"<td>" + p.getIdCategoria() + "</td>"
											+"<td>" + p.getNomeCategoria() + "</td>" +
					 						"</tr>");} 
								
								} catch (Exception ex) {
									ex.printStackTrace();
								} 
								
								%>
									
								</tbody>
							</table>
	</form>
	
	
				</div>
				</div>
				</div>
	
	
	
	${sucesso}
</body>


<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
</html>