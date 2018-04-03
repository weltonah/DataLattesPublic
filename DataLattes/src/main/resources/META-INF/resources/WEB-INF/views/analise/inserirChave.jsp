<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<tags:padrao>
 <jsp:attribute name="extraScripts">
<script>
	$(function() {
	        // We can attach the `fileselect` event to all file inputs on the page
	        $(document).on('change', ':file', function() {
	          var input = $(this),
	              numFiles = input.get(0).files ? input.get(0).files.length : 1,
	              label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
	          input.trigger('fileselect', [numFiles, label]);
	        });
	
	        // We can watch for our custom `fileselect` event like this
	        $(document).ready( function() {
	            $(':file').on('fileselect', function(event, numFiles, label) {
	
	                var input = $(this).parents('.input-group').find(':text'),
	                    log = numFiles > 1 ? numFiles + ' files selected' : label;
	
	                if( input.length ) {
	                    input.val(log);
	                } else {
	                    if( log ) alert(log);
	                }
	
	            });
	        });
	       
	});

</script>
</jsp:attribute>
 <jsp:body>
	<div class="col-12 align-middle"
   style="height: 70vh; padding-top: 30vh;">
   
   
      		<div class="form-group col-8 offset-2 row alert alert-dark" style="background-color: #fff">
        <div class=" col-12 w-100">
        <form method="post" action="criterio" class="needs-validation" enctype="multipart/form-data">
                    <h3>Selecione o arquivo Chave:</h3> <br>
                     <div class="input-group w-100 ">
                     
                        <label  style="margin: 0px;">
                            <span class="btn btn-warning ">
                                <span class="ion-android-upload" aria-hidden="true"></span>
                                Buscar chave&hellip; <input type="file"  accept=".Dtkey" name="file" style="display: none;" required>
                            </span>
                        </label>
                        <input type="text" class="form-control form-control-sm" readonly>
                    </div>
                    <br>
                    <a href="infoChave"><u>Não sei o que é o arquivo de Chave.</u></a>
                <br><br>
                <div align="right">
                    <a href="index" class="btn btn-outline-dark">Voltar</a>
                    <button type="submit" class="btn btn-primary">Analisar</button>
                </div>
                </form>
        	</div>
        	</div>
  	</div>
	</jsp:body>
</tags:padrao>