let X = 0;
let alcohol = 0;
let gasoline = 0;
let diesel = 0;

while (X !== 4) {
  X = parseInt(gets());  
  if (X == 1) {
    alcohol++;
  } else if (X == 2) {
    gasoline++;    
  } else if (X == 3) {
    diesel++;
  } 
}

console.log("MUITO OBRIGADO");
console.log("Alcool: " + alcool);
console.log("Gasolina: " + gasolina);
console.log("Diesel: " + diesel);