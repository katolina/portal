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
            <a class="navbar-brand" href="<c:url value = "/registracija/admin/login"/>">Portal vesti</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="<c:url value = "/registracija/admin/login"/>">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link" href="<c:url value = "/kultura"/>">Kultura</a>
                    <a class="nav-item nav-link" href="<c:url value = "/hronika"/>">Hronika</a>
                    <a class="nav-item nav-link" href="<c:url value = "/zabava"/>">Zabava</a>
                    <a class="nav-item nav-link" href="<c:url value = "/sport"/>">Sport</a>
                    <a class="nav-item nav-link" href="<c:url value = "/novaPodkategorija"/>">Dodaj novu podkategoriju</a>
                    <a class="nav-item nav-link" href="<c:url value = "/vest/novaVest"/>">Dodaj novu vest</a>
                    <a class="nav-item nav-link" href="<c:url value = "/home"/>">Izloguj se</a>


                </div>
            </div>
        </nav>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
    <!-- Footer -->
    <footer class="page-footer font-small mdb-color lighten-3 pt-4">

        <!-- Footer Links -->
        <div class="container text-center text-md-left">

            <!-- Grid row -->
            <div class="row">

                <!-- Grid column -->
                <div class="col-md-6 col-lg-3 mr-auto my-md-4 my-0 mt-4 mb-1">

                    <!-- Content -->
                    <h5 class="font-weight-bold text-uppercase mb-4">Portal vesti</h5>
                    <p>Uz nas saznajte najnovije detalje iz sveta sporta, kulture, zabave i hronike.</p>
                    <p>Budite obavesteni o svim mogucim dogadjajima, jer mi smo tu da saznate istinu iz prve ruke.</p>

                </div>


                <hr class="clearfix w-100 d-md-none">

                <!-- Grid column -->
                <div class="col-md-6 col-lg-3 mx-auto my-md-4 my-0 mt-4 mb-1">

                    <!-- Contact details -->
                    <h5 class="font-weight-bold text-uppercase mb-4">Adresa</h5>

                    <ul class="list-unstyled">
                        <li>
                            <p>
                                <i class="fas fa-home mr-3"></i> Mije Kovacevica 7, Beograd</p>
                        </li>
                        <li>
                            <p>
                                <i class="fas fa-envelope mr-3"></i> portalvesti011@gmail.com</p>
                        </li>
                        <li>
                            <p>
                                <i class="fas fa-phone mr-3"></i> +381 64 55 11 777</p>
                        </li>
                        <li>
                            <p>
                                <i class="fas fa-print mr-3"></i> 011 39 66 777</p>
                        </li>
                    </ul>

                </div>
                <!-- Grid column -->

                <hr class="clearfix w-100 d-md-none">

                <!-- Grid column -->
               

                <!-- Copyright -->
                <div class ="container">
                <div class="footer-copyright text-center py-3">© 2020 Copyright:
                    <a href="#"> KM</a>
                </div>
                <!-- Copyright -->
                </div>
                </footer>
</html>
