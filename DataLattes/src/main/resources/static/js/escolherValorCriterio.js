var sizeList = document.getElementById('sizeList').value;
var cont = 0;
function Avancar() {
	if (cont != sizeList - 1) {
		document.getElementById('divItem' + cont).classList.add("d-none");
		cont++;
		document.getElementById('divItem' + cont).classList.remove("d-none");
	}
}
function Voltar() {
	if (cont != 0) {
		document.getElementById('divItem' + cont).classList.add("d-none");
		cont--;
		document.getElementById('divItem' + cont).classList.remove("d-none");
	} else {

	}

}
function ItemLimite(Nome, item) {
	var x = document.getElementById("myCheck" + Nome + "ItemLimite" + item).checked;
	var inputs = document.querySelectorAll("." + Nome + "limite" + item);
	if (x) {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.remove("d-none");
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("d-none");
	}
}
function ItemStatus(Nome, item) {
	var x = document.getElementById("myCheck" + Nome + "ItemStatus" + item).checked;
	var inputs = document.querySelectorAll("." + Nome + "Tipo1tt" + item);
	var xx = document.querySelectorAll("." + Nome + "Tipo0tt" + item);
	if (x) {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.remove("d-none");
		for (var j = 0; j < xx.length; j++)
			xx[j].classList.add("d-none");
	} else {
		for (var i = 0; i < inputs.length; i++)
			inputs[i].classList.add("d-none");
		for (var j = 0; j < xx.length; j++)
			xx[j].classList.remove("d-none");
	}
}


