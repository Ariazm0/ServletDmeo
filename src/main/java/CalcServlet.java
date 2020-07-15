import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-07-14
 * Time: 17:56
 */
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aStr = req.getParameter("a");
        String bStr = req.getParameter("b");
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int result = a + b;
        resp.getWriter().write(String.format("<h1>result:%d</h1>",result));
    }
}
