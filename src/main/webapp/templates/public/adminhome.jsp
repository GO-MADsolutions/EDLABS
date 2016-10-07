<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADMIN PANEL</h1>

<form method="post" action="admingetemployee">
<div>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<div class="input-field">
				<input id="emailid" type="text" class="active validate" 
					name="emailid" required> <label for="emailid">
					ENTER EMAIL ID TO SEARCH USER
					</label>
					
			</div>
			<button class="btn waves-effect waves-light" type="submit">Submit
    <i class="material-icons right"></i>
  </button>
</div>

</form>
</body>
</html>