<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>year=<%=request.getParameter("year") %></h1>
<p>${myDate.year}년 ${myDate.month}월 ${myDate.day}일은 ${yoil}입니다.</p>
</body>
</html>
