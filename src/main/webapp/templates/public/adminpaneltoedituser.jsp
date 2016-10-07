<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>EDIT  ${User.firstname} PROFILE</h1>
<h2>EMPLOYEE ID: ${User.employeeid}</h2>
<form:form modelAttribute="User" method="post" action="adminpaneltoedituser">
		
			<spring:bind path="User.employeeid">
			<div class="input-field">
				<input disabled id="employeeid" type="text" class="active validate" value=${User.employeeid}
					name="employeeid" required> <label for="employeeid">
					
					Employee Id</label>
			</div>
		</spring:bind>
		
		<spring:bind path="User.emailid">
			<div class="input-field">
				<input id="emailid" type="text" class="active validate" value=${User.emailid}
					name="emailid" required> <label for="emailid">EMPLOYEE EMAIL ID
					</label>
			</div>
		</spring:bind>
		<spring:bind path="User.firstname">
			<div class="input-field">
				<input id="firstname" type="text" class="active validate" value=${User.firstname}
					name="firstname" required> <label for="firstname">First
					Name</label>
			</div>
		</spring:bind>
		<spring:bind path="User.lastname">
			<div class="input-field">
				<input id="lastname" type="text" class="active validate" value=${User.lastname}
					name="lastname" required> <label for="lastname">Last
					Name</label>
			</div>
		</spring:bind>
		<spring:bind path="User.password">
			<div class="input-field">
				<input id="password" type="password" class="active validate" value=${User.password}
					name="password"> <label for="password">Enter Password
					</label>
			</div>
		</spring:bind>
		<spring:bind path="User.salary">
			<div class="input-field">
				<input id="salary" type="text" class="active validate" value=${User.salary}
					name="salary" required> <label for="salary">Salary
					</label>
			</div>
		</spring:bind>
		<spring:bind path="User.jobrole">
			<div class="input-field">
				<input id="jobrole" type="text" class="active validate" value=${User.jobrole}
					name="jobrole" required> <label for="jobrole">Job Role
					</label>
			</div>
		</spring:bind>
		<h4>ENTER EITHER ADMIN OR EMP</h4>
		<spring:bind path="User.employeetype">
			<div class="input-field">
				<input id="employeetype" type="text" class="active validate" value=${User.employeetype}
					name="employeetype" required> <label for="employeetype">Employee Type
					</label>
			</div>
			<button class="btn waves-effect waves-light" type="submit">Submit
    <i class="material-icons right"></i>
  </button>
		</spring:bind>


	</form:form>


</div>

</body>
</html>