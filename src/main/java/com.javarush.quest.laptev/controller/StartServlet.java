package com.javarush.quest.laptev.controller;

import com.javarush.quest.laptev.model.Quest;
import jakarta.xml.bind.JAXBException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Quest quest = (Quest) session.getAttribute("quest");
        String ipAddress = req.getRemoteAddr();
        String user = req.getParameter("user");
        if (quest == null) {
            try {
                quest = new Quest();
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
            quest.setUser(user != null? user : "");
            quest.setIpAddress(ipAddress);
            quest.setNumberGames(1);
        } else if (user.equals(quest.getUser()) && !user.equals("")) {
            quest.setNumberGames(quest.getNumberGames() + 1);
        } else if (!user.equals(quest.getUser()) || user.equals("")) {
            quest.setUser(user != null? user : "");
            quest.setIpAddress(ipAddress);
            quest.setNumberGames(1);
        }

        session.setAttribute("quest", quest);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/quest.jsp");
        requestDispatcher.forward(req, resp);
    }
}
