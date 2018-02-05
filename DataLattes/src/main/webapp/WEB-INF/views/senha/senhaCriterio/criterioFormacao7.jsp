<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class=" well col-xs-12">
 <div class="  col-xs-12">
  <div class=" col-xs-4 col-md-offset-4">
   <h2>Formação</h2>
  </div>
 </div>
 <div class="well col-xs-12 FormacaoDiv">
  <div>
   <h4>Configurações</h4>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckFormacaoStatus"
    name="myCheckFormacaoStatus" onclick="FormacaoStatus(this)">
    Diferenciar pontuação por status
   </label>
  </div>
  <div class="checkbox">
   <label> <input type="checkbox" id="myCheckFormacaoLimite"
    name="myCheckFormacaoLimite" onclick="FormacaoLimite(this)">
    Colocar limite maximo de itens contabilizados
   </label>
  </div>
 </div>
 <div class=" well col-xs-12" id="FormacaoDivGeral">
  <div class=" col-xs-12">
   <div class=" col-md-4">
    <label>Itens:</label>
   </div>
   <div class="col-md-4">
    <label>Valor por item:</label>
   </div>
   <div class=" col-md-4 Formacaovalorlimite hidden">
    <label>Maximo de item contabilizado</label>
   </div>
  </div>
  <c:forEach var="formacao" varStatus="status" items="${formacaoList}">
   <c:choose>
    <c:when test="${formacao eq 'Livre-docência'}">
     <div class="well col-xs-12">
      <div class="col-xs-12">
       <label>${formacao}:</label>
      </div>
      <div class="col-xs-12">
       <div class=" col-md-4">
        <label>Concluido</label>
       </div>
       <div class=" col-md-4">
        <div class=" col-md-5">
         <input type="number" class="form-control livreAndConValorUni"
          id="valorCon${formacao}" name="${formacao}" placeholder="pts">
        </div>
       </div>
       <div class=" col-md-4 ">
        <div class=" col-md-5  Formacaovalorlimite hidden">
         <input type="number" class="form-control LivreAndConLimite"
          id="limiteCon${formacao}" name="${formacao}"
          placeholder="itens">
        </div>
       </div>
      </div>
     </div>
    </c:when>
    <c:otherwise>
     <div class="well col-xs-12">
      <div class="col-xs-12">
       <label>${formacao}:</label>
      </div>
      <div class="col-xs-12 FormacaoAndCon">
       <div class=" col-md-4">
        <label>Em andamento ou concluido</label>
       </div>
       <div class=" col-md-4">
        <div class=" col-md-5">
         <input type="number"
          class="form-control formacaoAndConValorUni "
          id="valor${formacao}" name="${formacao}" placeholder="pts">
        </div>
       </div>
       <div class=" col-md-4">
        <div class=" col-md-5  Formacaovalorlimite hidden">
         <input type="number" class="form-control formacaoAndConLimite"
          id="limite${formacao}" name="${formacao}" placeholder="itens">
        </div>
       </div>
      </div>
      <div class="col-xs-12 hidden FormacaoSepAndCon">
       <div class=" col-xs-12">
        <div class=" col-md-4">
         <label>Andamento</label>
        </div>
        <div class=" col-md-4">
         <div class=" col-md-5">
          <input type="number" class="form-control formacaoAndValorUni"
           id="valorAnd${formacao}" name="${formacao}" placeholder="pts">
         </div>
        </div>
        <div class=" col-md-4 ">
         <div class=" col-md-5  Formacaovalorlimite hidden">
          <input type="number" class="form-control formacaoAndimite"
           id="limiteAnd${formacao}" name="${formacao}"
           placeholder="itens">
         </div>
        </div>
       </div>
       <div class=" col-xs-12">
        <div class=" col-md-4">
         <label>Concluido</label>
        </div>
        <div class=" col-md-4">
         <div class=" col-md-5">
          <input type="number" class="form-control formacaoConValorUni"
           id="valorCon${formacao}" name="${formacao}" placeholder="pts">
         </div>
        </div>
        <div class=" col-md-4 ">
         <div class=" col-md-5 Formacaovalorlimite hidden">
          <input type="number" class="form-control formacaoConLimite"
           id="limiteCon${formacao}" name="${formacao}"
           placeholder="itens">
         </div>
        </div>
       </div>
      </div>
     </div>
    </c:otherwise>
   </c:choose>
  </c:forEach>
 </div>
</div>