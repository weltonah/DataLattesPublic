<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tags:padrao>	
<jsp:body>
<div style="margin-top:20%;">
  <div class="row">
	  <div class="well col-xs-12">
	  <div class="well col-xs-12">
	 	<div class=" col-xs-12">
			<div class=" col-md-4">
				<label></label>
			</div>
			<div class="col-md-4">
				<label>Ano inicio</label>
			</div>
			<div class=" col-md-4">
				<label>Ano fim</label>
			</div>
		</div>
	  	<div class=" col-xs-12">
			<div class=" col-md-4">
				<label>Ano de analise</label>
			</div>
			<div class="col-md-4">
				<label>${SessaoCriteriosKey.getAnoInicio()}</label>
			</div>
			<div class=" col-md-4">
				<label>${SessaoCriteriosKey.getAnoFim()}</label>
			</div>
		</div>
		</div>
	  
	  <c:forEach var="AreaEstrutura" varStatus="AreaEstruturastatus" items="${SessaoCriteriosKey.getListEst()}">
        <div class="well col-xs-12">
	  		<label>${AreaEstrutura.getNome()}</label><br>
	 	 <c:forEach var="CriterioEstrutura" varStatus="CriterioEstruturastatus" items="${AreaEstrutura.getListCrit()}">
             <div class=" col-xs-12">
              <div class=" col-md-4">
              </div>
              <div class="col-md-4">
               <label>Valor por item:</label>
              </div>
              <div class=" col-md-4">
               <label>Maximo de item contabilizado</label>
              </div>
             </div>
             <div class="well col-xs-12">
             <label>${CriterioEstrutura.getCriterio() }</label>
    	 	 <c:forEach var="listTipo" varStatus="listTipostatus" items="${CriterioEstrutura.getListTipo()}">
        	 	 <c:forEach var="TipoEstrutura" varStatus="TipoEstruturastatus" items="${listTipo}">
        	 	 	<div class=" col-xs-12">
        				<div class=" col-md-4">
        					<label>${TipoEstrutura.getNomeTipo()}</label>
        				</div>
        				<div class="col-md-4">
        					<label>${TipoEstrutura.getValor()}</label>
        				</div>
        				<div class=" col-md-4">
                      <c:if test="${TipoEstrutura.getLimite() != -1}">
        					<label>${TipoEstrutura.getLimite()}</label>
                       </c:if>
        				</div>
        			</div>
        	  	</c:forEach>
    	  	</c:forEach>
        	</div>
	  	</c:forEach>
        </div>
	  </c:forEach>
	  </div>
	  </div>
	  
	  
	  <div class= "col-md-6 col-md-offset-3 ">
	  	<a href="upload" type="button" class="btn btn-default btn-lg btn-block">Avançar </a>
	  </div>
  </div>
</div>
</jsp:body>
</tags:padrao>