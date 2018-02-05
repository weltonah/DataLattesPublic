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
 <div class="well col-xs-12 ProdBibliDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckProdBibliStatus"
    name="myCheckProdBibliStatus" onclick="ProdBibliStatus(this)">
    Diferenciar pontuação de TODOS os itens por status
   </label>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckProdBibliLimite"
    name="myCheckProdBibliLimite" onclick="ProdBibliLimite(this)">
    Colocar limite maximo em TODOS os críterios
   </label>
  </div>
 </div>
 <div class="well col-xs-12" id="ProdBibliDivGeral">
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
      id="myCheckProdBibliItemStatus${itemstatus.index}"
      name="myCheckProdBibliItemStatus${itemstatus.index}"
      onclick="ProdBibliItemStatus(${itemstatus.index})">
      Diferenciar pontuação por status do críterio
     </label>
    </div>
    </c:if>
    
    
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckProdBibliItemLimite${itemstatus.index}"
      name="myCheckProdBibliItemLimite${itemstatus.index}"
      onclick="ProdBibliItemLimite(${itemstatus.index})"> Colocar
      limite maximo de itens contabilizados por críterio
     </label>
    </div>
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index}&3 indexCont3" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 ProdBibliTipo${liststatus.index}tt${itemstatus.index} 
       ProdBibliItemIndex${itemstatus.index}
       ProdBibliTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>"
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
          class="form-control  ProdBiblivalor${liststatus.index}
          ProdBibliTipo${liststatus.index}tt${itemstatus.index} 
          ProdBibliTipo${liststatus.index}valor${itemstatus.index} 
          ProdBibliTipoIndex${liststatus.index}
           ProdBibliGeral"
          id="eeee${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control ProdBibliTipo${liststatus.index}limite${itemstatus.index}  ProdBiblilimite${itemstatus.index} ProdBiblivalorlimite${liststatus.index} ProdBiblilimiteGeral hidden"
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