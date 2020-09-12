<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
    <script src="js/Calendar.js"></script>
    <script src="js/function.js"></script>
    
    <style>
    	.reg p .error{
    		display:inline-block;
    		border:1px solid #ff855a;
    		background-color:#ffe8e0;
    		
    	}
    </style>
    
</head>
<body><!-------------------reg-------------------------->
<div class="reg">
    <form action="#" method="post"><h1><a href="index.html"><img src="img/temp/logo.png"></a></h1>
        <h1 style="padding:Opx;magin:Opx;font-size:30px;background:#3344AA;text-align:center;line-height:60px;color:#FFFFFFF" >用户注册</h1>
        <p><input type="text" name="userName" value="" placeholder="请输入用户名"><span class="error">用户名不能为空</span></p>
        <p><input type="text" name="name" value="" placeholder="请输入姓名"><span></span></p>
        <p><input type="text" name="passWord" value="" placeholder="请输入密码"><span></span></p>
        <p><input type="text" name="rePassWord" value="" placeholder="请确认密码"><span></span></p>
        <p>
        	<input style="width:15px;height=15px" type="radio" name="sex" value="T" checked="checked">男
        	<input style="width:15px;height=15px" type="radio" name="sex" value="F" checked="checked">女
        	</p>
        <p><input type="text" name="birthday" value="" onfocus="calendar.show(this)" placeholder="请输入出生日期"><span></span></p>
        <p><input type="text" name="email" value="" placeholder="请输入邮箱"><span></span></p>
        <p><input type="text" name="mobile" value="" placeholder="请输入手机号码"><span></span></p>
        <p><input type="text" name="address" value="" placeholder="请输入送货地址"><span></span></p>
        <p> <input class="code" type="text" name="veryCode" value="" placeholder="验证码">
        <img height="25" src="getcode" alt="看不清，换一张" onclick="change(this)"></p>
        <p><input type="submit" name="" value="注册"></p>
        <p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#">
            <使用条款和隐私策略>
        </a></p>
        <p class="txt"><a href="#"><span></span>已有账号登录</a></p>
        <!--<a href="#" class="off"><img src="img/temp/off.png"></a>--></form>
</div>
</body>
</html>