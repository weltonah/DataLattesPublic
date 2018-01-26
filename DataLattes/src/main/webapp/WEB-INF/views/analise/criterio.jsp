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
				<label>${Ano.getValor()}</label>
			</div>
			<div class=" col-md-4">
				<label>${Ano.getLimite()}</label>
			</div>
		</div>
		</div>
	  <div class="well col-xs-12">
	  <c:forEach var="exemplo" varStatus="status" items="${List}">
	  		<label>${exemplo.getTipoCriterio()}</label><br>
	  		<div class=" col-xs-12">
				<div class=" col-md-4">
					<label>Item:</label>
				</div>
				<div class="col-md-4">
					<label>Valor por item:</label>
				</div>
				<div class=" col-md-4">
					<label>Maximo de item contabilizado</label>
				</div>
			</div>
	 	 <c:forEach var="DadosGerais" varStatus="status" items="${exemplo.getListDadosCriterio()}">
	 	 	<div class=" col-xs-12">
				<div class=" col-md-4">
					<label>${DadosGerais.getNomeCriterio()}</label>
				</div>
				<div class="col-md-4">
					<label>${DadosGerais.getValor()}</label>
				</div>
				<div class=" col-md-4">
					<label>${DadosGerais.getLimite()}</label>
				</div>
			</div>
	  	</c:forEach>
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