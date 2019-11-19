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
 * 创建时间：2019/11/19
 * 8:11
 * request获取网址信息
 */
@WebServlet(name = "GServlet")
public class GServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter=response.getWriter();
        printWriter.println("xieyi"+request.getScheme()+"</br>");
        printWriter.println("wenjianlujing"+request.getContextPath()+"</br>");
        printWriter.println("servlet"+request.getServletPath()+"</br>");
        printWriter.println("URI"+request.getRequestURI()+"</br>");
        printWriter.println("canshu"+request.getQueryString()+"</br>");
        printWriter.println("port"+request.getServerPort()+"</br>");
        printWriter.println("URL"+request.getRequestURL()+"</br>");


    }
}
