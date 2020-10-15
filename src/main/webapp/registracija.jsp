<%-- 
    Document   : registracija
    Created on : Sep 21, 2020, 11:17:23 AM
    Author     : Katica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registracija</title>
        <link rel='stylesheet' href='${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css'>

    </head>
    <body>


        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="home.jsp">Portal vesti</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                 <a class="nav-item nav-link active" href="<c:url value = "/home"/>">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link" href="<c:url value = "/kultura"/>">Kultura</a>
                    <a class="nav-item nav-link" href="<c:url value = "/hronika"/>">Hronika</a>
                    <a class="nav-item nav-link" href="<c:url value = "/zabava"/>">Zabava</a>
                    <a class="nav-item nav-link" href="<c:url value = "/sport"/>">Sport</a>
                    <a class="nav-item nav-link" href="<c:url value = "/registracija"/>">Prijavi se</a>


                </div>
            </div>
        </nav>
        <div class="container">
            <br>
        <a href="<c:url value = "/registracija/admin"/>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Registruj se kao admin</a>
        <a href="<c:url value = "/registracija/user"/>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Registruj se kao posetilac</a>

        </div>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
