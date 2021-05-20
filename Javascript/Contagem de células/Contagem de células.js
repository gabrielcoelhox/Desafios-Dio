let valorNotas = [100, 50, 20, 10, 5, 2, 1];
let quantidadeNotas = [0, 0, 0, 0, 0, 0, 0];

let quantia = parseInt(gets());

let resto = quantia;

while (resto >= 1) {
  
  nota = valorNotas.findIndex(value => value <= resto);
  quantidadeNotas[nota] = Math.trunc(resto / valorNotas[nota]);
  resto = resto % valorNotas[nota];

}

console.log(quantia);
console.log(quantidadeNotas[0] + " nota(s) de R$ 100,00");
console.log(quantidadeNotas[1] + " nota(s) de R$ 50,00");
console.log(quantidadeNotas[2] + " nota(s) de R$ 20,00");
console.log(quantidadeNotas[3] + " nota(s) de R$ 10,00");
console.log(quantidadeNotas[4] + " nota(s) de R$ 5,00");
console.log(quantidadeNotas[5] + " nota(s) de R$ 2,00");
console.log(quantidadeNotas[6] + " nota(s) de R$ 1,00");
