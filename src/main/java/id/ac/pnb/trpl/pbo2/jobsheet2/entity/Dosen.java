package id.ac.pnb.trpl.pbo2.jobsheet2.entity;

public class Dosen {

  public enum JenisKelamin {
    LAKI_LAKI(0),
    PEREMPUAN(1);

    private final int number;

    JenisKelamin(int number) {
      this.number = number;
    }

    public String toString() {
      switch (this.number) {
        case 0 -> {
          return "Laki-Laki";
        }

         case 1 -> {
           return "Perempuan";
        }

        default -> {
          return null;
        }
      }
    }
  }

  private String nidn;
  private String nama;
  private JenisKelamin jenisKelamin;
  private String noTelpon;

  public Dosen() {
    this(null, null, null, null);
  }

  public Dosen(String nidn, String nama, JenisKelamin jenisKelamin,
               String noTelpon) {
    this.nidn = nidn;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.noTelpon = noTelpon;
  }

  public Object[] getAllFields() {
    return new Object[]{
        nidn, nama, jenisKelamin.toString(), noTelpon
    };
  }

  public void setNidn(String nidn) {
    this.nidn = nidn;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setJenisKelamin(JenisKelamin jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public void setNoTelpon(String noTelpon) {
    this.noTelpon = noTelpon;
  }

  public String getNidn() {
    return nidn;
  }

  public String getNama() {
    return nama;
  }

  public int getJenisKelamin() {
    return jenisKelamin.number;
  }

  public String getNoTelpon() {
    return noTelpon;
  }
}