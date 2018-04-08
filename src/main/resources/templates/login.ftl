<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="utf-8">
    <title>抓站系统登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="${base}/static/assets/reset.css">
    <link rel="stylesheet" href="${base}/static/assets/supersized.css">
    <link rel="stylesheet" href="${base}/static/assets/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>

<body>

<div class="page-container">
    <img src="${base}/static/image/logo.jpg" alt="" class="logo">
<#--<h1 style="display:inline">Login</h1>-->
    <form action="/login" method="post">
        <input type="text" name="username" class="username" placeholder="Username">
        <input type="password" name="password" class="password" placeholder="Password">
        <button type="submit" value="Submit">登陆</button>
        <div class="error">
            <#if (code?exists && code==0)>
                <p>${errorMes}</p>
            </#if>
        </div>
    </form>
<#--<div class="connect">-->
<#--<p>Or connect with:</p>-->
<#--<p>-->
<#--<a class="facebook" href=""></a>-->
<#--<a class="twitter" href=""></a>-->
<#--</p>-->
<#--</div>-->
</div>
<!-- Javascript -->
<script src="${base}/static/js/jquery-1.8.2.min.js"></script>
<script src="${base}/static/js/supersized.3.2.7.min.js"></script>
<script src="${base}/static/js/supersized-init.js"></script>
<script src="${base}/static/js/login.js"></script>

</body>

</html>

