class IndeksNilaiMatkul { 
    companion object { 
        @JvmStatic 
        fun main(args: Array<String>) { 
            when { 
                args.isEmpty() || args[0].isBlank() -> println("Nilai harus diisi") 
                else -> { 
                    val nilai = args[0].toIntOrNull() 
                    if (nilai == null) { 
                        println("Nilai harus berupa angka") 
                    } else { 
                        when { 
                            nilai > 100 || nilai < 0 -> println("Nilai di luar jangkauan") 
                            nilai >= 80 -> println("A") 
                            nilai >= 70 -> println("AB") 
                            nilai >= 60 -> println("B") 
                            nilai >= 50 -> println("BC") 
                            nilai >= 40 -> println("C") 
                            nilai >= 30 -> println("D") 
                            else -> println("E") 
                        } 
                    } 
                } 
            } 
        } 
    } 
}