<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<tags:padrao>	
<jsp:body>

<div class="col-10 ">
<div class="row">
<div class="col-12" style="background-color: #64b5f6; height: 10vh;">
Tutorial
</div>





<div class=" col-12" style="background-color: #64b5f6; margin-top: 1vh; padding-bottom: 10px; padding-top: 10px;">
<div class="row col-12" style="border: solid;">
<div class="row col-12" style="border: solid;">
<div class="row col-9" style="border: solid;">
   <div class=" col-12" style="border: solid;">
       <h3>Nome completo</h3>
   </div>
   <div class="row col-12" style="border: solid;">
     <div class=" col-6" style="border: solid;">
   	    <h3>link</h3>
     </div>
     <div class=" col-6" style="border: solid;">
        <h3>Ultima atualização</h3>
     </div>
   </div>
   <div class=" col-12" style="border: solid;">
      <h3>Resumo</h3>
   </div>
 </div>
 <div class="col-3" style="border: solid;">
   <div class=" col-12" style="border: solid;">
   <h3>Pontuação</h3>
   </div>
   <div class=" col-12" style="border: solid;">
   <h3>Botão csv</h3>
   </div>
 </div>


</div>
<div class="row col-12" style="border: solid;">
 <div class=" col-6" style="border: solid;">
   <h3>Endereço</h3>
 </div>
 <div class=" col-6" style="border: solid;">
   <h3>doação</h3>
 </div>
</div>

</div>
<div class=" row col-12" style="border: solid;">
<div class=" col-12" style="border: solid;">
Formação
</div>
<div class=" col-12" style="border: solid;">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Tipo</th>
      <th scope="col">Quantidade 
(Válidos* /Total)</th>
      <th scope="col">Pontuação por item</th>
      <th scope="col">Pontuação total</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
</div>

</div>

<div class=" col-12" style="border: solid;">
 <c:forEach var="AreaEstrutura" varStatus="AreaEstruturastatus" items="${SessaoCriteriosKey.getListEst()}"><label>${AreaEstrutura.getNome()}</label><br>
<div class=" col-12">
<c:forEach var="CriterioEstrutura" varStatus="CriterioEstruturastatus" items="${AreaEstrutura.getListCrit()}">
<label>${CriterioEstrutura.getCriterio() }</label><br>
<div class=" col-12">
<c:forEach var="listTipo" varStatus="listTipostatus" items="${CriterioEstrutura.getListTipo()}">
<c:forEach var="TipoEstrutura" varStatus="TipoEstruturastatus" items="${listTipo}">
<div class=" col-12">
 <div class=" col-6">
 <label>${TipoEstrutura.getNomeTipo()}</label>
 </div>
 <div class=" col-6">
  <label>${TipoEstrutura.getValor()}</label>
 </div>
</div>
<div class=" col-12">
<c:forEach var="ItemAnalisado" varStatus="ItemAnalisadostatus" items="${TipoEstrutura.getItemAnalisados()}">

<c:choose>
<c:when test="${AreaEstrutura.getAbre().contentEquals('For')}">
<label> osoosossoososo</label>
<div class=" col-12">

 <div class="col-11" >
  <div class="col-12" style="background-color: #fff5cc;">
     <div class=" col-10">
      <label>Titulo : ${ItemAnalisado.getItem().getTitulo()}</label>
     </div>
     <div class=" col-2">
      <label>Ano: ${ItemAnalisado.getItem().getAno()}</label>
     </div>
  </div>
  <div class=" col-12" style="border: 0.1px solid black;">
      <label>Titulo trabalho: ${ItemAnalisado.getItem().getTituloTrabalho()}</label>
  </div>
  <div class=" col-12" style="border: 0.1px solid black;">
     <div class=" col-6">
      <label>Orientador: ${ItemAnalisado.getItem().getNomeOrientador()}</label>
     </div>
     <div class=" col-6">
      <label>Instituição: ${ItemAnalisado.getItem().getNomeInstituicao()}</label>
     </div>
  </div>
 </div>
 <div class=" col-1" style="background-color: #fff5cc;">
 <label>${ItemAnalisado.getValorContabilizado()}</label>
 </div>
</div></c:when>
<c:otherwise>
<div class=" col-12">
 <div class=" col-11">
 <label>${ItemAnalisado.getItem().getTitulo()}</label>
  <label>${ItemAnalisado.getItem().getAno()}</label>
 </div>
 <div class=" col-1">
 <label>${ItemAnalisado.getValorContabilizado()}</label>
 </div>
</div>
</c:otherwise>

</c:choose>
</c:forEach>
</div>
<div class="col-12">
  <div class="col-11" >
  </div>
 <div class=" col-1" style="background-color: #fff5cc;">
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

</div>

</div>
</div>

<div class="col-2">
<div class="alert alert-warning">
  <span>asdasd</span>
</div>
 </div>


<div class="col-12">




</div>








</jsp:body>
</tags:padrao>