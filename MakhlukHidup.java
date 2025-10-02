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
        if (umur < 0) { 
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

