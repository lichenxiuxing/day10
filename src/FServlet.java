import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/18
 * 10:09
 * 获取操作系统和浏览器信息
 */
@WebServlet(name = "FServlet")
public class FServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("来访ip是："+request.getRemoteAddr());
        System.out.println("访问方法是："+request.getMethod());
        String s=request.getHeader("User-Agent");
        System.out.println(s);
    }
}
