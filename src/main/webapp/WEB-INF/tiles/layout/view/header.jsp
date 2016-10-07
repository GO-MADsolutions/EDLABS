<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="${pageContext.request.contextPath}/js/angular.min.js"></script>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/materialize.min.js" ></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css"/>
<title>Insert title here</title>
</head>
<body>

<nav>
    <div class="nav-wrapper">
      <a href="/" class="brand-logo">EDLABS</a>
      <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
        <li><a href="/EmployeeManagement/user/employee-edit">Edit My Profile</a></li>
        <sec:authorize access="hasAuthority('ADMIN')">


<li><a href="/EmployeeManagement/admingetemployee">Manage Employee</a></li>
</sec:authorize>
        
        <li><a href="/EmployeeManagement/logout">Logout</a></li>
        
      </ul>
      <ul class="side-nav" id="mobile-demo">
        <li><a href="/EmployeeManagement/user/employee-edit">Edit My Profile</a></li>
        <sec:authorize access="hasAuthority('ADMIN')"><li><a href="admingetemployee">Manage Employee</a></li></sec:authorize>
        <li><a href="/EmployeeManagement/logout">Logout</a></li>
      </ul>
    </div>
  </nav>

</body>
</html>