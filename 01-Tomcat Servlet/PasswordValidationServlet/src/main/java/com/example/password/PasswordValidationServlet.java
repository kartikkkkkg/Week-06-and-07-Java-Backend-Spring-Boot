package com.example.password;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class PasswordValidationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (isValidPassword(password)) {
            out.println("<h2>Registration Successful</h2>");
        } else {
            out.println("<h2>Invalid Password!</h2>");
            out.println("<p>Password must:</p>");
            out.println("<ul>");
            out.println("<li>Be at least 8 characters long</li>");
            out.println("<li>Have at least 1 uppercase letter</li>");
            out.println("<li>Contain at least 1 number</li>");
            out.println("<li>Contain exactly 1 special character</li>");
            out.println("</ul>");
        }
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        int upper = 0, digit = 0, special = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isDigit(ch)) digit++;
            else if (!Character.isLetterOrDigit(ch)) special++;
        }
        return upper >= 1 && digit >= 1 && special == 1;
    }
}
