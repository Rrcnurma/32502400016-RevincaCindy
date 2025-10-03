# 📘 Tugas 1 Pemrograman Berorientasi Object

```
Nama : Revinca Cindy Nurmalinda
NIM  : 32602400016
```

### Meliputi materi :
1. **Class dan Object (Pertemuan 2)**
2. **Encapsulation (Pertemuan 3)**
3. **Constructor (Pertemuan 4)**


---

## 💻 Analisa Kode Berikut

### Kode `MakhlukHidup.java` dan `TestAccess.java` versi `ERROR`
><div style="color: blue">
><strong>Tugas:<br/>
>1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada MakhlukHidup.java dan TestAccess.java. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat pada tabel skor). Skor minimal LULUS = 60.
><br/>
>2. Tuliskan output dari TestAccess jika kode sudah diperbaiki
></strong>
</div>

```java

public class MakhlukHidup {

    private string nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public makhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = jenis;  
        this.jenis = nama; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = nama; 
        this.jenis = other.jenis; 
        this.umur = this.umur; 
        this.berat = other.berat;
    }


    public void setUmur(String umur) { 
        this.umur = umur;
    }

    public void setNama(String nama) {
        nama = this.nama; 
    }

    public int getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.nama = "Kucing";  
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.MakhlukHidup("Kuda"); 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(-10); 
        
        System.out.println(m3.getInfo());

        
    }
}
```


## Table Score
| No | Error | Materi terkait            | Skor |
|----|-------|---------------------------|------|
| 1  | ERR1  | Class & Object (syntax)   | 10   |
| 2  | ERR2  | Class & Object (type)     | 10   |
| 3  | ERR3  | Constructor/init          | 10   |
| 4  | ERR4  | Encapsulation / Setter    | 10   |
| 5  | ERR5  | Constructor (copy)        | 10   |
| 6  | ERR6  | Constructor (copy)        | 10   |
| 7  | ERR7  | Encapsulation / Setter    | 10   |
| 8  | ERR8  | Class & Object (type)     | 10   |
| 9  | ERR9  | Class & Object (type)     | 10   |
| 10 | ERR10 | Encapsulation / Validation| 10   |
**Total skor : 100**

## Petunjuk Pengerjaan

Temukan semua ERR#, jelaskan kenapa salah dalam bentuk table dengan kolom berikut, selanjutnya tulis kode perbaikannya.

| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 | MakhlukHidup | [contoh] variable `jumlah` salah penulisan akses `publik` | seharusnya `public jumlah = 10`|

2. Kompilasi dan jalankan setelah diperbaiki.
3. Upload kode pada **Github** repository anda dan **upload link nya ke dalam sinau** di topik **Tugas 1 PBO** disertai **file penjelasannya** dalam format word atau markdown

> Peringatan : Penggunaan AI tidak menjamin jawaban anda semuanya benar


---


## JAWABAN PENYELESAIAN


| No |    Class   |Kesalahan|Perbaikan|
|----|------------|---------|---------|
| 1  |MakhlukHidup|syntax error seharusnya pada `private string nama;`|pada `string` seharusnya huruf 's' nya besar menjadi `String`|
| 2  |MakhlukHidup|access identifier atribut `berat` adalah `public`|karena atribut yang lain menggunakan access identifier private, maka ada baiknya memakai access private juga sehingga menjadi `private double berat`. untuk inisialisasi '1.0' sebaiknya dihilangkan karena sudah diinisialisasi di konstruktor (tindakan sia-sia)|
| 3  |MakhlukHidup|pada `public void MakhlukHidup(String nama)`|lebih baik diganti nama karena ini bukan konstruktor. Penggantiannya menjadi `public void Makhluk (String nama)`|
| 4  |MakhlukHidup|kesalahan penulisan `makhlukHidup`|seharusnya penulisan 'm' nya menggunakan huruf kapital karena termasuk constructor sehingga disamakan dengan nama class menjadi `MakhlukHidup`|
| 5  |MakhlukHidup|penulisan `this.nama = jenis`  dan `this.jenis = nama` terbalik (kesalahan syntax)|seharusnya ditulis menjadi `this.nama = nama`| 
| 6  |MakhlukHidup|`this.nama = jenis`  dan `this.jenis = nama` terbalik (kesalahan syntax)|seharusnya ditulis menjadi `this.jenis = jenis`|
| 7  |MakhlukHidup|penulisan `this.nama = nama` syntax nya salah|seharusnya ditambahkan "other." karena parameternya other yang merupakan 'copy constructor', sehingga ditulis menjadi `this.nama = other.nama`|
| 8  |MakhlukHidup|kesalahan syntax penulisan `this.umur = this.umur`|penulisan `this.umur = this.umur` seharusnya diganti menjadi 'other.' karena menggunakan parameter other yang merupakan 'copy constructor', sehingga penulisannya menjadi `this.umur = other.umur`|
| 9  |MakhlukHidup|kesalahan penulisan parameter String `public void 'setUmur(String umur)`|seharusnya menggunakan int karena sebelumnya dideklarasikan bahwa umur itu tipe datanya int yang mana merupakan angka|
| 10 |MakhlukHidup|penulisan `nama = this.nama` terbalik sehingga mengakibatkan kesalahan logika|seharusnya dibalik penulisannya menjadi `this.nama = nama`|
| 11 |MakhlukHidup|penulisan tipe data 'int' `public int getInfo()` salah |seharusnya menggunakan `String` untuk return type pada method `getInfo`|
| 12 |TestAccess|penulisan `m.nama = "Kucing";`|seharusnya menggunakan setter karena atribut `nama` accessnya adalah private sehingga apabila ingin menginisialisasi bisa diubah menjadi `m.setNama("Kucing")`|
| 13 |TestAccess|syntax `m2.MakhlukHidup("Kuda")`|ini bukan konstruktor dan di file `MakhlukHidup.java` juga sudah diganti menjadi `Makhluk` saja karena hanya method biasa sehingga menjadi `m2.Makhluk ("Kuda")`|
| 14 |TestAccess|kesalahan menginisialisasi umur dengan angka negatif yaitu '-10'|umur untuk makhluk hidup tidak pernah bisa negatif, sehingga harusnya menjadi `m3.setUmur(10)`. Lalu perlunya validasi pada setter umur di `MakhlukHidup.java` agar bisa memberi warning bahwa usia tidak boleh kurang dari 0|


##Source Code yang Sudah Diperbaiki

```java
public class MakhlukHidup {

    private String nama;   // syntax error, seharusnya 'String' s nya besar    
    private String jenis; 
    private double berat;  // atribut berat seharusnya private dan 1.0 dihilangkan karena sudah diinisialisasi di konstruktor (tindakan sia-sia)
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown"; 
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void Makhluk(String nama) { // ini bukan konstruktor, sebaiknya dihindari, ganti dari 'MakhlukHidup' menjadi 'Makhluk'
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    //initiate constructor
    public MakhlukHidup(String nama, String jenis, int umur, double berat) { //penulisan makhlukHidup harus kapital M
        this.nama = nama; // harusnya this.nama = nama; kesalahan logika 
        this.jenis = jenis; // harusnya this.jenis = jenis; kesalahan logika
        this.umur = umur;
        this.berat = berat;
    }

    //copy construction
    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; //ditambahkan "other." karena parameternya objek other
        this.jenis = other.jenis; 
        this.umur = other.umur; //harusnya other.umur karena mengambil dari objek lain
        this.berat = other.berat;
    }


    public void setUmur(int umur) { // parameter harus tipe data int bukan String
        if (umur < 0) { //validasi umur agar tidak bisa negatif
        System.out.println("Umur tidak boleh negatif"); 
        }else 
            this.umur = umur;
        }

    public void setNama(String nama) {
        this.nama = nama; // harusnya this.nama = nama; kesalahan logika
    }

    public String getInfo() { // return type harus String bukan int
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama("Kucing");  // gunakan setter untuk mengubah nama karena bersifat private
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0); 
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        System.out.println(m2.getInfo());
        
        m2.Makhluk ("Kuda"); //diganti Makhluk, mengikuti perubahan di MakhlukHidup.java karena bukan constructor       
        System.out.println(m2.getInfo());
        
        m3.setUmur(10); //umur tidak boleh negatif, apabila negatif akan muncul pesan error dan umur disetting copying dari m2
        System.out.println(m3.getInfo());
    }
}
```
----
## **Output Setelah Code Dijalankan**
```
Nama=Kucing, Jenis=Unknown, Umur=15, Berat=10.0
Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0
Nama=Kuda, Jenis=Salah, Umur=12, Berat=170.0
Nama=Harimau, Jenis=Hewan, Umur=10, Berat=120.0
```

**apabila menggunakan umur negatif maka akan muncul pesan error (validasi) dan umurnya akan menyalin dari data pada m2**
```
Nama=Kucing, Jenis=Unknown, Umur=15, Berat=10.0
Nama=Kuda, Jenis=Salah, Umur=12, Berat=170.0
Error: Umur tidak boleh negatif!
Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0
```

----
