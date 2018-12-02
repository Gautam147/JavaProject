<%-- 
    Document   : logout
    Created on : Dec 2, 2018, 9:43:50 PM
    Author     : Anu Goyal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
session.invalidate();
response.sendRedirect("index.html");
%>