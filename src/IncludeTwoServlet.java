import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/19
 * 10:00
 */
@WebServlet(name = "IncludeTwoServlet")
public class IncludeTwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getAttribute("username"));
        response.getWriter().println("TwoServlet");
    }
}
