fun main() {
    guessGame()
}

fun guessGame() {
    val rnd = (0..101).random()
    val input = Scanner(System.`in`)
    println("Welcome to the Guessing Game!")
    println("I have chosen a number between 1 and 101. Can you guess it?")

    for (attempts in 1..3) {
        print("Attempt $attempts: Enter your guess: ")
        val guess = input.nextInt()

        if (guess == rnd) {
            println("Congratulations! You guessed the number in $attempts attempts.")
            return
        } else if (guess != null) {
            if (guess < rnd) {
                println("Too low!")
            } else {
                println("Too high!")
            }
        }
    }

    println("Sorry, you did not guess the number within 3 attempts. The number was $rnd.")
    println("Thank you for playing!")
}