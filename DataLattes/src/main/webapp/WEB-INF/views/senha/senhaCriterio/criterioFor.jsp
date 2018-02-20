<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="col-12">
 <div class="col-12">
  <div class="col-4 col-offset-4">
   <h2>${estcrit.getListEst().get(idforech).getNome()}</h2>
  </div>
 </div>
 <div id="accordion ">
  <c:forEach var="item" varStatus="itemstatus"
   items="${estcrit.getListEst().get(idforech).getListCrit()}">
   <div class="card" style="margin-bottom: 10px;border-width: 0px;">
    <div class="card-header border" style="padding: 0px;border-width: 0px;" >
     <h5 class="mb-0">
      <button type="button" style="width: 100%;"
       class="btn btn-outline-secondary 
        <c:if test="${not itemstatus.first}">collapsed</c:if>"
       data-toggle="collapse" data-target="#collapse${itemstatus.index}"
       aria-expanded="<c:if test="${itemstatus.first}">true</c:if>
       <c:if test="${not itemstatus.first}">false</c:if>"
       aria-controls="collapse${itemstatus.index}">
       <div class="row">
       <div class="col-2">
       ${item.getCriterio()}
       </div>
       <div class="col-1 offset-9 ">
       TT
       </div>
       </div>
       
       </button>
     </h5>
    </div>
    <div id="collapse${itemstatus.index}"
     class="collapse 
    <c:if test="${ itemstatus.first}">show</c:if>
    "
     aria-labelledby="heading${itemstatus.index}"
     data-parent="#accordion">
     <div class="card-body">
                      <div class=" col-12">
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
                         <div class="col-12">
                          <span class="NomeItem${itemstatus.index}&0 indexCont0" name="${item.getAbre()}"></span>
                         </div>
                         <c:forEach var="list" varStatus="liststatus"
                          items="${item.getListTipo()}">
                          <div
                            class=" col-12 FormacaoTipo${liststatus.index}tt${itemstatus.index} 
                            FormacaoItemIndex${itemstatus.index}
                            FormacaoTipoIndex${liststatus.index} <c:if test="${not liststatus.first}">d-none</c:if>"
                            name="${liststatus.index}" id="${itemstatus.index}">
                          <c:forEach var="tipo" varStatus="tipostatus" items="${list}">
                           <div
                            class=" col-12 row" >
                            <div class="col-4">
                             <label>${tipo.getNomeTipo()}</label>
                            </div>
                            <div class="col-4">
                             <div class="col-5">
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
                            <div class="col-4">
                             <div class="col-5  ">
                              <input type="number"
                               class="form-control FormacaoTipo${liststatus.index}limite${itemstatus.index}  Formacaolimite${itemstatus.index} Formacaovalorlimite${liststatus.index} FormacaolimiteGeral d-none"
                               id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}limite" name="${tipo.getAbre()}"
                               placeholder="itens">
                             </div>
                            </div>
                           </div>
                          </c:forEach></div>
                         </c:forEach>
                        </div>
     </div>
    </div>
   </div>
  </c:forEach>
 </div>
</div>