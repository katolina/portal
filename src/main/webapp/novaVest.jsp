<%-- 
    Document   : novaVest
    Created on : Oct 2, 2020, 11:53:12 AM
    Author     : Katica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nova vest</title>
    </head>
    <body>
        <h1>Nova vest</h1>


        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="<c:url value = "/home"/>">Portal vesti</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="home.jsp">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link" href="kultura.jsp">Kultura</a>
                    <a class="nav-item nav-link" href="hronika.jsp">Hronika</a>
                    <a class="nav-item nav-link" href="zabava.jsp">Zabava</a>
                    <a class="nav-item nav-link" href="sport.jsp">Sport</a>
                    <a class="nav-item nav-link" href="registracija.jsp">Prijavi se</a>


                </div>
            </div>
        </nav>
        <form action="/PortalVesti/novaVest" method = "post">
            <label for="fname">Naslov</label><br>
            <input type="text" id="naslov" value="Naslov"><br><br>
            <label for="fname">Datum</label><br>
            <input type="text" id="datum" value="Datum"><br><br>
            <label for="fname">Kategorija</label><br>
            <input type="text" id="kategorija" value="Kategorija"><br><br>
            <label for="fname">Tekst</label><br>
            <input type="text" id="tekst" value="Tekst"><br><br>
            <label for="fname">Tagovi</label><br>
            <input type="text" id="tagovi" value="Tagovi"><br><br>
            <input type="submit" value="Sacuvaj">
        </form>
    </body>
</html>
