<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div>
    <nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
        <div class="container-fluid">
            <a class="navbar-brand" href="/user">
                Menu
            </a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <c:choose>
                    <c:when test="${sessionScope.user != null}">
                        <form:form action="/logout" method="post">
                            <button class="btn btn-primary btn-lg" type="submit">Logout</button>
                        </form:form>
                    </c:when>
                </c:choose>
            </div>
        </div>
    </nav>
</div>
