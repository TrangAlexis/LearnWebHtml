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

let mod_force
let mod_dexterite
let mod_constitution
let mod_intelligence
let mod_sagesse
let mod_charisme

function getMod(val){
    mod=""+Math.trunc((val-2)/2)-4
    if (mod>0){
        mod="+"+mod
    }
    return mod
}

const force = document.getElementById("caracteristique_force")
const forceSpan = document.getElementById("force_span")
const modForceSpan = document.getElementById("mod_force_span")

force.addEventListener('click',() => {let val_force=prompt("Valeur en force:");forceSpan.textContent=`FOR ${val_force}`;mod_force=getMod(val_force);modForceSpan.textContent=mod_force})

const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")

dexterite.addEventListener('click',() => {let val_dexterite=prompt("Valeur en dexterite:");dexteriteSpan.textContent=`DEX ${val_dexterite}`;mod_dexterite=getMod(val_dexterite);modDexteriteSpan.textContent=mod_dexterite})

const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")

constitution.addEventListener('click',() => {let val_constitution=prompt("Valeur en constitution:");constitutionSpan.textContent=`CON ${val_constitution}`;mod_constitution=getMod(val_constitution);modConstitutionSpan.textContent=mod_constitution})


const intelligence = document.getElementById("caracteristique_intelligence")
const intelligenceSpan = document.getElementById("intelligence_span")
const modIntelligenceSpan = document.getElementById("mod_intelligence_span")

intelligence.addEventListener('click',() => {let val_intelligence=prompt("Valeur en intelligence:");intelligenceSpan.textContent=`INT ${val_intelligence}`;mod_intelligence=getMod(val_intelligence);modIntelligenceSpan.textContent=mod_intelligence})


const sagesse = document.getElementById("caracteristique_sagesse")
const sagesseSpan = document.getElementById("sagesse_span")
const modSagesseSpan = document.getElementById("mod_sagesse_span")

sagesse.addEventListener('click',() => {let val_sagesse=prompt("Valeur en sagesse:");sagesseSpan.textContent=`SAG ${val_sagesse}`;mod_sagesse=getMod(val_sagesse);modSagesseSpan.textContent=mod_sagesse})


const charisme = document.getElementById("caracteristique_charisme")
const charismeSpan = document.getElementById("charisme_span")
const modCharismeSpan = document.getElementById("mod_charisme_span")

charisme.addEventListener('click',() => {let val_charisme=prompt("Valeur en charisme:");charismeSpan.textContent=`CHA ${val_charisme}`;mod_charisme=getMod(val_charisme);modCharismeSpan.textContent=mod_charisme})

const boiteComp = document.getElementById("boite_mod_competences")
let compSpan = document.getElementById("list_mod_competences_span")
modForceSpan.addEventListener('click',() => {           boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Force<br>Sauvegarde: ${mod_force}`})

modDexteriteSpan.addEventListener('click',() => {       boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Dexterité<br>Sauvegarde: ${mod_dexterite}`})

modConstitutionSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Constitution<br>Sauvegarde: ${mod_constitution}`})

modIntelligenceSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Intelligence<br>Sauvegarde: ${mod_intelligence}`})

modSagesseSpan.addEventListener('click',() => {         boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Sagesse<br>Sauvegarde: ${mod_sagesse}`})

modCharismeSpan.addEventListener('click',() => {        boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Charisme<br>Sauvegarde: ${mod_charisme}`})

boiteComp.addEventListener('click',() => {              boiteComp.style.backgroundColor = 'rgba(0, 0, 0, 0)';
                                                        boiteComp.style.border = "";
                                                        compSpan.innerHTML = ""})


