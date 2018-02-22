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
   style="height: 100vh; padding-top: 50vh;">
      		<div class="form-group col-6 offset-3 row">
        <form method="post" action="criterio" enctype="multipart/form-data">
                    <h3>Selecione a Chave:</h3> 
                     <div class="input-group">
                        <label style="margin: 0px;">
                            <span class="btn btn-primary ">
                                <span class="ion-android-upload" aria-hidden="true"></span>
                                Selecione o arquivo&hellip; <input type="file" accept=".Dtkey" name="file" style="display: none;" >
                            </span>
                        </label>
                        <input type="text" class="form-control form-control-sm" readonly>
                    </div>
                <br><br>
                <div align="right">
                    <a href="inserirChave" class="btn btn-danger">Voltar</a>
                    <button type="submit" class="btn btn-success">Analisar</button>
                </div>
                </form>
        	</div>
  	</div>
	</jsp:body>
</tags:padrao>