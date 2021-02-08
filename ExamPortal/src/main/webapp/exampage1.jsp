<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Page 1</h3>

<p>Q1 What is Java?
<ol type="i">
<div>
<li><input type="checkbox" id="Programming Language" name="Programming Language"
         >
  <label for="Programming Language">Programming Language</label></li>
  <li><input type="checkbox" id="Software" name="Software"
         >
  <label for="Software">Software</label></li>
  <li><input type="checkbox" id="Application" name="Application"
         >
  <label for="Application">Application</label></li>

</div>

</ol>
</p>
<button onclick="document.location='null.jsp'">Previous Question</button><input type="submit"></input><button onclick="document.location='exampage2.jsp'">
      Next Question
    </button>

</body>
</html>