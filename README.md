# 🎮 Tic-Tac-Toe Game (Java Console Application)

A simple **Tic-Tac-Toe** game built using the **MVC (Model–View–Controller)** architecture in Java.  
This project cleanly separates logic, data, and user interaction — making it easy to understand, extend, and maintain.

---

## 🧠 Project Overview

This is a **console-based** implementation of the classic Tic-Tac-Toe game for two players (`X` and `O`).  
Players take turns entering row and column positions, and the program determines when a player wins or when the game ends in a draw.

---

### 🧩 Layer Responsibilities

| Layer | Description |
|-------|--------------|
| **Model** | Defines the board and its data structure. |
| **Repository** | Manages and stores the current game state (Singleton pattern). |
| **Service** | Contains all game logic: updating board, checking rows/columns/diagonals, and winner detection. |
| **Controller** | Acts as the middle layer between the View and Service. |
| **View** | Handles user input/output and displays the game board on the console. |

---
### Sample Output
========== Tic-Tac-Toe Game ==========
1. Start The Game
2. Exit
1
 | | |
 | | |
 | | |

It is X's Turn !!!!
Please Enter the row and Column
0 0

X| | |
 | | |
 | | |

It is O's Turn !!!!
Please Enter the row and Column
1 1
...
X Wins!!!
