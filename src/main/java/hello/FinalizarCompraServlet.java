package hello;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/finalizar-compra")
public class FinalizarCompraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String produto = request.getParameter("produto");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Compra Realizada</title><link rel='stylesheet' type='text/css' href='estilo.css'></head><body>");
        out.println("<h2>Parabéns, " + nome + "! Sua compra foi concluída.</h2>");
        out.println("<p>Você adquiriu: " + produto + "</p>");
        out.println("<a href='index.html'>Voltar à Loja</a>");
        out.println("</body></html>");
    }
}