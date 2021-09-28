<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 9/28/2021
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%

%>

<div>
    <h1>Simple Calculator</h1>
    <form action="/ServletCalculator">
        <div>
            <span>First operand</span>
            <input type="number" name="numberA">
        </div>
        <div>
            <span>Operand</span>
            <select name="select" id="">
                <option value="sum">summation</option>
                <option value="sub">subtraction</option>
                <option value="mul">multiplication</option>
                <option value="div">division</option>
            </select>
        </div>
        <div>
            <span>Second operand</span>
            <input type="number" name="numberB">
        </div>
        <button>Calculator</button>
    </form>


</div>
</body>
</html>
