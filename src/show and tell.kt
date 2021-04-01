fun main(){

student() //invoked function

var addition=add(4,8,9)
    println(addition) //returned function

    company() //invoked function

   child("Liam","31 inches") //invoked function

    val country=country("Kenya")
    println(country.length) //returned function

    names() //invoked function

}

// data types and variables
fun student() {
   val name = "Nambooze Angella"
    var age = 22
    var phoneNumber = "0752853816"
    var weight = "57kgs"
    val citizenOfUganda: Boolean = true
    println(name)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizenOfUganda)
}

//operators(addition)
fun add(num1:Int,num2:Int,num3:Int):Int{
    return(num1+num2+num3)

}

// String indexing where we print out the index number of given string.
fun company(){
    val name="Canva"
    println(name[0])
    println(name[4])
}

// This is string interpolation.
fun child(name:String,height:String){
    var sentence="$name is $height tall."
    println(sentence)
}

fun country(code:String):String{
    return code

}

// This is an example of a loop method.
fun names(){
    val studentNamesArray=arrayOf("Tabitha","Caroline","Patience","Shakira","kevin")
    for (x in studentNamesArray){
        println(x.toUpperCase())
    }
}