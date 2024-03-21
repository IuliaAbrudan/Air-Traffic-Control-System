package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ATC {
    List<Aircraft> aircraftList = new ArrayList();

    void addAircraft(String id){
        //TODO
    }

    public void sendCommand(String aircraftId, AtcCommand cmd){
        aircraftList.forEach((a) ->{
            if(a.id.equals(aircraftId)){
                a.receiveAtcCommand(cmd);
                synchronized (a) {
                    a.notify();
                }
            }
        });
    }
}

