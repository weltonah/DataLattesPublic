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
 <div class="well col-xs-12 ProdArtDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckProdArtStatus"
    name="myCheckProdArtStatus" onclick="ProdArtStatus(this)">
    Diferenciar pontuação de TODOS os itens por status
   </label>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckProdArtLimite"
    name="myCheckProdArtLimite" onclick="ProdArtLimite(this)">
    Colocar limite maximo em TODOS os críterios
   </label>
  </div>
 </div>
 <div class="well col-xs-12" id="ProdArtDivGeral">
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
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckProdArtItemStatus${itemstatus.index}"
      name="myCheckProdArtItemStatus${itemstatus.index}"
      onclick="ProdArtItemStatus(${itemstatus.index})">
      Diferenciar pontuação por status do críterio
     </label>
    </div>
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckProdArtItemLimite${itemstatus.index}"
      name="myCheckProdArtItemLimite${itemstatus.index}"
      onclick="ProdArtItemLimite(${itemstatus.index})"> Colocar
      limite maximo de itens contabilizados por críterio
     </label>
    </div>
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index} indexCont2" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 ProdArtTipo${liststatus.index}tt${itemstatus.index} 
       ProdArtItemIndex${itemstatus.index}
       ProdArtTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>"
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
          class="form-control  ProdArtvalor${liststatus.index}
          ProdArtTipo${liststatus.index}tt${itemstatus.index} 
          ProdArtTipo${liststatus.index}valor${itemstatus.index} 
          ProdArtTipoIndex${liststatus.index}
           ProdArtGeral"
          id="eeee${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control ProdArtTipo${liststatus.index}limite${itemstatus.index}  ProdArtlimite${itemstatus.index} ProdArtvalorlimite${liststatus.index} ProdArtlimiteGeral hidden"
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