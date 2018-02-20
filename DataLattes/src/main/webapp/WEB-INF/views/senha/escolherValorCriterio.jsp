<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
<script src="<c:url value=" /js/escolherValorCriterio.js " />"></script>
<c:forEach var = "indice" begin = "0" end = "${sizeFor-1}">
<script>
$("#collapse${indice}tt${idforech}").on('hidden.bs.collapse', function() {
 $("#icon${indice}tt${idforech}").attr('class', 'ion-close-round');
 $("#button${indice}tt${idforech}").attr('class', 'btn btn-danger');
});
$("#collapse${indice}tt${idforech}").on('shown.bs.collapse', function() {
 $("#icon${indice}tt${idforech}").attr('class', 'ion-checkmark');
 $("#button${indice}tt${idforech}").attr('class', 'btn btn-success');
});
</script>
</c:forEach>

</jsp:attribute>
 <jsp:body>
 
<div class="col-10 ">
<div class="row">
<div class="col-12" style="background-color: #64b5f6; height: 10vh;">
Tutorial
</div>
<div class="rounded col-12"
      style="background-color: #64b5f6; margin-top: 1vh; padding-bottom: 10px;">
<form action="escolherValorCriterio">


<div class="col-12 ">
	<h2></h2>
</div>

<div class="col-12 ">
    <input type="hidden" id="sizeList" name="firstName" value="${estcrit.getListEst().size()}">
    <c:forEach var="estrutura" varStatus="estruturaStatus"
         items="${estcrit.getListEst()}">
         <c:set var="idforech" scope="application" value="${estruturaStatus.index }"/>
         <div class="col-12 <c:if test="${not estruturaStatus.first}"> d-none </c:if>"
         id="divItem${estruturaStatus.index}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterio${estrutura.getAbre()}.jsp" />
         </div>
        </c:forEach>
        
</div>
<div class="col-12 row"
       style="padding-right: 0px; margin-right: 0px;">
       
<div class="col-3 offset-9" style="padding-right: 0px;">

</div>
</div>


</form>
<button class="btn btn-outline-light" onclick="Voltar()">Voltar</button>
<button class="btn btn-success" onclick="Avancar()">Success</button>
</div>
</div>
  </div>

<div class="col-2">
<div class="alert alert-warning">
  <span>asdasd</span>
</div>
 </div>
 
 
</jsp:body>

</tags:padrao>