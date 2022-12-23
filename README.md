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


## Game Loop Pattern:

While a game is running, we have a loop that will run continuously. Without interrupting the game, with each loop that occurs, the input is processed, the model is updated and the game is rendered. How often this happens will be determined by the “FPS” (frames per second) of the game.

### Problem:

In a game like Tetris, the game (game) must be repeated continuously during the game (gameplay).

### Solution:

For each round of the loop, user input is processed without blocking, updates the game state, and renders the game. The game loop allows the game to run smoothly regardless of user input or lack thereof. It also allows for easier frame rate management.


## MVC Architecture Pattern:

Any application is divided into three parts: the 'Controller', the 'Model' and the 'View'. The 'Model' is used only to store the information, and this information is shown to the user through the 'View'. The 'View' also receives inputs from the user, which are then sent to the 'Controller'. Finally, the function of the 'Controller' is to transform the user's actions, send them to the 'View'.

### Problem:

In Tetris, or more broadly any game or application that uses a graphical user interface (GUI) to communicate with the user, how do you separate the different components?
### Solution:

A common solution for this is the use of the MVC Architecture (also known as Model-View-Controller), which consists of dividing the application into three parts (the model, the view and the controller).

Model - Contains game/application information only and is GUI independent. In the case of Tetris, the game model, for example, stores Tetrimino information, which blocks are on the board and where, how many points the user has, etc...

Viewer - This part is what helps the user to visualize the model data. The view calls the GUI to represent the model's data in a way that the user can interact with.

Controller - Most of the work is done by the controller, which converts user inputs into commands for the game/application, which result in model changes.


## State Pattern:

This pattern will be used to allow state switching between 'Menu', 'Game' and 'Tutorial'. The 'Game' class stores the current state and it is this state that allows the 'Game' class to use two of the three parts of an application, the 'Controller' and the 'View', specific to each state. Thus, we will have a code where it will be easier to avoid using too long instructions, such as switch clauses.
### Problem:

A game works like a finite state machine. Given a moment, a game can only be in a certain state. In the case of our game, we can either be in the Menu, seeing information about the Game, playing the Game, etc... Conditional logic can be used to switch between states. However, not only would this be more difficult to read and maintain, it would also be a violation of the Single Responsibility Principle and the Open Closed Principle.
### Solution:

Create classes for all the different states. All states implement the same State interface. This allows the Game to render different Views and make the player (user) work on different Controllers knowing only what state he is in.


## Factory Method Pattern:

This pattern is being implemented in our game, following the State Pattern. The functions 'getViewer' and 'getController', from an abstract class, will be used by different states, thus allowing both states to create different objects using different controllers and "viewers".
### Problem:

Let's imagine that we have a method that has to return objects of different classes every time it is called. When applying the State Pattern, we encountered this problem. For each different state, we needed getController() and getViewer() methods to return objects of different classes. The question is how to do it...
### Solution:

The Factory Method is a design pattern that provides an interface for creating objects in a superclass, but allows subclasses to change the type of objects that will be created. Thus, the same interface, in this case, State can return different and necessary Controllers and Viewers.


## Singleton Pattern:

As the 'Game' class is the main class of the game, we have to ensure that there is only one object of this class. So we implement this pattern in the 'Game' class, to obtain this guarantee.
### Problem:

In our project, there are classes where no more than one instance of that class is supposed to exist. For example, in a game like Tetris, we don't want the main object to be created more than once, as it must be played one "game" at a time on the same device. Also, the Music class in our project loads the music that can be heard in the game every time it is built, by having it as a Singleton it will only load the music file once.
### Solution:

Creating a singleton is done in two different steps, making the constructor private and also creating a getInstance() method that returns the instance of the class if it already exists or creates a new instance if it doesn't already exist.



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

<img width="1008" alt="image" src="https://user-images.githubusercontent.com/93715921/209180610-6164869b-2297-4a08-b5e4-8b4f7671a108.png">

http://localhost:63342/Tetris/build/reports/pitest/202212211219/index.html?_ijt=cm4b87ssp7joi0if9a4dukpulk&_ij_reload=RELOAD_ON_SAVE

## Better Code Hub

In Better Code Hub we managed to achieve a score of 9/10 failing only in "Keep architecture Components Balanced". This topic fails because our classes do not have similar sizes between them, this happens due to the fact that we have classes like AboutController that only have the its constructor is a function to open the about page in the menu, and then we have classes like the ScreenController that doesn't let the block go beyond the limits of the arena, or if the game is already over, among other features of the game.


![image](https://user-images.githubusercontent.com/93715921/208268198-c857a68d-991b-4457-a0fa-4e86f3b90f9c.png)


![image](https://user-images.githubusercontent.com/93715921/208268204-20404765-03a2-4cbd-95a1-dee6425391de.png)



## Self-Evaluation
| Name                 | Contribution| 
| -------------------- | --------- | 
| David Ferreira       | 1/3 |
| Gonçalo Santos       | 1/3 |
| Nuno Silva           | 1/3 |



