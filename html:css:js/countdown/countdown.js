
var time = setInterval(function() {
    let dataFinale = new Date("Jan 1, 2023 00:00:00").getTime();

    const secondo = 1000,
    minuto = secondo * 60,
    ora = minuto * 60,
    giorno = ora * 24;

    let orario = new Date().getTime();

    let countDown = dataFinale - orario;

    document.getElementById("giorni").innerHTML = Math.floor(countDown / (giorno));
    document.getElementById("ore").innerHTML = Math.floor((countDown % (giorno)) / (ora));
    document.getElementById("minuti").innerHTML = Math.floor((countDown % (ora)) / (minuto));
    document.getElementById("secondi").innerHTML = Math.floor((countDown % (minuto)) / secondo);

    if (countDown < 0) {
        clearInterval(x);
        document.getElementById("tempo scaduto");
    }

}, 0);