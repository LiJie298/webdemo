<#--这里的request.contextPath ,request这个变量名必须与javaconfig中的setRequestContextAttribute设置的一样，才能取值；-->
<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<body>
<title>抓站管理后台</title>
<input type="image" src="${base}/static/image/logo.jpg"/>抓站后台
<div>
    <div float="left">
            <#list pageList as page>
                <div>${page.name}</div>
            </#list>
    </div>
    <div float="right"></div>
</div>
</body>
</html>