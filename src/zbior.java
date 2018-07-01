import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class zbior {

    public static void main(String[] args) {
        TreeSet<Integer> zbiorLiczb = new TreeSet<>();

        Random random = new Random();
        int suma = 0;
        while (zbiorLiczb.size() < 50) {

            int liczba = random.nextInt(1000);
            zbiorLiczb.add(liczba);
            suma += liczba;
        }
        int srednia = suma / zbiorLiczb.size();
        System.out.println("liczby zbioru wiieksze od sredniej: ");
        Iterator<Integer> iterator = zbiorLiczb.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > srednia) {
                System.out.print(next + ", ");
            }

        }


        Integer first = zbiorLiczb.first();
        Integer last = zbiorLiczb.last();
        System.out.println("rozmiar zbioru : " + zbiorLiczb.size());
        System.out.println("najmniejsza liczba w zbiorze to : " + first);
        System.out.println("najwieksza liczba w zbiorze to : " + last);
        System.out.println("srednia : " + srednia);

//        System.out.println(zbiorLiczb.toString());
    }
}