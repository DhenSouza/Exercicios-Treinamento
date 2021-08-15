package br.com.stefanini.lojaG.dto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.lojaG.entities.Categoria;
import br.com.stefanini.lojaG.entities.Produto;
import br.com.stefanini.lojaG.persistence.CategoriaDAO;

@WebServlet("/CategoriaController")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CategoriaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");

		try {

			switch (flag) {
			case "gravarCategoria":
				gravar(request, response);
				break;
			case "logar":
				// logar(request, response);
				break;
			case "logout":
				// logout(request, response);
				break;

			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	protected void gravar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Categoria categoria = new Categoria();
			categoria.setNomeCategoria(request.getParameter("nomeCategoria"));
			categoria.setPlataforma(request.getParameter("plataforma"));


			new CategoriaDAO().gravarCategoria(categoria);

			// request.setAttribute("msg", "dados Gravados");
			request.getRequestDispatcher("telaGravarProdutoCategoria.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro na Gravacao");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}

}
 