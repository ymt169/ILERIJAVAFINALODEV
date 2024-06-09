import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        // List Örneği
        List<String> list = new ArrayList<>();
        list.add("Elma");
        list.add("Armut");
        list.add("Kiraz");
        System.out.println("List: " + list);
        list.remove("Armut");
        System.out.println("List after removal: " + list);
        System.out.println("Contains 'Kiraz': " + list.contains("Kiraz"));

        // Set Örneği
        Set<String> set = new HashSet<>();
        set.add("Kedi");
        set.add("Köpek");
        set.add("Kuş");
        System.out.println("Set: " + set);
        set.remove("Köpek");
        System.out.println("Set after removal: " + set);
        System.out.println("Contains 'Kedi': " + set.contains("Kedi"));

        // Map Örneği
        Map<String, String> map = new HashMap<>();
        map.put("Türkiye", "Ankara");
        map.put("Fransa", "Paris");
        map.put("Almanya", "Berlin");
        System.out.println("Map: " + map);
        map.remove("Fransa");
        System.out.println("Map after removal: " + map);
        System.out.println("Contains key 'Türkiye': " + map.containsKey("Türkiye"));
        System.out.println("Value for key 'Almanya': " + map.get("Almanya"));

        // Map'in tüm anahtar-değer çiftlerini yazdırma
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
