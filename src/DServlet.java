import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/18
 * 9:32
 * 设置重定向
 */
@WebServlet(name = "DServlet")
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Refresh","5;EServlet");
        PrintWriter printWriter=response.getWriter();
        printWriter.print("此处显示的是乱码");
    }
}
