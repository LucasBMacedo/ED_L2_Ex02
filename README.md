📁 projeto: Resto da Divisão Recursiva por Subtrações

📝 descricao: >
  Aplicação em Java que utiliza uma função recursiva para calcular o **resto da divisão**
  de dois números inteiros (dividendo e divisor) utilizando apenas subtrações sucessivas. A cada iteração,
  o dividendo vai sendo subtraído do divisor até que o dividendo se torne menor que o divisor, momento em que
  o dividendo restante é o resto da divisão.

🗂️ estrutura_de_arquivos:
  - 📄 caminho: src/controller/RestoDaDivisao.java
    descricao: Contém o método recursivo que calcula o resto da divisão 🔁
  - 📄 caminho: src/view/Principal.java
    descricao: Interage com o usuário, captura os valores e exibe o resultado via JOptionPane 📤

🧠 logica_da_recursividade:
  metodo: CalcularRestoDaDivisao(int dividendo, int divisor)
  explicacao:
    - ✋ condicao_de_parada: >
        Quando o dividendo for menor que o divisor, o algoritmo retorna o dividendo como o resto da divisão.
        Ou quando o dividendo for igual ao divisor, o resto é zero.
    - 🔁 relacao_recursiva: >
        Se o dividendo for maior que o divisor, subtrai-se o divisor do dividendo e chama-se a função novamente.
        Caso contrário, retorna-se o dividendo como o resto final.

💬 exemplo_execucao:
  entrada:
    - Dividendo: 17
    - Divisor: 5
  saida: O resto da divisão de 17 por 5 é: 2 🎯

📥 entrada:
  tipo: JOptionPane
  descricao: O usuário informa dois valores inteiros via caixas de diálogo (dividendo e divisor) 🧾

📤 saida:
  tipo: JOptionPane
  descricao: Exibe o **resto da divisão** em uma janela de mensagem 📢

📌 observacoes:
  - ✅ Utiliza subtrações para simular a divisão, retornando o resto da operação.
  - 🔄 Função recursiva com controle de fluxo para quando o dividendo se torna menor que o divisor.
  - 🧼 Código estruturado de maneira clara, com lógica separada da interface de usuário.
  - ⚠️ O código não trata caso de divisor igual a zero, o que pode causar erro de divisão por zero.

👨‍💻 autor:
  nome: **Lucas Bezerra de Macedo**
