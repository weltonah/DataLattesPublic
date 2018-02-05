<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class=" well col-xs-12">
 <div class="col-xs-12">
  <div class="col-xs-4 col-md-offset-4">
   <h2>${estcrit.getListEst().get(idforech).getNome()}</h2>
  </div>
 </div>
 <div class="well col-xs-12 DadosGeraisDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  
 </div>
 <div class="well col-xs-12" id="DadosGeraisDivGeral">
  <div class="col-xs-12">
   <div class="col-md-4">
    <label>Itens:</label>
   </div>
   <div class="col-md-4">
    <label>Valor por item:</label>
   </div>
   <div class="col-md-4">
    <label>Maximo de item contabilizado</label>
   </div>
  </div>
  <c:forEach var="item" varStatus="itemstatus"
   items="${estcrit.getListEst().get(idforech).getListCrit()}">
   <div class="well col-xs-12">
    
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index} indexCont5" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 DadosGeraisTipo${liststatus.index}tt${itemstatus.index} 
       DadosGeraisItemIndex${itemstatus.index}
       DadosGeraisTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>"
       name="${liststatus.index}" id="${itemstatus.index}">
     <c:forEach var="tipo" varStatus="tipostatus" items="${list}">
      <div
       class="well col-xs-12" >
       <div class="col-md-4">
        <label>${tipo.getNomeTipo()}</label>
       </div>
       <div class="col-md-4">
        <div class="col-md-5">
         <input type="number"
          class="form-control  DadosGeraisvalor${liststatus.index}
          DadosGeraisTipo${liststatus.index}tt${itemstatus.index} 
          DadosGeraisTipo${liststatus.index}valor${itemstatus.index} 
          DadosGeraisTipoIndex${liststatus.index}
           DadosGeraisGeral"
          id="eeee${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control DadosGeraisTipo${liststatus.index}limite${itemstatus.index}  DadosGeraislimite${itemstatus.index} DadosGeraisvalorlimite${liststatus.index} DadosGeraislimiteGeral hidden"
          id="eee${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="itens">
        </div>
       </div>
      </div>
     </c:forEach></div>
    </c:forEach>
   </div>
  </c:forEach>
 </div>
</div>