<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%int n=6; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"/>
<h1>JSP CIKLUSI</h1>
<h1>DINAMICKI RENDER</h1>
<%for(int i=1;i<=n;i++){%>
<h<%=i %>>DEO CIKLUSA</h<%=i %>>
	

<% }%>
<h1>STATICKI RENDER</h1>
<h2>DEOCIKLUSA</h6>
<h3>DEOCIKLUSA</h6>
<h4>DEOCIKLUSA</h6>
<h5>DEOCIKLUSA</h6>
<h6>DEOCIKLUSA</h6>


</body>
</html>