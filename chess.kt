fun main()
{
    val board: ArrayList<ArrayList<String>> = arrayListOf(
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
        arrayListOf("-","-","-","-","-","-","-","-"),
    )

    for(i in board.indices)
    {
        println(board[i].toString())
    }
}

class chesses(var step:Int ,var status:String)
enum class block()
{
    None,
    Have
}