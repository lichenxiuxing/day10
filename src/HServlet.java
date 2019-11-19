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
 * 8:31
 *
 *防盗链
 */
@WebServlet(name = "HServlet")
public class HServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String head=request.getHeader("Referer");
        System.out.println(head);
        if (head.contains("localhost")){
            System.out.println("hello");
        }else {
            response.sendRedirect("https://www.baidu.com");
        }
    }
}
