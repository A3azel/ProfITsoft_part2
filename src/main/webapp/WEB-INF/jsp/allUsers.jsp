<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<header>
    <jsp:include page="header.jsp" />
</header>
<main>
    <table class="table table-bordered table-striped text-center" style="margin: 20px; width: 80%; margin-left: auto; margin-right: auto">
        <thead class="table-info" >
        <tr>
            <th scope="col">
                Login
            </th>
            <th scope="col">
                Username
            </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${allUsers}">
            <tr>
                <td>${user.login}</td>
                <td>${user.username}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js">

</script>
</body>
</html>
