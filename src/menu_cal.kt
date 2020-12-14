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

        }
        "2"->{

        }
        "3"->{

        }
        "4"->{
            val bagi = bil_pertama / bil_kedua
            println("Hasil Pembagian dari $bil_pertama dan $bil_kedua adalah $bagi")
        }
        else->{
            print("Tidak ada menu")
        }
    }
}