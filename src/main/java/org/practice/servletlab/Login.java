package org.practice.servletlab;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.practice.servletlab.models.User;
import org.practice.servletlab.repo.Repository;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {

    private Repository repository;

    @Override
    public void init() {
        repository = new Repository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emailUsername = req.getParameter("email");
        String password = req.getParameter("password");

        var isEmail = emailUsername.contains("@");

        User authenticatedUser = (isEmail) ? repository.findByEmailAndPassword(emailUsername, password)
                : repository.findByUsernameAndPassword(emailUsername, password);

        if (authenticatedUser == null) {
            req.setAttribute("passwordError", "Invalid email or password");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        } else {
            req.getSession().setAttribute("user", authenticatedUser);
            resp.sendRedirect("login_successful");
        }
    }
}