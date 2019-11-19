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
 * 9:59
 * 请求包含，留头又留体
 * request域，通过serAttribute实现属性共享
 */
@WebServlet(name = "IncludeOneServlet")
public class IncludeOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("aaa","AAA");
        response.getWriter().println("OneServlet");
        request.setAttribute("username","zhangsan");
        request.getRequestDispatcher("IncludeTwoServlet").include(request,response);

    }
}
