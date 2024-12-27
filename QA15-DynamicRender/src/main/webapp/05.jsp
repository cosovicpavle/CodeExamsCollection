<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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


<h1>TABELA STUDENATA</h1>

<table border="1px">
<thead>

</thead>
<tr>
<th>Ime</th>
<th>Prezime</th>
<th>Prosek</th>
</tr>

<tbody>


<%for(Student pom : studenti) {%>
<tr>
<td><%=pom.getIme() %></td>
<td><%=pom.getRezime() %> </td>
<td><%=pom.getProsek() %> </td>



</tr>


<%} %>




</tbody>




</table>

</body>
</html>