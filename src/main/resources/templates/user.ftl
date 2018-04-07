<#--这里的request.contextPath ,request这个变量名必须与javaconfig中的setRequestContextAttribute设置的一样，才能取值；-->
<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<body>
<h1>demo</h1>
<input type="image" src="${base}/static/image/logo.jpg"/>
测试使用-user
<table height="100" border="0" cellspacing="1" bgcolor="#000000">
    <tr bgcolor="#FFFFFF">
        <td>id</td>
        <td>username</td>
        <td>password</td>
    </tr>
    <#list users as item>
    <tr bgcolor="#FFFFFF">
        <td>${item.id}</td>
        <td>${item.userName}</td>
        <td>${item.passWord}</td>
    </tr>
    </#list>
</table>
</body>
</html>