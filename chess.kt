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

    println(print_board(board))
    
}


fun print_board(board:ArrayList<ArrayList<Charater>>)
{
    for(i in 0..7)
    {
        for(j in 0..7)
        {
            print(board[i][j])   
            print(" ")
        }
        println("")
        println("-----+-----+-----+-----+-----+-----+-----+-----")
    }
}

