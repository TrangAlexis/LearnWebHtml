const ecranH = document.getElementById("ecran-haut")
const ecranB = document.getElementById("ecran-bas")

let currentNumber = ""
let total = 0
let ligneCalcul = ""

const btnC = document.getElementById("btn-c")
const btn1 = document.getElementById("btn-1")
const btn2 = document.getElementById("btn-2")
const btn3 = document.getElementById("btn-3")
const btn4 = document.getElementById("btn-4")
const btn5 = document.getElementById("btn-5")
const btn6 = document.getElementById("btn-6")
const btn7 = document.getElementById("btn-7")
const btn8 = document.getElementById("btn-8")
const btn9 = document.getElementById("btn-9")
const btn0 = document.getElementById("btn-0")
const btnParentheseGauche = document.getElementById("btn-parenthese-gauche")
const btnParentheseDroite = document.getElementById("btn-parenthese-droite")
const btnPoint = document.getElementById("btn-point")
const btnSlash = document.getElementById("btn-slash")
const btnEtoile = document.getElementById("btn-*")
const btnMoins = document.getElementById("btn-moins")
const btnPlus = document.getElementById("btn-plus")
const btnEgale = document.getElementById("btn-egale")

btnC.addEventListener('click', ()=>{ecranB.textContent="";ecranH.textContent="";ligneCalcul="";newLineCalcul="";currentNumber="";total=0})

btn1.addEventListener('click', ()=>{currentNumber+="1";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn2.addEventListener('click', ()=>{currentNumber+="2";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn3.addEventListener('click', ()=>{currentNumber+="3";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn4.addEventListener('click', ()=>{currentNumber+="4";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn5.addEventListener('click', ()=>{currentNumber+="5";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn6.addEventListener('click', ()=>{currentNumber+="6";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn7.addEventListener('click', ()=>{currentNumber+="7";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn8.addEventListener('click', ()=>{currentNumber+="8";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn9.addEventListener('click', ()=>{currentNumber+="9";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})
btn0.addEventListener('click', ()=>{currentNumber+="0";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"};console.log(currentNumber)})

btnParentheseGauche.addEventListener('click', ()=>{ligneCalcul+=currentNumber+"(";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})
btnParentheseDroite.addEventListener('click', ()=>{ligneCalcul+=currentNumber+")";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})
btnPoint.addEventListener('click', ()=>{if (currentNumber.includes(".")){currentNumber=currentNumber.replace(".","")};currentNumber+=".";ecranB.textContent=ligneCalcul+currentNumber;if(ecranH.textContent==""){ecranH.textContent="0"}})

btnSlash.addEventListener('click', ()=>{ligneCalcul+=currentNumber+"/";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})
btnEtoile.addEventListener('click', ()=>{ligneCalcul+=currentNumber+"*";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})
btnMoins.addEventListener('click', ()=>{ligneCalcul+=currentNumber+"-";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})
btnPlus.addEventListener('click', ()=>{ligneCalcul+=currentNumber+"+";currentNumber="";ecranB.textContent=ligneCalcul;if(ecranH.textContent==""){ecranH.textContent="0"}})

btnEgale.addEventListener('click',()=>{ecranB.textContent="";ligneCalcul+=currentNumber;console.log(ligneCalcul);currentNumber="";if(ligneCalcul[0]=="("){ligneCalcul="+"+ligneCalcul}; total=parseInt(`${eval(total+ligneCalcul)}`);ligneCalcul=""; ecranH.textContent=total})
