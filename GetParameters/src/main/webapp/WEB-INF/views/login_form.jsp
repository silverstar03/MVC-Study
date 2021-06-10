<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="/test3" method="post" class="loginForm">
      <h2>Login</h2>
      <div class="idForm">
        <input type="text" name="uid" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" name="upass" class="pw" placeholder="PW">
      </div>
      <button type="submit" class="btn" >
        LOG IN
      </button>
      
    </form>
</body>
</html>