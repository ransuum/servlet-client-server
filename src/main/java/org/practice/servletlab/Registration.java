package org.practice.servletlab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.practice.servletlab.enums.Gender;
import org.practice.servletlab.models.User;
import org.practice.servletlab.repo.Repository;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

@WebServlet(name = "registration", value = "/registration")
public class Registration extends HttpServlet {

    private Repository repository;

    @Override
    public void init() {
        repository = new Repository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        String gender = request.getParameter("gender");
        String date = request.getParameter("dob");

        if (email == null || username == null || password == null || gender == null || date == null ||
                email.isEmpty() || username.isEmpty() || password.isEmpty() || gender.isEmpty() || date.isEmpty()) {
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
            return;
        }

        if (repository.findByEmail(email) != null) {
            request.setAttribute("emailError", "Email already exists");
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
            return;
        }

        if (repository.findByUsername(username) != null) {
            request.setAttribute("usernameError", "Username already exists");
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
            return;
        }

        try {
            repository.save(User.builder()
                    .id(UUID.randomUUID().toString())
                    .username(username)
                    .password(password)
                    .gender(Gender.valueOf(gender.toUpperCase()))
                    .birthday(LocalDate.parse(date))
                    .email(email)
                    .build());

            response.sendRedirect("login");

        } catch (IllegalArgumentException e) {
            request.setAttribute("error", "Invalid data format");
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
        }
    }
}