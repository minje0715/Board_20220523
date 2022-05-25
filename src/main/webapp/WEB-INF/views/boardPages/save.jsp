<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<div class="container">
<form action="/board/save" method="post">
    <input class="form-control mb-2" type="text" name="boardTitle" placeholder="글 제목"> <br/>
    <input class="form-control mb-2" type="text" name="boardWriter" placeholder="작성자"> <br/>
    <input class="form-control mb-2" type="text" name="boardPassword" placeholder="비밀번호"> <br/>
    <textarea class="form-control mb-2" name="boardContents" rows="5" cols="10"></textarea>
    <input type="submit" class="btn btn-danger" value="작성">
</form>
</div>
</body>
</html>
