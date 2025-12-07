// Static + final in java (This value is known before even code execution whereas
// Let's say this particular variable depends on the function call, it won't work because we will get output after code execution is done
const val PI = 3.14

fun main() {

    var brandVar = "Apple" // mutable
    brandVar = "Apple !"

    // It's equivalent to final keyword in Java (final String brandVal = "Hello")
    val brandVal = "Toyota" // Read only

   // Note : Technically it's better to use val because of its immutability
}