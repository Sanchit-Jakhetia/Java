import java.util.*;

class GenericsExample2 {

    public static void main(String args[]) {

        Map<Integer, String> dataMap = new HashMap<Integer, String>();

        dataMap.put(3, "seema");
        dataMap.put(1, "hina");
        dataMap.put(4, "reena");
		
		// using dataMap.entrySet() 
      Set < Map.Entry < Integer, String >> s = dataMap.entrySet();
     Iterator < Map.Entry < Integer, String >> itr = s.iterator();
        
        while (itr.hasNext()) 
	{ 
	Map.Entry e = itr.next();

        System.out.println(e.getKey() + " " + e.getValue());

       }

    }
}