fun main() {
    //BRANCH MAIN
    println("Kalkulator")
    println("====================================================")
    println("Pilih : ")
    println("1. Tambah")
    println("2. Kurang")
    println("3. Kali")
    println("4. Bagi")
    print("Pilih Menu :")
    val pick_menu = readLine()
    print("Masukkan Bilangan Pertama : ")
    val bil_pertama = readLine()!!.toInt()
    print("Masukkan Bilangan Kedua : ")
    val bil_kedua = readLine()!!.toInt()
    when(pick_menu){
        "1"->{
            val hasil_tambah = bil_pertama + bil_kedua
            println("Hasil Penambahan dari $bil_pertama dan $bil_kedua adalah $hasil_tambah")
        }
        "2"->{
            val kurang = bil_pertama - bil_kedua
            println("Hasil dari pengurangan $bil_pertama dan $bil_kedua adalah $kurang")
        }
        "3"->{
            val kali = bil_pertama * bil_kedua
            println("Hasil Perkalian dari $bil_pertama dan $bil_kedua adalah $kali")
        }
        "4"->{

        }
        else->{
            print("Tidak ada menu")
        }
    }
}