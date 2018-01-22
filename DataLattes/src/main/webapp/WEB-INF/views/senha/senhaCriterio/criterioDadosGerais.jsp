<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-7 col-md-offset-4">
		<h2> Dados Gerais</h2>
	</div>
</div>
<!-- <div class="well col-xs-12"> -->
<!-- 	<div> -->
<!-- 		<h4>Configurações</h4> -->
<!-- 	</div> -->
	
<!-- 	<div class="checkbox"> -->
<!-- 		<label> -->
<!-- 			<input type="checkbox" id="myCheckDadosGeraisLimite" name="myCheckDadosGeraisLimite" onclick="DadosGeraisLimite(this)"> Colocar limite maximo de itens contabilizados -->
<!-- 		</label> -->
<!-- 	</div> -->
<!-- </div> -->
<div class=" well col-xs-12" id="DadosGeraisDivGeral">
	<div class=" col-xs-12">
		<div class=" col-md-4">
			<label>Itens:</label>
		</div>
		<div class="col-md-4">
			<label>Valor por item:</label>
		</div>
		<div class=" col-md-4 DadosGeraisvalorlimite hidden">
			<label>Maximo de item contabilizado</label>
		</div>
	</div>
	<c:forEach var="DadosGerais" varStatus="status" items="${DadosGeraisList}">
	
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${DadosGerais}:</label>
		</div>
		<div class="col-xs-12 DadosGeraisAndCon">
			<div class=" col-md-4">
				<label>Ativo</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${DadosGerais}" name="valorunitario" placeholder="pts">
			</div></div>
<!-- 			<div class=" col-md-4"><div class=" col-md-5  DadosGeraisvalorlimite hidden"> -->
<%-- 					<input type="number" class="form-control" id="limite${DadosGerais}" name="valorlimite" placeholder="itens"> --%>
<!-- 			</div></div> -->
		</div>
		
	</div></c:forEach>
	</div>
</div>