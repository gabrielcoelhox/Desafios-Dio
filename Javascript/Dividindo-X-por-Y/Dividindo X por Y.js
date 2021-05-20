let limit = parseInt(gets());
for (let i = 0; i < limit; i++) {
    let line = gets().split(" ");
    let X = parseInt(line[0]);
    let Y = parseInt(line[1]);
    if (Y == 0) {
        console.log("divisao impossivel");
    } else {
        let divisao = parseFloat(X / Y).toFixed(1); //complete com o sinal da operação faltante entre x e y
        console.log(divisao);
    }
}

function quantosDias(comida) {
  
    if (comida <= 1.0) {
      return 0;
    }
    
    const comeComida = comida / 2.0;
    return 1 + quantosDias(comeComida);
    
  }
  
  let casoDeTeste = parseInt(gets());
  
  while (casoDeTeste-- > 0) {
    
    const comida = parseFloat(gets());
    const qtdeDias = quantosDias(qtdComida);
    
    console.log(qtdeDias, 'dias');
    
  }