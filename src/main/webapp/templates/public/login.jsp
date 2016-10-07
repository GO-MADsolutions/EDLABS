<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<div class="row">
		<div class="valign-wrapper">
		<div class="col s12 l9 offset-l4 m8  offset-m4">
		<c:if test="${not empty error }">
		<div class="red-text">${error}</div>
		</c:if>
		<form method="post" action="login">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<div class="row">
			<div class="input-field col s6">
          <input id="emailid" type="text" name="emailid" class="validate">
          <label for="emailid">Enter Your E-MailId</label>
        </div>
        </div>
        <div class="row">
        <div class="input-field col s6">
          <input id="password" type="password" name="password" class="validate">
          <label for="password">Enter Your E-MailId</label>
        </div>
			</div>
			<div class="row">
			<div class="valign-wrapper">
			<button class="btn waves-effect waves-light" type="submit" name="action">Submit
    <i class="material-icons right"></i>
  </button>
			</div>
			
			</div>
			
		
		</form>
		</div>
		
		</div>
			
		</div>
</div>
		
</body>
</html>