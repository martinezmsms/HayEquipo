<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<html>
	<head> 
		<title>Ver partidos creados</title>
	</head>
	<body> 
		<form:form action="saludo" method="POST" modelAttribute="persona">								
			Nombre
			<form:input path="nombre"/>																
			
			Apellido
			<form:input path="apellido"/>
			
			<input type="submit" value="Enviar" />
		</form:form>
	</body>
</html>