<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="Dados" method="get">
	   Nome: <input type="text"  name="nome" size=15 > <br><br>     
	    Estado civil: <select name="estadocivil">
	    <option>Solteiro
	    <option>Casado
	    <option>Divorciado
	    <option>Viúvo
	    </select>
	    
	     Idade: <select name="idade">
	    <option>3 a 10 anos
	    <option>11 a 25 anos
	    <option>36 a 55 anos
	    <option>56 a 100 anos 
	    </select>
	    
	     <input type='submit' value="Enviar">
	</form>


</body>
</html>