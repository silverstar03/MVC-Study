<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/reguster" method="post">
     이름<input type="text" name="user_name" placeholder="name"><br/>
     아이디<input type="text" name="user_id" placeholder="ID"><br/>
     비밀번호<input type="password" name="user_pw" placeholder="PW"><br/>
     이메일<input type="text" name="user_email" placeholder="code"><br/>
     주소<input type="text" name="user_addr1" placeholder="address"><br/>
     상세주소<input type="text" name="user_addr2" placeholder="detail"><br/>
      	
      <input type="submit" value="submit">
      
    </form>
</body>
</html>