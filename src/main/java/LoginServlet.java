import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();

        if("admin".equals(username) && "admin".equals(password)){
            writer.write("Welcome " + username + " to website");
        }else{
            writer.write("Login error");
        }


    }
}
