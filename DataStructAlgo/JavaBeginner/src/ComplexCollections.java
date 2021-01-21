import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexCollections {

    private static String[] vehicles=new String[]{
            "ambulance","helicopter","lifeboat"
    };
    private static String[][] drivers=new String[][]{
            {"Bob","Joe","David"},
            {"Michale","Davies","Ryan","Bob"},
            {"David","Julia","Marry"}


    };
    public static void main(String[] args){
        Map<String, Set<String>> personnel=new HashMap<>();

        for(int i=0;i<vehicles.length;i++){
            String vehicle=vehicles[i];

            String[] driversList=drivers[i];
            Set<String> driverSet=new LinkedHashSet<>();
            for(String driver: driversList){
                driverSet.add(driver);
            }

            personnel.put(vehicle,driverSet);

        }
        {
            Set<String> driverSet = personnel.get("helicopter");
            for (String driver : driverSet) {
                System.out.println(driver);
            }
        }

        for(String vehicle:personnel.keySet()){
            Set<String> driverSet = personnel.get(vehicle);
            System.out.print(vehicle+" : ");
            for (String driver : driverSet) {
                System.out.print(driver+" ");
            }
            System.out.println();
        }


    }
}
