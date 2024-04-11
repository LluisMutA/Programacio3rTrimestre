import java.util.*;

class Posicio {
    Integer x;
    Integer y;

    public Posicio(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}

public class ExercicisContainer {
    public static void main(String[] args) {

    }
        static void ex1 () {
            String s = "Hola això es una prova";
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    // El mapa ja conté el caracter i el que feim es sumar 1 més al comptador corresponent
                    int n = map.get(c);
                    map.put(c, n + 1);
                } else {
                    // El mapa no conté el caracter per tant guardem dins el mapa el numero 1 associat al caracter c
                    map.put(c, 1);
                }
            }
            System.out.println(map);
        }

        static void ex2() {
        String s = "Hola aixó és una prova Hola això és un exercici";
        String[] ar = s.split(" ");
        Set<String> set = new HashSet<>();
        for (String paraula : ar) {
            set.add(paraula);
        }
            System.out.println(set);
        }

        static void ex3(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quants de números de fibonnaci vols?");
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                if (i == 0){ list.add(1); continue;}
                if (i == 1){ list.add(1); continue;}
                int last = list.size()-1;
                list.add(list.get(last) + list.get(last-1));
            }
            System.out.println(list);
        }

        static void ex4() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quin número vols per treure els seus divisors?");
            int n = scanner.nextInt();
            List<Integer> divisors = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                }
                System.out.println(divisors);
            }
        }
        static void ex5() {
            Posicio p = new Posicio(1,5);
            List<Posicio> list = List.of(new Posicio(0, 0), new Posicio(1, 1), new Posicio(3, 5), new Posicio(-1, 0));
            Iterator<Posicio> iterator = list.iterator();
            Posicio propera = mesPropera(p, iterator);
            System.out.println(propera);
        }
        static Posicio mesPropera (Posicio ref, Iterator<Posicio> itPosicions){
            double min = 1_000_000_000;
            Posicio res = null;
            while(itPosicions.hasNext()) {
                Posicio p = itPosicions.next();
                double dist = calcDistancia(ref, p);
                if (dist < min){
                    min = dist;
                    res = p;
                }
            }
            return res;
        }

    private static double calcDistancia(Posicio ref, Posicio p) {
        double dx = ref.x - p.x;
        double dy = ref.y - p.y;
        return  Math.sqrt(dx*dx + dy*dy);
    }
}
