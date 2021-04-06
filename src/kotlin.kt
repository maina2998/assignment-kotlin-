fun main() {
    number()
nameArray("mary","magdaline","grace","katerina","lucy")
    multiply()

    robot(5)
    robot(10)
    robot(15)



}
fun number(){
    for(num in 1..100)
        if(num%2==1){
            println(num)
        }
}
fun nameArray(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String> {
    var b = arrayOf(name1, name2, name3, name4, name5)
    for (r in b)
        if (r.length >5){
            println(r)
    }
    return b
}
fun robot(){

}
fun multiply() {
    for (i in 1..100) {
    }
    for (i in 1..100) {
        if (i % 3 == 0) {
            println("fizz")

        }
        for (i in 1..100)
            if (i % 5 == 0) {
            }
    }
}
fun robot(age:Int){
    if(age < 6){
        println("milk")

    }else if (age < 15 && age >6){
        println("fanta")

    }else{
        println("cocacola")
    }
}