/*INITIALISATION*/
/*VALEUR ET MODIFICATEURS DE CARACTERISTIQUES*/
let val_force = 0
let val_dexterite = 0
let val_constitution = 0
let val_intelligence = 0
let val_sagesse = 0
let val_charisme = 0

let mod_force = 0
let mod_dexterite = 0
let mod_constitution = 0
let mod_intelligence = 0
let mod_sagesse = 0
let mod_charisme = 0

/*Bonus*/
let bonus_race_force = 0
let bonus_race_dexterite = 0
let bonus_race_constitution = 0
let bonus_race_intelligence = 0
let bonus_race_sagesse = 0
let bonus_race_charisme = 0

let bonus_mod_force = 0
let bonus_mod_dexterite = 0
let bonus_mod_constitution = 0
let bonus_mod_intelligence = 0
let bonus_mod_sagesse = 0
let bonus_mod_charisme = 0

/*fonction pour passer de valeur à modificateur*/
function getMod(val){
    mod=""+Math.trunc((val-2)/2)-4
    if (val==1){
        mod=-5
    }
    if (mod>0){
        mod="+"+mod
    }
    return mod
}

/*MAITRISES*/
let bonus_maitrise
let maitr_armes = []
let maitr_armures = []
let maitr_langues = []
let maitr_outils = []
let maitr_sauvegardes = []
let maitr_competences = []

/*CAPACITES DE RACE ET VITESSE*/
let vitesse = 0
let liste_capacite_race = []

/*NOM, RACE, ET HISTORIQUE*/
let nom = ""
var inputNom = document.getElementById("input_nom")

let classeI = ""
var inputClasseI = document.getElementById("input_classeI")

let race = ""
var inputRace = document.getElementById("input_race")



/*fonction pour récupérer les bonus de race*/
function bonus_race(Race){
    switch (Race.toLowerCase()){
        case "haut-elfe":
            bonus_race_dexterite=2;
            bonus_race_intelligence=1;
            vitesse=9;
            liste_capacite_race.push("Vision dans le noir","Sens aiguisés","Ascendance féerique","Transe","Entraînement aux armes elfiques","Sort mineur","Langue supplémentaire")
            maitr_armes.push("épées longues","épées courtes", "arcs longs","arcs courts")
            maitr_langues.push("Commun","Elfique")
            break;
        case "elfe des bois":
            bonus_race_dexterite+=2;
            bonus_race_sagesse+=1;
            vitesse=10.5;
            liste_capacite_race.push("Vision dans le noir","Sens aiguisés","Ascendance féerique","Transe","Entraînement aux armes elfiques","Foulée légère","Cachette naturelle")
            maitr_armes.push("épées longues","épées courtes", "arcs longs","arcs courts")
            break;

        case "drow":
            bonus_race_dexterite+=2;
            bonus_race_charisme+=1;
            vitesse=9;
            liste_capacite_race.push("Vision dans le noir supérieure","Sens aiguisés","Ascendance féerique","Transe","Sensibilité au soleil", "Magie drow", "Entrainement aux armes drows");
            maitr_langues.push("Commun","Elfique");
            maitr_armes.push("rapières","épées courtes","arbalètes de poing")
            break;
    }
}

let historique = ""
var inputHistorique = document.getElementById("input_historique")



/*GRILLE QUI CONTIENT LES CARACTERISTIQUES PRINCIPALES*/

const force = document.getElementById("caracteristique_force")
const forceSpan = document.getElementById("force_span")
const modForceSpan = document.getElementById("mod_force_span")
force.addEventListener('click',() => {let val_force_finale=`${parseInt(prompt("Valeur en force:"))+bonus_race_force}`;forceSpan.textContent=`FOR ${val_force_finale}`;mod_force=getMod(val_force_finale);modForceSpan.textContent=mod_force})

const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")

dexterite.addEventListener('click',() => {let val_dexterite_finale=`${parseInt(prompt("Valeur en dexterité:"))+bonus_race_dexterite}`;dexteriteSpan.textContent=`DEX ${val_dexterite_finale}`;mod_dexterite=getMod(val_dexterite_finale);modDexteriteSpan.textContent=mod_dexterite})

const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")
constitution.addEventListener('click',() => {val_constitution=prompt("Valeur en constitution:");constitutionSpan.textContent=`CON ${val_constitution}`;mod_constitution=getMod(val_constitution);modConstitutionSpan.textContent=mod_constitution})


const intelligence = document.getElementById("caracteristique_intelligence")
const intelligenceSpan = document.getElementById("intelligence_span")
const modIntelligenceSpan = document.getElementById("mod_intelligence_span")
intelligence.addEventListener('click',() => {val_intelligence+=prompt("Valeur en intelligence:");intelligenceSpan.textContent=`INT ${val_intelligence}`;mod_intelligence=getMod(val_intelligence);modIntelligenceSpan.textContent=mod_intelligence})


const sagesse = document.getElementById("caracteristique_sagesse")
const sagesseSpan = document.getElementById("sagesse_span")
const modSagesseSpan = document.getElementById("mod_sagesse_span")
sagesse.addEventListener('click',() => {val_sagesse+=prompt("Valeur en sagesse:");sagesseSpan.textContent=`SAG ${val_sagesse}`;mod_sagesse=getMod(val_sagesse);modSagesseSpan.textContent=mod_sagesse})


const charisme = document.getElementById("caracteristique_charisme")
const charismeSpan = document.getElementById("charisme_span")
const modCharismeSpan = document.getElementById("mod_charisme_span")
charisme.addEventListener('click',() => {val_charisme+=prompt("Valeur en charisme:");charismeSpan.textContent=`CHA ${val_charisme}`;mod_charisme=getMod(val_charisme);modCharismeSpan.textContent=mod_charisme})




/*PETITES BOITES AVEC LES COMPETENCES. ELLES S'AFFICHENT QUAND ON CLIQUE SUR LA CARACTERISTIQUE PRINCIPALE QUI LEUR EST ASSOCIEE.*/
const boiteComp = document.getElementById("boite_mod_competences")
let compSpan = document.getElementById("list_mod_competences_span")
modForceSpan.addEventListener('click',() => {           boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Force<br>Sauvegarde: ${mod_force}`;
                                                        compSpan.innerHTML += `<br>Athlétisme: ${mod_force}`;
                                                        boiteComp.style.height = "11.5vh"
                                                        boiteComp.style.width = "25vw"
                                                    })

modDexteriteSpan.addEventListener('click',() => {       boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Dexterité<br>Sauvegarde: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Accrobatie: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Discrétion: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Escamotage: ${mod_dexterite}`;
                                                        boiteComp.style.height = "17.5vh"
                                                        boiteComp.style.width = "25vw"
                                                    })

modConstitutionSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Constitution<br>Sauvegarde: ${mod_constitution}`;
                                                        boiteComp.style.height = "8.5vh"
                                                        boiteComp.style.width = "25vw"
                                                    })

modIntelligenceSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Intelligence<br>Sauvegarde: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Arcane: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Histoire: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Investigation: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Nature: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Religion: ${mod_intelligence}`;
                                                        boiteComp.style.height = "20vh"
                                                        boiteComp.style.width = "25vw"
                                                    })

modSagesseSpan.addEventListener('click',() => {         boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Sagesse<br>Sauvegarde: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Dressage: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Médecine: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Perception: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Perspicacité: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Survie: ${mod_sagesse}`;
                                                        boiteComp.style.height = "20vh"
                                                        boiteComp.style.width = "25vw"
                                                    })

modCharismeSpan.addEventListener('click',() => {        boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Charisme<br>Sauvegarde: ${mod_charisme}`;
                                                        compSpan.innerHTML += `<br>Intimidation: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Persuasion: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Représentation: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Tromperie: ${mod_charisme}`
                                                        boiteComp.style.height = "18vh"
                                                        boiteComp.style.width = "25vw"
                                                        
                                                    })

boiteComp.addEventListener('click',() => {              boiteComp.style.backgroundColor = 'rgba(0, 0, 0, 0)';
                                                        boiteComp.style.border = "";
                                                        compSpan.innerHTML = ""
                                                        boiteComp.style.height = "0vh"
                                                        boiteComp.style.width = "0vw"
                                                    })


/*CAPACITES*/

const boiteCapacitesRace = document.getElementById("boite_capacites_race")

const btnRefresh = document.getElementById("refresh")
btnRefresh.addEventListener('click', () => {
    nom=inputNom.value
    console.log(nom)
    race=inputRace.value
    console.log(race)
    historique=inputHistorique.value
    console.log(historique)
    liste_capacite_race=[]
    bonus_race(race)

    boiteCapacitesRace.innerHTML=""
    for (const capacite_race of liste_capacite_race){
    boiteCapacitesRace.innerHTML+= `${capacite_race}<br>`
}})


/*test zone*/



