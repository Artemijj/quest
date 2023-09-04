package com.javarush.quest.laptev.controller;

import com.javarush.quest.laptev.model.Quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "QuestServlet", value = "/quest")
public class QuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Quest quest = (Quest) session.getAttribute("quest");
        int nextLevel = quest.getLevel() + 1;
        String answer = req.getParameter("answer");

        if (answer == null) {
            req.getRequestDispatcher("WEB-INF/quest.jsp").forward(req, resp);
        }

        quest.setNextState(answer);
        quest.setLevel(nextLevel);

        session.setAttribute("quest", quest);

        if (quest.getCurrentState().nextState(answer) == null) {
            req.getRequestDispatcher("WEB-INF/final.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("WEB-INF/quest.jsp").forward(req, resp);
        }
    }
}
