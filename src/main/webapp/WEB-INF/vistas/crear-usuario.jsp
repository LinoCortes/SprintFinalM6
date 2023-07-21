<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
    <!-- Font Awesome -->
	  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"/>
	 <!-- /Font Awesome -->
  </head>
<body>

    <!-- Navbar -->
    <jsp:include page="navbar.jsp" />
    <!-- End Navbar -->
    <div class="container mt-5">
    
        <h2 class="text-center">Crear usuario</h2>
        
        <div class="row mt-5">
        	<div class="col-4 offset-4">
        	<form:form action="${pageContext.request.contextPath}/listar-usuarios" method="post" class="form-horizontal">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <form:input path="name" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <form:input path="lastname" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <form:input path="email" class="form-control"/>
            </div>

                <div class="d-grid gap-2 mt-2">
                        <button type="submit" class="btn btn-success">Crear</button>
                </div>
        </form:form>
        
        	</div>
        </div>

    </div>
</body>
</html>