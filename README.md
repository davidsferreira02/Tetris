# Projeto LDTS-2022 Tetris
 
 ## Group L12GR01 elements

| Name                 | Number    | E-Mail                 |
| -------------------- | --------- | ---------------------- |
| Nuno Silva           | 202108827 |up202108827@edu.fe.up.pt|
| David Ferreira       | 202006302 |up202006302@edu.fc.up.pt|
| Gonçalo Santos       | 202108839 |up202108839@edu.fe.up.pt|

**Gameplay**

The game consists in stacking the tetriminos that go down the screen in order to complete horizontal lines.

The BlockHero have different forms and go one after the other randomly, with a specific time gap.

The objective is to fill all the empty space in a line.

When a line forms, it vanishes from the screen, the upper layers fall and the player earned points.

Tetris' goal is just to try to fight the computerized BlockHero dropper to play for as long as possible while you're earning points.


**Controls Game menu:**

1. Right - Move to the right;
2. Left - Move to the left;
3. Z - Rotate right;
4. Up/X - Rotate left;
5. Space - Drop piece;
6. Down - Move down;
7. Q/ESC - Exit to menu.



In the main menu, you can select "Up" to select above option or "Down" to select down option.
Then either you choose "Enter" to select current option or "Q/ECS" to exit.



**Implemented Features:**

* Starting Menu;
* Tutorial;
* Game Over Message.
* Arena
* BlockHero
* Rotate Block


**Mockups:**

![image](https://user-images.githubusercontent.com/93715921/203797407-4248cfe7-538b-43d6-a44f-d978c270eeeb.png)
![image](https://user-images.githubusercontent.com/93715921/203797500-1aa1bdc8-cd3d-409e-8642-18c8f0a26fe6.png)
![image](https://user-images.githubusercontent.com/93715921/203797588-e78cbd12-41cd-46c4-a926-29db9a6e00b9.png)
![image](https://user-images.githubusercontent.com/93715921/203797641-3036cba7-e3c9-42f9-905c-e51b18b86a65.png)



**UML:**

![UML_TETRIS_LDTS drawio (1) drawio (2)](https://user-images.githubusercontent.com/93005732/203954730-b07ee79e-5abd-4475-ab24-c9e06aa85609.png)



**(Design Patterns) utilizados:**

 Game Loop Pattern: 
	Em quanto um jogo corre, temos um loop que irá correr continuamente. Sem causar interrupção do jogo, a cada loop que ocorra, o input é processado, o modelo é atualizado e o jogo é renderizado. A frequência com que isto acontece será determinada pelos “FPS” (frames por segundo) do jogo.

MVC Architecture Pattern:
	Qualquer aplicação se encontra dividida em três partes: o ‘Controller’, o ‘Model’ e ‘View’.
O ‘Model’ é utilizado, apenas, para guardar a informação, e essa informação é mostrada ao utilizador através do ‘View’. A ‘View’ recebe também os inputs do utilizador, que são depois enviados para o ‘Controller’. Por fim, a função do ‘Controller’ é transformar as ações do utilizador, envia-las para a ‘View’.	

 
State Pattern:
	Este padrão será usado para permitir que haja trocas de estado entre o ‘Menu’, ‘Game’ e ‘Tutorial’. A classe ‘Game’ guarda o estado atual e é esse estado que permite à classe ‘Game’ utilizar duas das três partes de uma aplicação, o ‘Controller’ e a ‘View’, próprios de cada estado. Assim, teremos um código onde será mais fácil evitar o uso de instruções demasiado longas, como por exemplo, switch clauses.

Factory Method Pattern:
	Este padrão está a ser implementado no nosso jogo, no seguimento do State Pattern. As funções ‘getViewer’ e ‘getController’, de uma classe abstrata, vão ser usadas pelos diferentes estados, permitindo assim que ambos os estados possam criar objetos distintos usando controladores e “viewers” diferentes.


Singleton Pattern:
	Como a classe ‘Game’ é a classe principal do jogo, temos de garantir que existem apenas um objeto desta classe. Assim implementamos este padrão na classe ‘Game’, para obtermos essa garantia.






