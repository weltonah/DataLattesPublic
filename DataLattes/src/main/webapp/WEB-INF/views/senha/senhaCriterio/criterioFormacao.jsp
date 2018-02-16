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
 <div class="well col-xs-12 FormacaoDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckFormacaoStatus"
    name="myCheckFormacaoStatus" onclick="FormacaoStatus(this)">
    Diferenciar pontuação de TODOS os itens por status
   </label>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckFormacaoLimite"
    name="myCheckFormacaoLimite" onclick="FormacaoLimite(this)">
    Colocar limite maximo em TODOS os críterios
   </label>
  </div>
 </div>
 <div class="well col-xs-12" id="FormacaoDivGeral">
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
   
    <c:if test="${!item.getCriterio().contentEquals('Livre-docência')}">
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckFormacaoItemStatus${itemstatus.index}"
      name="myCheckFormacaoItemStatus${itemstatus.index}"
      onclick="FormacaoItemStatus(${itemstatus.index})">
      Diferenciar pontuação por status do críterio
     </label>
    </div>
    </c:if>
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckFormacaoItemLimite${itemstatus.index}"
      name="myCheckFormacaoItemLimite${itemstatus.index}"
      onclick="FormacaoItemLimite(${itemstatus.index})"> Colocar
      limite maximo de itens contabilizados por críterio
     </label>
    </div>
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index}&0 indexCont0" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 FormacaoTipo${liststatus.index}tt${itemstatus.index} 
       FormacaoItemIndex${itemstatus.index}
       FormacaoTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>"
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
          class="form-control  Formacaovalor${liststatus.index}
          FormacaoTipo${liststatus.index}tt${itemstatus.index} 
          FormacaoTipo${liststatus.index}valor${itemstatus.index} 
          FormacaoTipoIndex${liststatus.index}
           FormacaoGeral"
          id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control FormacaoTipo${liststatus.index}limite${itemstatus.index}  Formacaolimite${itemstatus.index} Formacaovalorlimite${liststatus.index} FormacaolimiteGeral hidden"
          id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}limite" name="${tipo.getAbre()}"
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