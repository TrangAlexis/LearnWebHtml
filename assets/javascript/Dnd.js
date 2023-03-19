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
const nom = document.getElementById("Nom")
const nomSpan = document.getElementById("nom_span")
nom.addEventListener('click',() => {nomSpan.textContent=prompt("Entrez nom:")})

const classe = document.getElementById("Classe")
const classeSpan = document.getElementById("classe_span")
classe.addEventListener('click',() => {classeSpan.textContent=prompt("Entrez classe:")})

const race = document.getElementById("Race")
const raceSpan = document.getElementById("race_span")
race.addEventListener('click',() => {raceSpan.textContent=prompt("Entrez race:")})

/*fonction pour récupérer les bonus de race*/
function bonus_race(Race){
    switch (Race.toLowerCase()){
        case "haut-elfe":
            val_dexterite+=2;
            val_intelligence+=1;
            vitesse=9;
            liste_capacite_race.push("Vision dans le noir","Sens aiguisés","Ascendance féerique","Transe","Entraînement aux armes elfiques","Sort mineur","Langue supplémentaire")
            maitr_armes.push("épées longues","épées courtes", "arcs longs","arcs courts")
            maitr_langues.push("Commun","Elfique")
            break;
        case "elfe des bois":
            val_dexterite+=2;
            val_sagesse+=1;
            vitesse=10.5;
            liste_capacite_race.push("Vision dans le noir","Sens aiguisés","Ascendance féerique","Transe","Entraînement aux armes elfiques","Foulée légère","Cachette naturelle")
            maitr_armes.push("épées longues","épées courtes", "arcs longs","arcs courts")
            break;

        case "drow":
            val_dexterite+=2;
            val_charisme+=1;
            vitesse=9;
            liste_capacite_race.push("Vision dans le noir supérieure","Sens aiguisés","Ascendance féerique","Transe","Sensibilité au soleil", "Magie drow", "Entrainement aux armes drows");
            maitr_langues.push("Commun","Elfique");
            maitr_armes.push("rapières","épées courtes","arbalètes de poing")
            break;
    }
}

const historique = document.getElementById("Historique")
const historiqueSpan = document.getElementById("historique_span")
historique.addEventListener('click',() => {historiqueSpan.textContent=prompt("Entrez historique:")})




/*GRILLE QUI CONTIENT LES CARACTERISTIQUES PRINCIPALES*/

const force = document.getElementById("caracteristique_force")
const forceSpan = document.getElementById("force_span")
const modForceSpan = document.getElementById("mod_force_span")
force.addEventListener('click',() => {let val_force_finale=`${parseInt(prompt("Valeur en force:"))+val_force}`;forceSpan.textContent=`FOR ${val_force_finale}`;mod_force=getMod(val_force_finale);modForceSpan.textContent=mod_force})

const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")

dexterite.addEventListener('click',() => {val_dexterite+=prompt("Valeur en dexterite:");dexteriteSpan.textContent=`DEX ${val_dexterite}`;mod_dexterite=getMod(val_dexterite);modDexteriteSpan.textContent=mod_dexterite})

const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")
constitution.addEventListener('click',() => {val_constitution+=prompt("Valeur en constitution:");constitutionSpan.textContent=`CON ${val_constitution}`;mod_constitution=getMod(val_constitution);modConstitutionSpan.textContent=mod_constitution})


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
                                                    })

modDexteriteSpan.addEventListener('click',() => {       boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Dexterité<br>Sauvegarde: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Accrobatie: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Discrétion: ${mod_dexterite}`;
                                                        compSpan.innerHTML += `<br>Escamotage: ${mod_dexterite}`;
                                                        boiteComp.style.height = "17.5vh"
                                                    })

modConstitutionSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Constitution<br>Sauvegarde: ${mod_constitution}`;
                                                        boiteComp.style.height = "8.5vh"
                                                    })

modIntelligenceSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Intelligence<br>Sauvegarde: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Arcane: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Histoire: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Investigation: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Nature: ${mod_intelligence}`;
                                                        compSpan.innerHTML += `<br>Religion: ${mod_intelligence}`;
                                                        boiteComp.style.height = "22.5vh"
                                                    })

modSagesseSpan.addEventListener('click',() => {         boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Sagesse<br>Sauvegarde: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Dressage: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Médecine: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Perception: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Perspicacité: ${mod_sagesse}`;
                                                        compSpan.innerHTML += `<br>Survie: ${mod_sagesse}`;
                                                        boiteComp.style.height = "23vh"
                                                    })

modCharismeSpan.addEventListener('click',() => {        boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Charisme<br>Sauvegarde: ${mod_charisme}`;
                                                        compSpan.innerHTML += `<br>Intimidation: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Persuasion: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Représentation: ${mod_charisme}`
                                                        compSpan.innerHTML += `<br>Tromperie: ${mod_charisme}`
                                                        
                                                    })

boiteComp.addEventListener('click',() => {              boiteComp.style.backgroundColor = 'rgba(0, 0, 0, 0)';
                                                        boiteComp.style.border = "";
                                                        compSpan.innerHTML = ""})


/*CAPACITES*/

const boiteCapacitesRace = document.getElementById("boite_capacites_race")

const spanTest = document.getElementById("refresh_race")
spanTest.addEventListener('click', () => {
    liste_capacite_race=[]
    boiteCapacitesRace.innerHTML=""
    bonus_race(raceSpan.innerHTML)

    for (const capacite_race of liste_capacite_race){
    boiteCapacitesRace.innerHTML+= `${capacite_race}<br>`
}})


/*test zone*/



