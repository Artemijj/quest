<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Quest</title>
    <link href="../static/main.css" rel="stylesheet" type="text/css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
</head>

<%@page import="com.javarush.quest.laptev.model.Quest" %>
<%@page import="java.util.ResourceBundle" %>

<% Quest quest = (Quest) session.getAttribute("quest"); %>
<% ResourceBundle rb = ResourceBundle.getBundle("text"); %>

<body>
<h2 class="position"><%=rb.getString("level")%><%= quest.getLevel()%></h2>
<br><br>

<p>
    <%= quest.getQuestion()%>
</p>

<br><br>
<form action="quest">
    <input type="radio" name="answer" value="one"/><%= quest.getAnswerOne()%>
    <br>
    <input type="radio" name="answer" value="two"/><%= quest.getAnswerTwo()%>
    <br><br>
    <input type="submit" value="Ok"/>
</form>

<br><br><br><br><br><br>
<%= rb.getString("user")%><%= quest.getUser()%>
<br><br>
IP: <%= quest.getIpAddress()%>
<br><br>
<%= rb.getString("gameNumber")%><%= quest.getNumberGames()%>
</body>
</html>
