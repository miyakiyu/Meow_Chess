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

    //print board
    print_board(board)
    
    //
}

fun move_chess()
{


}

fun print_board(board:ArrayList<ArrayList<Charater>>)
{
    for(i in 0..7)
    {
        println(" ")
        println("------|------|------|------|------|------|------|------")
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