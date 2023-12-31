<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page session="true" %>
<nav class="navbar navbar-expand-lg bg-dark border-bottom border-bottom-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.jsp">Bootcamp</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuarios
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="listar-usuarios">Listar usuarios</a></li>
            <li><a class="dropdown-item" href="crear-usuario">Crear usuario</a></li>
          </ul>
        </li>
      </ul>
      
     <div>
     	<div class="d-flex justify-content-between align-items-center">
    	<p class="text-white-50 mx-3 my-2"> Bienvenido <span class="fw-bold text-capitalize">
    	<sec:authentication property="principal.username"/>
		</span></p>

		<form class="form-inline" action="${pageContext.request.contextPath}/logout" method="post">
	    <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Cerrar sesi�n</button>
	    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</form>
		</div>
     
     </div>
    </div>
  </div>
</nav>
