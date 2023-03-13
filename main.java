fun main() {
    val archScreen :ArchList = ArchList()
    archScreen.printing()


}

class ArchList () {

    var archives = mapOf (0 to "")
    fun printing () {
        println("Список архивов")
        println("1. Создать архив")
        if (archives.size>1 ) {
            for (i in 1..archives.size) println(archives[i])
        }
        println("${archives.size+1}. Выход.")
    }

}
