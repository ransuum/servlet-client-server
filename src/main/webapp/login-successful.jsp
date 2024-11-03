<%@ page import="java.util.Base64" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
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
            align-items: center;
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

        h1 {
            color: #1877f2;
            margin-bottom: 1rem;
        }

        p {
            color: #606770;
            margin-bottom: 1.5rem;
        }

    </style>
</head>
<body>
<div class="success-container">
    <h1>Login Successful!</h1>
    <h2>Welcome, ${user.username}!</h2>
    <p>Your email: ${user.email}</p>
    <p>Your birthday: ${user.birthday}</p>
    <p>Gender: ${user.gender}</p>
    <%!
        public String formattedTimeDate() {
            return  LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
    %>
    <h2>Time now: <%=formattedTimeDate()%>
    </h2>
</div>
</body>
</html>