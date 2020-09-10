package helperClasses;

public class MyIPLibary {

    public static String returnPrivateCClassIP(int cClassNrGroup1, int cClassNrGroup2) throws Exception {
        if (256 <= cClassNrGroup1 || 256 <= cClassNrGroup2) {
            throw new Exception("IP-Adress-Nr. > 255  ==> not possible!");
        }
        return "192.168." + cClassNrGroup1 + "." + cClassNrGroup2;
    }

    private static String getFirstPrivateCClassIP(){
        return "192.168.001.001";
    }

    private static String getLastPrivateCClassIP(){
        return "192.168.255.255";
    }

    private static String getStandartPrivateCClassSubNetMask(){
        return "255.255.255.0";
    }

}
