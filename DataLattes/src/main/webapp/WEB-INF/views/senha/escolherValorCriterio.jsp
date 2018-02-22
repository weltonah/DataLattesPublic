<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
<script src="<c:url value=" /js/escolherValorCriterio.js " />"></script>

<c:forEach var="idforechlist" begin="0"
   end="${estcrit.getListEst().size()-1}">
<c:if
    test="${!estcrit.getListEst().get(idforechlist).getAbre().contentEquals('Orien')}">
<script>

function ${estcrit.getListEst().get(idforechlist).getAbre()}ItemStatus(item) {
 ItemStatus("${estcrit.getListEst().get(idforechlist).getAbre()}", item);
}
function ${estcrit.getListEst().get(idforechlist).getAbre()}ItemLimite(item) {
 ItemLimite("${estcrit.getListEst().get(idforechlist).getAbre()}", item)
}

</script>
</c:if>
<c:forEach var="indice" begin="0"
    end="${estcrit.getListEst().get(idforechlist).getListCrit().size()-1}">
<script>
 $("#collapse${indice}tt${idforechlist}")
   .on('hidden.bs.collapse', function() {
  var input = document
    .querySelectorAll('.${estcrit.getListEst().get(idforechlist).getAbre()}item${indice}tt${idforechlist}Input:not(.d-none)');
  for (var i = 0; i < input.length; i++) {
   if (input[i].value == '') {
    $("#icon${indice}tt${idforechlist}").attr('class',
      'ion-close-round');
    $("#button${indice}tt${idforechlist}").attr(
      'class', 'btn btn-danger');
    return null;
   }
  }
  $("#icon${indice}tt${idforechlist}").attr('class',
    'ion-checkmark');
  $("#button${indice}tt${idforechlist}").attr('class',
    'btn btn-success');
 });
</script>
</c:forEach>
</c:forEach>
<script>
$("#collapseOne")
.on('hidden.bs.collapse', function() {
var input = document
 .querySelectorAll('.AnoCriterio');
for (var i = 0; i < input.length; i++) {
if (input[i].value == '') {
 $("#iconOne").attr('class',
   'ion-close-round');
 $("#buttonOne").attr(
   'class', 'btn btn-danger');
 return null;
}
}
$("#iconOne").attr('class',
 'ion-checkmark');
$("#buttonOne").attr('class',
 'btn btn-success');
});
var theDate=new Date()
document.getElementById("AnoFim").value =theDate.getFullYear();
</script>


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
    <input type="hidden" id="sizeList" name="firstName"
        value="${estcrit.getListEst().size()}">
    
    <div class="col-12 " id="divItemInicial">
      <c:import
         url="/WEB-INF/views/senha/senhaCriterio/criterioInicio.jsp" />    
        
     </div>
     
    <c:forEach var="estrutura" varStatus="estruturaStatus"
        items="${estcrit.getListEst()}">
         <c:set var="idforech" scope="application"
         value="${estruturaStatus.index }" />
         <div class="col-12 d-none" id="divItem${estruturaStatus.index}">
              <c:import
          url="/WEB-INF/views/senha/senhaCriterio/criterio${estrutura.getAbre()}.jsp" />
         </div>
        </c:forEach>
        
        
    <div class="col-12 d-none " id="divItemChave">    
        <div class="col-12">
         <div class="alert alert-success" role="alert">
           <h4 class="alert-heading">Parabéns</h4>
           <p>Sua Chave DataLattes foi criada, faça download clicando no botão a baixo. Utilize essa chave toda vez que quiser utilizar os criterios selecionados </p>
           <hr>
            <button class="btn btn-info" onclick="GerarKey()" style="width:100%;font-size:25px;"> <i class="ion-android-download" > Gerar Key</i></button>
         </div>
        </div>
        <div class="col-12">
        
        </div>
        
     </div>   
        
</div>
<div class="col-12 row" style="padding-right: 0px; margin-right: 0px;">
       
<div class="col-3 offset-9" style="padding-right: 0px;">

</div>
</div>


</form>
<button class="btn btn-outline-light" onclick="Voltar()">Voltar</button>
<button class="btn btn-success" onclick="Avancar()">Avançar</button>
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