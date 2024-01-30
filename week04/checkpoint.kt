const val HUNTER_NAME = "Madrigal"

fun main() {
    println("The Hunter awakens in Iosefka's clinic, the ominous strong smell of blood thick in the air")

    println(HUNTER_NAME)

    var playerlevel = 1
    println(playerlevel)
    
    if (playerlevel == 1){
        println("Meets Eileen the Crow in the city of Yharnam")
    } else if (playerlevel <= 5) {
        println("Save the city of Yharnam from the Beasts")
    } else if (playerlevel == 6) {
        println("locate the caryll rune")
    } else if (playerlevel == 7)   {
        println("recover the long-last caryll rune of The Great Ones")
    } else if (playerlevel == 8) { 
    println("Defeat Bloodletting Beast.")    
    }  
    
    else {
        println("There are no quests right now.")
    }

   
   
    println("time passes...")
    println("The Hunter returns from his quest")
   
    playerlevel += 1
    println(playerlevel)
}