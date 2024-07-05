package pbo;

//Inheritance
public class BukuInfo extends Buku {
    //Constructor
    public BukuInfo(String judul, String kode, int halaman) {
        super(judul, kode, halaman);
    }
    
    public String getPenerbit(){
        String kdBuku = getKode().substring(0, 2);
        //Seleksi dengan Percabangan If
        if (kdBuku.equals("ER") || kdBuku.equals("Er") || kdBuku.equals("er")) {
            return "Penerbit Erlangga";
        } else {
            return "Penerbit Lain";
        }
    }
    
    public int getTahunTerbit(){
        //Seleksi dengan mengubah nilai string ke integer
        return Integer.parseInt(getKode().substring(2, 4)) + 2000;
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
    
    //Polymorphism (Overriding)
    @Override
    public String tampil(){
        return super.tampil()+
                "\nPenerbit\t: "+getPenerbit()+
                "\nTahun Terbit\t: "+getTahunTerbit()+
                "\nGenre Buku\t: "+getGenre();
    }
}