<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Books in the base</title>
    <table>
        <tr>
            <th width="10%">No</th>
            <th width="">Code</th>
            <th width="">Genres</th>
            <th width="">Authors</th>
            <th width="">Title</th>
            <th width="">Description</th>
            <th width="">Price</th>
        </tr>
        <c:set var="i" value="${0}" />
        <c:forEach var="book" items="${books}">
            <c:set var="i" value="${i + 1}" />
            <tr align="center">
                <td><c:out value="${i}"/></td>
                <td><c:out value="${book.id}"/></td>
                <td>
                    <c:forEach var="genre" items="${book.genres}">
                        <c: out value="${genre.name}\n"/>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="author" items="${book.authors}">
                        <c: out value="${author.name}\n"/>
                    </c:forEach>
                </td>
                <td><c:out value="${book.title}"/></td>
                <td><c:out value="${book.description}"/></td>
                <td><c:out value="${book.price}"/></td>
            </tr>
        </c:forEach>
    </table>
</head>
<body>

</body>
</html>
