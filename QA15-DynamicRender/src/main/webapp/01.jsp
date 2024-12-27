<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    out.println("JSP");
    
    int a = 3;
    int b=6;
    
    int c=a+b;
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="nav.jsp"/>
<h1>JSP</h1>
<h2>Zbir primer</h2>
<p> Zbir <%=a %> i <%=b %> je <%=c %></p>
<p>Zbir <%out.println(a); %> i <%out.println(b); %>je <%out.println(c); %> </p>
</body>
</html>