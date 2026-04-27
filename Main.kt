
// // perbandingan String

// // soal pertama//


fun main() {
    val string1 ="Abdulloh al-hudda makatul mukaromah"
    val string2 ="Abdulloh al-hudda makatul mukaromah"
    
    println("jumlah karakter data pertama ${string1.length}")
    println("jumlah karakter data kedua ${string2.length}")
    
    if (string1 == string2) {
        println("sama")
    }else {
        println("Tidak Sama")
    }
    println("Pengecekan Selesai")
     
}

// //nomor 2 soal//
// //cek lebih dari 50 atau tidak

fun main() {
    val angka =51
    
    if (angka > 50){
        println("Lebih dari 50") 
    }else if(angka < 50){
        println("Kurang dari 50")
    }else {
        println("Sama dengan 50")
    }
    
    //cek kelipatan 5 atau tidak
    if (angka %5==0){
        println("kelipatan 5")
    }else {
        println("bukan kelipatan 5")
    }
        
}


// // nomor 3 soal 
// // mencari yang genap dalam array//

fun main() {
    val angka = arrayOf(21, 32, 43, 24, 27, 28)

    for (i in angka) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

// // noomor 4//
// // mengunkan when //

fun main() {
    val umur = 50

    val hasil = when (umur) {
        in 6..12 -> "Anak-anak"
        in 13..16 -> "Remaja awal"
        in 17..100 -> "Remaja/Tua"
        else -> "Di luar rentang"
    }

    println(hasil)
}



// // nomor 5//

// // 	kelipatan 3 atau 5 ,kelipatan 3 dan 5

fun main() {
    val angka = 24
	if (angka % 3 == 0 && angka % 5 == 0) {
    println ("kelipatan 3 dan 5")
	}else if (angka % 3 == 0) {
    println("kelipatan 3")
	}else if (angka % 5 == 0) {
    println("kelipatan 5")
	}else {
    println("bukan kelipatam 3 maupun 5")
	}

}