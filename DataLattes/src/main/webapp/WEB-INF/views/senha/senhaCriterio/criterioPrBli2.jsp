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
 <div class="well col-xs-12 PrBliDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckPrBliStatus"
    name="myCheckPrBliStatus" onclick="PrBliStatus(this)">
    Diferenciar pontuação de TODOS os itens por status
   </label>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckPrBliLimite"
    name="myCheckPrBliLimite" onclick="PrBliLimite(this)">
    Colocar limite maximo em TODOS os críterios
   </label>
  </div>
 </div>
 <div class="well col-xs-12" id="PrBliDivGeral">
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
   
    <c:if test="${item.getListTipo().size() > 1}">
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckPrBliItemStatus${itemstatus.index}"
      name="myCheckPrBliItemStatus${itemstatus.index}"
      onclick="PrBliItemStatus(${itemstatus.index})">
      Diferenciar pontuação por status do críterio
     </label>
    </div>
    </c:if>
    
    
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckPrBliItemLimite${itemstatus.index}"
      name="myCheckPrBliItemLimite${itemstatus.index}"
      onclick="PrBliItemLimite(${itemstatus.index})"> Colocar
      limite maximo de itens contabilizados por críterio
     </label>
    </div>
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index}&3 indexCont3" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 PrBliTipo${liststatus.index}tt${itemstatus.index} 
       PrBliItemIndex${itemstatus.index}
       PrBliTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>
       <c:if test="${item.getListTipo().size() == 1}">Semtipo</c:if>"
       name="${liststatus.index}" id="${itemstatus.index}">
     <c:forEach var="tipo" varStatus="tipostatus" items="${list}">
      <div
       class="well col-xs-12" >
       <div class="col-md-4">
        <label>${tipo.getNomeTipo()}  </label>
       </div>
       <div class="col-md-4">
        <div class="col-md-5">
         <input type="number"
          class="form-control  PrBlivalor${liststatus.index}
          PrBliTipo${liststatus.index}tt${itemstatus.index} 
          PrBliTipo${liststatus.index}valor${itemstatus.index} 
          PrBliTipoIndex${liststatus.index}
           PrBliGeral 
           <c:if test="${item.getListTipo().size() == 1}">Semtipo</c:if>"
          id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control PrBliTipo${liststatus.index}limite${itemstatus.index}  PrBlilimite${itemstatus.index} PrBlivalorlimite${liststatus.index} PrBlilimiteGeral hidden"
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