package com.javarush.quest.laptev.controller;

import com.javarush.quest.laptev.model.Quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "FinalServlet", value = "/final")
public class FinalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Quest quest = (Quest) session.getAttribute("quest");
        quest.start();
        session.setAttribute("quest", quest);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
