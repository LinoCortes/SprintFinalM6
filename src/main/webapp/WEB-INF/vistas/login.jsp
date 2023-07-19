<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Page-Risks-Prevention</title>
<meta name="author" content="Grupo 7">


<!--Google fonts-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&amp;display=swap"
	rel="stylesheet">

<!-- Bootstrap 5.1.3 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!--iconos-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">

<!--Mi estilo-->
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="hero-section-login">
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto mt-5 p-4">Inicie
			Sesión</h1>
	</div>
	<!-- Codigo del Formulario Login -->
	<div class="row container-fluid mx-auto">
		<div class="col-xs-12 col-sm-12 col-md-4 mx-auto">
			<div class="card bg-dark text-white" style="border-radius: 1rem;">
				<div class="card-body p-5">
				<%
				String error = (String) request.getAttribute("error");
				if (error != null && error.equals("true")){
					out.println("<h6 class= 'alert alert-danger'> Error de Autenticación</h6>");
				}
				%>
								
					<form name= "loginForm" class="form" action="${pageContext.request.contextPath}/login" method="post">
						<div class="mb-3">
							<label for="username" class="form-label">Usuario</label>
							<input type="text" class="form-control" id="exampleInputEmail1"
								name="username" value="" />
						</div>

						<div class="mb-3">
							<label for="password" class="form">contraseña</label>
							<input type="password" class="form-control"
								id="exampleInputPassword1" name="password" required />

						</div>
						<div class="d-grid gap-2 pb-4 pt-4">
							<button type="submit" class="btn btn-primary">Acceder</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Fin Codigo del Formulario Login -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>