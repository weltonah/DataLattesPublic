<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<tags:padrao>
 <jsp:body>
	<div class="col-12 align-middle"
   style="height: 100vh; padding-top: 50vh;">
      	
      		<div class="form-group col-6 offset-3 row">
        <form class="form-inline" action="criterio" method="POST">
      
      <div class="col-auto">
      <div class="input-group mb-2 input-group-lg">
        <div class="input-group-prepend">
          <div class="input-group-text" id="inputGroup-sizing-lg">
         <i class="ion-key"></i>
        </div>
        </div>
        <input type="text" id="key" name="key" class="form-control"
        id="inlineFormInputGroup" aria-label="Large" aria-describedby="inputGroup-sizing-sm" placeholder="Chave">
      </div>
    </div>
      
      
      
      
      		    <button type="submit" class="btn btn-primary">Avançar</button>
      	 </form>  
        
        	</div>
      
  	</div>
	</jsp:body>
</tags:padrao>