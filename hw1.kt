fun main() {
     guessGame()
}

fun guessGame(){
    println("Find the random number by guessing, there are 3 chances.")
    val input = Scanner(System.`in`)
    val rnd = (0..101).random()
    println("random: $rnd")
     for(i in 3 downTo 1){
            println("Make a guess: ")
            val guess = input.nextInt()
            if(guess.equals(rnd)){
                println("You find it, Congrats.")
                break
            }else if(guess > rnd){
                println("Make it smaller, there are ${i-1} guesses")
            }else{
                println("Make it bigger, there are ${i-1} guesses")
         }
     }
     
}