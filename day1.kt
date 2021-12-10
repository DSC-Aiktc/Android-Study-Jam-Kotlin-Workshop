fun main(){
    
    ////////////
    // OUTPUT //
    ////////////
    
    print("hello world") //for single line
    println("hello workd") // for next line
    // The only difference is that it does not insert a new line at the end of the output

    /////////////////////////
    // declaring variables //
    /////////////////////////

    var a =  123
    var b = "hello world"

    println(a)
    println(b)
    
    val c = 12
    println(c)
    
    ////////////////////
    //// Data Types ////
    ////////////////////
    // 
    // Byte
	// The Byte data type can store whole numbers from -128 to 127. This can be used instead of Int or other integer types to 
	// save memory when you are certain that the value will be within -128 and 127:
	
    // Short
	// The Short data type can store whole numbers from -32768 to 32767:
	// 
	// Int
	// The Int data type can store whole numbers from -2147483648 to 2147483647:
	// 
	// Long
	// The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775808. 
    // This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L":


    val myNum: Long = 15000000000L
    var num1 : Int = 12
    var string1 : String = "a"
    var float :Float = 12.4f
	var double : Double = 12.33
    
    // Changing data type

    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()

    var sd = num1.toString()
    sd += "123das"
    println(sd)
    
    // Note: If you want to create a String without assigning the value 
    // (and assign the value later), you must specify the type while declaring the variable:

    // WORK FINE

    var name : String
    name = "zaki"
    println(name)
    
    // => Error 

    // var name
	// name = "zaki"
	// println(name)
	
    //////////////
    /// String ///
    //////////////
    
    // to access a string
    
    println(name[0])
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name.compareTo("zakii"))
    println(name.indexOf("q"))
    println(name.plus(" ur rahman"))
    
    ///////////////
    // condition //
    ///////////////
    
    // -------------------------- //
    // if else-if else conditions //
    // -------------------------- //

    var age = 20
    if (age >= 21) {
        println("Eligble for drinking beer")
    } else if (age >= 18){
      println("Wait ${21-age} years more for beer")  
    } else{
        println("not eligble to drink beer")
    }
    
    //  ---------------- //
    // ternary operator  //
    //  ---------------- //
    val ter = if (age >= 21) "Adult" else "Minor"
    println(ter)
    
    // ------ //
    // switch //
    // ------ //
    
    var month = 12
    
    var result = when(month){
        1 -> "Jan"
        2 -> "Feb"
        3 -> "Mar"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "Aug"
        9 -> "Sept"
        10 -> "Oct"
        11 -> "Nov"
        12 -> "Dec"
        else -> "Invail Day"
    }
    
    println(result)
    
    ////////////////
    //// Loops /////
    ////////////////

    var i = 0
    while (i < 5) {
      println(i)
      i++
    }
  
    println("outof forloop value = $i")
    
    i = 6
    do {
      println(i)
      i++
    }
    while (i < 5)
    
    println("FOR LOOP")
    for (i in 0..5){
        println(i)
    }
    
    // from higher to lower
    
    for (i in 5 downTo 1){
        println(i)
    }
    
    for (i in 0..10 step 2){
        println("Even no = $i")
    }
    
    repeat(10){
        println("op")
    }
    
    /////////////////////
    // Arrays and list //
    /////////////////////
	
    // array
    var array = arrayOf(1,"a")
    for (i in array){
        println(i)
    }
    
    // list
    
    var list1 = listOf(1,12.32,"a")
    println(list1)
    
    var list2 : List<Int> = listOf(1,2,12,123)
    
    var mutablelist = mutableListOf(1,2,3,'k',3,12,12.234,"hello world")
    println(mutablelist)
    
    println(mutablelist.size)
    println(mutablelist[0])
    
    mutablelist.remove(3)
    println(mutablelist)
    mutablelist.removeAt(2)
    println(mutablelist)
    
    
    
    //     var mutablelist2 = mutableListOf() //error
    var mutablelist2 = mutableListOf<Any>()
    
    for( i in 0..5){
        mutablelist2.add(i)
    }
    println(mutablelist2)
    mutablelist2.shuffle()
    println(mutablelist2)
    
    
    
    
    
    
    
  
}