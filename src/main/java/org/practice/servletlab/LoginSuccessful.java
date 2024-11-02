package org.practice.servletlab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.practice.servletlab.models.User;

import java.io.IOException;

@WebServlet(name = "login_successful", value = "/login_successful")
public class LoginSuccessful extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");

        if (user == null) {
            response.sendRedirect("login");
        } else {
            request.setAttribute("user", user);
            request.getRequestDispatcher("/login-successful.jsp").forward(request, response);
        }
    }
}
