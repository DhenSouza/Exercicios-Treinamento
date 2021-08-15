package br.com.stefanini.lojaG.dto.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.stefanini.lojaG.dto.request.ProdutoRequest;
import br.com.stefanini.lojaG.entities.Produto;
import br.com.stefanini.lojaG.persistence.IProdutoDAO;
import br.com.stefanini.lojaG.persistence.ProdutoDAO;


@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProdutoController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				request.setAttribute("msg", "Cliente nao encontrado");
				request.getRequestDispatcher("saidaError.jsp").forward(request, response);

			}

		}
		
	} catch (Exception ex) {
		request.setAttribute("msg", "Erro interno da aplicação");
		request.getRequestDispatcher("saidaError.jsp").forward(request, response);
		ex.printStackTrace();
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			String flag = request.getParameter("flag");

			switch (flag) {
			case "gravar":
				gravar(request, response);
				break;
			case "logar":
				//logar(request, response);
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
			Produto produto = new Produto();
			produto.setNome(request.getParameter("nome"));
			produto.setDescricao(request.getParameter("descricao"));
			produto.setAnoLançamento(request.getParameter("anoLancamento"));
			produto.setPreco((double) Integer.parseInt(request.getParameter("preco")));

			new ProdutoDAO().gravarProduto(produto);
			
			//request.setAttribute("msg", "dados Gravados");
			request.getRequestDispatcher("telaGravarProdutoCategoria.jsp").forward(request, response);

		} catch (Exception ex) {

			request.setAttribute("msg", "Erro na Gravacao");
			request.getRequestDispatcher("saidaError.jsp").forward(request, response);
			ex.printStackTrace();

		}
	}

}
