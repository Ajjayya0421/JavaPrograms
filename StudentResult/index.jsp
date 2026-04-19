<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>

<script>
function validateForm() {
    let r = document.forms["f"]["rollno"].value;
    let n = document.forms["f"]["name"].value;
    let s1 = document.forms["f"]["sub1"].value;
    let s2 = document.forms["f"]["sub2"].value;
    let s3 = document.forms["f"]["sub3"].value;
    let s4 = document.forms["f"]["sub4"].value;
    let s5 = document.forms["f"]["sub5"].value;

    if (r=="" || n=="" || s1=="" || s2=="" || s3=="" || s4=="" || s5=="") {
        alert("All fields must be filled");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h2>Student Marks Entry</h2>

<form name="f" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="number" name="sub1"><br><br>
Sub2: <input type="number" name="sub2"><br><br>
Sub3: <input type="number" name="sub3"><br><br>
Sub4: <input type="number" name="sub4"><br><br>
Sub5: <input type="number" name="sub5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>