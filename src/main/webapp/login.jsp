<%-- 
    Document   : ulogovaniAdmin
    Created on : Oct 1, 2020, 9:18:19 AM
    Author     : Katica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dobrodosli</title>
        <link rel='stylesheet' href='${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css'>
    </head>
    <body>


    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="<c:url value = "/home"/>">Portal vesti</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="<c:url value = "/login"/>">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link" href="kultura.jsp">Kultura</a>
                    <a class="nav-item nav-link" href="hronika.jsp">Hronika</a>
                    <a class="nav-item nav-link" href="zabava.jsp">Zabava</a>
                    <a class="nav-item nav-link" href="sport.jsp">Sport</a>
                    <a class="nav-item nav-link" href="<c:url value = "/home"/>">Izloguj se</a>


                </div>
            </div>
        </nav>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
