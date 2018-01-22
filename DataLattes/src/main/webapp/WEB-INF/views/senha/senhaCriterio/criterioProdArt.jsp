<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-4 col-md-offset-4">
		<h2> Produção Artistica</h2>
	</div>
</div>
<div class="well col-xs-12">
	<div>
		<h4>Configurações</h4>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckProdArtStatus" name="myCheckProdArtStatus" onclick="ProdArtCarater(this)"> Diferenciar pontuação por carater
		</label>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckProdArtLimite" name="myCheckProdArtLimite" onclick="ProdArtLimite(this)"> Colocar limite maximo de itens contabilizados
		</label>
	</div>
</div>
<div class=" well col-xs-12" id="ProdArtDivGeral">
	<div class=" col-xs-12">
		<div class=" col-md-4">
			<label>Itens:</label>
		</div>
		<div class="col-md-4">
			<label>Valor por item:</label>
		</div>
		<div class=" col-md-4 ProdArtvalorlimite hidden">
			<label>Maximo de item contabilizado</label>
		</div>
	</div>
	<c:forEach var="ProdArt" varStatus="status" items="${ProdArtList}">
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${ProdArt}:</label>
		</div>
		<div class="col-xs-12 ProdArtAndCon">
			<div class=" col-md-4">
				<label>Produção individual ou coletiva</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${ProdArt}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  ProdArtvalorlimite hidden">
					<input type="number" class="form-control" id="limite${ProdArt}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
		<div class="col-xs-12 hidden ProdArtSepAndCon" >
			<div class=" col-xs-12">
			<div class=" col-md-4">
				<label>Produção individual</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valorAnd${ProdArt}" name="valorunitarioAnd" placeholder="pts">
			</div></div>
			<div class=" col-md-4 "><div class=" col-md-5  ProdArtvalorlimite hidden">
					<input type="number" class="form-control" id="limiteAnd${ProdArt}" name="valorlimiteAnd" placeholder="itens">
			</div></div>
			</div>
			<div class=" col-xs-12">
				<div class=" col-md-4">
					<label>Produção coletiva</label>
				</div>
				<div class=" col-md-4"><div class=" col-md-5">
						<input type="number" class="form-control" id="valorCon${ProdArt}" name="valorunitarioCon" placeholder="pts">
				</div></div>
				<div class=" col-md-4 "><div class=" col-md-5 ProdArtvalorlimite hidden">
						<input type="number" class="form-control" id="limiteCon${ProdArt}" name="valorlimiteCon" placeholder="itens">
				</div></div>
			</div>
		</div>
	</div></c:forEach>
	</div>
</div>