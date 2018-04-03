<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib	tagdir="/WEB-INF/tags"	prefix="tags"%>

<tags:padrao>
<jsp:attribute	name="extraScripts">
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
  
  
  <div class="form-group col-8 offset-2 row alert alert-light" style="background-color: white;" >
        <div class=" col-12 w-100">
        <form method="post" action="analise" enctype="multipart/form-data">
                    <h3 style="color: black;">Upload do arquivo lattes formato .zip ou .xml:</h3> <br>
                     <div class="input-group w-100">
                     
                        <label style="margin: 0px;">
                            <span class="btn btn-warning ">
                                <span class="ion-android-upload" aria-hidden="true"></span>
                               Selecione o arquivo&hellip; <input type="file" accept=".zip, .xml" name="file" style="display: none;" >
                            </span>
                        </label>
                        <input type="text" class="form-control form-control-sm" readonly>
                    </div>
                    <br>
                    <a href="infoXML"><u>Não sei o que é o arquivo .zip ou .xml</u></a>
                <br><br>
                <div align="right">
                    <a href="javascript: window.history.go(-1)" class="btn btn-outline-dark">Voltar</a>
                    <button type="submit" class="btn btn-primary">Analisar</button>
                </div>
                </form>
         </div>
         </div>
        
        </div>
	</jsp:body>
</tags:padrao>