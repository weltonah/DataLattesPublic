function formacaoStatus() {
	var x = document.getElementById("myCheckFormacaoStatus").checked;
	var inputs = document.querySelectorAll(".FormacaoTipoIndex1");
	var xx = document.querySelectorAll(".FormacaoTipoIndex0");
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}

	}
}
function FormacaoItemStatus(item) {
	var x = document.getElementById("myCheckFormacaoItemStatus"+item).checked;
	var inputs = document.querySelectorAll(".FormacaoTipo1tt"+item);
	var xx = document.querySelectorAll(".FormacaoTipo0tt"+item);
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}

	}
}
function FormacaoItemLimite(item) {
	var x = document.getElementById("myCheckFormacaoItemLimite"+item).checked;
	var inputs = document.querySelectorAll(".Formacaolimite"+item);
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}
function formacaoLimite() {
	var x = document.getElementById("myCheckFormacaoLimite").checked;
	var inputs = document.querySelectorAll(".formacaolimiteGeral");
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}






function ProdBibliLimite() {
	var x = document.getElementById("myCheckProdBibliLimite").checked;
	var inputs = document.querySelectorAll('.ProdBiblivalorlimite');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}

function TrabNacInter() {
	var x = document.getElementById("myCheckTrabNacInter").checked;
	var inputs = document.querySelectorAll('.TrabSepNacInter');
	var xx = document.querySelectorAll('.TrabNacInter');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}
	}
}
function PatenteNacInter() {
	var x = document.getElementById("myCheckPatenteNacInter").checked;
	var inputs = document.querySelectorAll('.PatenteSepNacInter');
	var xx = document.querySelectorAll('.PatenteNacInter');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");
			
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}
	}
}

function ProdTecLimite() {
	var x = document.getElementById("myCheckProdTecLimite").checked;
	var inputs = document.querySelectorAll('.ProdTecvalorlimite');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}


function ProdArtLimite() {
	var x = document.getElementById("myCheckProdArtLimite").checked;
	var inputs = document.querySelectorAll('.ProdArtvalorlimite');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}
function ProdArtCarater() {
	var x = document.getElementById("myCheckProdArtStatus").checked;
	var inputs = document.querySelectorAll('.ProdArtSepAndCon');
	var xx = document.querySelectorAll('.ProdArtAndCon');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}

	}
}

function OriBancLimite() {
	var x = document.getElementById("myCheckOriBancLimite").checked;
	var inputs = document.querySelectorAll('.OriBancvalorlimite');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
	}
}


function OriBancCarater() {
	var x = document.getElementById("myCheckOriBancStatus").checked;
	var inputs = document.querySelectorAll('.OriBancSepAndCon');
	var xx = document.querySelectorAll('.OriBancAndCon');
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.add("hidden");
		}
	} else {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.add("hidden");

		}
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}

	}
}




function GerarKey(formacaosize) {
	var key;
	key = "Ano>" + document.getElementById("AnoInicio").value + ">"
			+ document.getElementById("AnoFim").value + "%";
	var tipo = document.querySelectorAll('.FormacaoDiv');
	if(tipo.length > 0){
		key = key + "Formacao!";
		for(var i=0; i<formacaosize;i++){
			
		}
		
		key = key + "%";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	if(tipo.length > 0){
		key = key + "Formacao!";
		if (document.getElementById("myCheckFormacaoStatus").checked) {
			var and = document.querySelectorAll('.formacaoAndValorUni');
			var con = document.querySelectorAll('.formacaoConValorUni');
			if (document.getElementById("myCheckFormacaoLimite").checked) {
				for (var i = 0; i < and.length; i++) {
					var andLimite = document.querySelectorAll('.formacaoAndimite');
					var conLimite = document.querySelectorAll('.formacaoConLimite');
					key = key + "#" + and[i].name;
					key = key + "@" + "Tipo1" + "=" + and[i].value  + "=" + "&"+ andLimite[i].value + "&";
					key = key + "@" + "Tipo2" + "=" + con[i].value + "=" + "&"+ conLimite[i].value + "&"+ "@";
				}
				key = key + "#";
			} else {
				for (var i = 0; i < and.length; i++) {
					key = key + "#" + and[i].name;
					key = key + "@" + "Tipo1" + "=" + and[i].value + "=";
					key = key + "@" + "Tipo2" + "=" + con[i].value + "=" + "@";
				}
				key = key + "#";
			}
		} else {
			var andConValor = document.querySelectorAll('.formacaoAndConValorUni');
			if (document.getElementById("myCheckFormacaoLimite").checked) {
				var andConLimite = document.querySelectorAll('.formacaoAndConLimite');
				for (var i = 0; i < andConValor.length; i++) {
					key = key + "#" + andConValor[i].name + "="
							+ andConValor[i].value + "="+ "&" + andConLimite[i].value + "&";
				}
				key = key + "#";
			} else {
				for (var i = 0; i < andConValor.length; i++) {
					key = key + "#" + andConValor[i].name + "="+ andConValor[i].value + "=";
				}
				key = key + "#";
			}
		}
		key = key + "%";
	}
	
	
	

	

	document.getElementById("keyId").value = key;
}
