enum class Charater 
{
    King,
    Queen,
    Rook,
    Bishop,
    Knight,
    Pawn,
    Empty
}

fun main()
{
    val board: ArrayList<ArrayList<Charater>> = arrayListOf(
        arrayListOf(Charater.Rook,Charater.Knight,Charater.Bishop,Charater.Queen,Charater.King,Charater.Bishop,Charater.Knight,Charater.Rook),
        arrayListOf(Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn),
        arrayListOf(Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty),
        arrayListOf(Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty),
        arrayListOf(Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty),
        arrayListOf(Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty,Charater.Empty),
        arrayListOf(Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn,Charater.Pawn),
        arrayListOf(Charater.Rook,Charater.Knight,Charater.Bishop,Charater.Queen,Charater.King,Charater.Bishop,Charater.Knight,Charater.Rook),
    )

    //print board first
    print_board(board)
    
    //user input for make sure  which chess you choose
    println("Please chooooose a chess")
    println("Enter row:")
    val user_in_row:Int = readLine()!!.toInt()
    println("Enter column:")
    val user_in_col:Int = readLine()!!.toInt()
    move_chess(board,user_in_row,user_in_col)
}

fun move_chess(board:ArrayList<ArrayList<Charater>>,user_in_row:Int,user_in_col:Int)
{
    when(board[user_in_row][user_in_col])
    {
        Charater.King -> 
        {
            println("Now you choose the King")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_in_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_in_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_in_row][user_in_col+1] == board[user_in_row][user_in_col-1] || 
                    board[user_in_row][user_in_col-1] == board[user_in_row+1][user_in_col] || 
                    board[user_in_row+1][user_in_col] == board[user_in_row-1][user_in_col] ||
                    board[user_in_row-1][user_in_col] == board[user_in_row-1][user_in_col-1] || 
                    board[user_in_row-1][user_in_col-1] == board[user_in_row+1][user_in_col+1] ||
                    board[user_in_row+1][user_in_col+1] == board[user_in_row-1][user_in_col+1] || 
                    board[user_in_row+1][user_in_col+1] == board[user_in_row+1][user_in_col-1] &&
                    board[user_in_row][user_in_col+1] != Charater.Empty)
                {
                    println("There already ahve people >:( ")
                }
                //if is empty then put the chess 
                //if you put the wrong place
                else if()
                {
                    println("I can't move here :(")
                }
                //you put the right place
                else if(board[user_in_row][user_in_col] == )
                {
                    println("Ok I will go there!")
                    board[user_in_row][user_in_col] = Charater.King
                    print_board(board)
                    check = false
                }    
            }
        }
    

        Charater.Queen ->
        {
            println("Now you choose the Queen")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_in_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_in_col:Int = readLine()!!.toInt()

                //check empty
                if( != Charater.Empty)
                {
                    println("You can't move there my load")
                }
                //if is empty then put the chess 
                //if you put the wrong place
                else if()
                {
                    println("No!not here! >:/")
                }
                //you put the right place
                else
                {
                    println("Ok, I will move :/")
                    board[user_in_row][user_in_col] = Charater.Queen
                    print_board(board)
                    check = false
                }
            }
        }

        Charater.Rook -> 
        {
            println("Now you choose the Rook")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_in_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_in_col:Int = readLine()!!.toInt()

                //check empty
                if( != Charater.Empty)
                {
                    println("Oops not here!")
                }
                //if is empty then put the chess 
                //if you put the wrong place
                else if( )
                {
                    println("I'm stuck :'( ")
                }
                //you put the right place
                else
                {
                    println("HAHA I'm going!")
                    board[user_in_row][user_in_col] = Charater.Rook
                    print_board(board)
                    check = false
                }
            }
        }

        Charater.Bishop -> 
        {
            println("Now you choose the Bishop")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_in_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_in_col:Int = readLine()!!.toInt()

                //check empty
                if( != Charater.Empty)
                {
                    println("I hope God have give you the eyes -_-")
                }
                //if is empty then put the chess 
                //if you put the wrong place
                else if()
                {
                    println("I can't move there")
                }
                //you put the right place
                else
                {
                    println("OK...")
                    board[user_in_row][user_in_col] = Charater.Bishop
                    print_board(board)
                    check = false
                }
            }
        }

        Charater.Knight ->
        {
            println("Now you choose the Knight")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_in_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_in_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_in_row-1][user_in_col+2] == board[user_in_row-2][user_in_col+1] || 
                   board[user_in_row-2][user_in_col+1] == board[user_in_row+1][user_in_col+2] ||
                   board[user_in_row+1][user_in_col+2] == board[user_in_row+2][user_in_col+1] ||
                   board[user_in_row+2][user_in_col+1] == board[user_in_row-2][user_in_col-1] ||
                   board[user_in_row-2][user_in_col-1] == board[user_in_row-1][user_in_col-2] ||
                   board[user_in_row-1][user_in_col-2] == board[user_in_row+2][user_in_col-1] ||
                   board[user_in_row+2][user_in_col-1] == board[user_in_row+1][user_in_col-2] &&
                   board[user_in_row-1][user_in_col+2] != Charater.Empty)
                {
                    println("Are you serious? >:(")
                }
                //put the right place
                else if()
                {
                    println("I will bring the victory!")
                    board[user_in_row][user_in_col] = Charater.Knight
                    print_board(board)
                    check = false
                }
                //put the wrong place
                else
                {
                    println("I can't move >:0")
                }
            }
        }

        Charater.Pawn ->
        {
            println("Now you choose the Pawn")
            var check = true
            while(check)
            {
                println("Where you want to put the chess?")
                println("Enter row:")
                val user_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_row][user_col] != Charater.Empty)
                {
                    println("Hey! You scared me! :0")
                    println("Select other place!")
                }
                //check the original place if equal to its forward 1 step then it's a ligal step
                else if(board[user_in_row][user_in_col] == board[user_in_row][user_in_col+1])
                {
                    println("Go Go Go!!!")
                    board[user_row][user_col] = Charater.Pawn
                    print_board(board)
                    board[user_in_row][user_in_col] = Charater.Empty
                    check = false
                }
                //put the wrong place
                else
                {
                    println("I can't go there :(")
                }
            }
        }

        Charater.Empty -> 
        {
            println("Hmm interesting...")
            println("What did you see...?")
        }
    }
}


fun print_board(board:ArrayList<ArrayList<Charater>>)
{
    for(i in 0..7)
    {
        println(" ")
        if(i > 0)
        {
            println("------|------|------|------|------|------|------|------")
        }
        for(j in 0..7)
        {
            when(board[i][j])
            {
                Charater.King -> print(" King ")
                Charater.Queen -> print(" Queen ")
                Charater.Rook -> print("  Rook ")
                Charater.Bishop -> print(" Bishop ")
                Charater.Knight -> print("Knight")
                Charater.Pawn -> print(" Pawn  ")
                Charater.Empty -> print(" ")
            }
        }
    }
    println("")
}