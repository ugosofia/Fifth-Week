

function Valida() {
    let nome = document.getElementsById(nome);
    let matricola = document.getElementsById(matricola);
    let exp_nome = /^[A-Za-zÀ-ú\s]+$/;


    if(nome == "") {
        alert("Il campo nome non può essere vuoto");
    }

    if(nome.substring(0,1) == " ") {
        alert("Il campo nome non è valido");
    }

    if (!exp_nome.test(nome)) {
        alert("Il campo nome può contenere solo caratteri alfabetici")
    }

    if(isNaN(matricola) ||  (matricola.parseInt() > 2000 || matricola.parseInt() < 1)) {
        alert("Il campo matricola non è valido.");
    }

}