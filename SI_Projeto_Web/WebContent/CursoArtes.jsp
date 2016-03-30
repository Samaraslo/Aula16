<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="to.CursoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Curso Artes</title>
</head>
<body>

<%CursoTO to = (CursoTO)request.getAttribute("Artes"); %>

	Id: <%=to.getIdCurso() %>
	Nome Curso: <%=to.getNomeCurso() %>
	Data Inicio: <%=to.getDataInicio() %>
	Data Termino: <%=to.getDataTermino() %>
	Horario: <%=to.getHorario() %>
	Numero de Vagas: <%=to.getNumeroVagas() %>
	Valor: <%=to.getValorCurso() %>
	Numero do Laboratorio: <%=to.getDescricao() %>
	Livros: <%=to.getLivros() %>
	
	


</body>
</html>