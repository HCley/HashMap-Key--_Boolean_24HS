import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class app{
    private static Boolean[] bool;
    private static Map<Boolean[], String> map;
    
    public static void main(String args[]){
        map = new HashMap<>();
        bool = new Boolean[5];
        Arrays.fill(bool, false);

        for(int i = 0; i < 24; i++){

            System.out.println("\nHora : " + i +
                               "\nPos 0: " + bool[0] +
                               "\nPos 1: " + bool[1] +
                               "\nPos 2: " + bool[2] +
                               "\nPos 3: " + bool[3] +
                               "\nPos 4: " + bool[4]);
             horarioRecursivo(bool);
            map.put(new Boolean[]  {bool[4],bool[3],bool[2],bool[1],bool[0]}, new String("Hora: "+ i));
        }
/*
        Arrays.fill(bool, false);
        bool[0] = true;
        
        System.out.println("\nPos 0: " + bool[0] +
                           "\nPos 1: " + bool[1] +
                           "\nPos 2: " + bool[2] +
                           "\nPos 3: " + bool[3] +
                           "\nPos 4: " + bool[4]);

        System.out.println(map.get(bool));

*/
        for(int i = 0; i < 24; i++){

            System.out.println(map.get(bool));
            horarioRecursivo(bool);
        }

    }

    private static Boolean[] horarioRecursivo(Boolean[] bool){ 
        return aux(bool, (byte) 0);}
    private static Boolean[] aux (Boolean[] bool, byte booleano){
        if(!bool[booleano]){
            
                if(bool[4] && booleano == 3){
                    bool[4] = false;
                    return bool;
                }
            
            bool[booleano] = true;
            return bool;
        }

        bool[booleano] = false;
        booleano++;
        return aux(bool, (byte) booleano);
    }

} // main_class_block