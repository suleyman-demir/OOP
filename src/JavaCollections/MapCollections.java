package JavaCollections;
import java.util.*;

public class MapCollections {
        public static void main(String[] args) {
            // Map oluşturma ve değer ekleme
            Map<String, String> map = new HashMap<>();
            map.put("A", "Elma");
            map.put("B", "Muz");
            map.put("C", "Kiraz");
            map.put("D", "Portakal");
            map.put("E", "Karpuz");

            // Map'teki tüm değerleri entrySet ile döngüyle yazdırma
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Anahtar: " + entry.getKey() + ", Değer: " + entry.getValue());
            }

            // keySet ve values kullanarak döngüyle yazdırma
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println("Anahtar: " + key + ", Değer: " + map.get(key));
            }

            // values kullanarak döngüyle yazdırma
            for (String value : map.values()) {
                System.out.println("Değer: " + value);
            }

            // Sık kullanılan Map metotları
            boolean containsKey = map.containsKey("A"); // Anahtarın olup olmadığını kontrol et
            boolean containsValue = map.containsValue("Elma"); // Değerin olup olmadığını kontrol et
            int size = map.size(); // Map'in boyutunu al
            boolean isEmpty = map.isEmpty(); // Map'in boş olup olmadığını kontrol et
            map.clear(); // Tüm öğeleri temizle
            map.put("A", "Elma");
            String valueOrDefault = map.getOrDefault("B", "Muz"); // Belirtilen anahtarla ilişkili değeri al veya varsayılan değeri döndür

            // Metotları yazdır
            System.out.println("containsKey(A): " + containsKey);
            System.out.println("containsValue(Elma): " + containsValue);
            System.out.println("Boyut: " + size);
            System.out.println("Boş mu: " + isEmpty);
            System.out.println("Varsayılan veya Değer: " + valueOrDefault);
        }
    }

