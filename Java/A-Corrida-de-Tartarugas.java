/* 
A Corrida de Tartarugas

Descrição:
A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem a capturar tartarugas rápidas, e treiná-las para faturar milhões em corridas pelo mundo. Porém a tarefa de apturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:

Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h.
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

Entrada:
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada tartaruga do grupo.

Saída:
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo. 
*/

using System;

class Program {
 public static void Main() {
    int qtEntradas = 3;
      
    while (qtEntradas > 0) {
      var quantidade = Int32.Parse(Console.ReadLine());
        
      if (quantidade >= 1 && quantidade <= 500) {
        string[] cagados = Console.ReadLine().Split(" ");
        var maiorVelocidade = Int32.Parse(cagados[0]);
          
        for (int i = 1; i < quantidade; i++) {
          var cagado = Int32.Parse(cagados[i]);
            
          if ( cagado > maiorVelocidade) {
            maiorVelocidade = cagado;
          }
        }

        if(maiorVelocidade < 10) {
          Console.WriteLine(1);
        } else if (maiorVelocidade >= 10 && maiorVelocidade < 20) {
          Console.WriteLine(2);
        } else if (maiorVelocidade >= 20) {
          Console.WriteLine(3);
        }
        qtEntradas--;
      } else {
        Console.WriteLine("Insira um número entre 1 e 500");
      }
    }
  }
}