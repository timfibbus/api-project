<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<meta charset="ISO-8859-1" content="width=device-width, initial-scale=1">
<title>Results</title>
<style>
        .bcontent {
            margin-top: 10px;
        }
    </style>
</head>
<body class="container">
<div class="card">
  <div class="card-body">
    <h5 class="card-title">Here's what we found!</h5>
    <p class="card-text"></p>
    <a href="/" class="btn btn-primary">Return to Search</a>
  </div>
</div>
	<div class="card-columns inline-block">
	<c:forEach var="hit" items="${hits }">
		<div class="card" style="width: 18rem;">
  			<img src="${hit.recipe.image }" class="card-img-top" alt="...">
 		    <div class="card-body">
    			<h5 class="card-title" ><c:out value="${hit.recipe.label }" /></h5>
    			<p class="card-text">Yields <c:out value="${hit.recipe.yield }" /> servings.</p>
   				 <p class="card-text"><fmt:formatNumber type="number" value="${hit.recipe.caloriesPer }"/> calories per serving.</p>
   				 <a href="${hit.recipe.shareAs }" class="card-link">View Recipe</a> 
    			 <a href="/add-favorite" class="card-link">Add To Favorites</a>
    
  			</div>
		</div>
	</c:forEach>
	</div>
	  <div class="card-body">
    <h5 class="card-title">MMMMm! That stuff looks good.</h5>
    <p class="card-text">Didn't find what you're looking for?  Click below to return to the search form.</p>
    <a href="/" class="btn btn-primary">Return to Search</a>
  </div>

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>