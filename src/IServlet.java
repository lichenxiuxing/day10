import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/19
 * 8:53
 * 获取请求参数
 */
@WebServlet(name = "IServlet")
public class IServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("psw"));
        String[] strings=request.getParameterValues("check");
        System.out.println(Arrays.toString(strings));
        /**
         * 利用map来获取请求参数
         */
        Map<String,String[]> map=request.getParameterMap();
        for(String name:map.keySet()){
            String[] value=map.get(name);
            System.out.println(name+"="+Arrays.toString(value));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("xxx"));
        System.out.println(request.getParameter("yyy"));
    }
}
