package kz.step.cw3

class StudentService {
    var students: ArrayList<Student> = arrayListOf()

    init {
        for (i in 0..15) {
            students.add(Student("surname$i", "name$i"))
        }
    }

    fun alphabetSort(): ArrayList<Student> {
        students.sortBy { it.firstname }
        return students
    }

    fun randomSort(): ArrayList<Student> {
        students.shuffle()
        return students
    }

    override fun toString(): String {
        return buildString {
            for (student in students) {
                append(student.firstname + " " + student.lastname + "\n")
            }
        }
    }
}