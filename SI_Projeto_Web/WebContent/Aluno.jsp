<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="to.AlunoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aluno</title>
</head>
<body>

	
	<%AlunoTO to = (AlunoTO)request.getAttribute("aluno");%>
	
	Nome: <%=to.getNome() %><br>
	Endereço: <%=to.getEndereco() %><br>
	Telefone: <%=to.getTelefone() %><br>
	Email: <%=to.getEmail() %><br>
	RG: <%=to.getRg() %><br>
	CPG <%=to.getCpf() %><br>



</body>
</html>