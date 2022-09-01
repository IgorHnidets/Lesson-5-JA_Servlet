package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/servlet")
public class HomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!! DO GET");
        writer.print("<html>");
        writer.print("<h2> Hello from Servlet </h2>");
        writer.print("</html>");
        writer.close();
    }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!! DO POST");
            String email = req.getParameter("Email");
            System.out.println("Email = " + email);

            String pass = req.getParameter("password");
            System.out.println("Password = " + pass);

            writer.print("<html>");
            writer.print("<h2> Post method "+ email + "</h2>");
            writer.print("</html>");
        }



}
