fun main() {
    var g = greeting("Ada")
    println(v)

    var r = quotient(50, 7.5f)
    println(r)

    var total = add(20,30,12,14)
    println(total)

     interest()
}

fun greeting(name: String): String{
    var name  = "Hello $name"
    return name
}

fun quotient(x:Int, y:Float): Float {
    var remainder = x % y
    return remainder

}

fun add(a: Int, b: Int, c: Int, d: Int): Int{
    var sum = a+b+c+d
    return sum

}

fun interest(){
println("i love dancing")
}

