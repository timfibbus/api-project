<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<title>Food and Recipe Search API</title>
</head>
<body>
  <header>
    <h1 class="title">food-search</h1>
    <form id="search" name="search" action="/recipes/diet/">
      <input type="text" name="search" placeholder="Searching by keyword: ">
      <input type="number" name="calories" placeholder="calories per serving: ">
      <div>
      <input type="check-box" name="health" placeholder="allergies">
      </div>
      <button type="submit">SEARCH</button>
	</form>
  </header>
  <section>
    <div id="result"></div>
  </section>
</body>
</html>