<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
<script src="<c:url value=" /js/escolherCriterio.js " />"></script>
</jsp:attribute>
 <jsp:body>
 
<div class="col-10 ">
<div class="row">
<div class="col-12" style="background-color: #64b5f6; height: 10vh;">
Tutorial
</div>
<form:form action="escolherValorCriterio">
<div class="rounded col-12"
      style="background-color: #64b5f6; margin-top: 1vh; padding-bottom: 10px;">

<div class="col-12 ">
	<h2> Selecione os critérios:</h2>
</div>

<div class="card-columns col-xl-12 ">
    
</div>
<div class="col-12 row"
       style="padding-right: 0px; margin-right: 0px;">
       
<div class="col-3 offset-9" style="padding-right: 0px;">
<a class="btn btn-outline-light" href="index" role="button">Voltar</a>
<button type="submit" id="submitForm" class="btn btn-success">Success</button>
</div>
</div>


</div>
</form:form>
</div>
  </div>

<div class="col-2">
<div class="alert alert-warning">
  <span>asdasd</span>
</div>
 </div>
</jsp:body>
</tags:padrao>