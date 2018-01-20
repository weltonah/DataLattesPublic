<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
	<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>

		<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
			<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
				<tags:padrao>
					<jsp:attribute name="extraScripts">
						<script src="<c:url value=" /js/escolherCriterio.js " />"></script>
					</jsp:attribute>
					<jsp:body>
						<div class="well col-md-12" style="background-color: #d1c4e9">
							<form:form action="escolherValorCriterio">
								<div class="col-sx-12 well">
									<h2> Selecione os criterios que serão avaliados :</h2>
								</div>
								<div class="col-sx-12">

									<div class="col-sm-4  ">
										<div class="well col-sm-12" id="Formacao" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													</br>
													<label>Formação</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="FormacaoMisto">
												<div class="checkbox col-md-12 row">
													<input type="checkbox" class="hidden check" name="formacao" value="-1" checked>
													<c:forEach var="formacao" varStatus="status" items="${ck.getFormacao()}">
														<div class="checkbox col-md-12 row">
															<label>
																<input type="checkbox" name="formacao" value="${status.index}"> ${formacao}
																<br>
															</label>
														</div>
													</c:forEach>
												</div>


											</div>
										</div>
										<div class=" well col-sm-12 " id="ProdArtis" style="background-color: #ffab91">
											<div class="col-md-12 ">
												<div class="col-md-12">
													</br>
													<label>Produção Artistica</label>
												</div>
											</div>
											<div class="col-md-12  well " id="ProdArtMisto">
												<div class="checkbox col-md-12 row">
													<input type="checkbox" class="hidden check" name="ProdArt" value="-1" checked>
													<c:forEach var="formacao" varStatus="status" items="${ck.getProdArt()}">
														<div class="checkbox col-md-12 row">
															<label>
																<input type="checkbox" name="ProdArt" value="${status.index}"> ${formacao }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>


											</div>
										</div>
									</div>
									<div class="col-sm-4  ">
										<div class="well col-sm-12 " id="ProdTecni" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													</br>
													<label>Produção Técnica</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="ProdTecniMisto">
												<div class="checkbox col-md-12 row">
													<input type="checkbox" class="hidden check" name="ProdTec" value="-1" checked>
													<c:forEach var="formacao" varStatus="status" items="${ck.getProdTec()}">
														<div class="checkbox col-md-12 row">
															<label>
																<input type="checkbox" name="ProdTec" value="${status.index}"> ${formacao }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>

											</div>
										</div>
									</div>
									<div class="col-sm-4  ">
										<div class="well col-sm-12 " id="Orien" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													</br>
													<label>Orientações e Bancas</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="OrienMisto">
												<div class="checkbox col-md-12 row">
													<input type="checkbox" class="hidden check" name="OriBanc" value="-1" checked>
													<c:forEach var="formacao" varStatus="status" items="${ck.getOriBanc()}">
														<div class="checkbox col-md-12 row">
															<label>
																<input type="checkbox" name="OriBanc" value="${status.index}"> ${formacao }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>

											</div>
										</div>
										<div class=" well col-sm-12 " id="ProdBibli" style="background-color: #ffab91">
											<div class="col-md-12 ">
												<div class="col-md-12">
													</br>
													<label>Produção Bibliografica</label>
												</div>
											</div>
											<div class="col-md-12  well " id="ProdBibliMisto">
												<div class="checkbox col-md-12 row">
													<input type="checkbox" class="hidden check" name="ProdBibl" value="-1" checked>
													<c:forEach var="formacao" varStatus="status" items="${ck.getProdBibli()}">
														<div class="checkbox col-md-12 row">
															<label>
																<input type="checkbox" name="ProdBibl" value="${status.index}"> ${formacao }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>

											</div>
										</div>
									</div>


								</div>
								<div class="col-md-12">
									<a type="button" class="btn btn-default" href="index">Voltar</a>
									<button type="submit" class="btn btn-success">Success</button>
								</div>

							</form:form>
						</div>


					</jsp:body>



				</tags:padrao>