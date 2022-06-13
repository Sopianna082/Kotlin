package Hero

//Implementasi Exception
//Menggunakan Throwable dalam class dimana jika terjadi error,
//Tidak akan menghentikan program atau program tidak akan berjalan,
//Melainkan akan menampilkan pesan exception
class SupportException(message:String):Throwable(message) {
}