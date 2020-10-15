<%-- 
    Document   : noviNalog.jsp
    Created on : Sep 29, 2020, 12:15:55 PM
    Author     : Katica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css'>
        <title>Novi posetilac</title>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="<c:url value = "/home"/>">Portal vesti</a>
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
        <form action="registracija/user/noviNalog" method = "get">
            <div class ="container">
                <div class="form-group">
                    <br>
                    <label for="exampleInputEmail">Email</label>
                    <input type="email" class="form-control" id="exampleInputUsername" aria-describedby="EmailHelp">

                </div>
                 <button type="submit" class="btn btn-primary">Prijavi se</button>
            </div>
        </form>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>F
    </body>
</html>
