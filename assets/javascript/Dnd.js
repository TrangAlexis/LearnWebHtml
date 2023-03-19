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



function getMod(val){
    mod=""
    if(val==1){
        mod = "-5"
    } else if (val<=3){
        mod = "-4"
    }else if (val<=5){
        mod = "-3"
    }else if (val<=7){
        mod = "-2"
    }
    else if (val<=9){
        mod = "-1"
    }
    else if (val<=11){
        mod = "0"
    }
    else if (val<=13){
        mod = "+1"
    }
    else if (val<=15){
        mod = "+2"
    }
    else if (val<=17){
        mod = "+3"
    }
    else if (val<=19){
        mod = "+4"
    }else if (val<=21){
        mod = "+5"
    }else {
        mod = "mauvaise valeur"
    }
    return mod 
}

const force = document.getElementById("caracteristique_force")
const forceSpan = document.getElementById("force_span")
const modForceSpan = document.getElementById("mod_force_span")
let mod_force
force.addEventListener('click',() => {let val_force=prompt("Valeur en force:");forceSpan.textContent=`FOR ${val_force}`;mod_force=getMod(val_force);modForceSpan.textContent=mod_force})

const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")
let mod_dexterite
dexterite.addEventListener('click',() => {let val_dexterite=prompt("Valeur en dexterite:");dexteriteSpan.textContent=`DEX ${val_dexterite}`;mod_dexterite=getMod(val_dexterite);modDexteriteSpan.textContent=mod_dexterite})

const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")
let mod_constitution
constitution.addEventListener('click',() => {let val_constitution=prompt("Valeur en constitution:");constitutionSpan.textContent=`DEX ${val_constitution}`;mod_constitution=getMod(val_constitution);modConstitutionSpan.textContent=mod_constitution})


const intelligence = document.getElementById("caracteristique_intelligence")
const intelligenceSpan = document.getElementById("intelligence_span")
const modIntelligenceSpan = document.getElementById("mod_intelligence_span")
let mod_intelligence
intelligence.addEventListener('click',() => {let val_intelligence=prompt("Valeur en intelligence:");intelligenceSpan.textContent=`DEX ${val_intelligence}`;let mod_intelligence=getMod(val_intelligence);modIntelligenceSpan.textContent=mod_intelligence})


const sagesse = document.getElementById("caracteristique_sagesse")
const sagesseSpan = document.getElementById("sagesse_span")
const modSagesseSpan = document.getElementById("mod_sagesse_span")
let mod_sagesse
sagesse.addEventListener('click',() => {let val_sagesse=prompt("Valeur en sagesse:");sagesseSpan.textContent=`DEX ${val_sagesse}`;let mod_sagesse=getMod(val_sagesse);modSagesseSpan.textContent=mod_sagesse})


const charisme = document.getElementById("caracteristique_charisme")
const charismeSpan = document.getElementById("charisme_span")
const modCharismeSpan = document.getElementById("mod_charisme_span")
let mod_charisme
charisme.addEventListener('click',() => {let val_charisme=prompt("Valeur en charisme:");charismeSpan.textContent=`DEX ${val_charisme}`;let mod_charisme=getMod(val_charisme);modCharismeSpan.textContent=mod_charisme})

const boiteComp = document.getElementById("boite_mod_competences")
let compSpan = document.getElementById("list_mod_competences_span")
modForceSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; boiteComp.style.border = "1px solid black"; compSpan.innerHTML = `Force<br>Sauvegarde: ${mod_force}`})
modDexteriteSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; compSpan.innerHTML = `Dexterité<br>Sauvegarde: ${mod_dexterite}`})
modConstitutionSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; compSpan.innerHTML = `Constitution<br>Sauvegarde: ${mod_constitution}`})
modIntelligenceSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; compSpan.innerHTML = `Intelligence<br>Sauvegarde: ${mod_intelligence}`})
modSagesseSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; compSpan.innerHTML = `Sagesse<br>Sauvegarde: ${mod_sagesse}`})
modCharismeSpan.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgb(245, 245, 220)'; compSpan.innerHTML = `Charisme<br>Sauvegarde: ${mod_charisme}`})
boiteComp.addEventListener('click',() => {boiteComp.style.backgroundColor = 'rgba(0, 0, 0, 0)'; boiteComp.style.border = "";compSpan.innerHTML = ""})

/*

*/



