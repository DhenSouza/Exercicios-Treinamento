package br.com.stefanini.lojaR.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.stefanini.lojaR.entities.Categoria;
import br.com.stefanini.lojaR.entities.Produto;
import br.com.stefanini.lojaR.persistence.CategoriaDAO;
import br.com.stefanini.lojaR.persistence.ProdutoDAO;

@WebServlet("/ProdutoCategoriaController")
public class ProdutoCategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProdutoCategoriaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");

		switch (flag) {
		case "gravar":
			gravarProduto(request, response);
			break;
			
		case "mostrarCategoria":
			findCategoria(request, response);
			break;

		}

	}

	protected void gravarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			Produto produto = new Produto();

			produto.setNome(request.getParameter("nome"));
			produto.setDescricao(request.getParameter("descricao"));
			produto.setPreco(new Double(request.getParameter("preco")));

			new ProdutoDAO().gravarProduto(produto);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	
	
	protected void findCategoria(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
try {
				
			Integer code = new Integer(request.getParameter("code"));
			Categoria cat = new CategoriaDAO().findByIdCategoria(code);

			HttpSession session = request.getSession(true);

			if (cat != null) {
				List<Produto> listaProdutos = new ArrayList<>();
				List<Categoria> listaCategorias = new ArrayList<>();

				session.setAttribute("listaProd", listaProdutos);
				session.setAttribute("listaCat", listaCategorias);
				
				
				
				request.setAttribute("sucesso", "dados Gravados");
				request.getRequestDispatcher("resposta.jsp").forward(request, response);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
