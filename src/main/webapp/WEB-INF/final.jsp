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
<h2 class="position">
    <%= quest.getMessage()%>
</h2>

<form action="final" class="position">
    <input type="submit" value="<%= rb.getString("restartButton")%>" />
</form>

<br><br><br><br><br><br>
<%= rb.getString("user")%><%= quest.getUser()%>
<br><br>
IP: <%= quest.getIpAddress()%>
<br><br>
<%= rb.getString("gameNumber")%><%= quest.getNumberGames()%>
</body>
</html>
