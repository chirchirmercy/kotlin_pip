fun main(){
    robotDescition(30)
    robotDescition(20)
    robotDescition(15)
    school("nyeri","nakuru","rongai","seme")
    year()
    evenNumbers()
}
//Q1. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age f 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printig out the name of the drink each person gets according to
//their age.

fun robotDescition (age:Int){
    when(age){
        in 0..6 -> println("glass of milk")
        in 7..15 -> println("bottle of fanta orange")
        else ->
            println ("botlle of cocacola")

    }
}

//Q2. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun school(schl1:String,schl2:String,schl3:String,schl4:String) {
    var schl = arrayOf(schl1, schl2, schl3, schl4)
    println(schl.contentToString())
}

 //Q3.Given years between 1990 and 2020, print all the leap years in the following
//sentence, i.e “2020 is a leap year” if not ,print i.e “is not a leap year”
fun year(){
    for(year in 1990 ..2020){
        if(year%4===0){
            println("is a leap year")
        }else if(year%4 !==0){
            println("is a not a leap year")
        }else {
            year
        }
    }
}

//Q4. Create a function that prints out all the odd numbers between 1 and 100
fun evenNumbers(){
    for (num in 1..50){
        if(num % 2==0){
            println(num)
        }
    }
}
