package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Servicos;
import model.ServicosDAO;

@WebServlet("/InserirServicos")
public class InserirServicos extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UFT-8");
		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet InserirServiço</title>");
			out.println("</head>");
			out.println("<body>");

			String nome = request.getParameter("nome");
			String valorString = request.getParameter("valor");
			// CONVERTENDO PARA DOUBLE
			double valor = Double.parseDouble(valorString);

			try {
				Servicos s = new Servicos();
				s.setNome(nome);
				s.setValor(valor);

				ServicosDAO sDB = new ServicosDAO();
				sDB.conectar();
				sDB.inserir(s);
				sDB.desconectar();

				out.print("<script language='javascript'>");
				out.print("alert('Serviço inserido com sucesso!!');");
				out.print("location.href='listar_produtos.jsp';");
				out.print("</script>");
			} catch (Exception e) {
				out.print(e);
			}

		} catch (Exception e) {

		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
