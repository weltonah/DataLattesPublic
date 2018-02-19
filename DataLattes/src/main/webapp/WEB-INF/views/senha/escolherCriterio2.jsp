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
										<div class="well col-sm-12" id="formacao" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													
													<label style="font-size: 20px;">Formação</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="formacao.Misto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxformacaoMarkAll" onclick="formacaoMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(0).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="formacao" type="checkbox" name="formacao" value="${formacao.getAbre()}"> ${formacao.getCriterio()}
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
													
													<label style="font-size: 20px;">Produção Artistica</label>
												</div>
											</div>
											<div class="col-md-12  well " id="ProdArtMisto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxProdArtMarkAll" onclick="ProdArtMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(2).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="ProdArt" type="checkbox" name="ProdArt" value="${formacao.getAbre()}"> ${formacao.getCriterio() }
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
													
													<label style="font-size: 20px;">Produção Técnica</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="ProdTecniMisto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxProdTecMarkAll" onclick="ProdTecMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(1).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="ProdTec" type="checkbox" name="ProdTec" value="${formacao.getAbre()}" > ${formacao.getCriterio() }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>

											</div>
										</div>
										<div class="well col-sm-12 " id="DadosGerais" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													
													<label style="font-size: 20px;">Dados Gerais</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="DadosGeraisMisto">
												<div class="checkbox col-md-12 row">
                                                       <div class="col-md-12">
                                                      <input type="checkbox" class="checkbox" id="checkboxDadosGeraisMarkAll" onclick="DadosGeraisMarkAll(this)"> Marcar todos
                                                      </div>
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(6).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="DadosGerais" type="checkbox" name="DadosGerais" value="${formacao.getAbre()}"> ${formacao.getCriterio() }
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
													
													<label style="font-size: 20px;">Orientações</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="OrienMisto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxOrienMarkAll" onclick="OrienMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(4).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="Orien" type="checkbox" name="Orien" value="${formacao.getAbre()}"> ${formacao.getCriterio() }
																<br>
															</label>
														</div>
													</c:forEach>
												</div>

											</div>
										</div>
										<div class="well col-sm-12 " id="Orien" style="background-color: #ffab91">
											<div class="col-sm-12 ">
												<div class="col-sm-12">
													
													<label style="font-size: 20px;">Bancas</label>
												</div>
											</div>
											<div class="col-sm-12  well " id="BancMisto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxBancMarkAll" onclick="BancMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(5).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="Banc" type="checkbox" name="Banc" value="${formacao.getAbre()}"> ${formacao.getCriterio() }
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
													
													<label style="font-size: 20px;">Produção Bibliografica</label>
												</div>
											</div>
											<div class="col-md-12  well " id="ProdBibliMisto">
												<div class="checkbox col-md-12 row">
													<div class="col-md-12">
													<input type="checkbox" class="checkbox" id="checkboxProdBiblMarkAll"  onclick="ProdBiblMarkAll(this)"> Marcar todos
													</div>
													<hr  style="border-top: 1px solid #8c8b8b;">
													<c:forEach var="formacao" varStatus="status" items="${estr.getListEst().get(3).getListCrit()}">
														<div class="checkbox col-md-12 row">
															<label style="font-size: 20px;">
																<input class="ProdBibl" type="checkbox" name="ProdBibl" value="${formacao.getAbre()}"> ${formacao.getCriterio() }
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
									<button type="submit" id="submitForm" class="btn btn-success">Success</button>
								</div>

							</form:form>
						</div>


					</jsp:body>



				</tags:padrao>