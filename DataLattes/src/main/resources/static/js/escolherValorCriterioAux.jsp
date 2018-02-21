
<c:forEach var="idforechlist" begin="0" end="${estcrit.getListEst().size()-1}">
<c:if test="${!estcrit.getListEst().get(idforechlist).getAbre().contentEquals('Orien')}">
<script>

function ${estcrit.getListEst().get(idforechlist).getAbre()}ItemStatus(item) {
 ItemStatus("${estcrit.getListEst().get(idforechlist).getAbre()}", item);
}
function ${estcrit.getListEst().get(idforechlist).getAbre()}ItemLimite(item) {
 ItemLimite("${estcrit.getListEst().get(idforechlist).getAbre()}", item)
}

</script>
</c:if>
<c:forEach var="indice" begin="0" end="${estcrit.getListEst().get(idforechlist).getListCrit().size()-1}">
<script>
 $("#collapse${indice}tt${idforechlist}")
   .on('hidden.bs.collapse', function() {
  var input = document
    .querySelectorAll('.${estcrit.getListEst().get(idforechlist).getAbre()}item${indice}tt${idforechlist}Input:not(.d-none)');
  for (var i = 0; i < input.length; i++) {
   if (input[i].value == '') {
    $("#icon${indice}tt${idforechlist}").attr('class',
      'ion-close-round');
    $("#button${indice}tt${idforechlist}").attr(
      'class', 'btn btn-danger');
    return null;
   }
  }
  $("#icon${indice}tt${idforechlist}").attr('class',
    'ion-checkmark');
  $("#button${indice}tt${idforechlist}").attr('class',
    'btn btn-success');
 });
</script>
</c:forEach>
</c:forEach>
<script>
$("#collapseOne")
.on('hidden.bs.collapse', function() {
var input = document
 .querySelectorAll('.AnoCriterio');
for (var i = 0; i < input.length; i++) {
if (input[i].value == '') {
 $("#iconOne").attr('class',
   'ion-close-round');
 $("#buttonOne").attr(
   'class', 'btn btn-danger');
 return null;
}
}
$("#iconOne").attr('class',
 'ion-checkmark');
$("#buttonOne").attr('class',
 'btn btn-success');
});
var theDate=new Date()
document.getElementById("AnoFim").value =theDate.getFullYear();
</script>
