package javaServletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-07-17
 * Time: 16:15
 */
public class ServletDemo7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie nameName = new Cookie("uerName","Aria");
        Cookie age = new Cookie("age","18");
        resp.addCookie(nameName);
        resp.addCookie(age);
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("写入cookie成功！");
    }
}
