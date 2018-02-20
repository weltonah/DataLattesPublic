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
 <div class="well col-xs-12 OrienDiv">
  <div>
   <h4>Configurações Gerais</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckOrienLimite"
    name="myCheckOrienLimite" onclick="OrienLimite(this)">
    Colocar limite maximo em TODOS os críterios
   </label>
  </div>
 </div>
 <div class="well col-xs-12" id="OrienDivGeral">
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
   
 
    
    <div>
    <div class="radio">
    <label>
      <input type="radio" name="optionsRadios${itemstatus.index}" id="optionsRadios1" value="option1" checked
      onclick="OrienItemStatus(${itemstatus.index},0)">
      Sem diferenciação
    </label>
    </div>
    <div class="radio">
      <label>
        <input type="radio" name="optionsRadios${itemstatus.index}" id="optionsRadios2" value="option2"
        onclick="OrienItemStatus(${itemstatus.index},1)">
        Diferenciar por tipo de orientação
      </label>
    </div>
    <div class="radio">
      <label>
        <input type="radio" name="optionsRadios${itemstatus.index}" id="optionsRadios2" value="option3"
        onclick="OrienItemStatus(${itemstatus.index},2)">
        Diferenciar por status da orientação 
      </label>
    </div>
    <div class="radio">
      <label>
        <input type="radio" name="optionsRadios${itemstatus.index}" id="optionsRadios2" value="option4"
        onclick="OrienItemStatus(${itemstatus.index},3)">
        Diferenciar por status e por tipo da orientação 
      </label>
    </div>
    </div>
    
    
    <div class="checkbox">
     <label> <input type="checkbox"
      id="myCheckOrienItemLimite${itemstatus.index}"
      name="myCheckOrienItemLimite${itemstatus.index}"
      onclick="OrienItemLimite(${itemstatus.index})"> Colocar
      limite maximo de itens contabilizados por críterio
     </label>
    </div>
    <div class="col-xs-12">
     <span class="NomeItem${itemstatus.index}&4 indexCont4" name="${item.getAbre()}">${item.getCriterio()}</span>
    </div>
    <c:forEach var="list" varStatus="liststatus"
     items="${item.getListTipo()}">
     <div
       class="well col-xs-12 OrienTipo${liststatus.index}tt${itemstatus.index} 
       OrienItemIndex${itemstatus.index}
       OrienTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">hidden</c:if>
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
          class="form-control  Orienvalor${liststatus.index}
          OrienTipo${liststatus.index}tt${itemstatus.index} 
          OrienTipo${liststatus.index}valor${itemstatus.index} 
          OrienTipoIndex${liststatus.index}
           OrienGeral 
           <c:if test="${item.getListTipo().size() == 1}">Semtipo</c:if>"
          id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}" name="${tipo.getAbre()}"
          placeholder="pts">
        </div>
       </div>
       <div class="col-md-4">
        <div class="col-md-5  ">
         <input type="number"
          class="form-control OrienTipo${liststatus.index}limite${itemstatus.index}  Orienlimite${itemstatus.index} Orienvalorlimite${liststatus.index} OrienlimiteGeral hidden"
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