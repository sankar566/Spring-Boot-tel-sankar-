<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>this is home .jsp page</h1>
 <form action="/addAlien" >
  <input type="text" name="aid" placeholder="enter id"> <br>
  <input type="text" name="aname" placeholder="enter name"><br>
    <input type="text" name="tech" placeholder="enter tech"><br>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

 <form action="/getAlien" >
  <input type="text" name="aid" placeholder="enter id"> <br>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

 <form action="/getAlien1" >
  <input type="text" name="aid" placeholder="enter id"> <br>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

</body>
</html>