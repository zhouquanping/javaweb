<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新用户注册</title>
<style>
        .p{
            color:red;
            margin-left:20px;
            display:inline-block;
        }
        .c{
            color:red;
            margin-left:4px;
            display:inline-block;
        }
        .l{
            font-size:18px;
        }
        .d{
            height:35px;
            width:300px;
            display:inline;
        }
        .i{
            height:30px;
            width:300px;
        }


    </style>
</head>
<body>
<div style="height:80px;"></div>
    <form name="reg" action="/chapter05/Adduser" method="post">
        <div style="width:500px;float:left;margin:0 20px;">
            <div style="font-size:28px;">注册新用户</div>
            <br/>
            <span class="p">*</span>
            <label for="username" class="l">用户名:</label>
            <div style="height:35px;width:300px;position:relative;display:inline;">
                <input name="username" type="text" style="height:30px;width:250px;padding-right:50px;">
                <span style="position:absolute;right:18px;top:2px;background-image:url(user.ico);height:16px;width:16px;display:inline-block;" ></span>
            </div>
            <br/><br/>
             <span class="c">*</span>
            <label for="idcard" class="l">身份证号:</label>
            <div  class="d">
                <input name="id" type="text" class="i">
            </div>
             <br/><br/>
            <span class="p">*</span>
            <label for="email" class="l">邮            箱   :</label>
            <div  class="d">
                <input name="email" type="text" class="i">
            </div>
            <br/><br/>
            <span class="c">*</span>
            <label for="login_password" class="l">登录密码:</label>
            <div  class="d">
                <input name="login_password" type="text" class="i">
            </div>
            <br/><br/>
            <span class="c">*</span>
            <label for="confirm_password" class="l">确认密码:</label>
            <div  class="d">
                <input name="confirm_password" type="text" class="i">
            </div>
            <br/><br/>
            
            
            <input type="submit" value="注册" style="margin-left:100px;height:30px;width:300px;background-color:red;display:inline-block;"/>
        </div>
    </form>

</body>
</html>