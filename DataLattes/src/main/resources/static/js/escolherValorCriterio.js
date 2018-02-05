function FormacaoStatus() {
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
	var x = document.getElementById("myCheckFormacaoItemStatus" + item).checked;
	var inputs = document.querySelectorAll(".FormacaoTipo1tt" + item);
	var xx = document.querySelectorAll(".FormacaoTipo0tt" + item);
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
	var x = document.getElementById("myCheckFormacaoItemLimite" + item).checked;
	var inputs = document.querySelectorAll(".Formacaolimite" + item);
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
function FormacaoLimite() {
	var x = document.getElementById("myCheckFormacaoLimite").checked;
	var inputs = document.querySelectorAll(".FormacaolimiteGeral");
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


function ProdArtStatus() {
	var x = document.getElementById("myCheckProdArtStatus").checked;
	var inputs = document.querySelectorAll(".ProdArtTipoIndex1");
	var xx = document.querySelectorAll(".ProdArtTipoIndex0");
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
function ProdArtItemStatus(item) {
	var x = document.getElementById("myCheckProdArtItemStatus" + item).checked;
	var inputs = document.querySelectorAll(".ProdArtTipo1tt" + item);
	var xx = document.querySelectorAll(".ProdArtTipo0tt" + item);
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
function ProdArtItemLimite(item) {
	var x = document.getElementById("myCheckProdArtItemLimite" + item).checked;
	var inputs = document.querySelectorAll(".ProdArtlimite" + item);
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
	var inputs = document.querySelectorAll(".ProdArtlimiteGeral");
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


function ProdTecStatus() {
	var x = document.getElementById("myCheckProdTecStatus").checked;
	var inputs = document.querySelectorAll(".ProdTecTipoIndex1");
	var xx = document.querySelectorAll(".ProdTecTipoIndex0");
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
function ProdTecItemStatus(item) {
	var x = document.getElementById("myCheckProdTecItemStatus" + item).checked;
	var inputs = document.querySelectorAll(".ProdTecTipo1tt" + item);
	var xx = document.querySelectorAll(".ProdTecTipo0tt" + item);
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
function ProdTecItemLimite(item) {
	var x = document.getElementById("myCheckProdTecItemLimite" + item).checked;
	var inputs = document.querySelectorAll(".ProdTeclimite" + item);
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
function ProdTecLimite() {
	var x = document.getElementById("myCheckProdTecLimite").checked;
	var inputs = document.querySelectorAll(".ProdTeclimiteGeral");
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

function ProdBibliStatus() {
	var x = document.getElementById("myCheckProdBibliStatus").checked;
	var inputs = document.querySelectorAll(".ProdBibliTipoIndex1");
	var xx = document.querySelectorAll(".ProdBibliTipoIndex0");
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
function ProdBibliItemStatus(item) {
	var x = document.getElementById("myCheckProdBibliItemStatus" + item).checked;
	var inputs = document.querySelectorAll(".ProdBibliTipo1tt" + item);
	var xx = document.querySelectorAll(".ProdBibliTipo0tt" + item);
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
function ProdBibliItemLimite(item) {
	var x = document.getElementById("myCheckProdBibliItemLimite" + item).checked;
	var inputs = document.querySelectorAll(".ProdBiblilimite" + item);
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
	var inputs = document.querySelectorAll(".ProdBiblilimiteGeral");
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




function GerarKey() {
	var key;
	key = "Ano>" + document.getElementById("AnoInicio").value + ">"
			+ document.getElementById("AnoFim").value + "%";
	var NomeItemFor = ["Formacao","ProdTec","ProdArt","ProdBibli","OriBanc","DadosGerais"];
	var NomeItemForAbre = ["For","PrTe","PrArt","PrBli","BaOr","CrGe"];
	for(var t =0; t<6;t++ ){
		var formDiv = document.querySelectorAll('.indexCont'+t);
		if (formDiv.length > 0) {
			//alert(t);
			key = key +NomeItemForAbre[t] +"!";
			for (var i = 0; i < formDiv.length; i++) {
				//var list = document.getElementById(i);
				var list = document.querySelectorAll('.'+ NomeItemFor[t] +'ItemIndex' + i);
				//alert(list.length);
				for(var k=0; k < list.length ;k++){
					//alert(i);
					if(list[k] != null){
						if (!(list[k].classList.contains("hidden"))) {
							var listId = list[k].getAttribute("name");
							var itemName= list[k].getAttribute("id");
							var ItemAbre = document.getElementsByClassName("NomeItem"
									+ itemName+"&"+t);
							key = key + "#" + ItemAbre[0].getAttribute("name");
							var valor = document.querySelectorAll('.'+ NomeItemFor[t] +'Tipo'+listId+'valor'+i);
							var limite = document.querySelectorAll('.'+ NomeItemFor[t] +'Tipo'+listId+'limite'+i);
							//alert('.FormacaoTipo'+listId+'valor'+i);
							//alert(valor.length);
							for (var j = 0; j < valor.length; j++) {
								key = key + "@" + valor[j].getAttribute("name") + "="
								+ valor[j].value + "=" ;
								if(!(limite[j].classList.contains("hidden"))){
									key = key + "&" + limite[j].value + "&";
								}
							}
						}
					}
				}
			}
			key = key + "%";
		}
	}
	document.getElementById("keyId").value = key;
}

