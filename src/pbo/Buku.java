package pbo;

//Class
public class Buku {
    //Atribut & Encapsulation
    private String judul, kode;
    private int halaman;

    //Constructor
    public Buku(String judul, String kode, int halaman) {
        this.judul = judul;
        this.kode = kode;
        this.halaman = halaman;
    }
    
    //Mutator (Setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
    
    //Accessor (Getter)
    public String getJudul() {
        return judul;
    }

    public String getKode() {
        return kode;
    }

    public int getHalaman() {
        return halaman;
    }
    
    //Tampil Data
    public String tampil(){
        return "Judul Buku\t: "+getJudul()+
                "\nKode Buku\t: "+getKode()+
                "\nJumlah Halaman\t: "+getHalaman()+" halaman";
    }
    
    //Polymorphism (Overloading)
    public String tampil(String stok){
        return tampil() + "\nStok Buku\t: "+stok;
    }
}

