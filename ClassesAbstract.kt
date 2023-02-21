	abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}
class Teacher(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}
fun main(args: Array<String>) {
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    
}

abstract class Person(name: String) {

    //Parameters 
    ////member functions
    abstract fun displayJob(description: String)
}
class Teacher(name: String): Person(name) {
    //class that inherits

    override fun displayJob(description: String) {
        println(description)
    }
}
fun main(args: Array<String>) {
    //Object of the class 
    ////accessing th function 
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    
}
 # Lamdas
 
    val lambda1={Fname:String,LastName:String ->
println("Name $Fname  $LastName")}
   

fun main()
{
    //Invoking Lambas
    lambda1("Joe", "Biden")
}

