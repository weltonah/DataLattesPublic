<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<tags:padrao>	
<jsp:body>

<div class="col-12 ">
<div class=" col-12" style="background-color: ; margin-top: 1vh;margin-bottom: 1vh; padding-bottom: 10px; padding-top: 10px;">
<div class="row col-12" >
<div class="row col-12" >
<div class="row col-9"  >
   <div class="col-12" style="white-space: normal;" >
      <strong style="font-size:4vw;"> ${SessaoCriteriosKey.getDadosCurricular().getNome()}</strong>
   </div>
   <div class="row col-12" >
     <div class=" col-6" >
   	    Link Lattes :
        <a class=" ion-link btn btn-link" role="button"
         href="http://lattes.cnpq.br/${SessaoCriteriosKey.getDadosCurricular().getIdLattes()}" target="_blank">
          ${SessaoCriteriosKey.getDadosCurricular().getIdLattes()}</a>
     </div>
     <div class="col-6" >
     <strong>Ultima atualização:</strong><br>
       ${SessaoCriteriosKey.getDadosCurricular().getUltAtualizacao()}
     </div>
   </div>
   
   <div class=" col-12" >
   
   <div class="alert alert-dark" role="alert">
  <h4 class="alert-heading">Resumo:</h4>
  <hr>
  <p class="mb-0">${SessaoCriteriosKey.getDadosCurricular().getResumo()}</p>
</div>
   
   
      
   </div>
 </div>
 <div class="col-3" >
   <div class=" col-12" >
   <div class="card text-center ">
  <div class="card-header bg-success">
      <span class="text-white"> Nota Total</span> 
      </div>
      <div class="card-body" style="padding:0px;">
      <span style="font-size:4vw;">
        ${SessaoCriteriosKey.getNotatotal()}
        </span>
      </div>
    </div>
   </div>
   <div class="col-12" style="margin-top:10px;">
   <a class="btn btn-warning w-100" href="DownloadCSV" style="white-space: normal;" role="button">
    <i class="ion-document" ></i> Baixar relatorio excel</a>
   </div>
 </div>


</div>
<div class="col-12  ">
<button class="btn btn-primary w-100" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
 <i class="ion-arrow-down-b" ></i>   Mostrar Resultados Detalhados <i class="ion-arrow-down-b" ></i>
</button>

<div class="collapse show " id="collapseExample">
  <div class="card card-body alert alert-dark border-primary">



<div class=" row col-12" >
<div class="row col-12" >
<div class="row  col-8"  >
 <div class="col-12 text-black">
  <h5 >Legenda</h5>
 </div>
 <div class="col-12  alert-success" style="margin:0px;padding:5px;" role="alert">
   <i class="ion-checkmark" ></i> Item analisado foi contabilizado
 </div>
 <div class="col-12  alert-warning text-black" style="margin:0px;padding:5px;" role="alert">
   <i class="ion-close" ></i> Item analisado ultrapassou o limite maximo de item
 </div>
 <div class="col-12  alert-danger" style="margin-bottom:5px;padding:5px;" role="alert">
   <i class="ion-close" ></i> Item analisado está fora do limite de tempo estabelecido
 </div>
</div>
</div>


<div id="accordion" class="w-100  " >
<c:forEach var="AreaEstrutura" varStatus="AreaEstruturastatus" items="${SessaoCriteriosKey.getListEst()}">
<div class="card border border-success" style="margin-top: 10px;border-width: 0px;">
<div class="card-header" id="heading${AreaEstruturastatus.index}" style="padding: 0px;border-width: 0px;" >
     <h5 class="mb-0">
      <button class="btn btn-outline-success w-100 text-left" data-toggle="collapse" style="border: 0px"
         data-target="#collapse${AreaEstruturastatus.index}"
         aria-expanded="true"
         aria-controls="collapse${AreaEstruturastatus.index}">
        <div class="row">
       <div class="col-5" >
       <span  style="font-size: 2vw;">${AreaEstrutura.getNome()}</span>
       </div>
       </div>
        
      </button>
     </h5>
</div>
<div id="collapse${AreaEstruturastatus.index}" class="collapse  show"
 aria-labelledby="heading${AreaEstruturastatus.index}" data-parent="#accordion">
      <div class="card-body">
       <div class="row col-12" style="color: #545454">
       <div class=" col-5">
       Tipo
       </div>
       <div class=" col-3">
       Quantidade (Válidos/Total)
       </div>
       <div class=" col-2">
       Pontos por item
       </div>
       <div class=" col-2">
       Pontuação total
       </div>
       </div>
<c:forEach var="CriterioEstrutura" varStatus="CriterioEstruturastatus" items="${AreaEstrutura.getListCrit()}">
<c:forEach var="listTipo" varStatus="listTipostatus" items="${CriterioEstrutura.getListTipo()}">

<c:forEach var="TipoEstrutura" varStatus="TipoEstruturastatus" items="${listTipo}">
       <div id="accordion${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}">
       <div class="card">
       <div class="card-header" style="margin:0px;padding:0px; " id="heading${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}">
           <button class="rounded-0 btn btn-light w-100 text-left border border-dark" style="white-space: normal;margin:0px;padding:0px; " data-toggle="collapse" 
           data-target="#collapse${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}"
            aria-expanded="true" aria-controls="collapse${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}">
             <div class="row" style="margin:0px;padding:0px; ">
               <div class="col-5">
               ${CriterioEstrutura.getCriterio()} ${TipoEstrutura.getNomeTipo()}
               </div>
               <div class=" col-3">
               ${TipoEstrutura.ItemValidos()} / ${TipoEstrutura.getItemAnalisados().size()}
               </div>
               <div class=" col-2">
              ${TipoEstrutura.getValor()}
               </div>
               <div class=" col-2">
               ${TipoEstrutura.getValorTotalContabilizado()}
               </div>
             </div>
           </button>
       </div>
        <div id="collapse${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}"
         class="collapse border border-dark bg-dark" 
          aria-labelledby="heading${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}"
           data-parent="#accordion${AreaEstruturastatus.index}tt${CriterioEstruturastatus.index}tt${TipoEstruturastatus.index}">
          <div class="row card-body">
          
          <c:forEach var="ItemAnalisado" varStatus="ItemAnalisadostatus" items="${TipoEstrutura.getItemAnalisados()}">
           <div class="col-12
           <c:if test="${ItemAnalisado.getValidade() == 0 || ItemAnalisado.getValidade() == -1}">alert-success </c:if>
           <c:if test="${ItemAnalisado.getValidade() == 2}">alert-warning </c:if>
           <c:if test="${ItemAnalisado.getValidade() == 1}">alert-danger </c:if>"
           style="margin-top:3px;">
           
              <div class=" col-10">
               <label>Titulo : ${ItemAnalisado.getItem().getTitulo()}</label>
              </div>
              <div class=" col-1">
               <label>Ano: ${ItemAnalisado.getItem().getAno()}</label>
              </div>
           </div>
                   
          </c:forEach>
          
          </div>
        </div>
       </div>
       </div>
</c:forEach>

</c:forEach>

</c:forEach>

</div>

</div>
<div class="card-footer text-muted">
 <div class="row col-12">
<div class="col-2 offset-10 ">
 <span  style="font-size: 1.5vw;">Total:  ${AreaEstrutura.getValorTotalArea()}</span>
</div>
</div>
  </div>
</div>
</c:forEach>
</div>
</div>

  </div>
</div>

</div>


<!-- <div class="row col-12" style="margin-top: 10px;"> -->
<!--  <div class=" col-12" > -->
<!--    <div class="alert alert-success" role="alert"> -->
<!--   <h4 class="alert-heading">Well done!</h4> -->
<!--   <p>Aww yeah, you successfully read this important alert message. This example text is going to run a bit longer so that you can see how spacing within an alert works with this kind of content.</p> -->
<!--   <hr> -->
<!--   <p class="mb-0">Whenever you need to, be sure to use margin utilities to keep things nice and tidy.</p> -->
<!-- </div> -->
<!--  </div> -->
<!-- </div> -->

</div>





</div>

</div>









</jsp:body>
</tags:padrao>