package javaServletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-07-15
 * Time: 17:14
 */
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html; charset=utf-8");
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("SecondName");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write("firstName:" + firstName);
        writer.write("<br/>");
        writer.write("secondName:" + secondName);
        writer.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
