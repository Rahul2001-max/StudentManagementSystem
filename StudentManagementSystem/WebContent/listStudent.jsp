<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 40px;
            background-color: #f8f9fa;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0,0,0,0.05);
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #dee2e6;
        }

        th {
            background-color: #343a40;
            color: #fff;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a {
            text-decoration: none;
            margin: 0 5px;
            font-size: 18px;
        }

        .edit-icon {
            color: orange;
        }

        .delete-icon {
            color: crimson;
        }

        .register-btn {
            margin-top: 20px;
            display: inline-block;
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 18px;
            font-size: 15px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            text-decoration: none;
        }

        .register-btn:hover {
            background-color: #0056b3;
        }

    </style>
</head>
<body>
    <h2>All Students</h2>
    
    <table>
        <tr>
            <th>Sr</th>
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
            <th>Branch</th>
            <th>Actions</th>
        </tr>
        <s:iterator value="studentList" status="stat">
            <tr>
                <td><s:property value="#stat.index + 1"/></td> <!-- This gives 1,2,3,... -->
                <td><s:property value="name"/></td>
                <td><s:property value="age"/></td>
                <td><s:property value="email"/></td>
                <td><s:property value="branch"/></td>
                <td>
                    <a href="editStudent.action?id=<s:property value='id'/>&update=true" class="edit-icon" title="Edit">✏️</a>
                    <a href="deleteStudent.action?id=<s:property value='id'/>" class="delete-icon" title="Delete">❌</a>
                </td>
            </tr>
        </s:iterator>
    </table>

    <a href="addStudent.jsp" class="register-btn">+ Register</a>
</body>
</html>
