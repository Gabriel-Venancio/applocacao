<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AppLoca��o</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container-fluid mt-3">
    <h3>Listagem de Caminh�o:</h3>
    <h4><a href="/caminhao">Novo caminh�o</a></h4>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>C�digo</th>
            <th>Capacidade Carga</th>
            <th>Tem carreta?</th>
            <th>Tipo Caminh�o</th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="b" items="${listaCaminhao}">
            <tr>
                <td>${b.id}</td>
                <td>${b.nome}</td>
                <td>${b.valor}</td>
                <td>${b.codigo}</td>
                <td>${b.capacidadeCarga}</td>
                <td>${b.temCarreta}</td>
                <td>${b.tipoCaminhao}</td>
                <td><a href="/caminhao/${b.id}/excluir">excluir</a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>