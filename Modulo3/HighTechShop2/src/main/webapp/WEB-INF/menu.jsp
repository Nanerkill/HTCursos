<%@page import="model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<a href="index.jsp">Home</a> | <a href="users">Cadastrar Usuário</a> | <a href="users">Listar Usuários</a> | <a href="product">Listar Produtos</a> | <a href="formproduct.jsp">Cadastrar Produto</a>

<% User user = (User)session.getAttribute("user"); %>

<p>Logged User: <%= user.getName()%></p>
