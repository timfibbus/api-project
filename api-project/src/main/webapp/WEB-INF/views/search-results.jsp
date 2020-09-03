<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>

	<div>	
		<c:forEach var="hit" items="${hits }" >
			<form method="post" action="add-favorite">
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
				</form>
		</c:forEach>
	
	</div>

</body>
</html>