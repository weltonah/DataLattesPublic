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




function OrienItemStatus(item,valor) {
	var Nome = "Orien";
	var valor0 = document.querySelectorAll("." + Nome + "Tipo0tt" + item);
	var valor1 = document.querySelectorAll("." + Nome + "Tipo1tt" + item);
	var valor2 = document.querySelectorAll("." + Nome + "Tipo2tt" + item);
	var valor3 = document.querySelectorAll("." + Nome + "Tipo3tt" + item);
	switch(valor){
	case 0:
		for (var i = 0; i < valor0.length; i++)
			valor0[i].classList.remove("hidden");
		for (var j = 0; j < valor1.length; j++)
			valor1[j].classList.add("hidden");
		for (var i = 0; i < valor2.length; i++)
			valor2[i].classList.add("hidden");
		for (var j = 0; j < valor3.length; j++)
			valor3[j].classList.add("hidden");
		break;
	case 1:
		for (var i = 0; i < valor0.length; i++)
			valor0[i].classList.add("hidden");
		for (var j = 0; j < valor1.length; j++)
			valor1[j].classList.remove("hidden");
		for (var i = 0; i < valor2.length; i++)
			valor2[i].classList.add("hidden");
		for (var j = 0; j < valor3.length; j++)
			valor3[j].classList.add("hidden");
		break;
	case 2:
		for (var i = 0; i < valor0.length; i++)
			valor0[i].classList.add("hidden");
		for (var j = 0; j < valor1.length; j++)
			valor1[j].classList.add("hidden");
		for (var i = 0; i < valor2.length; i++)
			valor2[i].classList.remove("hidden");
		for (var j = 0; j < valor3.length; j++)
			valor3[j].classList.add("hidden");
		break;
	case 3:
		for (var i = 0; i < valor0.length; i++)
			valor0[i].classList.add("hidden");
		for (var j = 0; j < valor1.length; j++)
			valor1[j].classList.add("hidden");
		for (var i = 0; i < valor2.length; i++)
			valor2[i].classList.add("hidden");
		for (var j = 0; j < valor3.length; j++)
			valor3[j].classList.remove("hidden");
		break;
	
	}
}
function OrienItemLimite(item) {
	ItemLimite("Orien", item);
}
function OrienLimite() {
	LimiteTudo("Orien");
}
function BancStatus() {
	StatusTudo("Banc");
}
function BancItemStatus(item) {
	ItemStatus("Banc", item);
}
function BancItemLimite(item) {
	ItemLimite("Banc", item);
}
function BancLimite() {
	LimiteTudo("Banc");
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
			"Orien", "Banc", "DadosGerais" ];
	var NomeItemForAbre = [ "For", "PrTec", "PrArt", "PrBli", "Orien", "Banc", "CrGe" ];
	for (var t = 0; t < 7; t++) {
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

