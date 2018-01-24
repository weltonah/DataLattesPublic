function FormacaoStatus() {
	var x = document.getElementById("myCheckFormacaoStatus").checked;
	var inputs = document.querySelectorAll('.FormacaoSepAndCon');
	var xx = document.querySelectorAll('.FormacaoAndCon');
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
function FormacaoLimite() {
	var x = document.getElementById("myCheckFormacaoLimite").checked;
	var inputs = document.querySelectorAll('.Formacaovalorlimite');
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




function GerarKey() {
	var key;
	key = "Ano>" + document.getElementById("AnoInicio").value + ">"
			+ document.getElementById("AnoFim").value + "%";

	key = key + "Formacao!";
	if (document.getElementById("myCheckFormacaoStatus").checked) {
		var and = document.querySelectorAll('.formacaoAndValorUni');
		var con = document.querySelectorAll('.formacaoConValorUni');
		if (document.getElementById("myCheckFormacaoLimite").checked) {
			for (var i = 0; i < and.length; i++) {
				var andLimite = document.querySelectorAll('.formacaoAndimite');
				var conLimite = document.querySelectorAll('.formacaoConLimite');
				key = key + "#" + and[i].name;
				key = key + "@" + "And" + "=" + and[i].value  + "=" + "&"
						+ andLimite[i].value + "&";
				key = key + "@" + "Con" + "=" + con[i].value + "=" + "&"
						+ conLimite[i].value + "&"+ "@";
				
			}
			key = key + "#";
		} else {
			for (var i = 0; i < and.length; i++) {
				key = key + "#" + and[i].name;
				key = key + "@" + "And" + "=" + and[i].value + "=";
				key = key + "@" + "Con" + "=" + con[i].value + "=" + "@";
				
			}
			key = key + "#";
		}
	} else {
		var andConValor = document.querySelectorAll('.formacaoAndConValorUni');
		if (document.getElementById("myCheckFormacaoLimite").checked) {
			var andConLimite = document
					.querySelectorAll('.formacaoAndConLimite');
			for (var i = 0; i < andConValor.length; i++) {
				key = key + "#" + andConValor[i].name + "="
						+ andConValor[i].value + "="+ "&" + andConLimite[i].value
						+ "&";
			}
			key = key + "#";
		} else {
			for (var i = 0; i < andConValor.length; i++) {
				key = key + "#" + andConValor[i].name + "="
						+ andConValor[i].value + "=";
			}
			key = key + "#";
		}
	}
	
	
	
	key = key + "%"
	var valor = document.querySelectorAll('.OriBancAndCon');
	var limite = document.querySelectorAll('.OriBancSepAndCon');

	document.getElementById("keyId").value = key;
}
