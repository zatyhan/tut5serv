import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;


@WebServlet(urlPatterns={"/patients"}, loadOnStartup =1)
public class servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>zatyhan</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1> Nur Eizzaty Hamzaid </h1>\n" +
                "<p> :) </p>\n" +
                "</body>\n" +
                "</html>");
        resp.getWriter().write(req.getServletPath());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String reqBody = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        resp.setContentType("text/html");
        resp.getWriter().write("Thank you client! "+ reqBody);
    }
}
