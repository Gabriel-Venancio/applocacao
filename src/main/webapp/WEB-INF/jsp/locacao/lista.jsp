<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Cadastramento de Loca��o</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h3>Loca��es: ${listagem.size()}</h3>

    <h4><a href="/locacao">Nova loca��o</a></h4>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Descri��o</th>
            <th>Data</th>
            <th>Web</th>
            <th>Solicitante</th>
            <th>Ve�culos</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${listagem}">
            <tr>
                <td>${p.id}</td>
                <td>${p.descricao}</td>
                <td>${p.data}</td>
                <td>${p.web}</td>
                <td>${p.solicitante.nome}</td>
                <td>${p.veiculo.size()}</td>
                <td><a href="/locacao/${p.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>