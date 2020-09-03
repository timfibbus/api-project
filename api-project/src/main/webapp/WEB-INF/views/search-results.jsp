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
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>

	<c:forEach var="hit" items="${hits }">
		<div class="card" style="width: 18rem;">
  <img src="${hit.recipe.image }" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title" ><c:out value="${hit.recipe.label }" /></h5>
    <p class="card-text"><c:out value="${hit.recipe.ingredientLines }" /></p>
    <p class="card-text"><c:out value="${hit.recipe.calories }"/> Calories.</p>
    <p class="card-text">Yields <c:out value="${hit.recipe.yield }" /> servings.</p>
    <a href="${hit.recipe.shareAs }" class="btn btn-primary">View Recipe</a>
  </div>
</div>
	</c:forEach>

	<div>	
		<c:forEach var="hit" items="${hits }" >
			<form method="post" action="add-favorite">
			<div class="container " >
			<p>
			<c:url value="${hit.recipe.uri }" />
			</p>
			<p>
			<c:out value="${hit.recipe.label }" />
			</p>
			<p>
			<c:url value="${hit.recipe.url }" />
			</p>
			<p>
			<a href="${hit.recipe.shareAs }"> <c:url value="View Recipe Details" /> </a>
			</p>
			<p>
			<c:out value="${hit.recipe.calories }" />
			</p>
			<p>
			<c:out value="${hit.recipe.yield }" />
			</p>
			<p>
			<c:forEach var="health" items="${hit.recipe.healthLabels[loop.index]}" varStatus="loop">
				<li>
				<c:out value="${healthLabels }" />
				</li>
			</c:forEach>
			<input type="submit" value="add to favorites" name="add" />
			</p>
			</div>
				</form>
		</c:forEach>
	
	</div>

</body>
</html>