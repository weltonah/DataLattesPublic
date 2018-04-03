<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>

<tags:padrao>	
	<jsp:body>
  <div class="col-12">
    <div class="alert alert-danger" role="alert">
       <h4 class="alert-heading">Versão Teste</h4>
       <p> Projeto em desenvolvimento, pode apresentar erros.
       </p>
       </div>
    </div>
    
 
	<div class="col-12 align-middle" style="height: 50vh; padding-top: 20vh;" >

	  <div class="col-6 offset-3 row">
	  	<a href="escolherCriterio" id="criarSenha" role="button" class="btn btn-outline-dark btn-lg btn-block">Criar chave </a>
	  	<a href="inserirChave" role="button" class="btn btn-primary btn-lg btn-block">Utilizar chave </a>
	  </div>
  	</div>
  
	</jsp:body>
</tags:padrao>