import java.lang.Integer.sum

class mathss {
    var num1: Int = 1
    var num2: Int = 1
    var result: Int = 0


    fun sum(num11: Int, num21: Int) {
        this.num1 = num11
        this.num2 = num21
        result = num1 + num2
    }

    fun getSum() {
        println("Adition : $result")
    }

    fun sub(num11: Int, num21: Int) {
        this.num1 = num11
        this.num2 = num21
        result = num1 - num2
    }

    fun getSub() {
        println("Subtraction : $result")
    }

    fun mul(num11: Int, num21: Int) {
        this.num1 = num11
        this.num2 = num21
        result = num1 * num2
    }

    fun getMul() {
        println("Multiplecation : $result")
    }

    fun div(num11: Int, num21: Int) {
        this.num1 = num11
        this.num2 = num21
        result = num1 / num2
    }

    fun getDiv() {
        println("Divition : $result")
    }

}

fun main(args:Array<String>)
{
    var obj = mathss()

    obj.sum(100,10)
    obj.getSum()

    obj.sub(100,10)
    obj.getSub()

    obj.mul(100,10)
    obj.getMul()

    obj.div(100,10)
    obj.getDiv()
}