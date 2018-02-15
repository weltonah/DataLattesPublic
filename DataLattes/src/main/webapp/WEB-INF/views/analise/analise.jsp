<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<tags:padrao>	
<jsp:body>
<div class="col-xs-12">
<c:forEach var="AreaEstrutura" varStatus="AreaEstruturastatus" items="${SessaoCriteriosKey.getListEst()}">


<label>${AreaEstrutura.getNome()}</label><br>
<div class="well col-xs-12">
<c:forEach var="CriterioEstrutura" varStatus="CriterioEstruturastatus" items="${AreaEstrutura.getListCrit()}">
<label>${CriterioEstrutura.getCriterio() }</label><br>
<div class="well col-xs-12">
<c:forEach var="listTipo" varStatus="listTipostatus" items="${CriterioEstrutura.getListTipo()}">
<c:forEach var="TipoEstrutura" varStatus="TipoEstruturastatus" items="${listTipo}">
<div class=" col-xs-12">
 <div class=" col-md-6">
 <label>${TipoEstrutura.getNomeTipo()}</label>
 </div>
 <div class=" col-md-6">
  <label>${TipoEstrutura.getValor()}</label>
 </div>
</div>
<div class="well col-xs-12">
<c:forEach var="ItemAnalisado" varStatus="ItemAnalisadostatus" items="${TipoEstrutura.getItemAnalisados()}">

<c:choose>
<c:when test="${AreaEstrutura.getAbre().contentEquals('For')}">
<label> osoosossoososo</label>
<div class="well col-xs-12">

 <div class="col-md-11" >
  <div class="col-xs-12" style="background-color: #fff5cc;">
     <div class=" col-md-10">
      <label>Titulo : ${ItemAnalisado.getItem().getTitulo()}</label>
     </div>
     <div class=" col-md-2">
      <label>Ano: ${ItemAnalisado.getItem().getAno()}</label>
     </div>
  </div>
  <div class=" col-xs-12" style="border: 0.1px solid black;">
      <label>Titulo trabalho: ${ItemAnalisado.getItem().getTituloTrabalho()}</label>
  </div>
  <div class=" col-xs-12" style="border: 0.1px solid black;">
     <div class=" col-md-6">
      <label>Orientador: ${ItemAnalisado.getItem().getNomeOrientador()}</label>
     </div>
     <div class=" col-md-6">
      <label>Instituição: ${ItemAnalisado.getItem().getNomeInstituicao()}</label>
     </div>
  </div>
 </div>
 <div class="well col-md-1" style="background-color: #fff5cc;">
 <label>${ItemAnalisado.getValorContabilizado()}</label>
 </div>
 
</div>


</c:when>
<c:otherwise>
<div class="well col-xs-12">
 <div class=" col-md-11">
 <label>${ItemAnalisado.getItem().getTitulo()}</label>
  <label>${ItemAnalisado.getItem().getAno()}</label>
 </div>
 <div class=" col-md-1">
 <label>${ItemAnalisado.getValorContabilizado()}</label>
 </div>
</div>
</c:otherwise>

</c:choose>





</c:forEach>


</div>
<div class="col-xs-12">
  <div class="col-md-11" >
  </div>
 <div class="well col-md-1" style="background-color: #fff5cc;">
 <label>${TipoEstrutura.getValorTotalContabilizado()}</label>
 </div>
</div>
</c:forEach>


</c:forEach>
</div>
</c:forEach>
</div>
</c:forEach>



</div>








</jsp:body>
</tags:padrao>