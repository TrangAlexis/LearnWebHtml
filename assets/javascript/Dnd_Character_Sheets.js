var inputNom = document.getElementById("input_nom")
var inputRace = document.getElementById("input_race")
const btnSend = document.getElementById("send")

inputNom.addEventListener('keypress', function(event){
    if(event.key ==="Enter"){
        console.log("entré")
    }
})

