var sizeList = document.getElementById('sizeList').value;
var cont = 0;
function Avancar() {
	if (cont != sizeList-1) {
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
	}else{
		
	}

}
