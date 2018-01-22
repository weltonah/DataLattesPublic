<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-10 col-md-offset-4">
		<h2> Orientações e Bancas</h2>
	</div>
</div>
<div class="well col-xs-12">
	<div>
		<h4>Configurações</h4>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckOriBancStatus" name="myCheckOriBancStatus" onclick="OriBancCarater(this)"> Diferenciar pontuação por carater
		</label>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckOriBancLimite" name="myCheckOriBancLimite" onclick="OriBancLimite(this)"> Colocar limite maximo de itens contabilizados
		</label>
	</div>
</div>
<div class=" well col-xs-12" id="OriBancDivGeral">
	<div class=" col-xs-12">
		<div class=" col-md-4">
			<label>Itens:</label>
		</div>
		<div class="col-md-4">
			<label>Valor por item:</label>
		</div>
		<div class=" col-md-4 OriBancvalorlimite hidden">
			<label>Maximo de item contabilizado</label>
		</div>
	</div>
	<c:forEach var="OriBanc" varStatus="status" items="${OriBancList}">
	<c:choose><c:when test="${OriBanc.contains('Banca')}">
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${OriBanc}:</label>
		</div>
		<div class="col-xs-12">
			<div class=" col-md-4">
				<label>Participado</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${OriBanc}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  OriBancvalorlimite hidden">
					<input type="number" class="form-control" id="limite${OriBanc}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
	</div>
	</c:when>
	
	
	
	
	
	<c:otherwise>
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${OriBanc}:</label>
		</div>
		<div class="col-xs-12 OriBancAndCon">
			<div class=" col-md-4">
				<label>Orientações em andamento ou concluidas</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${OriBanc}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  OriBancvalorlimite hidden">
					<input type="number" class="form-control" id="limite${OriBanc}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
		<div class="col-xs-12 hidden OriBancSepAndCon" >
			<div class=" col-xs-12">
			<div class=" col-md-4">
				<label>Orientações em andamento</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valorAnd${OriBanc}" name="valorunitarioAnd" placeholder="pts">
			</div></div>
			<div class=" col-md-4 "><div class=" col-md-5  OriBancvalorlimite hidden">
					<input type="number" class="form-control" id="limiteAnd${OriBanc}" name="valorlimiteAnd" placeholder="itens">
			</div></div>
			</div>
			<div class=" col-xs-12">
				<div class=" col-md-4">
					<label>Orientações concluidas</label>
				</div>
				<div class=" col-md-4"><div class=" col-md-5">
						<input type="number" class="form-control" id="valorCon${OriBanc}" name="valorunitarioCon" placeholder="pts">
				</div></div>
				<div class=" col-md-4 "><div class=" col-md-5 OriBancvalorlimite hidden">
						<input type="number" class="form-control" id="limiteCon${OriBanc}" name="valorlimiteCon" placeholder="itens">
				</div></div>
			</div>
		</div>
	</div></c:otherwise></c:choose></c:forEach>
	</div>
</div>