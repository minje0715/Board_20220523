<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
        <script>
            const saveForm = () => {
                location.href = "/save";
            }
            const findAll = () => {
                location.href = "/findAll";
            }
        </script>
</head>
<body>
<h2>index.jsp</h2>
<%--<a href="/save">글 작성하기</a>--%>
<%--<a href="/findAll">글 목록</a>--%>

<button class="btn btn-outline-success" onclick="saveForm()">글작성</button>
<button class="btn btn-outline-success" onclick="findAll()">글목룍</button>

</body>
</html>