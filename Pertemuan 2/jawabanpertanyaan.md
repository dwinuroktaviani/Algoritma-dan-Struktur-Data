
	
	# Jawaban 2.3.3

	1. Sebutkan 2 karakteristik class/objek!
				Jawab :
				Class: Diawali dengan huruf kapital
				Obek : Intansiasi dari sebuah Class
	2. Kata kunci apakah yang digunakan untuk mendeklarasikan class
				Jawab : <modifier> class <namaClass>
	3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada 		   
	baris berapa saja deklarasi atribut dilakukan?
				Jawab :
				Terdapat 4 Atribut. Deklarasi atribut terdapat pada baris 2 dan 3
	4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?
				Jawab :
				Terdapat 4 Method. Method tersebut : tampilBarang(),tambahStok(int n),kurangiStok(int n),hitungHargaTotal(int jumlah)
				Pada baris 5,12,15,dan 18
	5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan 	
	jika stok masih ada (masih lebih besar dari 0)
				Jawab :
				public void kurangiStok(int n){
			        if (stok > 0) {
			             stok = stok -n;
			        }
			        else{
			            stok = 0;
			        }
			    }
	6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int?
				Jawab :
				Parameter ini digunakan untuk perhitungan jumlah stok apabila ditambahkan dengan stok lagi yang nantinya akan disimpan di dalam parameter int n
	7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
				Jawab : Karena method ini memiliki nilai kembalian.
	8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
				Jawab :
				Karena method ini tidak memiliki nilai kembalian 

	# Jawaban 2.4.3
	1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan?
				Jawab :
				Pada Baris ke-3. Nama objek : b1
	2. Bagaimana cara mengakses atribut dan method dari suatu objek?
				Jawab :
				NamaObjek.namaAtribut;

	# Jawaban 2.5.1
	3.Jalankan kembali class BarangMain dan amati hasilnya.
				Jawab :
				Class BarangMain akan mnginputkan nilai dari attribute dari Barang dengan cara menginputkan langsung di dalam konstruktor Barang yang berparameter. Urutan input harus sesuai dengan urutan parameter yang ada. Misal : Urutan String dan Int. Kemudian dari input dengan parameter akan di panggil fungsi tampilBarang();

	# Jawaban 2.5.3
	1. Perhatikan class Barang yang ada di Praktikum 1.5, pada baris berapakah deklarasi konstruktor berparameter dilakukan?
				Jawab : 
				Baris ke-7
	2. Perhatikan class BarangMain di Praktikum 1.5, apa sebenarnya yang dilakukan pada baris program dibawah ini?
				Jawab :
				Membuat mendeklarasikan Objek ke dua dari class Barang yaitu b2. kemudian dengan memanfaatkan kontruktor berparameter yang telah dibuat kelas barang, maka pada saat instansiasi dilakukan input langsung dengan memasukkan nilai dari yang nantinya disimpan untuk atribute di kelas barang
	3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang.
				Jawab :
				Barang b3 = new Barang("Lenovo","Laptop",5000000,5);
        		b3.tampilBarang();

    # Jawaban 2.6.3
    1. Apa yang dimaksud dengan kode berikut ini:
    			Jawab :
    			Untuk membuat objek dari kelas PersegiPanjang bernama ppArray yang yang bertipe Array yang dapat dibatasi dengan jumlah array adalah 3 masukan.
    2. Apa yang dimaksud dengan kode berikut ini:
    			Jawab :
    			Untuk memberikan nilai panjang dan lebar untuk objek ppArray dengan indeks 1 

    # Jawaban 2.7.3
    1. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
    			Jawab : Karena ppArray[5] belum diinstansiasi sebagai objek baru untuk kelas Persegi Panjang


    # Jawaban 2.8.3
    1. Apa yang dimaksud dengan konstruktor?
    			Jawab :
    			Konstruktor adalah yang pertama di eksekusi ketika objek dibuat, nama konstruktor sama dengan nama class.
   	2. Jika diketahui terdapat class Segitiga seperti berikut ini: Bagaimana kode untuk membuat array Segitiga tersebut yang berisi 15 elemen?
   				Jawab :
   				Segitiga[] sgArray = new Segitiga[15];
   	3. Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
   				Jawab :
   				 public Segitiga(int a, int t) {
			        alas = a;
			        tinggi = t;
			    }
	4. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut.
				Jawab :
				 public int hitungLuas(){
			        return (int) (0.5 * alas * tinggi);
			    }
			    public int hitungKeliling(){
			        double d  = (alas * alas) + (tinggi * tinggi) ;
			        return (int) (alas + tinggi + Math.sqrt(d))  ;
			    }
	5. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:
		sgArray ke-0 alas: 10, tinggi: 4
		sgArray ke-1 alas: 20, tinggi: 10
		sgArray ke-0 alas: 15, tinggi: 6
		sgArray ke-0 alas: 25, tinggi: 10
		Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().
				Jawab:
				public static void main(String[] args) {
			        Segitiga[] sgArray = new Segitiga[4];
			        
			        sgArray[0] = new Segitiga(10, 4);
			        sgArray[1] = new Segitiga(20, 10);
			        sgArray[2] = new Segitiga(15, 6);
			        sgArray[3] = new Segitiga(25, 10);
			        
			        for (int i = 0; i < 4; i++) {
			            System.out.println("Luas Segitiga ke-" + i + "=" +sgArray[i].hitungLuas());
			            System.out.println("Keliling Segitiga ke-" + i + "=" + sgArray[i].hitungKeliling() );
			            
			        }
			        
			    }











