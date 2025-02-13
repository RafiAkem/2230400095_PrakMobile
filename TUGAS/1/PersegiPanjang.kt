class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
    fun luas() = panjang * lebar
    fun keliling() = 2 * (panjang + lebar)
   }
   fun main(args: Array<String>) {
    if (args.size != 2) {
    println("Program memerlukan dua argumen: panjang dan lebar")
    return
    }
   
    val panjang = args[0].toIntOrNull()
    val lebar = args[1].toIntOrNull()
   
    if (panjang == null || lebar == null) {
    println("Kedua argumen harus berupa bilangan bulat")
    return
    }
   
    val persegi = PersegiPanjang(panjang, lebar)
    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${persegi.luas()}")
    println("Keliling ${persegi.keliling()}")
   }