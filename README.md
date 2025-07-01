# Calculadora de Média Ponderada

## Visão Geral

Este programa Java solicita ao usuário que digite o número de vezes que o cálculo da média ponderada será realizado. Para cada cálculo, o usuário deverá inserir três valores para as médias, que serão ponderadas com os pesos 2, 3 e 5, respectivamente. O programa exibirá o resultado de cada média ponderada calculada.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa abrirá caixas de diálogo para solicitar o número de cálculos e, em seguida, os valores das médias para cada cálculo.

## Explicação do Código

O código Java realiza as seguintes operações:

* **Importa `javax.swing.*`:** Importa as classes necessárias para criar janelas de diálogo gráficas.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada da execução do programa.
* **Solicita o número de repetições:**
    * `int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de vezes que o caso vai se repetir!"))`: Abre uma caixa de diálogo para o usuário inserir o número de vezes que o cálculo da média ponderada será realizado. A entrada (uma `String`) é convertida para um inteiro usando `Integer.parseInt()` e armazenada na variável `n`. **Esta é uma operação de conversão de tipo (parsing).**
* **Loop `for`:** Um loop `for` é executado `n` vezes.
    * **Solicita os valores das médias:** Dentro do loop, para cada iteração:
        * `double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"))`: Solicita ao usuário o primeiro valor da média. A entrada (uma `String`) é convertida para um número de ponto flutuante de precisão dupla (`double`) usando `Double.parseDouble()` e armazenada na variável `a`. **Ocorre outra operação de parsing.**
        * `double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"))`: Solicita o segundo valor da média, convertendo a entrada para `double` e armazenando em `b`. **Mais uma operação de parsing.**
        * `double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"))`: Solicita o terceiro valor da média, convertendo a entrada para `double` e armazenando em `c`. **E outra operação de parsing.**
    * **Calcula a média ponderada:**
        * `double media = ((a * 2.0 + b * 3.0 + c * 5.0) / 10.0);`: Calcula a média ponderada utilizando a fórmula fornecida, com pesos de 2 para `a`, 3 para `b`, e 5 para `c`. A soma dos pesos é 2 + 3 + 5 = 10.0.
    * **Exibe o resultado:**
        * `JOptionPane.showMessageDialog(null,"O valor da média ponderada é: " + media)`: Exibe uma caixa de diálogo mostrando o valor da média ponderada calculada para o conjunto de valores inseridos.

## Conversão de Tipos (Parsing)

Neste código, a conversão de tipos (parsing) é fundamental para trabalhar com os valores inseridos pelo usuário. Os métodos `Integer.parseInt()` e `Double.parseDouble()` são utilizados para converter as `Strings` retornadas pelas caixas de diálogo de entrada para os tipos numéricos `int` e `double`, respectivamente.

* `Integer.parseInt()`: Converte uma `String` para um número inteiro.
* `Double.parseDouble()`: Converte uma `String` para um número de ponto flutuante de precisão dupla.

## Requisitos

* Java Development Kit (JDK) instalado no sistema.

## Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Salve o código em `seu_projeto/principal/Main.java`.
3.  Abra o terminal e navegue até a pasta `seu_projeto`.
4.  Compile o código com: `javac principal/Main.java`
5.  Execute o programa com: `java principal.Main`

## Exemplo de Uso

1.  Ao executar o programa, a primeira caixa de diálogo perguntará "Digite o valor de vezes que o caso vai se repetir!". Se você digitar `2` e clicar em "OK".
2.  Para o primeiro cálculo, aparecerão três caixas de diálogo pedindo os valores das médias. Se você digitar `7.5`, `8.0` e `9.5` e clicar em "OK" para cada um, uma caixa de diálogo mostrará "O valor da média ponderada é: 8.65".
3.  Em seguida, o programa solicitará novamente os três valores das médias para o segundo cálculo. Você poderá inserir outros valores e ver o resultado da média ponderada correspondente.

## Autor

gustavodees

gustavoemartins@gmail.com
