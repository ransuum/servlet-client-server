<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        margin: 0;
        padding: 20px;
        box-sizing: border-box;
    }
    .form-container {
        background-color: white;
        padding: 2rem;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
    }
    h1 {
        color: #1877f2;
        text-align: center;
        margin-bottom: 1.5rem;
    }
    form {
        display: flex;
        flex-direction: column;
    }
    label {
        margin-bottom: 0.5rem;
        color: #606770;
    }
    input {
        margin-bottom: 1rem;
        padding: 0.5rem;
        border: 1px solid #dddfe2;
        border-radius: 4px;
        font-size: 1rem;
    }
    input[type="submit"] {
        background-color: #1877f2;
        color: white;
        font-weight: bold;
        cursor: pointer;
        padding: 0.75rem;
        border: none;
        border-radius: 4px;
        font-size: 1.1rem;
    }
    input[type="submit"]:hover {
        background-color: #166fe5;
    }
    .register-link {
        text-align: center;
        margin-top: 1rem;
    }
    .register-link a {
        color: #1877f2;
        text-decoration: none;
    }
    .register-link a:hover {
        text-decoration: underline;
    }
    .error {
        color: #ff0000;
        font-size: 0.9rem;
        margin-top: -0.5rem;
        margin-bottom: 0.5rem;
    }
    #forgotPassword {
        text-align: right;
        margin-top: -0.5rem;
        margin-bottom: 1rem;
    }
    #forgotPassword a {
        color: #1877f2;
        text-decoration: none;
        font-size: 0.9rem;
    }
    #forgotPassword a:hover {
        text-decoration: underline;
    }
</style>
<body>
<div class="form-container">
    <h1>Log In</h1>
    <form id="loginForm" action="login" method="post">
        <label for="email">Email or Username</label>
        <input type="text" id="email" name="email" required>
        <div id="emailError" class="error">${emailError}</div>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
        <div id="passwordError" class="error">${passwordError}</div>
        <div id="error"></div>

        <div id="forgotPassword">
            <a href="#" id="forgotPasswordLink">Forgot Password?</a>
        </div>

        <input type="submit" value="Log In">
    </form>
    <div class="register-link">
        Don't have an account? <a href="registration">Sign up</a>
    </div>
</div>
</body>
</html>