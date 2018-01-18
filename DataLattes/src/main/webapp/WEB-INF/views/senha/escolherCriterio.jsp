<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
	<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>

		<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
			<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
				<tags:padrao>
					<jsp:attribute name="extraScripts">
						<script src="<c:url value=" /js/escolherCriterio.js " />"></script>
					</jsp:attribute>
					<jsp:body>
						<div class="well col-md-12" style="background-color: #d1c4e9 ">
							<form action="criterioChave">
								<div class="col-md-12">
									<h2> Selecione os criterios que serão avaliados :</h2>
								</div>
								
								<div class=" well col-md-12 row" id="Formacao" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckFormacao" name="myCheckFormacao" onclick="Formacao(this)">
											<text id="txtFormacao">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Formação</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="FormacaoMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Graduação
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Especialização
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Mestrado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Doutorado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Pós-Doutorado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Livre-docência
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Curso Técnico ou Profissionalizante
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Mestrado Profissionalizante
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Residência médica
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> Aperfeiçoamento
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value=""> MBA
											</label>
										</div>

									</div>
								</div>

								<div class=" well col-md-12 row" id="ProdTecni" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckProdTecni" name="myCheckProdTecni" onclick="ProdTecni(this)">
											<text id="txtProdTecni">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Produção Técnica</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="ProdTecniMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Tradução
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Cultivação Registrada
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Cultivação Protegida
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Software
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Patente
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Desenho Técnico
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Marca
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Topografia de circuito integrado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Produto Tecnologico
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Processo ou técnica
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Trabalho Técnico
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Apresentação de Trabalho
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Carta, mapa ou similar
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Curso ministrado de curta duração
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Produção de material didatico
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Editoração
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Manutenção de obra artistica
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Maquete
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Organização de evento
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Comentario em programa de Radio ou TV
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Relatorio de pesquisa
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Texto em midia Social
											</label>
										</div>
									</div>
								</div>
								<div class=" well col-md-12 row" id="ProdBibli" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckProdBibli" name="myCheckProdBibli" onclick="ProdBibli(this)">
											<text id="txtProdBibli">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Produção Bibliografica</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="ProdBibliMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Trabalho em eventos
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Artigos publicados
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Artigos aceitos para publicação
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Textos em jornais ou revista
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Capítulo de livro
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Organização de livro
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Publicação de livro
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Prefácio ou posfácio de livro
											</label>
										</div>
									</div>
								</div>
								<div class=" well col-md-12 row" id="ProdArt" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckProdArt" name="myCheckProdArt" onclick="ProdArt(this)">
											<text id="txtProdArt">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Produção Artistica</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="ProdArtMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Criação de Partitura
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Apresentação de Obra Artistica
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Apresentação de programa em Radio ou TV
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Arranjo musical
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Composição musical
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Obra de Artes vizuais
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Sonoplastia
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Trabalho em Arte Cenicas
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Trabalho em Artes Vizuais
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Musica
											</label>
										</div>
									</div>
								</div>
								<div class=" well col-md-12 row" id="Orien" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckOrien" name="myCheckOrien" onclick="Orien(this)">
											<text id="txtOrien">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Orientações e Bancas</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="OrienMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação Mestrado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação Doutorado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação Aperfeicoamento
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação Especialização ou Aperfeiçoamento
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação de Graduação
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Orientação de Iniciação Cientifica
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Mestrado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Doutorado
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Qualificação
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Especialização ou Aperfeiçoamento
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Graduação
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Professor Titular
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Concurso Publico
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Livre-docencia
											</label>
										</div>
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Banca de Avaliação de curso
											</label>
										</div>
									</div>
								</div>
								<div class=" well col-md-12 row" id="Geral" style="background-color: #ffab91">
									<div class="col-md-12 row">
										<div class="col-md-2">
											</br>
											<input type="checkbox" id="myCheckGeral" name="myCheckGeral" onclick="Geral(this)">
											<text id="txtGeral">Desativo</text>
										</div>
										<div class="col-md-6">
											</br>
											<label>Dados Gerais</label>
										</div>
									</div>
									<div class="col-md-12 row well hidden" id="GeralMisto">
										<div class="checkbox col-md-12 row">
											<label>
												<input type="checkbox" value="Graduação"> Graduação
											</label>
										</div>
									</div>
								</div>

								<div div class=" well col-md-12 row">
									<span>Formacao</span>
								</div>


								<div class="col-md-12">
									<a type="button" class="btn btn-default" href="index">Voltar</a>
									<button type="submit" class="btn btn-success">Success</button>
								</div>

							</form>
						</div>


					</jsp:body>



				</tags:padrao>