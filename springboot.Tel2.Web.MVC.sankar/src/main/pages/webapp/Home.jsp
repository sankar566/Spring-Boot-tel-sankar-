<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>This is home jsp page </h1>
 <h1>My name is  ${name}</h1>
  <h1>if u put "assign "in URL ----> we get this out put   ${employee.name}  ${employee.id}</h1>
   <h1>if u put "objectassign" in URL ----> we get this out put --> whole object able to assess here   ${alien.aname}, ${alien.aid} </h1>
</body>
</html>