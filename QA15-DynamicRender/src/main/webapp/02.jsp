<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    int a=50;
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"/>
<h1>JSP Grananja</h1>
<h1>SKRIPLETI</h1>
<%if(a>10){ %>
<h2>VECI NASLOV</h2>
<%}else{ %>
<h3>MANJI NASLOV</h3>
<%} %>

<h2>JSP writer</h2>
<%if(a>10){ 
	out.println("<h2>VECI NASLOV</h2>");
	
}else{
	
	out.println("<h3>MANJI NASLOV</h3>");
}


%> 
</body>
</html>