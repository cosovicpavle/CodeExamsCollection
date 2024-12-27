<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%
    ArrayList<Student> studenti = new ArrayList<Student>();
    studenti.add(new Student("Marko" ,"Markovic",9.2 ));
    studenti.add(new Student("Marko" ,"Markovic",9.2 ));
    studenti.add(new Student("Marko" ,"Markovic",9.2 ));
    studenti.add(new Student("Marko" ,"Markovic",9.2 ));
    studenti.add(new Student("Marko" ,"Markovic",9.2 ));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"/>
<h1>LISTA STUDENATA</h1>
<ul>
<%for(Student pom:studenti){ %>
<li><%=pom.getIme() %><%=pom.getRezime() %><%=pom.getProsek()%></li>
<% }%>

</ul>

</body>
</html>