<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 50px;
            background-color: #f0f2f5;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        .form-container {
            max-width: 400px;
            margin: auto;
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1);
        }

        .form-container label {
            font-weight: bold;
        }

        .form-container .s-label {
            display: block;
            margin-bottom: 6px;
            margin-top: 15px;
        }

        .form-container input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 6px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-container input[type="submit"],
        .form-container .btn-list {
            width: 100%;
            background-color: #28a745;
            color: white;
            border: none;
            padding: 12px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 15px;
            transition: background-color 0.3s;
        }

        .form-container input[type="submit"]:hover,
        .form-container .btn-list:hover {
            background-color: #218838;
        }

        .btn-link {
            text-decoration: none;
        }

    </style>
</head>
<body>
    <h1>Student Registration Form</h1>
    <div class="form-container">
        <s:form action="register" method="post" theme="simple">
            <label class="s-label">Name:</label>
            <s:textfield name="name" cssClass="form-control"/>

            <label class="s-label">Age:</label>
            <s:textfield name="age" cssClass="form-control"/>

            <label class="s-label">Email:</label>
            <s:textfield name="email" cssClass="form-control"/>

            <label class="s-label">Branch:</label>
            <s:textfield name="branch" cssClass="form-control"/>

            <input type="submit" value="Register"/>
        </s:form>

        <a href="getStudent.action" class="btn-link">
            <button class="btn-list">Get List</button>
        </a>
    </div>
</body>
</html>
