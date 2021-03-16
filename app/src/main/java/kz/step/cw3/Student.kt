package kz.step.cw3

class Student(_lastname: String, _firstname: String) {
    var lastname: String? = null
    var firstname: String? = null

    init {
        firstname = _firstname
        lastname = _lastname
    }

}