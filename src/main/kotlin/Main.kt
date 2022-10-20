fun main() {
    var vector1 = My3DVector(3.0, 1.0, -2.0)
    var vector2 = My3DVector(1.0, 2.0, -1.0)
    println(vector1.vectoruli(vector2))
    println(vector1.skalaruli(vector2))
}

interface calculate{
    fun vectoruli(secondvector: Any?): String
    fun skalaruli(secondvector: Any?): String
}

class My3DVector(var a1: Double, var a2: Double, var a3:Double): calculate {
    var x:Double = 0.0
    var y:Double = 0.0
    var z:Double = 0.0

    override fun vectoruli(secondvector: Any?): String {
        if (secondvector is My3DVector) {
            x = a2 * secondvector.a3 - a3 * secondvector.a2
            y = -(a1 * secondvector.a3 - a3 * secondvector.a1)
            z = a1 * secondvector.a2 - a2 * secondvector.a1
            return "მიღებული ვექტორია: ($x ; $y ; $z)"
        } else {
            return "შეყვანილი მონაცემები არასწორია"
        }
    }

    var h = 0.0
    override fun skalaruli(secondvector: Any?): String {
        if (secondvector is My3DVector) {
            h = a1 * secondvector.a1 + a2 * secondvector.a2 + a3 * secondvector.a3
            return "სკალარული ნამრავლია: $h"
        }
        else{
            return "შეყვანილი მონაცემები არასწორია"
        }
    }

}
