function numeroDecimal(id, value) {
    value = value.replace(/[\a-z \A-Z \; \@ \% \! \# \$ \& \* \( \) ]/g, '');
    document.getElementById(''+id).value = value;
}
function numeroInteiro(id, value) {
    value = value.replace(/[\a-z \A-Z \; \@ \% \! \# \$ \& \* \( \) \, \.]/g, '');
    value = value.replace(/[,]/g, '');
    document.getElementById(''+id).value = value;
}
