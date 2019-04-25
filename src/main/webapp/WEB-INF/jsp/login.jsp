<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

<h2>Normal Login</h2>
<form action="login" method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
</form>

<ul>
    <c:forEach var="utilisateur" items="${ utilisateurs }">
        <li><c:out value="${ utilisateur.firstName }" /> <c:out value="${ utilisateur.lastName}" /></li>
    </c:forEach>


</ul>

</body>
</html>

