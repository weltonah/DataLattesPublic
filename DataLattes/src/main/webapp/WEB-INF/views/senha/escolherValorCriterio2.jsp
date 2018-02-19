<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tags:padrao>
	<jsp:attribute name="extraScripts">
	<script src="<c:url value="/js/escolherValorCriterio.js" />"></script>
</jsp:attribute>
	<jsp:body>
	<div class="well col-md-12" style="background-color: #d1c4e9">
		<div class="col-xs-12 " id="mostrarCriterio" >
			<div class="col-md-12">
				<h2> Selecione os criterios avaliados :   </h2>
			</div>
			<div class=" well col-xs-12">
			<div class=" col-md-4">
				<label>Anos de analise</label>
			</div>
			<div class=" col-md-4">
				<div class=" col-md-5">
					<label>Ano inicio</label>
					<input type="number" class="form-control" id="AnoInicio" name="AnoInicio" placeholder="anos">
				</div>
			</div>
			<div class=" col-md-4 ">
				<div class=" col-md-5">
					<label>Ano fim</label>
					<input type="number" class="form-control " id="AnoFim" value="2018" name="AnoFim" placeholder="anos">
				</div>
			</div>
			
			
			</div>
         <c:forEach var="estrutura" varStatus="estruturaStatus"
         items="${estcrit.getListEst()}">
         <c:set var="idforech" scope="application" value="${estruturaStatus.index }"/>
              <c:if test="${estrutura.getAbre().contains('For')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioFormacao.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('PrTe')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdTec.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('PrArt')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdArt.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('PrBli')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdBibli.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('Orien')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioOrien.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('Banc')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioBanc.jsp" />
              </c:if>
              <c:if test="${estrutura.getAbre().contains('CrGe')}">
              <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioDadosGerais.jsp" />
              </c:if>
        </c:forEach>
			<div class="col-md-12">
				<a type="button" class="btn btn-default" href="index">Voltar</a>
				<button type="submit" class="btn btn-success" onclick="GerarKey(this)">Gerar Chave</button>
			</div>
   </div>
       <div class="col-xs-12 hidden " id="mostrarKey">
    	    <form action="criterioChave">
                 <input type="text" class="form-control " id="keyId" name="keyId" >
                 <a type="button" class="btn btn-default" onclick="voltar(this)">Voltar</a>
    		</form>
      </div>
	
 
 </div>
</jsp:body>
</tags:padrao>