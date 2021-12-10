class car {
    var brand : String = ""
    var model : String = ""
    var dom : Int = 0
}

open class book(val name : String, val author : String,val price: Int){
    
    init{
        println("Book Name : $name")
        println("Author Name: $author")
        println("Book price : $price")
    }
    
    open fun pricePerQuantity(qty: Int){
        println(qty*price)
    }
}

// inheriting book class
class manga(name: String,author: String,price: Int,chapter: Int):book(name,author,price){
	
    // method overriding
    override fun pricePerQuantity(qty: Int){
        var Tprice = qty*price
        var gst_price = price * 0.18
        println("Final price : ${Tprice+gst_price}")
    }
    
    // method overloading
    fun pricePerQuantity(qty: Int, discount : Int){
        var Tprice = qty*price
        var gst_price = price * 0.18
        println("Final price : ${Tprice+gst_price-discount}")
    }
    
}

class school{
    // secondary constructor
    constructor(name: String,country: String){
        println("Name : $name")
        println("Country : $country")
    }
    constructor(name: String,country: String,city: String){
        println("Name : $name")
        println("Country : $country")
        println("City : $city")
    }
}

fun main(){
    var carObj = car()
    carObj.brand = "Buggati"
    carObj.model = "Centodieci"
    carObj.dom = 2019
    println(carObj.brand)
    
    
    var bookObj = book("How to unleash the power of your subconscious mind","Dr Joseph murphy",250)
    bookObj.pricePerQuantity(10)
    
    var man = manga("How to unleash the power of your subconscious mind","Dr Joseph murphy",250,10)
    man.pricePerQuantity(10)
    
}