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
force.addEventListener('click',() => {let val_force=prompt("Valeur en force:");forceSpan.textContent=`FOR ${val_force}`;let mod=getMod(val_force);modForceSpan.textContent=mod})

const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")
dexterite.addEventListener('click',() => {let val_dexterite=prompt("Valeur en dexterite:");dexteriteSpan.textContent=`DEX ${val_dexterite}`;let mod=getMod(val_dexterite);modDexteriteSpan.textContent=mod})

const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")
constitution.addEventListener('click',() => {let val_constitution=prompt("Valeur en constitution:");constitutionSpan.textContent=`DEX ${val_constitution}`;let mod=getMod(val_constitution);modConstitutionSpan.textContent=mod})


const intelligence = document.getElementById("caracteristique_intelligence")
const intelligenceSpan = document.getElementById("intelligence_span")
const modIntelligenceSpan = document.getElementById("mod_intelligence_span")
intelligence.addEventListener('click',() => {let val_intelligence=prompt("Valeur en intelligence:");intelligenceSpan.textContent=`DEX ${val_intelligence}`;let mod=getMod(val_intelligence);modIntelligenceSpan.textContent=mod})


const sagesse = document.getElementById("caracteristique_sagesse")
const sagesseSpan = document.getElementById("sagesse_span")
const modSagesseSpan = document.getElementById("mod_sagesse_span")
sagesse.addEventListener('click',() => {let val_sagesse=prompt("Valeur en sagesse:");sagesseSpan.textContent=`DEX ${val_sagesse}`;let mod=getMod(val_sagesse);modSagesseSpan.textContent=mod})


const charisme = document.getElementById("caracteristique_charisme")
const charismeSpan = document.getElementById("charisme_span")
const modCharismeSpan = document.getElementById("mod_charisme_span")
charisme.addEventListener('click',() => {let val_charisme=prompt("Valeur en charisme:");charismeSpan.textContent=`DEX ${val_charisme}`;let mod=getMod(val_charisme);modCharismeSpan.textContent=mod})
