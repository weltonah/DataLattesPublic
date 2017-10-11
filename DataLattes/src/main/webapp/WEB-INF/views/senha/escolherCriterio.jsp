<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<tags:padrao>	
	<jsp:attribute	name="extraScripts">
		
			
		<script src="<c:url value="/js/escolherCriterio.js" />"></script>
										
	</jsp:attribute>
	
	
	<jsp:body>
	<div class="well col-md-12" style="background-color: #d1c4e9 ">
		<form  action="criterioChave">
		<div class="col-md-12">
			<h2> Selecione os criterios avaliados :</h2>
		</div>
		
		<div class=" well col-md-12 row" id="ano" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckano" name="myCheckano" onclick="ano(this)">
				 <text id="txtano">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Ano de Analise</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="anoMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Ano:</label>
                    </div>
                    <div class="col-md-2">
                        <input type="number" class="form-control">
                    </div>
                    
				</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="Doutor" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckDoutor" name="myCheckDoutor" onclick="Doutor(this)">
				 <text id="txtDoutor">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Possui Doutorado</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="DoutorMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>doutorado:</label>
                    </div>
                    <div class="col-md-2">
                        <input type="number" class="form-control">
                    </div>
                    
				</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="dedicacaoExclusiva" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckdedicacaoExclusiva" name="myCheckdedicacaoExclusiva" onclick="dedicacaoExclusiva(this)">
				 <text id="txtdedicacaoExclusiva">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Dedicação exclusiva</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="dedicacaoExclusivaMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>dedicação exclusiva:</label>
                    </div>
                    <div class="col-md-2">
                        <input type="number" class="form-control">
                    </div>
                    
				</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="artCompPerioInd" style="background-color: #ffab91">
			<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckartCompPerioInd" onclick="artCompPerioInd(this)"> <text id="txtartCompPerioInd">Desativo</text>
			</div>
			<div class="col-md-6">
				<label>Criterio:</label></br>	
				<label>Artigos completos em periódico indexados</label>
			</div>
			
			<div class="col-md-4 ">
			<fieldset id="artCompPerioInd" disabled>
				<div class=" row">
				<div class="col-sx-6">
					<label>Valor</label>
				    <input type="number" class="form-control">
				</div>
				<div class="col-sx-6">
					<label>Maximo de artigos contabilizado(opicional):</label>
				    <input type="number" class="form-control">
				</div>
			  	</div>
			</fieldset>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="artCompAceitoPublic" style="background-color: #ffab91">
			<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckartCompAceitoPublic" onclick="artCompAceitoPublic(this)"> <text id="txtartCompAceitoPublic">Desativo</text>
			</div>
			<div class="col-md-6">
				<label>Criterio:</label></br>	
				<label>Artigos completos aceitos para publicação</label>
			</div>
			
			<div class="col-md-4 ">
			<fieldset id="artCompAceitoPublic" disabled>
				<div class=" row">
				<div class="col-sx-6">
					<label>Valor</label>
				    <input type="number" class="form-control">
				</div>
				<div class="col-sx-6">
					<label>Maximo de artigos contabilizado(opicional):</label>
				    <input type="number" class="form-control">
				</div>
			  	</div>
			</fieldset>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="livro" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myChecklivro" name="myChecklivro" onclick="livro(this)">
				 <text id="txtlivro">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Livros publicados</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="livroMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>Maximo:</label>
                    </div>
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>livros:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="capLivro" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckcapLivro" name="myCheckcapLivro" onclick="capLivro(this)">
				 <text id="txtcapLivro">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>capitulos de livros</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="capLivroMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>Maximo:</label>
                    </div>
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>capitulos:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="orgLivro" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckorgLivro" name="myCheckorgLivro" onclick="orgLivro(this)">
				 <text id="txtorgLivro">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Organização de livro</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="orgLivroMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>Maximo:</label>
                    </div>
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>livros organizados:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
			</div>
		</div>
			
		<div class=" well col-md-12 row" id="trabEvento" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myChecktrabEvento" name="myChecktrabEvento" onclick="trabEvento(this)"> <text id="txttrabEvento">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>trabEventos publicados</label>
				</div>
			</div>
			<div class="hidden" id="trabEventoCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="TrabRadio" id="TrabRadio" value="1" onclick="trabEventoMisto(this)" disabled>
				    Trabalho misto
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="TrabMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Completo:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoComple">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Resumo:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="TrabRadio" id="TrabRadio1" onclick="trabEventoSeparado(this)" disabled>
				    Trabalho separado
				</label>
				</div>
				<div class="col-md-12 hidden" id="TrabNacInte">
					<h3> trabalhos nacionais</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Completo:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Resumo:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> trabalhos Internacionais</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Completo:</label>
							</div>
							
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Resumo:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="depPatente" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckdepPatente" name="myCheckdepPatente" onclick="depPatente(this)">
				 <text id="txtdepPatente">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Patente publicados</label>
				</div>
			</div>
			<div class="hidden" id="depPatenteCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="PatRadio" id="PatRadio" value="1" onclick="PatenteMisto(this)" disabled>
				    Patente misto
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="PateMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="PatRadio" id="PatRadio1" value="2" onclick="PatenteSeparado(this)" disabled>
				    Patente separado
				</label>
				</div>
				<div class="col-md-12 hidden" id="PateNacInte">
					<h3> Patente nacionais</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Patente:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Patente Internacionais</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="BancMest" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckBancMest" name="myCheckBancMest" onclick="BancMest(this)">
				 <text id="txtBancMest">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Banca Mestrado publicados</label>
				</div>
			</div>
			<div class="hidden" id="BancMestCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancMestRadio" id="BancMestRadio" value="1" onclick="BancMestMisto(this)" disabled>
				    Banca Mestrado
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="BancMestMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancMestRadio" id="BancMestRadio1" value="2" onclick="BancMestSeparado(this)" disabled>
				    Banca Mestrado Separada
				</label>
				</div>
				<div class="col-md-12 hidden" id="BancMestNacInte">
					<h3> Banca Mestrado interna</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Patente:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Banca Mestrado externa</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="BancDout" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckBancDout" name="myCheckBancDout" onclick="BancDout(this)">
				 <text id="txtBancDout">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Banca Doutorado publicados</label>
				</div>
			</div>
			<div class="hidden" id="BancDoutCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancDoutRadio" id="BancDoutRadio" value="1" onclick="BancDoutMisto(this)" disabled>
				    Banca Doutorado misto
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="BancDoutMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancDoutRadio" id="BancDoutRadio1" value="2" onclick="BancDoutSeparado(this)" disabled>
				    Banca Doutorado separado
				</label>
				</div>
				<div class="col-md-12 hidden" id="BancDoutNacInte">
					<h3> Banca Doutorado interna</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Patente:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Banca Doutorado externa</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="BancQualDout" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckBancQualDout" name="myCheckBancQualDout" onclick="BancQualDout(this)">
				 <text id="txtBancQualDout">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Banca de Qualificação de Doutorado</label>
				</div>
			</div>
			<div class="hidden" id="BancQualDoutCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancQualDoutRadio" id="BancQualDoutRadio" value="1" onclick="BancQualDoutMisto(this)" disabled>
				    Banca de Qualificação de Doutorado misto
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="BancQualDoutMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="BancQualDoutRadio" id="BancQualDoutRadio1" value="2" onclick="BancQualDoutSeparado(this)" disabled>
				    Banca de Qualificação de Doutorado separado
				</label>
				</div>
				<div class="col-md-12 hidden" id="BancQualDoutNacInte">
					<h3> Banca de Qualificação de Doutorado interna</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Patente:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Banca de Qualificação de Doutorado externa</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Patente:</label>
							</div>
							<div class="col-md-4 row">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="OriDout" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckOriDout" name="myCheckOriDout" onclick="OriDout(this)">
				 <text id="txtOriDout">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Orientação de Doutorado</label>
				</div>
			</div>
			<div class="hidden" id="OriDoutCaixa">
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="checkbox" name="OriDoutcheck" id="OriDoutcheck" value="1" onclick="OriDoutMisto(this)" disabled>
				    Orientação em andamento
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="OriDoutMisto">
                <h3> Orientação em andamento</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Orientação:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Coorientação em andamento</h3>
					<div class="col-md-12 row well">
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
                            <div class="col-md-2">
                                <label>Coorientação:</label>
                            </div>
                            <div class="col-md-4 row">
                            <fieldset  id="trabEventoMistoResumo">
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                            </fieldset>
                            </div>
                        </div>
					</div>
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="checkbox" name="OriDoutcheck" id="OriDoutcheck1" value="2" onclick="OriDoutSeparado(this)" disabled>
				    Orientação concluida
				</label>
				</div>
				<div class="col-md-12 hidden" id="OriDoutNacInte">
					<h3> Orientação concluida</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Orientação:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Coorientação concluida</h3>
					<div class="col-md-12 row well">
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
                            <div class="col-md-2">
                                <label>Coorientação:</label>
                            </div>
                            <div class="col-md-4 row">
                            <fieldset  id="trabEventoMistoResumo">
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                            </fieldset>
                            </div>
                        </div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="OriMest" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckOriMest" name="myCheckOriMest" onclick="OriMest(this)">
				 <text id="txtOriMest">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Orientação de mestrado</label>
				</div>
			</div>
			
			<div class="hidden" id="OriMestCaixa">
			
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="checkbox" name="OriMestcheck" id="OriMestcheck" value="1" onclick="OriMestMisto(this)" disabled>
				    Orientação em andamento
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="OriMestMisto">
                <h3> Orientação em andamento</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Orientação:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Coorientação em andamento</h3>
					<div class="col-md-12 row well">
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
                            <div class="col-md-2">
                                <label>Coorientação:</label>
                            </div>
                            <div class="col-md-4 row">
                            <fieldset  id="trabEventoMistoResumo">
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                            </fieldset>
                            </div>
                        </div>
					</div>
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="checkbox" name="OriMestcheck" id="OriMestcheck1" value="2" onclick="OriMestSeparado(this)" disabled>
				    Orientação concluida
				</label>
				</div>
				<div class="col-md-12 hidden" id="OriMestNacInte">
					<h3> Orientação concluida</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Orientação:</label>
								</div>
								<div class="col-md-4 row">
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
									<div class="col-md-6">
									    <input type="number" class="form-control">
									</div>
								</div>
						</div>
					</div>
						
					<h3> Coorientação concluida</h3>
					<div class="col-md-12 row well">
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
                            <div class="col-md-2">
                                <label>Coorientação:</label>
                            </div>
                            <div class="col-md-4 row">
                            <fieldset  id="trabEventoMistoResumo">
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                            </fieldset>
                            </div>
                        </div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="ProdArt" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckProdArt" name="myCheckProdArt" onclick="ProdArt(this)">
				 <text id="txtProdArt">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Produção artistica</label>
				</div>
			</div>
			
			<div class="hidden" id="ProdArtCaixa">
			
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="ProdArtRadio" id="ProdArtRadio" value="1" onclick="ProdArtMisto(this)" disabled>
				    Produção artistica misto
				</label>
				</div>
				<div class="col-md-12 row well hidden" id="ProdArtMisto">
				
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
					</div>
					<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Produção individual:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
                    <div class="col-md-12 row">
							<div class="col-md-2">
								<label>Produção Coletiva:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
					</div>
				
				</div>
			</div>
			
			<div class="col-md-12 row well">
				<div class="col-md-12">
				<label>
				    <input type="radio" name="ProdArtRadio" id="ProdArtRadio1" value="2" onclick="ProdArtSeparado(this)" disabled>
				    Produção artistica separada
				</label>
				</div>
				<div class="col-md-12 hidden" id="ProdArtNacInte">
					<h3> Produção artistica nacional</h3>
					<div class="col-md-12 row well">
						
						<div class="col-md-12 row">
								<div class="col-md-2">
									<label>Tipo:</label>
								</div>
								
								<div class="col-md-2">
									<label>Maximo:</label>
								</div>
								<div class="col-md-2">
									<label>valor:</label>
								</div>
						</div>
						<div class="col-md-12 row">
                        <div class="col-md-2">
                            <label>Produção individual:</label>
                        </div>
                        <div class="col-md-4 row">
                        <fieldset  id="trabEventoMistoResumo">
                            <div class="col-md-6">
                                <input type="number" class="form-control">
                            </div>
                            <div class="col-md-6">
                                <input type="number" class="form-control">
                            </div>
                        </fieldset>
                    </div>
                    </div>
                    <div class="col-md-12 row">
                            <div class="col-md-2">
                                <label>Produção Coletiva:</label>
                            </div>
                            <div class="col-md-4 row">
                            <fieldset  id="trabEventoMistoResumo">
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <input type="number" class="form-control">
                                </div>
                            </fieldset>
                            </div>
                    </div>
					</div>
						
					<h3> Produção Artistica Internacional</h3>
					<div class="col-md-12 row well">
					
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Tipo:</label>
							</div>
							<div class="col-md-2">
								<label>Maximo:</label>
							</div>
							<div class="col-md-2">
								<label>valor:</label>
							</div>
						</div>
						<div class="col-md-12 row">
							<div class="col-md-2">
								<label>Produção individual:</label>
							</div>
							<div class="col-md-4 row">
							<fieldset  id="trabEventoMistoResumo">
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
								<div class="col-md-6">
								    <input type="number" class="form-control">
								</div>
							</fieldset>
							</div>
                        </div>
                        <div class="col-md-12 row">
                                <div class="col-md-2">
                                    <label>Produção Coletiva:</label>
                                </div>
                                <div class="col-md-4 row">
                                <fieldset  id="trabEventoMistoResumo">
                                    <div class="col-md-6">
                                        <input type="number" class="form-control">
                                    </div>
                                    <div class="col-md-6">
                                        <input type="number" class="form-control">
                                    </div>
                                </fieldset>
                                </div>
                        </div>
						
					</div>
				</div>
			</div>
		
			</div>
		</div>
		
		<div class=" well col-md-12 row" id="OriTCC" style="background-color: #ffab91">
			
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckOriTCC" name="myCheckOriTCC" onclick="OriTCC(this)">
				 <text id="txtOriTCC">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Orientação Trabalho de conclusão de curso</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="OriTCCMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>Maximo:</label>
                    </div>
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Concluida:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
			</div>
		</div>
		
		<div class="well col-md-12 row" id="OriIC" style="background-color: #ffab91">
			<div class="col-md-12 row">
				<div class="col-md-2">
				<label>Estado:</label></br>
				<input type="checkbox" id="myCheckOriIC" name="myCheckOriIC" onclick="OriIC(this)">
				 <text id="txtOriIC">Desativo</text>
				</div>
				<div class="col-md-6">
					<label>Criterio:</label></br>	
					<label>Orientação de iniciação cientifica</label>
				</div>
			</div>
			<div class="col-md-12 row well hidden" id="OriICMisto">
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Tipo:</label>
                    </div>
                    
                    <div class="col-md-2">
                        <label>Maximo:</label>
                    </div>
                    <div class="col-md-2">
                        <label>valor:</label>
                    </div>
				</div>
				<div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Andamento:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
                   <div class="col-md-12 row">
                    <div class="col-md-2">
                        <label>Concluida:</label>
                    </div>
                    <div class="col-md-4 row">
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                        <div class="col-md-6">
                            <input type="number" class="form-control">
                        </div>
                    </div>
				</div>
			</div>
		</div>
		
		<div class="col-md-12">
			<a type="button" class="btn btn-default" href="index">Voltar</a>
			<button type="submit" class="btn btn-success">Success</button>
		</div>
		
		</form>
	</div>
	
	
	</jsp:body>
	
	
	
</tags:padrao>