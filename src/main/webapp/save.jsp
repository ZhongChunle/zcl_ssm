<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>账户信息保存</title>
</head>
<body>
    <h1>添加账户信息表单</h1>
    <form action="${pageContext.request.contextPath}/account/save">
        账户名称：<input type="text" name="name"><br>
        账户金额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
