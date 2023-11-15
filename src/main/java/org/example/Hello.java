package org.example;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clamed/hello")
public class Hello extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String nomeUsuario = request.getParameter("name");

        out.println("<html>");
        out.println("<head><title>Mensagem de Boas-vindas</title></head>");
        out.println("<body>");

        if (nomeUsuario != null && !nomeUsuario.isEmpty()) {
            out.println("<h1>Olá, " + nomeUsuario + "!</h1>");
            out.println("<p>Bem-vindo ao seu Servlet de boas-vindas!</p>");
        } else {
            out.println("<h1>Olá, visitante!</h1>");
            out.println("<p>Por favor, forneça seu nome na URL para receber uma mensagem de boas-vindas.</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
