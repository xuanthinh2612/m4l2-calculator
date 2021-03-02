<%--
  Created by IntelliJ IDEA.
  User: xuant
  Date: 3/2/2021
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="">
    <h1>Calculator</h1>
    <input type="number" name="firstNum">
    <input type="number" name="secondNum">
    <button name="calculator" value="add" type="submit">Addition(-)</button>
    <button name="calculator" value="sub" type="submit">Subtraction(-)</button>
    <button  name="calculator" value="mul" type="submit">Multiplication(*)</button>
    <button name="calculator" value="div" type="submit">Division(/)</button>
</form>
</body>
</html>
