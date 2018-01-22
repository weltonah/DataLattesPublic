<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-4 col-md-offset-4">
		<h2> Formação</h2>
	</div>
</div>
<div class="well col-xs-12">
	<div>
		<h4>Configurações</h4>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckFormacaoStatus" name="myCheckFormacaoStatus" onclick="FormacaoStatus(this)"> Diferenciar pontuação por status
		</label>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckFormacaoLimite" name="myCheckFormacaoLimite" onclick="FormacaoLimite(this)"> Colocar limite maximo de itens contabilizados
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
	<c:choose><c:when test="${formacao eq 'Livre-docência'}">
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
					<input type="number" class="form-control" id="valorCon${formacao}" name="valorunitarioCon" placeholder="pts">
				</div>
			</div>
			<div class=" col-md-4 ">
				<div class=" col-md-5  Formacaovalorlimite hidden">
					<input type="number" class="form-control " id="limiteCon${formacao}" name="valorlimiteCon" placeholder="itens">
				</div>
			</div>
			</div>
		</div>
	</c:when><c:otherwise>
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${formacao}:</label>
		</div>
		<div class="col-xs-12 FormacaoAndCon">
			<div class=" col-md-4">
				<label>Em andamento ou concluido</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${formacao}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  Formacaovalorlimite hidden">
					<input type="number" class="form-control" id="limite${formacao}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
		<div class="col-xs-12 hidden FormacaoSepAndCon" >
			<div class=" col-xs-12">
			<div class=" col-md-4">
				<label>Andamento</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valorAnd${formacao}" name="valorunitarioAnd" placeholder="pts">
			</div></div>
			<div class=" col-md-4 "><div class=" col-md-5  Formacaovalorlimite hidden">
					<input type="number" class="form-control" id="limiteAnd${formacao}" name="valorlimiteAnd" placeholder="itens">
			</div></div>
			</div>
			<div class=" col-xs-12">
				<div class=" col-md-4">
					<label>Concluido</label>
				</div>
				<div class=" col-md-4"><div class=" col-md-5">
						<input type="number" class="form-control" id="valorCon${formacao}" name="valorunitarioCon" placeholder="pts">
				</div></div>
				<div class=" col-md-4 "><div class=" col-md-5 Formacaovalorlimite hidden">
						<input type="number" class="form-control" id="limiteCon${formacao}" name="valorlimiteCon" placeholder="itens">
				</div></div>
			</div>
		</div>
	</div>
	</c:otherwise></c:choose></c:forEach>
	</div>
</div>