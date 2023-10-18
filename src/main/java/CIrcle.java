public class CIrcle extends Point
{
    private float radius;
    // Konstruktor kelas Anak memanggil konstruktor kelas Induk
    public CIrcle(float r, float a, float b)
    {
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle dijalankan ");
    }
    // Method yang memanggil method Induk dari kelas induknya dengan

    public void cetakPoint() // redefinisi fungsi kelas induk
    {
        super.cetakPoint();
        System.out.println("Radius: "+radius);
    }
}

