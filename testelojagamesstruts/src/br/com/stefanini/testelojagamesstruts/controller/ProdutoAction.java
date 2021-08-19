package br.com.stefanini.testelojagamesstruts.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import br.com.stefanini.testelojagamesstruts.models.Produto;
import br.com.stefanini.testelojagamesstruts.persistence.ProdutoDAO;

public class ProdutoAction extends ActionSupport implements ModelDriven<Produto> {
	private static final long serialVersionUID = 1L;

	private Produto produto;
	private List<Produto> listaProdutos;
	HttpServletRequest request;
	HttpServletResponse response;

	public void init() {
		request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	}

	@Override
	public Produto getModel() {
		return produto;
	}

	public ProdutoAction() {
		produto = new Produto();
		listaProdutos = new ArrayList<Produto>();
	}

	public String listar() {
		init();
		HttpSession session = request.getSession(true);
		ProdutoDAO dao = new ProdutoDAO();
		try {
			listaProdutos = new ArrayList<Produto>();

			if (listaProdutos != null) {
				listaProdutos = dao.findAll();
				session.setAttribute("lista", listaProdutos);
			}
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}

	}

	public String execute() {
		return SUCCESS;
	}

	public String cadastrar() {
		init();

		try {
			ProdutoDAO dao = new ProdutoDAO();
			dao.gravarProduto(produto);
			request.setAttribute("msg", "Produto cadastrado com sucesso");
			return SUCCESS;

		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}

	}

	public String alterar() {
		init();

		try {
			ProdutoDAO dao = new ProdutoDAO();

			HttpSession session = request.getSession(true);

			dao.update(produto);
			response.sendRedirect("sistema.jsp");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SUCCESS;
	}

	public String exluirFind() {
		init();
		HttpSession session = request.getSession(true);
		ProdutoDAO dao = new ProdutoDAO();
		try {
			listaProdutos = new ArrayList<Produto>();

			if (listaProdutos != null) {
				listaProdutos = dao.findAll();
				session.setAttribute("listaExcluir", listaProdutos);

				int id = new Integer(request.getParameter("usuario.idProduto"));
				dao.delete(id);
				session.setAttribute("msg", "Exclusao do Cliente realizado com Sucesso");
			}
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
