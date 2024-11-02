<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: burlywood;
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
        input, select {
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
        .gender-container {
            display: flex;
            justify-content: space-between;
            margin-bottom: 1rem;
        }
        .gender-option {
            flex: 1;
            display: flex;
            align-items: center;
            border: 1px solid #dddfe2;
            border-radius: 4px;
            padding: 0.5rem;
        }
        .gender-option input {
            margin-right: 0.5rem;
            margin-bottom: 0;
        }
        .login-link {
            text-align: center;
            margin-top: 1rem;
        }
        .login-link a {
            color: #1877f2;
            text-decoration: none;
        }
        .login-link a:hover {
            text-decoration: underline;
        }
        .error {
            color: #ff0000;
            font-size: 0.9rem;
            margin-top: -0.5rem;
            margin-bottom: 0.5rem;
        }
        #preview {
            max-width: 100%;
            max-height: 200px;
            margin-bottom: 1rem;
            display: none;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>Join Our Network</h1>
    <form id="registrationForm" action="registration" method="post">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required>
        <div id="usernameError" class="error">${usernameError}</div>

        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>
        <div id="emailError" class="error">${emailError}</div>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
        <div id="passwordError" class="error">${passwordError}</div>

        <label for="dob">Date of Birth</label>
        <input type="date" id="dob" name="dob" required>
        <div id="dobError" class="error"></div>

        <label>Gender</label>
        <div class="gender-container">
            <label class="gender-option">
                <input type="radio" name="gender" value="male" required>
                MALE
            </label>
            <label class="gender-option">
                <input type="radio" name="gender" value="female">
                FEMALE
            </label>
            <label class="gender-option">
                <input type="radio" name="gender" value="other">
                OTHER
            </label>
        </div>
        <div id="genderError" class="error"></div>

        <label for="profile-picture">Profile Picture</label>
        <input type="file" id="profile-picture" name="profile-picture" accept="image/*">
        <img id="preview" alt="Profile picture preview" src="#" />

        <input type="submit" value="Sign Up">
    </form>
    <div class="login-link">
        Already have an account? <a href="login">Log in</a>
    </div>
</div>
</body>
</html>