package LetusGetCertifiec;


import java.io.IOException;
public class q641_Exception {
}
 class Device implements AutoCloseable{
    String header = null;
    public void open(){
        header = "OPENED";
        System.out.println("Device Opened");
    }
    public String read() throws IOException{
        return "Hello";
    }

    public void writeHeader(String str) throws IOException{
        System.out.println("Writing : "+str);
        header = str;
    }
    public void close(){
        header = null;
        System.out.println("Device closed");
    }

    public static void testDevice(){
        try(Device d = new Device()){
            d.open();
            d.read();
            d.writeHeader("TEST");
            d.close();
        }catch(IOException e){
            System.out.println("Got Exception");
        }
    }
    public static void main(String[] args) {
        Device.testDevice();
    }

}