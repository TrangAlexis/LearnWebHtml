const nom = document.getElementById("Nom")
const nomSpan = document.getElementById("nom_span")
nom.addEventListener('click',() => {nomSpan.textContent=prompt("Entrez nom:")})

const classe = document.getElementById("Classe")
const classeSpan = document.getElementById("classe_span")
classe.addEventListener('click',() => {classeSpan.textContent=prompt("Entrez classe:")})

const race = document.getElementById("Race")
const raceSpan = document.getElementById("race_span")
race.addEventListener('click',() => {raceSpan.textContent=prompt("Entrez race:")})

const historique = document.getElementById("Historique")
const historiqueSpan = document.getElementById("historique_span")
historique.addEventListener('click',() => {historiqueSpan.textContent=prompt("Entrez historique:")})
