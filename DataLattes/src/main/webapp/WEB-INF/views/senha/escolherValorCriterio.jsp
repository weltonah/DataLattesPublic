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
		<form action="criterioChave">
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
			<div class="col-xs-12">
				<input type="text" class="form-control " id="keyId" name="keyId" >
				<input class="btn btn-default" type="button" value="Input" onclick="GerarKey(${conteudo.get(0).size()})">
			</div>
			
			</div>
			<c:if test="${conteudo.get(0).size()!=null}">
            <c:import url="/WEB-INF/views/senha/senhaCriterio/criterioFormacao.jsp" />
			</c:if>
			<c:if test="${conteudo.get(1).size()!=null}">
			<c:import url="/WEB-INF/views/senha/senhaCriterio/criterioFormacao.jsp" />
			</c:if>
			<c:if test="${conteudo.get(2).size()!=null}">
			<c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdArt.jsp" />
			</c:if>
			<c:if test="${conteudo.get(3).size()!=null}">
			<c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdTec.jsp" />
			</c:if>
			<c:if test="${conteudo.get(4).size()!=null}">
			<c:import url="/WEB-INF/views/senha/senhaCriterio/criterioProdBibli.jsp" />
			</c:if>
			<c:if test="${conteudo.get(5).size()!=null}">
			<c:import url="/WEB-INF/views/senha/senhaCriterio/criterioOriBanc.jsp" />
			</c:if>
			
			<div class="col-md-12">
				<a type="button" class="btn btn-default" href="index">Voltar</a>
				<button type="submit" class="btn btn-success">Success</button>
			</div>
	
		</form>
	</div>


</jsp:body>
</tags:padrao>