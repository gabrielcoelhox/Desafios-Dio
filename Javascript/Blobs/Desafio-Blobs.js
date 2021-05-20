function quantosDias(quantidadeComida) {
  
    if (quantidadeComida <= 1.0) {
      return 0;
    }
    
    const comeComida = quantidadeComida / 2.0;
    return 1 + quantosDias(comeComida);
    
  }
  
  let casoDeTeste = parseInt(gets());
  
  while (casoDeTeste-- > 0) {
    
    const quantidadeComidacomida = parseFloat(gets());
    const qtdeDias = quantosDias(quantidadeComidacomida);
    
    console.log(qtdeDias, 'dias');
    
  }