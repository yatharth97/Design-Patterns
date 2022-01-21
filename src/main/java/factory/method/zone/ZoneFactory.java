package factory.method.zone;

public class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone;
        if(zoneId.equals("US/Pacific")) {
            zone = new ZonePacific();
        } else if(zoneId.equals("US/Mountain")) {
            zone = new ZoneMountain();
        } else if(zoneId.equals("US/Central")) {
            zone = new ZoneCentral();
        } else if(zoneId.equals("US/Eastern")) {
            zone = new ZoneEastern();
        } else {
            zone = null;
        }
        return zone;
    }
}
