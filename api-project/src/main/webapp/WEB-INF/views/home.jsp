<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food and Recipe Search API</title>
</head>
<body>
  <header>
    <h1 class="title">food-search</h1>
    <form id="search" name="search" action="/recipes/">
      <input type="text" name="search" placeholder="Searching by keyword: ">
            <button type="submit">SEARCH</button>
    </form>
      <input type="number" name="calories" placeholder="calories per serving: ">
      <input type="select" name="health" placeholder="health lebels: ">
      <button type="submit">SEARCH</button>

  </header>
  <section>
    <div id="result"></div>
  </section>
</body>
</html>