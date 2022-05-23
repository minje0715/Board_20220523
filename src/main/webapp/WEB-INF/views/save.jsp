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

</head>
<body>
    <form action="/save" method="post">
    <input type="text" name="boardTitle" placeholder="글 제목"> <br/>
    <input type="text" name="boardWriter" placeholder="작성자"> <br/>
    <input type="text" name="boardPassword" placeholder="비밀번호"> <br/>
    <input type="text" name="boardContents" placeholder="글 내용"> <br/>
    <input type="submit" value="작성">
    </form>
</body>
</html>
