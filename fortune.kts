fun main(){
//    calling the getFortuneCookie function to return fortune
    val fortunePick = getFortuneCookie()
//    printing the fortune by using string format
    print("your fortune is: $fortunePick")
}
// creating a function that can tell fortune
fun getFortuneCookie():String {
//    creating a list of fortune to be told
    val fortune = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
//    asking the user for input
    print("Enter your birthday:")
//    reading the user birthday still don't know what the shebang
    val birthday = readLine()!!
//    converting the string to integer or null to 1
    val b: Int = birthday.toIntOrNull() ?: 1
//    getting the remainder to be used for selecting the function
    val r: Int = b % fortune.size
//    selecting fortune to return based on remainder
    return (when (r) {
        0 -> fortune[r]
        1 -> fortune[r]
        2 -> fortune[r]
        3 -> fortune[r]
        4 -> fortune[r]
        5 -> fortune[r]
        else -> fortune[r]

    })

}
main()