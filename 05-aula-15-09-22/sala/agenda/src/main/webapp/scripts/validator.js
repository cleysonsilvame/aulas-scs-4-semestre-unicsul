function validar(){
	const nome = frmContato.nome.value
	const fone = frmContato.fone.value
	
	if(nome === "") {
		alert("Preencha o campo nome")
		frmContato.nome.focus()
	} else if (fone === "") {
		alert("Preencha o campo fone")
		frmContato.fone.focus()
	} else {
		frmContato.submit()
	}
	
}