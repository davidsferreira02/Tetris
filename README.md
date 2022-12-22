# Projeto LDTS-2022 Tetris
 
 ## Group L12GR01 elements

| Name                 | Number    | E-Mail                 |
| -------------------- | --------- | ---------------------- |
| Nuno Silva           | 202108827 |up202108827@edu.fe.up.pt|
| David Ferreira       | 202006302 |up202006302@edu.fc.up.pt|
| Gonçalo Santos       | 202108839 |up202108839@edu.fe.up.pt|

## Gameplay

The game consists in stacking the tetriminos that go down the screen in order to complete horizontal lines.

The BlockHero have different forms and go one after the other randomly, with a specific time gap.

The objective is to fill all the empty space in a line.

When a line forms, it vanishes from the screen, the upper layers fall and the player earned points.

Tetris' goal is just to try to fight the computerized BlockHero dropper to play for as long as possible while you're earning points.


## Controls Game menu:
1. Left - Move to the left;
2. Right - Move to the right;
3. Down - Move down;
4. Z - Rotate right;
5. Up/X - Rotate left;
6. Space - Drop piece;
7. Q/ESC - Exit to menu.



In the main menu, you can select "Up" to select above option or "Down" to select down option.
Then either you choose "Enter" to select current option or "Q/ECS" to exit.



## Implemented Features:

* Starting Menu;
* Tutorial;
* Game Over Message.
* Arena
* BlockHero
* Rotate Block
* Next Form
* About
* lines 
* levels
* points
* music


## Mockups:

<img width="1009" alt="Menu" src="https://user-images.githubusercontent.com/93007518/208271375-ff8f0618-bdd1-4b15-8651-33aafb8ec2f0.png">
<img width="1009" alt="Tutorial" src="https://user-images.githubusercontent.com/93007518/208271393-757ce4a4-c555-4d82-8a15-5a39c12a3266.png">
<img width="1013" alt="About" src="https://user-images.githubusercontent.com/93007518/208271402-ac3bdd9b-4462-409f-97ca-8ea623da13c6.png">
<img width="1013" alt="Begin" src="https://user-images.githubusercontent.com/93007518/208271403-d9c92714-2a63-4f5a-8257-555f6f655108.png">
<img width="1010" alt="Nível 1" src="https://user-images.githubusercontent.com/93007518/208271406-3390e504-0912-482e-b0eb-2b26a0197edb.png">
<img width="1014" alt="Nível 2" src="https://user-images.githubusercontent.com/93007518/208271408-24f9bd72-e51e-493c-bfc9-260b44979fa9.png">
<img width="1010" alt="Nível 3" src="https://user-images.githubusercontent.com/93007518/208271410-51c82584-c8bc-4003-91f8-956916997f94.png">
<img width="1012" alt="Game Over" src="https://user-images.githubusercontent.com/93007518/208271413-ca2f2422-3e93-4017-baa2-0cab23de1fa1.png">




## UML:

![UML_TETRIS_LDTS drawio (1) drawio (4)](https://user-images.githubusercontent.com/93005732/204039990-17b99fcf-1cf4-4e61-b8b5-987bb1eac8ef.png)




## (Design Patterns) utilizados:

### Game Loop Pattern: 

Enquanto um jogo corre, temos um loop que irá correr continuamente. Sem causar interrupção do jogo, a cada loop que ocorra, o input é processado, o modelo é atualizado e o jogo é renderizado. A frequência com que isto acontece será determinada pelos “FPS” (frames por segundo) do jogo.

#### Problema: 
Num jogo como o Tetris, o jogo(game) deve-se repetir continuamente durante o jogo (gameplay).

#### Solução: 
Para cada volta do loop, a entrada do user é processada sem bloquear, atualiza o estado do jogo e renderiza o jogo. O loop do jogo permite que o jogo seja executado sem problemas, independentemente da entrada do user ou da falta dela. Também permite uma gestão mais fácil da taxa de quadros.

### MVC Architecture Pattern:

Qualquer aplicação se encontra dividida em três partes: o ‘Controller’, o ‘Model’ e ‘View’. O ‘Model’ é utilizado, apenas, para guardar a informação, e essa informação é mostrada ao utilizador através do ‘View’. A ‘View’ recebe também os inputs do utilizador, que são depois enviados para o ‘Controller’. Por fim, a função do ‘Controller’ é transformar as ações do utilizador, envia-las para a ‘View’.

#### Problema: 
No Tetris, ou mais amplamente, em qualquer jogo ou aplicação que use uma interface gráfica do usuário (GUI) para comunicar com o usuário, como se podem separar os diferentes componentes?

#### Solução: 
Uma solução comum para isto é a utilização da Arquitetura MVC (também conhecida como Model-View-Controller), que consiste em dividir a aplicação em três partes (o model, a view e o controller).

*Model* - Contém apenas as informações do jogo/aplicaçãp e é independente da GUI. No caso do Tetris, o modelo do jogo, por exemplo, armazena as informações do Tetrimino, quais blocos estão no tabuleiro e onde, quantos pontos o user tem, etc...

*Viewer* - Esta parte é a que ajuda o user a visualizar os dados do modelo. A exibição chama a GUI para representar os dados do modelo de uma maneira que o user possa interagir.

*Controller* - A maior parte do trabalho é feita pelo controlador, que converte as entradas do user em comandos para o jogo/aplicação, que resultam em alterações no modelo.


### State Pattern:

Este padrão será usado para permitir que haja trocas de estado entre o ‘Menu’, ‘Game’ e ‘Tutorial’. A classe ‘Game’ guarda o estado atual e é esse estado que permite à classe ‘Game’ utilizar duas das três partes de uma aplicação, o ‘Controller’ e a ‘View’, próprios de cada estado. Assim, teremos um código onde será mais fácil evitar o uso de instruções demasiado longas, como por exemplo, switch clauses.

#### Problema: 
Um jogo funciona como uma máquina de estado finito. Dado um momento, um jogo só pode estar em um certo estado. No caso do nosso jogo, nós tanto podemos estar no Menu, vendo informação sobre o Jogo, a jogar o Jogo, etc... Pode-se usar a lógica condicional para mudar entre os estados. No entanto, isso não apenas seria mais difícil de ler e manter, mas também seria uma violação do Princípio da Responsabilidade Única e do Princípio Aberto e Fechado.

#### Solução: 
Criar classes para todos os diferentes estados. Todos os estados implementam a mesma interface State. Isto permite que o Game renderize diferentes Views e faça com que o jogador (user) trabalhe em diferentes Controllers sabendo apenas em que estado ele está.

### Factory Method Pattern:

Este padrão está a ser implementado no nosso jogo, no seguimento do State Pattern. As funções ‘getViewer’ e ‘getController’, de uma classe abstrata, vão ser usadas pelos diferentes estados, permitindo assim que ambos os estados possam criar objetos distintos usando controladores e “viewers” diferentes.

#### Problema:
Imaginemos que temos um método que tem de retornar objetos de classes diferentes sempre que for chamado. Ao aplicar o State Pattern, encontramos esse problema. Para cada estado diferente, precisávamos dos métodos getController() e getViewer() para retornar objetos de classes diferentes. A questão é como fazê-lo...

#### Solução: 
O Factory Method é um padrão de desenho que fornece uma interface para criar objetos numa superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Assim, a mesma interface, neste caso,State pode retornar Controllers e Viewers diferentes e necessários.

### Singleton Pattern:

Como a classe ‘Game’ é a classe principal do jogo, temos de garantir que existem apenas um objeto desta classe. Assim implementamos este padrão na classe ‘Game’, para obtermos essa garantia.

#### Problema:
No nosso projeto, existem classes onde não é suposto existir mais que uma instância dessa classe. Por exemplo, num jogo como o Tetris, não queremos que o objeto principal seja criado mais que uma vez, pois deve ser jogado um "jogo" de cada vez no mesmo dispositivo. Além disso, a classe Music no nosso projeto carrega a música que pode ser ouvida no jogo sempre que é construída, por tê-la como um Singleton, ela carregará o arquivo de música apenas uma vez.

#### Solução: 
A criação de um singleton é realizada em duas diferentes etapas, fazendo com que o construtor se torne privado e também criando um método getInstance() que retorna a instância da classe se ela já existir ou cria uma nova instância se ela ainda não existir.


## Code Smells and Possible Refactorings
While working on this project we came across with a lot of  code that was working but wasn't as good/improved as it could be. With that in mind, we've changed our code numerous times to get the most improved we could have, that is, eliminating the code smells that were there.

### Removing Repeated Code
#### Replace Temp with Query
In this case we had the exact same variable being constructed a lot of times in a row.

![Before treating](https://user-images.githubusercontent.com/93007518/208295513-0885ed63-77d3-47ba-8382-cc61db524872.png)

To remove this smell, we constructed the new variable before, and then just called it, instead of constructing it enumerous times.

![After treating](https://user-images.githubusercontent.com/93007518/208295524-31fa03bb-dd78-434c-ad42-6300e831013a.png)

## Coverage

<img width="633" alt="Captura de ecrã 2022-12-22, às 16 31 01" src="https://user-images.githubusercontent.com/93715921/209179697-39e609ce-8d14-42e5-a89a-58f7412704ad.png">


## Pitest

![image](https://user-images.githubusercontent.com/93715921/208268192-4efd2fa5-766d-45fe-bf81-2f106e67b15a.png)

## Better Code Hub

No Better Code Hub conseguimos aingir uma pontuaçao 9/10 falhando apenas no "Keep architecture Components Balanced".Este topico falha porque as nossas classes nao tem tamanhos similares entre eles,isto acontece devido ao facto de termos classes como o AboutController que so tem o seu construtor e uma funçao para abrir a pagina about no menu,e depois temos classes como o ScreenController que nao deixa o bloco ultrapassar os limites da arena,ou se o jogo ja acabou,entre outras features do jogo.
![image](https://user-images.githubusercontent.com/93715921/208268198-c857a68d-991b-4457-a0fa-4e86f3b90f9c.png)


![image](https://user-images.githubusercontent.com/93715921/208268204-20404765-03a2-4cbd-95a1-dee6425391de.png)



## Self-Evaluation
| Name                 | Contribution| 
| -------------------- | --------- | 
| David Ferreira       | 1/3 |
| Gonçalo Santos       | 1/3 |
| Nuno Silva           | 1/3 |



