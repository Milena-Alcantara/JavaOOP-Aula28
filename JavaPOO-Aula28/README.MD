## Java OOP - Aula 28
### Estrelas Aprendiz

<hr>

**Exercício 1:**
- Crei a Interface lâmpada que recebeu os métodos abstratos ligar() e desligar();
####
- Criei a classe Fluorescente e Incandescente que implementa minha interface e sobrescreve os métodos ligar() e desligar()
retornando uma mensagem de confirmação dos métodos no console;
####
- Criei minha Classe FabricaLampada com o método contruir() que recebe como parâmetro a opção do usuário como _int_ que pode ser 1 - Incandescente ou 2 - Fluorescente, com base nessa escolha, eu instancio um objeto da classe Incandescente ou Fluorescente e exibo no console uma confirmação ao usuário informando que a lâmpada foi criada.
Além disso, depedendo do objeto criado eu chamo os métodos ligar() e desligar() da sua respectiva classe.

<hr>

**Exercício 2:**

- Criei uma interface chamada CalculodeTributos como método de calcularTributos()
####
- Criei a minha classe Conta que possui um atributo _double_ Saldo, e associei o mesmo utilizando o construtor ja inicializando com um valor;
####
- Após isso, criei as classes ContaCorrente e SegurodeVida que herdam o atributo saldo de Conta, implementam a interface calcularTributos e sobrescrevem o método calcularTributos() utilizando o saldo e a regra de negócio onde ContaCorrente tem como valor de tibuto 1% e SegurodeVida tem como taxa o valor R$42.
Além disso, após exibir o valor a ser tributado, os métodos também abatem tributo do saldo de cada Classe e exibem o valor do mesmo em console;
####
- Criei minha classe ContaPoupança com o método verificarPoupança() que permite ao usuário escolher entre consultar o saldo ou depositar um novo valor;
####
- Por fim, na minha classe Conta criei o método decisao(), que permite ao usuário acessar Conta Poupança, Conta Corrente ou Seguro de Vida, e executar os métodos correspondentes.
