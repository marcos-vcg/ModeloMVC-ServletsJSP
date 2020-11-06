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
		
		<h1>Cadastro de Sessões de Cinema</h1>
		
		<fieldset>
			<legend>Dados da Sessão Cadastrada</legend>
			
			<p>A seguinte sessão foi cadastrada com sucesso: </p>
			<p>
			Titulo do Filme: <%=filme %><br>
			Data da Sessão: <%=data %><br>
			Hora de Início: <%=inicio %><br>
			Hora de Término: <%=termino %><br>
			Sala da Sessão: <%=sala %><br>
			</p>
		</fieldset>
		
	</body>
</html>