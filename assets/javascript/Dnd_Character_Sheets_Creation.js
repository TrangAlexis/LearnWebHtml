/*CLASSES AND SETTERS*/
class mod{
    constructor (bonus){
        this.bonus=bonus
    }
}
function setBonusMod(mod,Bonus){
    mod.bonus = Bonus
}
function addPlus(val){
    if (val>0){
        return "+"+val
    }
    return val
}

/*INITIALISATION*/
/*VALEUR ET MODIFICATEURS DE CARACTERISTIQUES*/
var val_force = 0
var val_dexterite = 0
var val_constitution = 0
var val_intelligence = 0
var val_sagesse = 0
var val_charisme = 0

var mod_force = new mod(0)
var mod_dexterite = new mod(0)
var mod_constitution = new mod(0)
var mod_intelligence = new mod(0)
var mod_sagesse = new mod(0)
var mod_charisme = new mod(0)

/*Bonus*/
var bonus_race_force = 0
var bonus_race_dexterite = 0
var bonus_race_constitution = 0
var bonus_race_intelligence = 0
var bonus_race_sagesse = 0
var bonus_race_charisme = 0

var bonus_mod_force = new mod(0)
var bonus_mod_dexterite = new mod(0)
var bonus_mod_constitution = new mod(0)
var bonus_mod_intelligence = new mod(0)
var bonus_mod_sagesse = new mod(0)
var bonus_mod_charisme = new mod(0)

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

let race = ""
var selectRace = document.getElementById("select_race")

let classeI = ""
var selectClasseI = document.getElementById("select_classe_I")
let niveauI = ""
var selectNiveauI = document.getElementById("select_niveau_I")

let classeII = ""
var selectClasseII = document.getElementById("select_classe_II")
let niveauII = ""
var selectNiveauII = document.getElementById("select_niveau_II")

/*fonction pour récupérer les bonus de race*/
function bonus_race(Race){
    switch (Race.toLowerCase()){
        case "haut-elfe":
            bonus_race_dexterite+=2;
            bonus_race_intelligence+=1;
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
        case "goliath":
            bonus_race_force+=2;
            bonus_race_constitution+=1;
    }
}

let historique = ""
var selectHistorique = document.getElementById("select_historique")



/*GRILLE QUI CONTIENT LES CARACTERISTIQUES PRINCIPALES*/

function prompt_caracteristique(caracteristique,bonusChoisi,spanChoisi,modSpanChoisi,mod_a_changer){

    prompt_message= "Valeur en "+caracteristique+":";
    if (bonusChoisi!=0){
        prompt_message="Valeur en "+caracteristique+" :\n(bonus de race "+bonusChoisi+")"
    };
    let val_caracteristique_finale=`${parseInt(prompt(prompt_message))+bonusChoisi}`;
    spanChoisi.textContent=`${caracteristique.substring(0,3).toUpperCase()} ${val_caracteristique_finale}`;
    let mod_caracteristique=getMod(val_caracteristique_finale);
    modSpanChoisi.textContent=mod_caracteristique;
    setBonusMod(mod_a_changer,parseInt(mod_caracteristique))
}

const force = document.getElementById("caracteristique_force")
const forceSpan = document.getElementById("force_span")
const modForceSpan = document.getElementById("mod_force_span")
force.addEventListener('click',()=>{prompt_caracteristique("force",bonus_race_force,forceSpan,modForceSpan,mod_force);console.log(mod_force)})


const dexterite = document.getElementById("caracteristique_dexterite")
const dexteriteSpan = document.getElementById("dexterite_span")
const modDexteriteSpan = document.getElementById("mod_dexterite_span")
dexterite.addEventListener('click',()=>{prompt_caracteristique("dextérité",bonus_race_dexterite,dexteriteSpan,modDexteriteSpan,mod_dexterite)})


const constitution = document.getElementById("caracteristique_constitution")
const constitutionSpan = document.getElementById("constitution_span")
const modConstitutionSpan = document.getElementById("mod_constitution_span")
constitution.addEventListener('click',() => {prompt_caracteristique("constitution",bonus_race_constitution,constitutionSpan,modConstitutionSpan,mod_constitution)})


const intelligence = document.getElementById("caracteristique_intelligence")
const intelligenceSpan = document.getElementById("intelligence_span")
const modIntelligenceSpan = document.getElementById("mod_intelligence_span")
intelligence.addEventListener('click',() => {prompt_caracteristique("intelligence",bonus_race_intelligence,intelligenceSpan,modIntelligenceSpan,mod_intelligence)})


const sagesse = document.getElementById("caracteristique_sagesse")
const sagesseSpan = document.getElementById("sagesse_span")
const modSagesseSpan = document.getElementById("mod_sagesse_span")
sagesse.addEventListener('click',() => {prompt_caracteristique("sagesse",bonus_race_sagesse,sagesseSpan,modSagesseSpan,mod_sagesse)})


const charisme = document.getElementById("caracteristique_charisme")
const charismeSpan = document.getElementById("charisme_span")
const modCharismeSpan = document.getElementById("mod_charisme_span")
charisme.addEventListener('click',() => {prompt_caracteristique("charisme",bonus_race_charisme,charismeSpan,modCharismeSpan,mod_charisme)})




/*PETITES BOITES AVEC LES COMPETENCES. ELLES S'AFFICHENT QUAND ON CLIQUE SUR LA CARACTERISTIQUE PRINCIPALE QUI LEUR EST ASSOCIEE.*/
const boiteComp = document.getElementById("boite_mod_competences")
let compSpan = document.getElementById("list_mod_competences_span")
modForceSpan.addEventListener('click',() => {           boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Force<br>Sauvegarde: ${addPlus(mod_force.bonus)}`;
                                                        compSpan.innerHTML += `<br>Athlétisme: ${addPlus(mod_force.bonus)}`;
                                                        boiteComp.style.height = "11.5vh"
                                                        boiteComp.style.width = "50vw"
                                                    })

modDexteriteSpan.addEventListener('click',() => {       boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Dexterité<br>Sauvegarde: ${addPlus(mod_dexterite.bonus)}`;
                                                        compSpan.innerHTML += `<br>Accrobatie: ${addPlus(mod_dexterite.bonus)}`;
                                                        compSpan.innerHTML += `<br>Discrétion: ${addPlus(mod_dexterite.bonus)}`;
                                                        compSpan.innerHTML += `<br>Escamotage: ${addPlus(mod_dexterite.bonus)}`;
                                                        boiteComp.style.height = "17.5vh"
                                                        boiteComp.style.width = "50vw"
                                                    })

modConstitutionSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Constitution<br>Sauvegarde: ${addPlus(mod_constitution.bonus)}`;
                                                        boiteComp.style.height = "8.5vh"
                                                        boiteComp.style.width = "50vw"
                                                    })

modIntelligenceSpan.addEventListener('click',() => {    boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Intelligence<br>Sauvegarde: ${addPlus(mod_intelligence.bonus)}`;
                                                        compSpan.innerHTML += `<br>Arcane: ${addPlus(mod_intelligence.bonus)}`;
                                                        compSpan.innerHTML += `<br>Histoire: ${addPlus(mod_intelligence.bonus)}`;
                                                        compSpan.innerHTML += `<br>Investigation: ${addPlus(mod_intelligence.bonus)}`;
                                                        compSpan.innerHTML += `<br>Nature: ${addPlus(mod_intelligence.bonus)}`;
                                                        compSpan.innerHTML += `<br>Religion: ${addPlus(mod_intelligence.bonus)}`;
                                                        boiteComp.style.height = "20vh"
                                                        boiteComp.style.width = "50vw"
                                                    })

modSagesseSpan.addEventListener('click',() => {         boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Sagesse<br>Sauvegarde: ${addPlus(mod_sagesse.bonus)}`;
                                                        compSpan.innerHTML += `<br>Dressage: ${addPlus(mod_sagesse.bonus)}`;
                                                        compSpan.innerHTML += `<br>Médecine: ${addPlus(mod_sagesse.bonus)}`;
                                                        compSpan.innerHTML += `<br>Perception: ${addPlus(mod_sagesse.bonus)}`;
                                                        compSpan.innerHTML += `<br>Perspicacité: ${addPlus(mod_sagesse.bonus)}`;
                                                        compSpan.innerHTML += `<br>Survie: ${addPlus(mod_sagesse.bonus)}`;
                                                        boiteComp.style.height = "20vh"
                                                        boiteComp.style.width = "50vw"
                                                    })

modCharismeSpan.addEventListener('click',() => {        boiteComp.style.backgroundColor = 'rgb(245, 245, 220)';
                                                        boiteComp.style.border = "1px solid black";
                                                        compSpan.innerHTML = `Charisme<br>Sauvegarde: ${addPlus(mod_charisme.bonus)}`;
                                                        compSpan.innerHTML += `<br>Intimidation: ${addPlus(mod_charisme.bonus)}`
                                                        compSpan.innerHTML += `<br>Persuasion: ${addPlus(mod_charisme.bonus)}`
                                                        compSpan.innerHTML += `<br>Représentation: ${addPlus(mod_charisme.bonus)}`
                                                        compSpan.innerHTML += `<br>Tromperie: ${addPlus(mod_charisme.bonus)}`
                                                        boiteComp.style.height = "18vh"
                                                        boiteComp.style.width = "50vw"
                                                        
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
    race=selectRace.value
    console.log(race)

    classeI=selectClasseI.value
    console.log(classeI)
    niveauI=selectNiveauI.value
    console.log(niveauI)

    classeII=selectClasseII.value
    console.log(classeII)
    niveauII=selectNiveauII.value
    console.log(niveauII)
    historique=selectHistorique.value
    console.log(historique)
    liste_capacite_race=[]
    bonus_race(race)

    boiteCapacitesRace.innerHTML=""
    for (const capacite_race of liste_capacite_race){
    boiteCapacitesRace.innerHTML+= `${capacite_race}<br>`
}})


/*test zone*/


