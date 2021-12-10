

fun multiplyList(list1: MutableList<Int>,list2: MutableList<Int>): MutableList<Int>{
    println(list1)
    println(list2)
    var result = mutableListOf<Int>()
    for (i in 0..list2.size-1){
        
        var temp = list1[i]*list2[i]
        result.add(temp)
    }
    println("Result : $result")
    
    return result
}

fun reverse(num: Int): Int {
    var num = num                   // as a parameter is always a constant
    var rev = 0
    while (num != 0) 
    {
        val remainder = num % 10    // get the last digit
        rev = remainder + rev * 10  // store the digit as the MSD (most significant digit) of the reverse
        num /= 10                   // discard the last digit of the original number
    }
    
    return rev
}
    

fun main(){

    // multiply lists
    var list1 = mutableListOf(1,2,3,4,5)
    var list2 = mutableListOf(23,12,123,312,12)
    
    if (list1.size == list2.size){
	    var result = multiplyList(list1, list2)    
    } else {
        println("Lists should be of same length")
    }
    
    var arr1 = Array<Int>(10){ 0 }
    var arr2 = IntArray(10)
    println(arr1.size)
    println(arr2.size)
    println(arr2[0])

    // reverse a number 
    val num = 134
    print(reverse(num))
}