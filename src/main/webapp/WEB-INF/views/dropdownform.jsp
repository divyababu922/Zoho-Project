<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drop Down Form</title>
</head>
<body>
    <div align="center">
        <h2>USERS DROP DOWN</h2>
        <form id="dropdownform1" name="dropdownform1" method="get" action="register_success">
            <form:select name="users" multiple="true" path="users">
                <form:options items="${message}"></form:options>   
            </form:select>
            <p><input type="submit" value="submit"></p>
        </form>   
    </div>
</body>
</html>