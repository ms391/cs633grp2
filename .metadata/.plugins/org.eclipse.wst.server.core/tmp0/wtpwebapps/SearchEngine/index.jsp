<%@page import="java.util.Map"%>
<%@page import="org.bu.cs633.grp2.search.Searcher" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to search</title>
</head>
<body>
<center>
<%@ include file="search_header.inc" %>
<% if (request.getParameter("search") != null) { %>
<br />
<hr />
<section style="text-align=center;">
	<h1>Search results for "<%= request.getParameter("search") %>"</h1>
	<% Searcher s = Searcher.getInstance();
	   Map<String, Integer> results = s.search(request.getParameter("search"));
	   
	   for(String key : results.keySet())
	   {
			%><p><a href="<%= key %>"><%= results.get(key) %> - <%= key %></a></p><%
	   }
	%>
</section>
<% } %>
</center>
</body>
</html>