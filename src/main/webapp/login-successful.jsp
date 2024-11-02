<%@ page import="java.util.Base64" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items:  center;
            min-height: 100vh;
            margin: 0;
            padding: 20px;
            box-sizing: border-box;
        }
        .success-container {
            background-color: white;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        .profile-picture {
            width: 500px;
            height: 500px;
            border-radius: 50%;
            margin-bottom: 1rem;
            object-fit: cover;
        }

        h1 {
            color: #1877f2;
            margin-bottom: 1rem;
        }
        p {
            color: #606770;
            margin-bottom: 1.5rem;
        }
        .button {
            background-color: #1877f2;
            color: white;
            font-weight: bold;
            cursor: pointer;
            padding: 0.75rem 1.5rem;
            border: none;
            border-radius: 4px;
            font-size: 1.1rem;
            text-decoration: none;
            display: inline-block;
        }
        .button:hover {
            background-color: #166fe5;
        }
        #countdown {
            font-weight: bold;
            color: #1877f2;
        }
    </style>
</head>
<body>
<body>
<div class="success-container">
    <h1>Login Successful!</h1>
    <h2>Welcome, ${user.username}!</h2>
    <p>Your email: ${user.email}</p>
    <p>Your birthday: ${user.birthday}</p>
    <p>Gender: ${user.gender}</p>
</div>
</body>
</body>
</html>