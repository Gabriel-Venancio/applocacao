<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Cadastramento de Motos</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">

    <h4><a href="/moto">Nova moto</a></h4>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>Código</th>
            <th>Partida elétrica?</th>
            <th>Cilindrada</th>
            <th>Tipo Freio</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${listaMoto}">
            <tr>
                <td>${b.id}</td>
                <td>${b.nome}</td>
                <td>${b.valor}</td>
                <td>${b.codigo}</td>
                <td>${b.partidaEletrica}</td>
                <td>${b.cilindrada}</td>
                <td>${b.tipoFreio}</td>
                <td><a href="/moto/${p.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>