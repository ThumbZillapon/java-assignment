import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

interface Playable {
    void play();
}

abstract class MusicDevice {
    protected String brand;
    
    public MusicDevice(String brand) {
        this.brand = brand;
    }
    
    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }
    
    public abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {
    public CDPlayer(String brand) {
        super(brand);
    }
    
    public void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }
    
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

class Smartphone extends MusicDevice implements Playable {
    public Smartphone(String brand) {
        super(brand);
    }
    
    public void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }
    
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        CDPlayer cdPlayer = new CDPlayer("Sony");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();
        
        System.out.println();
        
        Smartphone smartphone = new Smartphone("Samsung");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}
