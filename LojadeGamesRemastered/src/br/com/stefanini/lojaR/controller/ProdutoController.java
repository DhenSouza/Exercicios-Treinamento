package br.com.stefanini.lojaR.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.lojaR.dto.request.ProdutoRequest;
import br.com.stefanini.lojaR.entities.Produto;
import br.com.stefanini.lojaR.persistence.IProdutoDAO;
import br.com.stefanini.lojaR.persistence.ProdutoDAO;

/**
 * Servlet implementation class ControllerProduto
 */
@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProdutoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String cmd = "";

			cmd = request.getParameter("cmd");

			int id = 0;

			id = Integer.parseInt(request.getParameter("idProduto"));
			if (cmd.equals("consulta")) {
				IProdutoDAO idao = new ProdutoDAO();
				Produto resp = idao.findByIdProduto(id);

				// response.getWriter().print(resp);
				if (resp != null) {
					request.setAttribute("produto", resp);
					request.getRequestDispatcher("saidaTeste.jsp").forward(request, response);
				} else {
					request.setAttribute("msg", "Produto nao encontrado");
					request.getRequestDispatcher("saidaError.jsp").forward(request, response);

				}

			}

		} catch (Exception ex) {
			request.setAttribute("msg", "Erro interno da aplicação");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String flag = request.getParameter("flag");

			switch (flag) {
			case "gravar":
				gravar(request, response);
				break;
			case "atualizar":
				atualizar(request, response);
				break;

			case "deletar":
				delete(request, response);
				break;

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void gravar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Produto produto = new Produto();

			produto.setNome(request.getParameter("nome"));
			produto.setDescricao(request.getParameter("descricao"));
			produto.setPreco(new Double(request.getParameter("preco")));

			new ProdutoDAO().gravarProduto(produto);

			request.setAttribute("sucesso", "dados Gravados");
			request.getRequestDispatcher("sucessoTela.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro na Gravacao");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}

	protected void atualizar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Produto produto = new Produto();

			produto.setIdProduto(new Integer(request.getParameter("idProduto")));
			produto.setNome(request.getParameter("nome"));
			produto.setDescricao(request.getParameter("descricao"));
			produto.setPreco(new Double(request.getParameter("preco")));

			new ProdutoDAO().update(produto);

			 request.setAttribute("sucesso", "dados atualizados");
			request.getRequestDispatcher("telaCrudProduto.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro no Update");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}

	protected void findById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ProdutoRequest requestObj = new ProdutoRequest();

			requestObj.ofProduto(new Integer(request.getParameter("idProduto")), request.getParameter("nome"),request.getParameter("descricao"),
					new Double(	request.getParameter("preco")));
			Produto produto = new Produto();

			produto.setIdProduto(new Integer(request.getParameter("idProduto")));
//			 produto.setNome(request.getParameter("nome"));
//			 produto.setDescricao(request.getParameter("descricao"));
//			 produto.setPreco(new Double (request.getParameter("preco")));

			Integer id = new Integer(request.getParameter("idProduto"));

			new ProdutoDAO().findByIdProduto(id);

			request.setAttribute("msg", requestObj);
			request.getRequestDispatcher("saidaID.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro no no findById");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Produto produto = new Produto();

			int id = new Integer(request.getParameter("idProduto"));
			produto.setIdProduto(id);
		

			new ProdutoDAO().delete(produto.getIdProduto());

			 request.setAttribute("sucesso", "dado deletado");
			request.getRequestDispatcher("sucessoTela.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro no delete");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}

}
