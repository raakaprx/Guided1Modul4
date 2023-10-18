public class Main {
    /**Main Method*/
    public static void main( String args[] )
    {
// Membuat instans dari kelas anak dan memanggil method yang
        Object dimilikinya = null;
        CIrcle circle1=new CIrcle(6.5f, 8.2f, 1.9f);
        circle1.cetakPoint();
        System.out.println(" ");
        CIrcle circle2=new CIrcle(10, 5, 5);
        circle2.cetakPoint();
    }
}
