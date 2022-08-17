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
                val user_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_row][user_col] != Charater.Empty)
                {
                    println("There already have a commoner >:( ")
                }
                //put a ligal place
                else if(board[user_row][user_col] == board[user_in_row][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row][user_in_col-1] ||
                        board[user_row][user_col] == board[user_in_row+1][user_in_col] ||
                        board[user_row][user_col] == board[user_in_row-1][user_in_col] ||
                        board[user_row][user_col] == board[user_in_row-1][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row+1][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row-1][user_in_col-1] ||
                        board[user_row][user_col] == board[user_in_row+1][user_in_col-1] )
                {
                    println("OK I will go there!")
                    board[user_row][user_col] = Charater.King
                    board[user_in_row][user_in_col] = Charater.Empty
                    print_board(board)
                    check = false
                }
                //you put the wrong place
                println("I can't move,I will dieeeee!!! :|")
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
                val user_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_row][user_col] != Charater.Empty)
                {
                    println("I can't go there dear :/")
                }
                //if put the ligal place
                TODO
                else if()
                {
                    println("Ok, I will move :/")
                    board[user_row][user_col] = Charater.Queen
                    board[user_in_row][user_in_col] = Charater.Empty
                    print_board(board)
                    check = false
                }
                //you put the wrong place
                println("No!not here! >:/")
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
                val user_row:Int = readLine()!!.toInt()
                println("Enter column:")
                val user_col:Int = readLine()!!.toInt()

                //check empty
                if(board[user_row][user_col] != Charater.Empty)
                {
                    println("Oops I'm stuck !!! :口 ")
                }
                //check the ligal step 
                for(i in 0..7)
                {
                    if(board[user_row][user_col] == board[user_in_row + i][user_in_col] ||
                        board[user_row][user_col] == board[user_in_row][user_in_col + i] )
                    {
                        println("HAHA I'm going!")
                        board[user_row][user_col] = Charater.Rook
                        board[user_in_row][user_in_col] = Charater.Empty
                        print_board(board)
                        check = false
                        break
                    }
                }
            }
                //you put the right place
                println("I can't move :口 ")
        }

        Charater.Bishop -> 
        {
            println("Now you choose the Bishop")
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
                    println("I hope God have give you the eyes -_-")
                }
                //you put the right place
                TODO
                else if()
                {
                    println("OK...")
                    board[user_row][user_col] = Charater.Bishop
                    board[user_in_row][user_in_col] = Charater.Empty
                    print_board(board)
                    check = false
                }
                //you put the wrong place
                println("I can't move there")
            }
        }

        Charater.Knight ->
        {
            println("Now, you choose the Knight")
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
                    println("Are you serious? >:(")
                }
                //put the right place
                else if(board[user_row][user_col] == board[user_in_row-1][user_in_col+2] ||
                        board[user_row][user_col] == board[user_in_row-2][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row+1][user_in_col+2] ||
                        board[user_row][user_col] == board[user_in_row+2][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row-1][user_in_col-2] ||
                        board[user_row][user_col] == board[user_in_row-2][user_in_col-1] ||
                        board[user_row][user_col] == board[user_in_row+2][user_in_col+1] ||
                        board[user_row][user_col] == board[user_in_row+1][user_in_col-2])
                {
                    println("I will bring the death!")
                    board[user_row][user_col] = Charater.Knight
                    board[user_in_row][user_in_col] = Charater.Empty
                    print_board(board)
                    check = false
                }
                //put the wrong place
                println("I can't move >:0")

            }
        }

        Charater.Pawn ->
        {
            println("Now, you choose the Pawn")
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
                //check the new place if equal to the original place forward 1 step then it's a ligal step
                else if(board[user_row][user_col] == board[user_in_row][user_in_col+1])
                {
                    println("Go Go Go!!!")
                    board[user_row][user_col] = Charater.Pawn
                    board[user_in_row][user_in_col] = Charater.Empty
                    print_board(board)
                    check = false
                }
                //put the wrong place
                println("I can't get there :(")
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