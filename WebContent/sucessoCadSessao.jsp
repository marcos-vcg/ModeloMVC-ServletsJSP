<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Clientes</title>
	</head>
	
	<body>
		<%
		String filme = request.getParameter("filme");
		String data = request.getParameter("data");
		String inicio = request.getParameter("inicio");
		String termino = request.getParameter("termino");
		int sala = Integer.parseInt(request.getParameter("sala"));
		%>
		
		<h1>Cadastro de Sess�es de Cinema</h1>
		
		<fieldset>
			<legend>Dados da Sess�o Cadastrada</legend>
			
			<p>A seguinte sess�o foi cadastrada com sucesso: </p>
			<p>
			Titulo do Filme: <%=filme %><br>
			Data da Sess�o: <%=data %><br>
			Hora de In�cio: <%=inicio %><br>
			Hora de T�rmino: <%=termino %><br>
			Sala da Sess�o: <%=sala %><br>
			</p>
		</fieldset>
		
	</body>
</html>