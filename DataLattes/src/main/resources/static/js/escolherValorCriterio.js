		function ano() {var x = document.getElementById("myCheckano").checked;
		if (x) {
		    document.getElementById("txtano").innerHTML="Ativado";
		    document.getElementById("anoMisto").classList.remove("hidden");
		    document.getElementById("ano").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtano").innerHTML="Desativado";
		    document.getElementById("anoMisto").classList.add("hidden");
		    document.getElementById("ano").style.backgroundColor = "#ffab91";
		}}	
		function dedicacaoExclusiva() {var x = document.getElementById("myCheckdedicacaoExclusiva").checked;
		if (x) {
		    document.getElementById("txtdedicacaoExclusiva").innerHTML="Ativado";
		    document.getElementById("dedicacaoExclusivaMisto").classList.remove("hidden");
		    document.getElementById("dedicacaoExclusiva").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtdedicacaoExclusiva").innerHTML="Desativado";
		    document.getElementById("dedicacaoExclusivaMisto").classList.add("hidden");
		    document.getElementById("dedicacaoExclusiva").style.backgroundColor = "#ffab91";
		}}	
		function Doutor() {var x = document.getElementById("myCheckDoutor").checked;
		if (x) {
		    document.getElementById("txtDoutor").innerHTML="Ativado";
		    document.getElementById("DoutorMisto").classList.remove("hidden");
		    document.getElementById("Doutor").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtDoutor").innerHTML="Desativado";
		    document.getElementById("DoutorMisto").classList.add("hidden");
		    document.getElementById("Doutor").style.backgroundColor = "#ffab91";
		}}	
		function Especializacao() {var x = document.getElementById("myCheckEspecializacao").checked;
		if (x) {
		    document.getElementById("txtEspecializacao").innerHTML="Ativado";
		    document.getElementById("EspecializacaoMisto").classList.remove("hidden");
		    document.getElementById("Especializacao").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtEspecializacao").innerHTML="Desativado";
		    document.getElementById("EspecializacaoMisto").classList.add("hidden");
		    document.getElementById("Especializacao").style.backgroundColor = "#ffab91";
		}}	
		function artCompPerioInd() {var x = document.getElementById("myCheckartCompPerioInd").checked;
			if (x) {
				document.getElementById("txtartCompPerioInd").innerHTML="Ativado";
				document.getElementById("artCompPerioInd").removeAttribute("disabled");
				document.getElementById("artCompPerioInd").style.backgroundColor = "#a5d6a7 ";
			}else{
				document.getElementById("txtartCompPerioInd").innerHTML="Desativado";
				document.getElementById("artCompPerioInd").setAttribute("disabled", "false");
				document.getElementById("artCompPerioInd").style.backgroundColor = "#ffab91";
			}}
		function artCompAceitoPublic() {var x = document.getElementById("myCheckartCompAceitoPublic").checked;
			if (x) {
				document.getElementById("txtartCompAceitoPublic").innerHTML="Ativado";
				document.getElementById("artCompAceitoPublic").removeAttribute("disabled");
				document.getElementById("artCompAceitoPublic").style.backgroundColor = "#a5d6a7 ";
			}else{
				document.getElementById("txtartCompAceitoPublic").innerHTML="Desativado";
				document.getElementById("artCompAceitoPublic").setAttribute("disabled", "false");
				document.getElementById("artCompAceitoPublic").style.backgroundColor = "#ffab91";
			}}
		function livro() {var x = document.getElementById("myChecklivro").checked;
		if (x) {
		    document.getElementById("txtlivro").innerHTML="Ativado";
		    document.getElementById("livroMisto").classList.remove("hidden");
		    document.getElementById("livro").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtlivro").innerHTML="Desativado";
		    document.getElementById("livroMisto").classList.add("hidden");
		    document.getElementById("livro").style.backgroundColor = "#ffab91";
		}}	
		function capLivro() {var x = document.getElementById("myCheckcapLivro").checked;
		if (x) {
		    document.getElementById("txtcapLivro").innerHTML="Ativado";
		    document.getElementById("capLivroMisto").classList.remove("hidden");
		    document.getElementById("capLivro").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtcapLivro").innerHTML="Desativado";
		    document.getElementById("capLivroMisto").classList.add("hidden");
		    document.getElementById("capLivro").style.backgroundColor = "#ffab91";
		}}	
		function orgLivro() {var x = document.getElementById("myCheckorgLivro").checked;
		if (x) {
		    document.getElementById("txtorgLivro").innerHTML="Ativado";
		    document.getElementById("orgLivroMisto").classList.remove("hidden");
		    document.getElementById("orgLivro").style.backgroundColor = "#a5d6a7 ";
		}else{
		    document.getElementById("txtorgLivro").innerHTML="Desativado";
		    document.getElementById("orgLivroMisto").classList.add("hidden");
		    document.getElementById("orgLivro").style.backgroundColor = "#ffab91";
		}}	
		function trabEvento() {var x = document.getElementById("myChecktrabEvento").checked;
			if (x) {
				document.getElementById("txttrabEvento").innerHTML="Ativado";
				document.getElementById("TrabRadio").removeAttribute("disabled");
				document.getElementById("TrabRadio1").removeAttribute("disabled");
				document.getElementById("trabEventoCaixa").classList.remove("hidden");
				document.getElementById("trabEvento").style.backgroundColor = "#a5d6a7 ";
			}else{
				document.getElementById("txttrabEvento").innerHTML="Desativado";
				document.getElementById("TrabRadio").setAttribute("disabled", "false");
				document.getElementById("TrabRadio1").setAttribute("disabled", "false");
				document.getElementById("TrabRadio").checked = false;
				document.getElementById("TrabRadio1").checked = false;
				document.getElementById("TrabMisto").classList.add("hidden");
			    document.getElementById("TrabNacInte").classList.add("hidden");
			    document.getElementById("trabEventoCaixa").classList.add("hidden");
			    document.getElementById("trabEvento").style.backgroundColor = "#ffab91";
			}}
		
		function trabEventoMisto() {
		    document.getElementById("TrabMisto").classList.remove("hidden");
		    document.getElementById("TrabNacInte").classList.add("hidden");
		}
		
		function trabEventoSeparado() {
		    document.getElementById("TrabMisto").classList.add("hidden");
		    document.getElementById("TrabNacInte").classList.remove("hidden");
		}
		function depPatente() {var x = document.getElementById("myCheckdepPatente").checked;
		if (x) {
			document.getElementById("txtdepPatente").innerHTML="Ativado";
			document.getElementById("PatRadio").removeAttribute("disabled");
			document.getElementById("PatRadio1").removeAttribute("disabled");
			document.getElementById("depPatenteCaixa").classList.remove("hidden");
			document.getElementById("depPatente").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtdepPatente").innerHTML="Desativado";
			document.getElementById("PatRadio").setAttribute("disabled", "false");
			document.getElementById("PatRadio1").setAttribute("disabled", "false");
			document.getElementById("PatRadio").checked = false;
			document.getElementById("PatRadio1").checked = false;
			document.getElementById("PateMisto").classList.add("hidden");
		    document.getElementById("PateNacInte").classList.add("hidden");
		    document.getElementById("depPatenteCaixa").classList.add("hidden");
		    document.getElementById("depPatente").style.backgroundColor = "#ffab91";
		}}
	
		function PatenteMisto() {
		    document.getElementById("PateMisto").classList.remove("hidden");
		    document.getElementById("PateNacInte").classList.add("hidden");
		}
		
		function PatenteSeparado() {
		    document.getElementById("PateMisto").classList.add("hidden");
		    document.getElementById("PateNacInte").classList.remove("hidden");
		}
		function BancMest() {var x = document.getElementById("myCheckBancMest").checked;
		if (x) {
			document.getElementById("txtBancMest").innerHTML="Ativado";
			document.getElementById("BancMestRadio").removeAttribute("disabled");
			document.getElementById("BancMestRadio1").removeAttribute("disabled");
			document.getElementById("BancMestCaixa").classList.remove("hidden");
			document.getElementById("BancMest").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtBancMest").innerHTML="Desativado";
			document.getElementById("BancMestRadio").setAttribute("disabled", "false");
			document.getElementById("BancMestRadio1").setAttribute("disabled", "false");
			document.getElementById("BancMestRadio").checked = false;
			document.getElementById("BancMestRadio1").checked = false;
			document.getElementById("BancMestMisto").classList.add("hidden");
		    document.getElementById("BancMestNacInte").classList.add("hidden");
		    document.getElementById("BancMestCaixa").classList.add("hidden");
		    document.getElementById("BancMest").style.backgroundColor = "#ffab91";
		}}
		function BancMestMisto() {
		    document.getElementById("BancMestMisto").classList.remove("hidden");
		    document.getElementById("BancMestNacInte").classList.add("hidden");
		}
		
		function BancMestSeparado() {
		    document.getElementById("BancMestMisto").classList.add("hidden");
		    document.getElementById("BancMestNacInte").classList.remove("hidden");
        }
			
		function BancDout() {var x = document.getElementById("myCheckBancDout").checked;
		if (x) {
			document.getElementById("txtBancDout").innerHTML="Ativado";
			document.getElementById("BancDoutRadio").removeAttribute("disabled");
			document.getElementById("BancDoutRadio1").removeAttribute("disabled");
			document.getElementById("BancDoutCaixa").classList.remove("hidden");
			document.getElementById("BancDout").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtBancDout").innerHTML="Desativado";
			document.getElementById("BancDoutRadio").setAttribute("disabled", "false");
			document.getElementById("BancDoutRadio1").setAttribute("disabled", "false");
			document.getElementById("BancDoutRadio").checked = false;
			document.getElementById("BancDoutRadio1").checked = false;
			document.getElementById("BancDoutMisto").classList.add("hidden");
		    document.getElementById("BancDoutNacInte").classList.add("hidden");
		    document.getElementById("BancDoutCaixa").classList.add("hidden");
		    document.getElementById("BancDout").style.backgroundColor = "#ffab91";
		}}
		function BancDoutMisto() {
		    document.getElementById("BancDoutMisto").classList.remove("hidden");
		    document.getElementById("BancDoutNacInte").classList.add("hidden");
		}
		
		function BancDoutSeparado() {
		    document.getElementById("BancDoutMisto").classList.add("hidden");
		    document.getElementById("BancDoutNacInte").classList.remove("hidden");
	    }	
			
		function BancQualDout() {var x = document.getElementById("myCheckBancQualDout").checked;
		if (x) {
			document.getElementById("txtBancQualDout").innerHTML="Ativado";
			document.getElementById("BancQualDoutRadio").removeAttribute("disabled");
			document.getElementById("BancQualDoutRadio1").removeAttribute("disabled");
			document.getElementById("BancQualDoutCaixa").classList.remove("hidden");
			document.getElementById("BancQualDout").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtBancQualDout").innerHTML="Desativado";
			document.getElementById("BancQualDoutRadio").setAttribute("disabled", "false");
			document.getElementById("BancQualDoutRadio1").setAttribute("disabled", "false");
			document.getElementById("BancQualDoutRadio").checked = false;
			document.getElementById("BancQualDoutRadio1").checked = false;
			document.getElementById("BancQualDoutMisto").classList.add("hidden");
		    document.getElementById("BancQualDoutNacInte").classList.add("hidden");
		    document.getElementById("BancQualDoutCaixa").classList.add("hidden");
		    document.getElementById("BancQualDout").style.backgroundColor = "#ffab91";
		}}
	
		function BancQualDoutMisto() {
		    document.getElementById("BancQualDoutMisto").classList.remove("hidden");
		    document.getElementById("BancQualDoutNacInte").classList.add("hidden");
		}
		
		function BancQualDoutSeparado() {
		    document.getElementById("BancQualDoutMisto").classList.add("hidden");
		    document.getElementById("BancQualDoutNacInte").classList.remove("hidden");
	    }
		
    
        function OriDout() {var x = document.getElementById("myCheckOriDout").checked;
        if (x) {
            document.getElementById("txtOriDout").innerHTML="Ativado";
            document.getElementById("OriDoutcheck").removeAttribute("disabled");
            document.getElementById("OriDoutcheck1").removeAttribute("disabled");
            document.getElementById("OriDoutCaixa").classList.remove("hidden");
            document.getElementById("OriDout").style.backgroundColor = "#a5d6a7 ";
        }else{
            document.getElementById("txtOriDout").innerHTML="Desativado";
            document.getElementById("OriDoutcheck").setAttribute("disabled", "false");
            document.getElementById("OriDoutcheck1").setAttribute("disabled", "false");
            document.getElementById("OriDoutcheck").checked = false;
            document.getElementById("OriDoutcheck1").checked = false;
            document.getElementById("OriDoutMisto").classList.add("hidden");
            document.getElementById("OriDoutNacInte").classList.add("hidden");
            document.getElementById("OriDoutCaixa").classList.add("hidden");
            document.getElementById("OriDout").style.backgroundColor = "#ffab91";
        }}
    
        function OriDoutMisto() {var x = document.getElementById("OriDoutcheck").checked;
        if (!x) {
            document.getElementById("OriDoutMisto").classList.add("hidden");
        }else{
            document.getElementById("OriDoutMisto").classList.remove("hidden");
        }}
        
        function OriDoutSeparado() {var x = document.getElementById("OriDoutcheck1").checked;
        if (!x) {
            document.getElementById("OriDoutNacInte").classList.add("hidden");
        }else{
            document.getElementById("OriDoutNacInte").classList.remove("hidden")
        }}
        function OriMest() {var x = document.getElementById("myCheckOriMest").checked;
        if (x) {
            document.getElementById("txtOriMest").innerHTML="Ativado";
            document.getElementById("OriMestcheck").removeAttribute("disabled");
            document.getElementById("OriMestcheck1").removeAttribute("disabled");
            document.getElementById("OriMestCaixa").classList.remove("hidden");
            document.getElementById("OriMest").style.backgroundColor = "#a5d6a7 ";
        }else{
            document.getElementById("txtOriMest").innerHTML="Desativado";
            document.getElementById("OriMestcheck").setAttribute("disabled", "false");
            document.getElementById("OriMestcheck1").setAttribute("disabled", "false");
            document.getElementById("OriMestcheck").checked = false;
            document.getElementById("OriMestcheck1").checked = false;
            document.getElementById("OriMestMisto").classList.add("hidden");
            document.getElementById("OriMestNacInte").classList.add("hidden");
            document.getElementById("OriMestCaixa").classList.add("hidden");
            document.getElementById("OriMest").style.backgroundColor = "#ffab91";
        }}
    
	    function OriMestMisto() {var x = document.getElementById("OriMestcheck").checked;
	    if (!x) {
	        document.getElementById("OriMestMisto").classList.add("hidden");
	    }else{
	        document.getElementById("OriMestMisto").classList.remove("hidden");
	    }}
	    
	    function OriMestSeparado() {var x = document.getElementById("OriMestcheck1").checked;
	    if (!x) {
	        document.getElementById("OriMestNacInte").classList.add("hidden");
	    }else{
	        document.getElementById("OriMestNacInte").classList.remove("hidden")
	    }}
	    
	    
	    function ProdArt() {var x = document.getElementById("myCheckProdArt").checked;
		if (x) {
			document.getElementById("txtProdArt").innerHTML="Ativado";
			document.getElementById("ProdArtRadio").removeAttribute("disabled");
			document.getElementById("ProdArtRadio1").removeAttribute("disabled");
			document.getElementById("ProdArtCaixa").classList.remove("hidden");
			document.getElementById("ProdArt").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtProdArt").innerHTML="Desativado";
			document.getElementById("ProdArtRadio").setAttribute("disabled", "false");
			document.getElementById("ProdArtRadio1").setAttribute("disabled", "false");
			document.getElementById("ProdArtRadio").checked = false;
			document.getElementById("ProdArtRadio1").checked = false;
			document.getElementById("ProdArtMisto").classList.add("hidden");
		    document.getElementById("ProdArtNacInte").classList.add("hidden");
		    document.getElementById("ProdArtCaixa").classList.add("hidden");
		    document.getElementById("ProdArt").style.backgroundColor = "#ffab91";
		}}
	
		function ProdArtMisto() {
		    document.getElementById("ProdArtMisto").classList.remove("hidden");
		    document.getElementById("ProdArtNacInte").classList.add("hidden");
		}
		
		function ProdArtSeparado() {
		    document.getElementById("ProdArtMisto").classList.add("hidden");
		    document.getElementById("ProdArtNacInte").classList.remove("hidden");
	    }
		
		function OriTCC() {var x = document.getElementById("myCheckOriTCC").checked;
		if (x) {
			document.getElementById("txtOriTCC").innerHTML="Ativado";
			document.getElementById("OriTCCMisto").classList.remove("hidden");
	        document.getElementById("OriTCC").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtOriTCC").innerHTML="Desativado";
			document.getElementById("OriTCCMisto").classList.add("hidden");
	        document.getElementById("OriTCC").style.backgroundColor = "#ffab91";
		}}	
		
		function OriIC() {var x = document.getElementById("myCheckOriIC").checked;
		if (x) {
			document.getElementById("txtOriIC").innerHTML="Ativado";
			document.getElementById("OriICMisto").classList.remove("hidden");
		    document.getElementById("OriIC").style.backgroundColor = "#a5d6a7 ";
		}else{
			document.getElementById("txtOriIC").innerHTML="Desativado";
			document.getElementById("OriICMisto").classList.add("hidden");
		    document.getElementById("OriIC").style.backgroundColor = "#ffab91";
		}}