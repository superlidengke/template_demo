<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <sf:form method="POST" modelAttribute="loginInfo" action="onLogin">
    <input type="text" name="userId">
    <input type="password" name="password">
    <input type="submit" name="name">
</sf:form>
<h1>${error}</h1>