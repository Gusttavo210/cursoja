package br.com.cursosja.controlecursoja.controller;

import java.io.IOException;

import br.com.cursosja.controlecursoja.controller.moddel.entidade.Professor;
import br.com.cursosja.controlecursoja.model.dao.ProfessorDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluirProfessores
 */
public class IncluirProfessores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirProfessores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nome = request.getParameter("celular");
		System.out.println(nome);
		
		
		String celular = request.getParameter("celular");
		System.out.println(celular);
		
		Professor p = new Professor();
		p.setNome(nome);
		p.setNome(celular);
		
		ProfessorDao dao = new ProfessorDao();
		
		boolean retorno = dao.incluir(p);
		
		response.sendRedirect("lista_professor.jsp");
	}

}
