function FormacaoStatus() {
	StatusTudo("Formacao");
}
function FormacaoItemStatus(item) {
	ItemStatus("Formacao", item);
}
function FormacaoItemLimite(item) {
	ItemLimite("Formacao", item)
}
function FormacaoLimite() {
	LimiteTudo("Formacao");
}
function ProdArtStatus() {
	StatusTudo("ProdArt");
}
function ProdArtItemStatus(item) {
	ItemStatus("ProdArt", item);
}
function ProdArtItemLimite(item) {
	ItemLimite("ProdArt", item)
}
function ProdArtLimite() {
	LimiteTudo("ProdArt");
}
function ProdTecStatus() {
	StatusTudo("ProdTec");
}
function ProdTecItemStatus(item) {
	ItemStatus("ProdTec", item);
}
function ProdTecItemLimite(item) {
	ItemLimite("ProdTec", item);
}
function ProdTecLimite() {
	LimiteTudo("ProdTec");
}
function ProdBibliStatus() {
	StatusTudo("ProdBibli");
}
function ProdBibliItemStatus(item) {
	ItemStatus("ProdBibli", item);
}
function ProdBibliItemLimite(item) {
	ItemLimite("ProdBibli", item);
}
function ProdBibliLimite() {
	LimiteTudo("ProdBibli");
}
function OriBancStatus() {
	StatusTudo("OriBanc");
}
function OriBancItemStatus(item) {
	ItemStatus("OriBanc", item);
}
function OriBancItemLimite(item) {
	ItemLimite("OriBanc", item);
}
function OriBancLimite() {
	LimiteTudo("OriBanc");
}
function StatusTudo(Nome) {
	var x = document.getElementById("myCheck" + Nome + "Status").checked;
	var inputs = document.querySelectorAll("." + Nome + "TipoIndex1");
	var xx = document.querySelectorAll("." + Nome + "TipoIndex0");
	if (x) {
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].classList.remove("hidden");
		}
		for (var j = 0; j < xx.length; j++)
			if (!(xx[j].classList.contains("Semtipo"))) {
				xx[j].classList.add("hidden");
			}
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("hidden");
		for (var j = 0; j < xx.length; j++) {
			xx[j].classList.remove("hidden");
		}
	}
}
function ItemStatus(Nome, item) {
	var x = document.getElementById("myCheck" + Nome + "ItemStatus" + item).checked;
	var inputs = document.querySelectorAll("." + Nome + "Tipo1tt" + item);
	var xx = document.querySelectorAll("." + Nome + "Tipo0tt" + item);
	if (x) {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.remove("hidden");
		for (var j = 0; j < xx.length; j++)
			xx[j].classList.add("hidden");
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("hidden");
		for (var j = 0; j < xx.length; j++)
			xx[j].classList.remove("hidden");
	}
}
function ItemLimite(Nome, item) {
	var x = document.getElementById("myCheck" + Nome + "ItemLimite" + item).checked;
	var inputs = document.querySelectorAll("." + Nome + "limite" + item);
	if (x) {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.remove("hidden");
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("hidden");
	}
}

function LimiteTudo(Nome) {
	var x = document.getElementById("myCheck" + Nome + "Limite").checked;
	var inputs = document.querySelectorAll("." + Nome + "limiteGeral");
	if (x) {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.remove("hidden");
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("hidden");
	}
}

function GerarKey() {
	
	var key;
	key = "Ano>" + document.getElementById("AnoInicio").value + ">"
			+ document.getElementById("AnoFim").value + "%";
	var NomeItemFor = [ "Formacao", "ProdTec", "ProdArt", "ProdBibli",
			"OriBanc", "DadosGerais" ];
	var NomeItemForAbre = [ "For", "PrTec", "PrArt", "PrBli", "BaOr", "CrGe" ];
	for (var t = 0; t < 6; t++) {
		var formDiv = document.querySelectorAll('.indexCont' + t);
		if (formDiv.length > 0) {
			// alert(t);
			key = key + NomeItemForAbre[t] + "!";
			for (var i = 0; i < formDiv.length; i++) {
				// var list = document.getElementById(i);
				var list = document.querySelectorAll('.' + NomeItemFor[t]
						+ 'ItemIndex' + i);
				// alert(list.length);
				for (var k = 0; k < list.length; k++) {
					// alert(i);
					if (list[k] != null) {
						if (!(list[k].classList.contains("hidden"))) {
							var listId = list[k].getAttribute("name");
							var itemName = list[k].getAttribute("id");
							var ItemAbre = document
									.getElementsByClassName("NomeItem"
											+ itemName + "&" + t);
							key = key + "#" + ItemAbre[0].getAttribute("name");
							var valor = document.querySelectorAll('.'
									+ NomeItemFor[t] + 'Tipo' + listId
									+ 'valor' + i);
							var limite = document.querySelectorAll('.'
									+ NomeItemFor[t] + 'Tipo' + listId
									+ 'limite' + i);
							// alert('.FormacaoTipo'+listId+'valor'+i);
							// alert(valor.length);
							for (var j = 0; j < valor.length; j++) {
								key = key + "@" + valor[j].getAttribute("name")
										+ "=" + valor[j].value + "=";
								if (!(limite[j].classList.contains("hidden"))) {
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
	document.getElementById("mostrarKey").classList.remove("hidden");
	document.getElementById("mostrarCriterio").classList.add("hidden");
}
function voltar(){
	document.getElementById("mostrarKey").classList.add("hidden");
	document.getElementById("mostrarCriterio").classList.remove("hidden");
}

