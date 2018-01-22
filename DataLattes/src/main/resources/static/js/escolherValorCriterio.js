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




function OriIC() {
	var x = document.getElementById("myCheckOriIC").checked;
	if (x) {
		document.getElementById("txtOriIC").innerHTML = "Ativado";
		document.getElementById("OriICMisto").classList.remove("hidden");
		document.getElementById("OriIC").style.backgroundColor = "#a5d6a7 ";
	} else {
		document.getElementById("txtOriIC").innerHTML = "Desativado";
		document.getElementById("OriICMisto").classList.add("hidden");
		document.getElementById("OriIC").style.backgroundColor = "#ffab91";
	}
}