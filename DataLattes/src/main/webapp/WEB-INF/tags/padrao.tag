
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute	name="extraScripts"	fragment="true"	%>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/js/jquery-3.2.1.min.js" />"></script>
    <style>
    	.inputfile + label {
		cursor: pointer;
        }
        html {
            position: relative;
            min-height: 100%;
        }
        body {
            margin: 0 0 60px; 
        }
        .rodape{
            position: absolute;
            bottom: 0px;
            margin-top: 10px;
        }
    </style>
</head>

<body>
	<c:import url="/WEB-INF/views/header.jsp" />
	<div class="col-md-12">
		<div class="mx-auto" style="margin: 0 auto;margin-top:20px; width: 70%; position: relative;">
	    <jsp:doBody/>
	    </div>
    </div>
    <div class="col-md-12" style="margin:40px;width: 70%; position: relative;">
    </div>
    <c:import url="/WEB-INF/views/footer.jsp" />
    <jsp:invoke	fragment="extraScripts"/>	
</body>
</html>