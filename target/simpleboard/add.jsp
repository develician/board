<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <title>Add</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<div id="wrap">
<h2>Add</h2>
<form action="add2.jsp" method="post">
    <input id="writer" name="writer" placeholder="writer..." required>
    <br>
    <input id="title" name="title" placeholder="title..." required>
    <br>
    <textarea id="content" name="content" required></textarea>
    <br>
    <input type="submit" value="Add">
</form>
</div>
</body>
</html>
