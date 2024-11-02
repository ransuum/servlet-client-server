<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Service</title>
</head>
<style>
    body {
        background-color: bisque;
        padding: 0;
        margin: 0;
    }

    .up-container {
        display: flex;
        align-items: center;
        justify-content: flex-end;
        background-color: burlywood;
    }

    .login {
        padding-right: 20px;
        padding-left: 20px;
        text-decoration: none;
        color: black;

    }
    .sign-up {
        padding-right: 20px;
        padding-left: 20px;
        text-decoration: none;
        color: black;
    }

    .sign-up:hover {
        background-color: wheat;
        color: black;
        cursor: pointer;
    }

    .login:hover {
        background-color: wheat;
        color: black;
        cursor: pointer;
    }

    .profile-container {
        padding: 25px;
        display: grid;
        gap: 25px;
        grid-template-columns: repeat(2, 1fr);
        grid-row-start: 1;
        grid-row-start: 3;
        align-items: center;
    }

    .box {
        background-color: #efefe3;
        border-radius: 25px;
    }

    .first {
        background-color: bisque;
        text-align: center;
    }

    .data {
        margin: 25px;
    }
</style>
<body>
<div class="up-container">
    <a href="login" class="login"><h3>Login</h3></a>
    <a href="registration" class="sign-up"><h3>Sign up</h3></a>
</div>
<div class="profile-container">
    <div class="box first"><img src="user.png"></div>
    <div class="box second">
        <p class="data">email</p>
        <p class="data">username</p>
        <p class="data">email</p>
    </div>
    <div class="box third"><p class="data">lalal</p></div>
</div>
</body>
</html>