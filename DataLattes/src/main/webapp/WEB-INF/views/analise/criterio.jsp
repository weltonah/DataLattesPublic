<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
</jsp:attribute>
 <jsp:body>
 
<div class="col-10 ">
<div class="row">
<div class="col-12" style="background-color: #64b5f6; height: 10vh;">
Tutorial
</div>

<div class=" col-12"
     style="background-color: #64b5f6; margin-top: 1vh; padding-bottom: 10px; padding-top: 10px;">

 <div class="col-12 row">
  <div class="col-2">
      <h2> Critérios:</h2>
  </div>
 	
 </div>
 <hr>
 <div class=" col-12">
    <div class="col-12">
       <div class="row col-12">
           <div class="col-4">
            <label></label>
           </div>
           <div class="col-4">
            <label>Ano inicio</label>
           </div>
           <div class=" col-4">
            <label>Ano fim</label>
           </div>
          </div>
            <div class="row col-12">
           <div class="col-4">
            <label>Ano de analise</label>
           </div>
           <div class="col-4">
            <label>${SessaoCriteriosKey.getAnoInicio()}</label>
           </div>
           <div class="col-4">
            <label>${SessaoCriteriosKey.getAnoFim()}</label>
           </div>
      </div>
   </div>
<div class="col-12" id="accordion"> 
  
   <c:forEach var="AreaEstrutura" varStatus="AreaEstruturastatus" items="${SessaoCriteriosKey.getListEst()}">
   <div class="card" style="margin-top:10px;">
    <div class="card-header" id="heading${AreaEstruturastatus.index}" >
     <h5 class="mb-0">
      <button class="btn btn-link" data-toggle="collapse"
         data-target="#collapse${AreaEstruturastatus.index}"
         aria-expanded="true"
         aria-controls="collapse${AreaEstruturastatus.index}">
        ${AreaEstrutura.getNome()}
      </button>
     </h5>
    </div>
    <div id="collapse${AreaEstruturastatus.index}" class="collapse"  aria-labelledby="heading${AreaEstruturastatus.index}" data-parent="#accordion">
     <div class="card-body">
     <div class="card-columns">
      <c:forEach var="CriterioEstrutura" varStatus="CriterioEstruturastatus" items="${AreaEstrutura.getListCrit()}">
      
        <div class="card border-success">
         <div class="card-body row">
           <div class="col-12">
             <h5 class="card-title">${CriterioEstrutura.getCriterio() }</h5>
             <hr>
           </div>
            <div class="col-12" style="margin-top: 10px;">
            <span style="font-size: 1vw;">
                <c:forEach var="listTipo" varStatus="listTipostatus" items="${CriterioEstrutura.getListTipo()}">
                
                <table class="table table-striped table-dark">
                  <thead>
                    <tr>
                      <th scope="col">Tipo</th>
                      <th scope="col">Valor</th>
                      <c:if test="${listTipo.get(0).getLimite() != -1}">
                      <th scope="col">Limite</th>
                      </c:if>
                    </tr>
                  </thead>
                  <tbody>        
                  <c:forEach var="TipoEstrutura" varStatus="TipoEstruturastatus" items="${listTipo}">
                   <tr>
                     <th scope="row">${TipoEstrutura.getNomeTipo()}</th>
                     <td>${TipoEstrutura.getValor()}</td>
                     <c:if test="${TipoEstrutura.getLimite() != -1}">
                     <td>${TipoEstrutura.getLimite()}
                     </td>
                     </c:if>
                   </tr>
                  </c:forEach>
                  </tbody>
                </table>
                </c:forEach>
                </span>
            </div>
            
         </div>
        </div>
      </c:forEach>
     </div>
    </div>
    </div>
    </div>
</c:forEach>
</div>
</div>
 
 <div class="col-12 row" style="padding-right: 0px; margin-right: 0px;margin-top:10px;">

   <div class="col-3 offset-9" style="padding-right: 0px;">
     <a class="btn btn-outline-light" href="index" role="button">Voltar</a>
     <a href="upload" role="button" class="btn btn-primary ">Avançar </a>
   </div>
 </div>
</div>

</div>
</div>

<div class="col-2">
<div class="alert alert-warning">
  <span>asdasd</span>
</div>
 </div>

 </jsp:body>
</tags:padrao>