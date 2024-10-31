First class Position

Checklist:
 - Class Position [public]
 - OOP Topics
   - Encapsulation
   - Constructors
   - ToString (Object/overriding).

Starting to implement Board and Piece

Checklist:
 - Classes Piece, Board [public]
 - OOP Topics:
   - Associations
   - Encapsulation
 - Data structures Topics:
   -Matrix


Chess layer and printing the board:

8 - - - - - - - - <br>
7 - - - - - - - - <br>
6 - - - - - - - - <br>
5 - - - - - - - - <br>
4 - - - - - - - - <br>
3 - - - - - - - - <br>
2 - - - - - - - - <br>
1 - - - - - - - - <br>

Placing pieces on the board

Checklist:
 - Method: Board.PlacePiece(piece, position)
 - Classes: Rook, King[public]
 - Method: ChessMatch.InitialSetup
 - OOP Topics:
   - Inheritance
   - Overriding
   - Polymorphism (ToString)


BoardException and defensive programming

Checklist:
   - Class BoardException[public]
   - Methods: Board, PositionExists, Board.ThereIsAPiece
   - Implement defensive programming in Boards methods
   - OOP Topics:
     - Exceptions
     - Constructors (a string must be informed to the exception)

ChessException and ChessPosition

Checklist:
 - Class ChessException:[public]
 - Class ChessPosition[public]
 - Refactor ChessMatch.InitialSetup
 - OOP Topics:
   - Exceptions
   - Encapsulation
   - Constructors (a string must be informed to the exception)
   - Overriding
   - Static members
   - Layers pattern
 
Little improvement in board printing

Color terminal:
 - Windows: git bash
 - Mac: Google "osx terminal color"

Checklist:
 - Place more pieces on the board.
 - Distinguish piece colors in UI.PrintPiece method