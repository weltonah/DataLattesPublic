<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class=" well col-xs-12">
<div class="  col-xs-12">
	<div class=" col-xs-7 col-md-offset-4">
		<h2> Produção Bibliografica</h2>
	</div>
</div>
<div class="well col-xs-12">
	<div>
		<h4>Configurações</h4>
	</div>
	
	<div class="checkbox">
		<label>
			<input type="checkbox" id="myCheckProdBibliLimite" name="myCheckProdBibliLimite" onclick="ProdBibliLimite(this)"> Colocar limite maximo de itens contabilizados
		</label>
	</div>
</div>
<div class=" well col-xs-12" id="ProdBibliDivGeral">
	<div class=" col-xs-12">
		<div class=" col-md-4">
			<label>Itens:</label>
		</div>
		<div class="col-md-4">
			<label>Valor por item:</label>
		</div>
		<div class=" col-md-4 ProdBiblivalorlimite hidden">
			<label>Maximo de item contabilizado</label>
		</div>
	</div>
	<c:forEach var="ProdBibli" varStatus="status" items="${ProdBiblList}">
	<c:choose><c:when test="${ProdBibli eq 'Trabalho em eventos'}">
		<div class="well col-xs-12">
		
		<div class="col-xs-12">
			<div class="checkbox">
				<label>
					<input type="checkbox" id="myCheckTrabNacInter" name="myCheckTrabNacInter" onclick="TrabNacInter(this)"> Diferenciar por carater do evento
				</label>
			</div>
		</div>
		<div class="col-xs-12">
			<label>${ProdBibli}:</label>
		</div>
			<div class="col-xs-12 TrabNacInter">
				<div class=" col-md-4">
					<label>Completo em evento nacional e internacional</label>
				</div>
				<div class=" col-md-4">
					<div class=" col-md-5">
						<input type="number" class="form-control" id="valorConTrabNacInter${ProdBibli}" placeholder="pts">
					</div>
				</div>
				<div class=" col-md-4 ">
					<div class=" col-md-5  ProdBiblivalorlimite hidden">
						<input type="number" class="form-control " id="limiteConTrabNacInter${ProdBibli}" placeholder="itens">
					</div>
				</div>
			</div>
			<div class="col-xs-12 TrabSepNacInter hidden">
				<div class="col-xs-12">
						<div class=" col-md-4">
						<label>Completo em evento nacional</label>
					</div>
					<div class=" col-md-4">
						<div class=" col-md-5">
							<input type="number" class="form-control" id="valorConTrabNac${ProdBibli}" placeholder="pts">
						</div>
					</div>
					<div class=" col-md-4 ">
						<div class=" col-md-5  ProdBiblivalorlimite hidden">
							<input type="number" class="form-control " id="limiteConTrabNac${ProdBibli}" placeholder="itens">
						</div>
					</div>
				</div>
				<div class="col-xs-12">
						<div class=" col-md-4">
						<label>Completo em evento internacional</label>
					</div>
					<div class=" col-md-4">
						<div class=" col-md-5">
							<input type="number" class="form-control" id="valorConTrabInter${ProdBibli}" placeholder="pts">
						</div>
					</div>
					<div class=" col-md-4 ">
						<div class=" col-md-5  ProdBiblivalorlimite hidden">
							<input type="number" class="form-control " id="limiteConTrabInter${ProdBibli}"  placeholder="itens">
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:when>
	
	
	
	
	
	<c:otherwise>
	<div class="well col-xs-12">
		<div class="col-xs-12">
			<label>${ProdBibli}:</label>
		</div>
		<div class="col-xs-12 ProdBibliAndCon">
			<div class=" col-md-4">
				<label>Completo</label>
			</div>
			<div class=" col-md-4"><div class=" col-md-5">
					<input type="number" class="form-control" id="valor${ProdBibli}" name="valorunitario" placeholder="pts">
			</div></div>
			<div class=" col-md-4"><div class=" col-md-5  ProdBiblivalorlimite hidden">
					<input type="number" class="form-control" id="limite${ProdBibli}" name="valorlimite" placeholder="itens">
			</div></div>
		</div>
		
	</div>
	</c:otherwise></c:choose></c:forEach>
	</div>
</div>