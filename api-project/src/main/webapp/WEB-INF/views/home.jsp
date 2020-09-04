<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
	<style>
        .bcontent {
            margin-top: 10px;
        }
    </style>
<title>Food and Recipe Search API</title>
</head>
<body>

  <form action="/search/" >
  <div class="card">
  <div class="card-body">
    <h5 class="card-title">Search for recipes</h5>
    <p class="card-text"> <input type="text" name="search" placeholder="keyword:" required></p>
    <p class="card-text"><input type="number" name="calories" placeholder="calories per serving:"></p>
    <p> <input type="checkbox" name="health" placeholder="allergies"></p>
    
    <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" name="health" value="alcohol-free">
    <label class="form-check-label" for="exampleCheck1">Alcohol-free</label>
    <input type="checkbox" class="form-check-input" name="health" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
    <input type="checkbox" class="form-check-input" name="health" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
    <input type="checkbox" class="form-check-input" name="health" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
    <input type="checkbox" class="form-check-input" name="health" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
    <input type="checkbox" class="form-check-input" name="health" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  	</div>
    <a href="/search/" class="btn btn-primary">Search</a>
  </div>
</div>
</form>
  
      <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>