
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caly on 6/25/2016.
 */
@WebServlet("/login")
public class ServletulMeu extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> l = new ArrayList<>();

        User u1 = new User();
        u1.setUser("ion");
        u1.setPwd("123");

        User u2 = new User();
        u2.setUser("calin");
        u2.setPwd("123");

        l.add(u1);
        l.add(u2);


        String ur = req.getParameter("usermail");
        String up = req.getParameter("password");

        System.out.println(ur);
        System.out.println(up);


        boolean f = false;
        for (User ob : l) {
            if (ob.getUser().equals(ur) && ob.getPwd().equals(up)) {
                f = true;
            }
        }
        System.out.println(f);
    }
}




    // parcurg lista
    // scot u curent
    // compar ur cu uc.getUser() si ...up cu uc.getpwd()




