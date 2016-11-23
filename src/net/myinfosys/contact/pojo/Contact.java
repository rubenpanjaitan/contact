package net.myinfosys.contact.pojo;




import net.myinfosys.contact.enumeration.Religi;
import net.myinfosys.contact.enumeration.Sex;
import net.myinfosys.contact.enumeration.Skill;

public class Contact {
	private String nama;
	private String alamat;
	private String tglLahir;
	private Religi agama;
	private Sex jenisKelamin;
	private Skill skill;
	private String email;
	private String nomor;

	/*
	 * constructor
	 */
	public Contact(String nama, String alamat, String tglLahir, Religi agama,
			Sex jenisKelamin, Skill skill, String email, String nomor) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.tglLahir = tglLahir;
		this.agama = agama;
		this.jenisKelamin = jenisKelamin;
		this.skill = skill;
		this.email = email;
		this.nomor = nomor;
	}

	public String getNama() {
		return nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public Religi getAgama() {
		return agama;
	}

	public Sex getJenisKelamin() {
		return jenisKelamin;
	}

	public Skill getSkill() {
		return skill;
	}

	public String getEmail() {
		return email;
	}

	public String getNomor() {
		return nomor;
	}

	public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public void setAgama(Religi agama) {
		this.agama = agama;
	}

	public void setJenisKelamin(Sex jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	@Override
	public String toString() {
		return  nama + "|" + alamat + "|"+ tglLahir + "|" + agama + "|"
				+ jenisKelamin + "|" + skill + "|" + email+ "|" + nomor;
	}
	
	

}
