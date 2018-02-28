<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
<script src="<c:url value=" /js/escolherCriterio.js " />"></script>
</jsp:attribute>
 <jsp:body>
 
<div class="col-12 ">
<div class="row">

<form:form action="escolherValorCriterio">
<div class="rounded col-12"
      style=" margin-top: 1vh;margin-bottom: 1vh; padding-bottom: 10px;">

<div class="col-12 ">
	<h2 style="color: #545454"> Selecione os critérios:</h2>
</div>
<div class="card-columns col-xl-12 ">
          <div class="card border-primary " id="formacao"
        style="background-color: #fff">
           <div class="card-header">
             <label style="font-size: 20px;">Formação</label>
           </div>
           <div class="card-body" id="formacao.Misto">
            <div class="form-check">
             <div>
               <input type="checkbox" class="form-check-input"
            id="checkboxformacaoMarkAll" onclick="formacaoMarkAll(this)">
               <label class="form-check-label"
            for="checkboxformacaoMarkAll">
               Marcar todos
              </label>
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="formacaostatus"
           items="${estr.getListEst().get(0).getListCrit()}">
                <input class="formacao form-check-input" type="checkbox"
            name="formacao" id="formacao${formacaostatus.index}"
            value="${formacao.getAbre()}">
                <label class="form-check-label"
            for="formacao${formacaostatus.index}"> ${formacao.getCriterio()}</label>
                <br>
             </c:forEach>
            </div>
           </div>
          </div>
          
           <div class="card border-primary " id="ProdArt"
        style="background-color: #fff">
           <div class="card-header">
             <label style="font-size: 20px;">Produção Artistica</label>
            </div>
           <div class="card-body" id="ProdArtMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxProdArtMarkAll" onclick="ProdArtMarkAll(this)">
             <label class="form-check-label"
            for="checkboxProdArtMarkAll"> Marcar todos</label>
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="ProdArtstatus"
           items="${estr.getListEst().get(2).getListCrit()}">
                <input class="ProdArt  form-check-input" type="checkbox"
            name="ProdArt" id="ProdArt${ProdArtstatus.index}"
            value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="ProdArt${ProdArtstatus.index}">${formacao.getCriterio() }</label>
                <br>
             </c:forEach>
            </div>
            </div>
           </div>
          <div class="card border-primary " id="ProdTecni"
        style="background-color: #fff">
           <div class="card-header">
             
             <label style="font-size: 20px;">Produção Técnica</label>
            </div>
           <div class="card-body" id="ProdTecniMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxProdTecMarkAll" onclick="ProdTecMarkAll(this)">
             <label class="form-check-label"
            for="checkboxProdTecMarkAll"> Marcar todos </label>
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="ProdTecnistatus"
           items="${estr.getListEst().get(1).getListCrit()}">
                <input class="ProdTec form-check-input" type="checkbox"
            name="ProdTec" id="ProdTec${ProdTecnistatus.index }"
            value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="ProdTec${ProdTecnistatus.index }">
                ${formacao.getCriterio() } </label>
                <br>
             </c:forEach>
            </div>
           </div>
           </div>
          
          <div class="card border-primary " id="DadosGerais"
        style="background-color: #fff">
           <div class="card-header">
             
             <label style="font-size: 20px;">Dados Gerais</label>
            </div>
           <div class="card-body" id="DadosGeraisMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxDadosGeraisMarkAll"
            onclick="DadosGeraisMarkAll(this)"> 
            <label class="form-check-label"
            for="checkboxDadosGeraisMarkAll"> Marcar todos </label>
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="DadosGeraisstatus"
           items="${estr.getListEst().get(6).getListCrit()}">
                <input class="DadosGerais form-check-input"
            type="checkbox" id="DadosGerais${DadosGeraisstatus.index }"
            name="DeEx" value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="DadosGerais${DadosGeraisstatus.index }">
                ${formacao.getCriterio() } </label>
                <br>
             </c:forEach>
            </div>
           </div>
           </div>
          
          <div class="card border-primary " id="Orien"
        style="background-color: #fff">
           <div class="card-header">
             
             <label style="font-size: 20px;">Orientações</label>
            </div>
           <div class="card-body" id="OrienMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxOrienMarkAll" onclick="OrienMarkAll(this)">
             <label class="form-check-label" for="checkboxOrienMarkAll"> Marcar todos </label> 
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="Orienstatus"
           items="${estr.getListEst().get(4).getListCrit()}">
                <input class="Orien form-check-input" type="checkbox"
            id="Orien${Orienstatus.index }" name="Orien"
            value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="Orien${Orienstatus.index }">
                ${formacao.getCriterio() } </label>
                <br>
             </c:forEach>
            </div>
           </div>
          </div>
          
          <div class="card border-primary " id="Banc"
        style="background-color: #fff">
           <div class="card-header">
             
             <label style="font-size: 20px;">Bancas</label>
            </div>
           <div class="card-body" id="BancMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxBancMarkAll" onclick="BancMarkAll(this)">
             <label class="form-check-label" for="checkboxBancMarkAll"> Marcar todos </label> 
             </div>
             <hr style="border-top: 1px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="Bancstatus"
           items="${estr.getListEst().get(5).getListCrit()}">
                <input class="Banc form-check-input" type="checkbox"
            id="Banc${Bancstatus.index }" name="Banc"
            value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="Banc${Bancstatus.index }">
                ${formacao.getCriterio() } </label>
                <br>
             </c:forEach>
            </div>
           </div>
           </div>
          
          <div class="card border-primary " id="ProdBibli"
        style="background-color: #fff">
           <div class="card-header">
             <label style="font-size: 20px;">Produção Bibliografica</label>
            </div>
           <div class="card-body" id="ProdBibliMisto">
            <div class="form-check">
             <div>
             <input type="checkbox" class="form-check-input"
            id="checkboxProdBiblMarkAll" onclick="ProdBiblMarkAll(this)"> 
             <label class="form-check-label"
            for="checkboxProdBiblMarkAll"> Marcar todos </label> 
            
             </div>
             <hr style="border-top: 0.5px solid #8c8b8b;">
             <c:forEach var="formacao" varStatus="ProdBiblistatus"
           items="${estr.getListEst().get(3).getListCrit()}">
                <input class="ProdBibl form-check-input" type="checkbox"
            id="ProdBibl${ProdBiblistatus.index }" name="ProdBibl"
            value="${formacao.getAbre()}"> 
                <label class="form-check-label"
            for="ProdBibl${ProdBiblistatus.index }">
                ${formacao.getCriterio() } </label>
                <br>
             </c:forEach>
            </div>
           </div>
           </div>
           
</div>
<hr style="background-color: black;">
<div class="col-12 row"
       style="padding-right: 0px; margin-right: 0px;">
       
<div class="col-2 offset-10" style="padding-right: 0px;">
<a class="btn btn-outline-dark" href="index" role="button">Voltar</a>
<button type="submit" id="submitForm" class="btn btn-primary">Success</button>
</div>
</div>


</div>
</form:form>
</div>
  </div>


</jsp:body>
</tags:padrao>