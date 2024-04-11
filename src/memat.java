import java.util.*;
public class memat {
    public static void main(String[] args) {
        Queue<String> cua = new LinkedList<>();
        cua.add("adc");
        cua.add("efg");
        while (cua.size() > 0) {
            System.out.println(cua.poll());
        }
        PriorityQueue<Integer> cuaPrio = new PriorityQueue<>();
        cuaPrio.add(7);
        cuaPrio.add(3);
        cuaPrio.add(66);
        cuaPrio.add(947);
        cuaPrio.add(99);
        cuaPrio.add(1);
        while(cuaPrio.size() > 0){
            System.out.println(cuaPrio.poll());
        }

        PriorityQueue<String> cuaPrio2 = new PriorityQueue<>();
        cuaPrio2.add("Pere");
        cuaPrio2.add("Joan");
        cuaPrio2.add("Andreu");
        cuaPrio2.add("Toni");
        while (cuaPrio2.size() > 0){
            System.out.println(cuaPrio2.poll());
        }

        PriorityQueue<Person> cuaPrio3 = new PriorityQueue<>();
        cuaPrio3.add(new Person("jack", 1993, 178));
        cuaPrio3.add(new Person("Bill", 1975, 190));
        cuaPrio3.add(new Person("Tomeu", 2003, 165));
        while (!cuaPrio3.isEmpty()){
            System.out.println(cuaPrio3.poll());
        }


    }
    static void exemplesMaps() {
        Map<Person, Integer> nivells = new HashMap<>();
        Person p1 = new Person ("john", 1970);
        Person p2 = new Person("mary", 1999);
        Person p3 = new Person("Jack", 2001);
        nivells.put(p1, 500);
        nivells.put(p2, 1500);
        nivells.put(p3, 700);
        System.out.println(nivells);

        Map<Person, List<Integer>> notes = new HashMap<>();
        notes.put(p1, List.of(new Integer[]{5,5,5}));
        notes.put(p2, List.of(new Integer[]{5,5,5}));
        notes.put(p3, List.of(new Integer[]{5,5,5}));
        System.out.println(notes);

        Map<Person, List<Modul>> notes2 = new HashMap<>();
        Modul m1p1 = new Modul("Programació", 5);
        Modul m2p1 = new Modul("BD", 6);
        notes2.put(p1, List.of(m1p1, m2p1));
        Modul m1p2 = new Modul("FOL", 9);
        Modul m2p2 = new Modul("Entorns", 7);
        notes2.put(p2, List.of(m1p2, m2p2));
        System.out.println(notes2);

        Map<Person, Map<String, Integer>> notes3 = new HashMap<>();
        Map<String, Integer> notesP1 = new HashMap<>();
        notesP1.put("Programació", 5);
        notesP1.put("BD", 6);
        notesP1.put("Llenguatge", 7);
        notes3.put(p1, notesP1);
        Map<String, Integer> notesP2 = new HashMap<>();
        notesP2.put("Programació", 8);
        notesP2.put("BD", 6);
        notesP2.put("Llenguatge", 7);
        notes3.put(p2, notesP2);
        System.out.println(notes3);

        Map<String, Integer> notespDeP2 = notes3.get(p2);
        System.out.println(notespDeP2);

        Set<Person> persones =  notes3.keySet();
        System.out.println(persones);

        for (Person p: persones){
            System.out.println("Persona: " + p.toString());
            System.out.println("notes: " + notes3.get(p));
        }

        System.out.println(notes3.values());

//        Map<Person, int[]> notes = new HashMap<>();
//        notes.put(p1, new int[]{5,5,5});
//        notes.put(p2, new int[]{4,5,4});
//        notes.put(p3, new int[]{4,4,4});
//        System.out.println(notes);
    }


    static void exempleSet() {
        Person p1 = new Person ("john", 1970);
        Person p2 = new Person("mary", 1999);
        Person p3 = new Person("mary", 1999);
        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
class Modul {
    String nom;
    int nota;

    public Modul(String nom, int nota) {
        this.nom = nom;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modul modul = (Modul) o;
        return nota == modul.nota && Objects.equals(nom, modul.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nota);
    }

    @Override
    public String toString() {
        return "Modul{" +
                "nom='" + nom + '\'' +
                ", nota=" + nota +
                '}';
    }
}
class Person implements Comparable<Person>{
    String name;
    int birthYear;
    int height;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person(String name, int birthYear, int height) {
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }

    @Override
    public int compareTo(Person p) {
        if (p.birthYear == this.birthYear) return 0; // podem cambiar quin atribut compara
        if(this.birthYear < p.birthYear) return -1;
        return 1;
    }

}

