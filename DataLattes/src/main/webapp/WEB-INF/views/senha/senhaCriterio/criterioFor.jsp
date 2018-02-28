<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="col-12">
<div id="accordion${idforech}">
<c:set var="sizeFor" scope="application" value="${estcrit.getListEst().get(idforech).getListCrit().size()}"/>
<h2>${estcrit.getListEst().get(idforech).getNome()}</h2>
<c:forEach var="item" varStatus="itemstatus"
   items="${estcrit.getListEst().get(idforech).getListCrit()}">
   <div class="card"  style="margin-bottom: 10px;border-width: 0px;">
    <div class="card-header" id="heading${itemstatus.index}tt${idforech}" style="padding: 0px;border-width: 0px;">
      <h5 class="mb-0">
        <button type="button" style="width: 100%;" id="button${itemstatus.index}tt${idforech}" class="btn btn-outline-secondary <c:if test="${not itemstatus.first}">collapsed</c:if>
        " data-toggle="collapse" data-target="#collapse${itemstatus.index}tt${idforech}" aria-expanded="
        <c:if test="${itemstatus.first}">true</c:if>
        <c:if test="${not itemstatus.first}">false</c:if>
        " aria-controls="collapse${itemstatus.index}tt${idforech}"  >
          <div class="row">
       <div class="col-2" >
       <span class="indexCont${idforech}" id="${estcrit.getListEst().get(idforech).getAbre()}" name="${item.getAbre()}">${item.getCriterio()}</span>
       </div>
       <div class="col-1 offset-9 ">
       <i class="" id="icon${itemstatus.index}tt${idforech}" ></i>
       </div>
       </div>
        </button>
      </h5> 
    </div>
    <div id="collapse${itemstatus.index}tt${idforech}" class="collapse 
    <c:if test="${itemstatus.first}">show</c:if>" aria-labelledby="heading${itemstatus.index}tt${idforech}" data-parent="#accordion${idforech}">
      <div class="card-body">
                      <div class="col-12">
                         <c:if test="${item.getListTipo().size() > 1}">
                         <div class="checkbox">
                          <label> <input type="checkbox"
                           id="myCheck${estcrit.getListEst().get(idforech).getAbre()}ItemStatus${itemstatus.index}"
                           name="myCheck${estcrit.getListEst().get(idforech).getAbre()}ItemStatus${itemstatus.index}"
                           onclick="${estcrit.getListEst().get(idforech).getAbre()}ItemStatus(${itemstatus.index})">
                           Diferenciar pontuação por status do critério
                          </label>
                         </div>
                         </c:if>
                         <div class="checkbox">
                          <label> <input type="checkbox"
                           id="myCheck${estcrit.getListEst().get(idforech).getAbre()}ItemLimite${itemstatus.index}"
                           name="myCheck${estcrit.getListEst().get(idforech).getAbre()}ItemLimite${itemstatus.index}"
                           onclick="${estcrit.getListEst().get(idforech).getAbre()}ItemLimite(${itemstatus.index})"> Colocar
                           limite maximo de itens contabilizados por critério
                          </label>
                         </div>
                         <div class="col-12">
                          <span class="NomeItem${itemstatus.index}&${idforech}" name="${item.getAbre()}"></span>
                         </div>
                         <c:forEach var="list" varStatus="liststatus"
                          items="${item.getListTipo()}">
                          <div
                            class=" col-12 ${estcrit.getListEst().get(idforech).getAbre()}Tipo${liststatus.index}tt${itemstatus.index} 
                            ${estcrit.getListEst().get(idforech).getAbre()}ItemIndex${itemstatus.index}
                            ${estcrit.getListEst().get(idforech).getAbre()}TipoIndex${liststatus.index} <c:if test="${not liststatus.first}">d-none</c:if>"
                            name="${liststatus.index}" id="${itemstatus.index}">
                          <c:forEach var="tipo" varStatus="tipostatus" items="${list}">
                           <div
                            class=" col-12 row" >
                            <div class="col-4">
                             <label>${tipo.getNomeTipo()}</label>
                            </div>
                            <div class="col-4">
                             <div class="col-9 input-group mb-2">
                             <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">valor:</span>
  </div>
                              <input type="number" min="0"
                               class="form-control  ${estcrit.getListEst().get(idforech).getAbre()}valor${liststatus.index}
                               ${estcrit.getListEst().get(idforech).getAbre()}item${itemstatus.index}tt${idforech}Input
                               ${estcrit.getListEst().get(idforech).getAbre()}Tipo${liststatus.index}tt${itemstatus.index} 
                               ${estcrit.getListEst().get(idforech).getAbre()}Tipo${liststatus.index}valor${itemstatus.index} 
                               ${estcrit.getListEst().get(idforech).getAbre()}TipoIndex${liststatus.index}
                                ${estcrit.getListEst().get(idforech).getAbre()}Geral <c:if test="${not liststatus.first}">d-none</c:if>"
                               id="item${itemstatus.index}list${liststatus.index}tipo${tipostatus.index}" name="${tipo.getAbre()}"
                               placeholder="pts" required>
                             </div>
                            </div>
                            <div class="col-4">
                             <div class="col-9 input-group mb-2 ${estcrit.getListEst().get(idforech).getAbre()}limite${itemstatus.index} d-none">
                             <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">n° max:</span>
  </div>
                              <input type="number"
                               class="form-control ${estcrit.getListEst().get(idforech).getAbre()}Tipo${liststatus.index}limite${itemstatus.index}
                                 ${estcrit.getListEst().get(idforech).getAbre()}limite${itemstatus.index} ${estcrit.getListEst().get(idforech).getAbre()}item${itemstatus.index}tt${idforech}InputLimite 
                                 ${estcrit.getListEst().get(idforech).getAbre()}valorlimite${liststatus.index} ${estcrit.getListEst().get(idforech).getAbre()}limiteGeral d-none"
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
