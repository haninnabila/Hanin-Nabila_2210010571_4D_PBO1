# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul, kode dan halaman buku, dan memberikan output berupa informasi detail dari Kode tersebut seperti penerbit, tahun terbit, dan genre buku.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `BukuInfo`, dan `Main` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class BukuInfo extends Buku {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `buku[i] = new BukuInfo(judul, kode, halaman);` adalah contoh pembuatan object.

```bash
buku[i] = new BukuInfo(judul, kode, halaman);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, `kode` dan `halaman` adalah contoh atribut.

```bash
String judul, kode;
int halaman;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku` dan `BukuInfo`.

```bash
public Buku(String judul, String kode, int halaman) {
    this.judul = judul;
    this.kode = kode;
    this.halaman = halaman;
}

public BukuInfo(String judul, String kode, int halaman) {
    super(judul, kode, halaman);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul`, `setKode` dan `setHalaman` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
    this.judul = judul;
}

public void setKode(String kode) {
    this.kode = kode;
}

public void setHalaman(int halaman) {
    this.halaman = halaman;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getKode`, `getHalaman`, `getPenerbit`, `getTahunTerbit`, dan `getGenre` adalah contoh method accessor.

```bash
public String getJudul() {
    return judul;
}

public String getKode() {
    return kode;
}

public int getHalaman() {
    return halaman;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul`, `kode` dan `halaman` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul, kode;
private int halaman;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BukuInfo` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class BukuInfo extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampil(String)` di `Buku` merupakan overloading method `tampil` dan `tampil` di `BukuInfo` merupakan override dari method `tampil` di `Buku`.

```bash
public String tampil(String stok){
    return tampil() + "\nStok Buku\t: "+stok;
}

@Override
public String tampil() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPenerbit` dan seleksi `switch` dalam method `getGenre`.

```bash
public String getPenerbit(){
    String kdBuku = getKode().substring(0, 2);
    //Seleksi dengan Percabangan If
    if (kdBuku.equals("ER") || kdBuku.equals("Er") || kdBuku.equals("er")) {
        return "Penerbit Erlangga";
    } else {
        return "Penerbit Lain";
    }
}

public String getGenre(){
    String kdBuku = getKode().substring(4);
    //Seleksi dengan Percabangan Switch Case
    switch(kdBuku){
        case "01":
            return "Kesehatan";
        case "02" :
            return "Pendidikan";
        case "03" :
            return "Sejarah";
        case "04" :
            return "Fiksi Ilmiah";
        case "05" :
            return "Roman";
        case "06" :
            return "Fantasi";
        case "07" :
            return "Horor";
        case "08" :
            return "Thriller/Mystery";
        default:
            return "Genre Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<buku.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("|Buku "+(i+1)+"|");
System.out.print("Masukkan Judul Buku\t: ");
String judul = scanner.nextLine();

System.out.println("\n▸ Buku Info");
System.out.println(data.tampil());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BukuInfo[] buku = new BukuInfo[2];` adalah contoh penggunaan array.

```bash
BukuInfo[] buku = new BukuInfo[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
    System.out.println("\nKode Yang Dimasukkan Salah: "+e.getMessage());
            
} catch (StringIndexOutOfBoundsException e){
    System.out.println("\nKode Yang Dimasukkan Kurang: "+e.getMessage());
        
}  catch (Exception e){
    System.out.println("\nKesalahan Umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Hanin Nabila
NPM: 2210010571
