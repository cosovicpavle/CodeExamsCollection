<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="keywords" content="travel,blog">
<title>Travel Blog</title>
</head>
<body style="width: 40%; margin-left:32%;">

<header>
<h1 style="margin-left:31%;" >TRAVEL BLOG</h1>
<nav>
<jsp:include page="partials/nav.jsp"/>
</nav>

</header>

<hr>
<br>

<section id="main" style="margin-left:13%;">

<jsp:include page="partials/main.jsp"/>



</section>

<section id="gallery" >


<jsp:include page="partials/gallery.jsp"/>

</section>

<section id="about">


<jsp:include page="partials/about.jsp"/>




</section>

<section id="footer">
<jsp:include page="partials/footer.jsp"></jsp:include>


</section>




</body>
</html>