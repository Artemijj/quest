
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Quest</title>
    <link href="static/main.css" rel="stylesheet" type="text/css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
</head>
<%@page import="java.util.ResourceBundle" %>

<% ResourceBundle rb = ResourceBundle.getBundle("text"); %>
<body>
<h2 class="position"><%= rb.getString("startQuest")%></h2>
<br><br>

<p>
    <%= rb.getString("story")%>
</p>

<br>

<form action="start">
    <div class="position1">
        <%= rb.getString("enterName")%>
    </div>
    <br>
    <div class="position1">
        <input name="user"/>
    </div>
    <br><br>
    <div class="position1">
        <input type="submit" value="<%= rb.getString("startButton")%>"/>
    </div>
</form>

</body>
</html>
