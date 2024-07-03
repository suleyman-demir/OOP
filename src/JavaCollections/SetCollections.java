package JavaCollections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;


    class Ogrenci {
        private String isim;
        private int okulNumarasi;

        public Ogrenci(String isim, int okulNumarasi) {
            this.isim = isim;
            this.okulNumarasi = okulNumarasi;
        }

        public String getIsim() {
            return isim;
        }

        public int getOkulNumarasi() {
            return okulNumarasi;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ogrenci ogrenci = (Ogrenci) o;
            return okulNumarasi == ogrenci.okulNumarasi;
        }

        @Override
        public int hashCode() {
            return Objects.hash(okulNumarasi);
        }

        @Override
        public String toString() {
            return "Ogrenci{" +
                    "isim='" + isim + '\'' +
                    ", okulNumarasi=" + okulNumarasi +
                    '}';
        }
    }

        public class SetCollections {
        public static void main(String[] args) {

            Set<Ogrenci> ogrenciSet = new HashSet<>();

            ogrenciSet.add(new Ogrenci("Ali", 123));
            ogrenciSet.add(new Ogrenci("Veli", 456));
            ogrenciSet.add(new Ogrenci("Ayşe", 123));


            for (Ogrenci ogrenci : ogrenciSet) {
                System.out.println(ogrenci);
            }


            boolean containsElement = ogrenciSet.contains(new Ogrenci("Ali", 123));
            int size = ogrenciSet.size();
            boolean isEmpty = ogrenciSet.isEmpty();
            ogrenciSet.clear();
            ogrenciSet.add(new Ogrenci("Ahmet", 789));


            System.out.println("Ali 123 içeriyor mu: " + containsElement);
            System.out.println("Boyut: " + size);
            System.out.println("Boş mu: " + isEmpty);


            Iterator<Ogrenci> iterator = ogrenciSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }


