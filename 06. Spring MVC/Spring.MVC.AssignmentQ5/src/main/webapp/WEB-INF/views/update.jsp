<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Spring.MVC.AssignmentQ5.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: 07ayu
  Date: 10-02-2022
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Employee Management System</title>
</head>
<body>
<div class="container mt-5">
    <div class="title">
        <center>
            <h1>Update Employee</h1>
        </center>
    </div>

    <form method="post" action="updateform">
        <div class="form-group">
            <label for="exampleInputEmail1">Employee Id</label>
            <input type="text"
                   name="id"
                   class="form-control"
                   id="exampleInputId1"
                   aria-describedby="emailHelp"
                   value = ${id}
                   readonly
                    >
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Employee Name</label>
            <input type="text"
                   name="name"
                   class="form-control"
                   id="exampleInputEmail1"
                   aria-describedby="emailHelp"
                   value = "${name}">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Employee Department</label>
            <input type="text"
                   name = "department"
                   class="form-control"
                   id="exampleInputPassword1"
                   value="${department}">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Employee Designation</label>
            <input type="text"
                   name="designation"
                   class="form-control"
                   id="exampleInputDepartment1"
                   value="${designation}">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Employee Salary</label>
            <input type="text"
                   name="salary"
                   class="form-control"
                   id="exampleInputSalary1"
                   value="${salary}">
        </div>
        <button type="submit" class="btn btn-primary">Update</button>

    </form>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>