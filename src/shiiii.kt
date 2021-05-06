fun main() {

    println("my is$ and i am$ old")
    var s=LongNames(arrayOf("sharon","sheila","faith","joy","hamdi"))
    println(s)

}
fun introduction(name:String, age:Int){
    var name="sharon"
        var age=20;

}
fun LongNames(name:Array<String>):Int{
    var counter=0
    for (name in name){
        if (name.length>4){
            counter+=1
        }
    }
    return counter
}
fun drinkjuice(age:Int){
    if(age<6){
        println("glass of milk")

    }
    else if(age>6&&age<15){
        println("glass of fanta")
    }
    else{
        println("cocacola")
    }
}
fun comparison(){

}