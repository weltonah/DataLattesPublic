<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-7 col-md-offset-4">
		<h2> Produção Tecnica</h2>
	</div>
</div>
<div class="well col-xs-12">
	<div>
		<h4>Configurações</h4>
	</div>
	
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckProdTecLimite" name="myCheckProdTecLimite" onclick="ProdTecLimite(this)"> Colocar limite maximo de itens contabilizados
		</label>
	</div>
</div>
<div class=" well col-xs-12" id="ProdTecDivGeral">
	<div class=" col-xs-12">
		<div class=" col-md-4">
			<label>Itens:</label>
		</div>
		<div class="col-md-4">
			<label>Valor por item:</label>
		</div>
		<div class=" col-md-4 ProdTecvalorlimite hidden">
			<label>Maximo de item contabilizado</label>
		</div>
	</div>
	<c:forEach var="ProdTec" varStatus="status" items="${ProdTecList}">
	<c:choose><c:when test="${ProdTec eq 'Patente'}">
		<div class="well col-xs-12">
		
		<div class="col-xs-12">
			<div class="checkbox">
				<label>
					<input type="checkbox" id="myCheckPatenteNacInter" name="myCheckPatenteNacInter" onclick="PatenteNacInter(this)"> Diferenciar por carater do evento
				</label>
			</div>
		</div>
		<div class="col-xs-12">
			<label>${ProdTec}:</label>
		</div>
			<div class="col-xs-12 PatenteNacInter">
				<div class=" col-md-4">
					<label>Patente nacional e internacional</label>
				</div>
				<div class=" col-md-4">
					<div class=" col-md-5">
						<input type="number" class="form-control" id="valorConTrabNacInter${ProdTec}" placeholder="pts">
					</div>
				</div>
				<div class=" col-md-4 ">
					<div class=" col-md-5  ProdTecvalorlimite hidden">
						<input type="number" class="form-control " id="limiteConTrabNacInter${ProdTec}" placeholder="itens">
					</div>
				</div>
			</div>
			<div class="col-xs-12 PatenteSepNacInter hidden">
				<div class="col-xs-12">
						<div class=" col-md-4">
						<label>Patente nacional</label>
					</div>
					<div class=" col-md-4">
						<div class=" col-md-5">
							<input type="number" class="form-control" id="valorConTrabNac${ProdTec}" placeholder="pts">
						</div>
					</div>
					<div class=" col-md-4 ">
						<div class=" col-md-5  ProdTecvalorlimite hidden">
							<input type="number" class="form-control " id="limiteConTrabNac${ProdTec}" placeholder="itens">
						</div>
					</div>
				</div>
				<div class="col-xs-12">
						<div class=" col-md-4">
						<label>Patente internacional</label>
					</div>
					<div class=" col-md-4">
						<div class=" col-md-5">
							<input type="number" class="form-control" id="valorConTrabInter${ProdTec}" placeholder="pts">
						</div>
					</div>
					<div class=" col-md-4 ">
						<div class=" col-md-5  ProdTecvalorlimite hidden">
							<input type="number" class="form-control " id="limiteConTrabInter${ProdTec}"  placeholder="itens">
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:when>
	
	<c:otherwise>
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${ProdTec}:</label>
		</div>
		<div class="col-xs-12 ProdTecAndCon">
			<div class=" col-md-4">
				<label>Completo</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${ProdTec}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  ProdTecvalorlimite hidden">
					<input type="number" class="form-control" id="limite${ProdTec}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
		
	</div>
	</c:otherwise></c:choose></c:forEach>
	</div>
</div>