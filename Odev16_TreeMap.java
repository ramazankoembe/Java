package odev16;

import java.util.TreeMap;

public class Odev16_TreeMap {
	


	public static void main(String[] args) {
       
        TreeMap<String, Integer> ogrenciNo = new TreeMap<>();

   
		ogrenciNo.put("Ali", 256);
        ogrenciNo.put("Ayse", 254);
        ogrenciNo.put("Aylin", 257);
        
        //ceillingEntry
        
       System.out.println(ogrenciNo.ceilingKey("Arzu"));
        
       //descendingKeySet
       
        System.out.println(ogrenciNo.descendingKeySet());
        
        //firstEnry
        
        System.out.println(ogrenciNo.firstEntry());
        
        //floorEntry
        System.out.println(ogrenciNo.floorEntry("Aylin"));

        //headMap(Key) kendinden oncekileri getiriyor.
        
        System.out.println(ogrenciNo.headMap("Ayse"));
        
      //headMap(Key,Boolean)
        
        System.out.println(ogrenciNo.headMap("Ali", true));
        
        //tailMap(Key) kendi ve sonrasindakileri getiriyor
        
        System.out.println(ogrenciNo.tailMap("Aylin"));
        
        //tailMap(key,Boolean)
        
        System.out.println(ogrenciNo.tailMap("Ali", true));

        //putIfAbsent()
        ogrenciNo.putIfAbsent("Kemal",257);
        System.out.println("TreeMap ogrenci numaralari: " + ogrenciNo);

        
    }
}



