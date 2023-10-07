<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AppLocação</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <h2>Cadastramento de Caminhão</h2>

    <form action="/caminhao/incluir" method="post">

        <c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>

        <div class="form-check">
            <input class="form-check-input" type="checkbox" name="carreta" value="true" checked>
            <label class="form-check-label">Tem carreta?</label>
        </div>

        <div class="mb-3 mt-3">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" value="99" id="nome" placeholder="Entre com o nome" name="nome">
        </div>

        <div class="mb-3 mt-3">
            <label for="valor">Valor:</label>
            <input type="text" class="form-control" value="Valor" id="valor" placeholder="Entre com o valor" name="valor">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>