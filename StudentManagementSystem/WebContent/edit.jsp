<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
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
            text-transform: capitalize;
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

        .form-container input[type="submit"] {
            width: 100%;
            background-color: #007bff;
            color: white;
            border: none;
            padding: 12px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 15px;
            transition: background-color 0.3s;
        }
        .form-container button {
            width: 100%;
            background-color: #007bff;
            color: white;
            border: none;
            padding: 12px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 15px;
            transition: background-color 0.3s;
        }
        

        .form-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<h1>Update Details</h1>
<div class="form-container">
    <s:form action="updateStudent" method="post" theme="simple">
        <s:hidden name="id" value="%{studentBean.id}" />

        <label class="s-label">Name:</label>
        <s:textfield name="name" value="%{studentBean.name}" cssClass="form-control"/>

        <label class="s-label">Email:</label>
        <s:textfield name="email" value="%{studentBean.email}" cssClass="form-control"/>

        <label class="s-label">Branch:</label>
        <s:textfield name="branch" value="%{studentBean.branch}" cssClass="form-control"/>

        <input type="submit" value="Update"/>
        <a href="getStudent.action"><button>Cancel</button></a>
    </s:form>
</div>

</body>
</html>
