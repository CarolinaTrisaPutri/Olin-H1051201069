package project;

public class DataDiri {
	String Nama;
	String TTL;
	String JenisKelamin;
	String Agama;
	String Email;
	String Alamat;
	String Prodi;
	String NIM;
	public DataDiri(String nama, String tTL, String jenisKelamin, String agama, String email, String alamat,
			String prodi, String nIM) {
		super();
		Nama = nama;
		TTL = tTL;
		JenisKelamin = jenisKelamin;
		Agama = agama;
		Email = email;
		Alamat = alamat;
		Prodi = prodi;
		NIM = nIM;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public String getTTL() {
		return TTL;
	}
	public void setTTL(String tTL) {
		TTL = tTL;
	}
	public String getJenisKelamin() {
		return JenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		JenisKelamin = jenisKelamin;
	}
	public String getAgama() {
		return Agama;
	}
	public void setAgama(String agama) {
		Agama = agama;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAlamat() {
		return Alamat;
	}
	public void setAlamat(String alamat) {
		Alamat = alamat;
	}
	public String getProdi() {
		return Prodi;
	}
	public void setProdi(String prodi) {
		Prodi = prodi;
	}
	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nIM) {
		NIM = nIM;
	}

}
