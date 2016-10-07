<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="${pageContext.request.contextPath}/js/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ngGeolocation.js"></script>
<script src="${pageContext.request.contextPath}/js/registerform.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/materialize.min.js" ></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/materialize.min.css"/>
</head>
<body class="">
<div>


	<div> <tiles:insertAttribute name="authenticationheader" /></div>  
             <div>   <tiles:insertAttribute name="authenticationbody" /></div>
</div>
</body>
</html>