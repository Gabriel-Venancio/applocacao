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

    <h2>Loca��o</h2>
    <form action="/locacao/incluir" method="post">
        <div class="form-group">
            <label>Descri��o:</label>
            <input type="text" class="form-control" placeholder="Entre com a descri��o" name="descricao">
        </div>
        <div class="form-group">
            <label>Data:</label>
            <input type="datetime-local" class="form-control" name="dtSolicitante">
        </div>
        <div class="form-group">
            <label>Tipo:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="web" value="true"> Web
                <label class="form-check-label"></label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="web" value="false"> Loja
                <label class="form-check-label"></label>
            </div>
        </div>

        <div class="form-group">
            <label>Solicitante:</label>
            <select name="solicitante" class="form-control">
                <c:forEach var="s" items="${solicitantes}">
                    <option value="${s.id}">${s.nome}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label>Ve�culos:</label>
            <c:forEach var="p" items="${veiculo}">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="veiculo" value="${p.id}">
                    <label class="form-check-label"> ${p.nome}</label>
                </div>
            </c:forEach>
        </div>

        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>

</div>
</body>
</html>