import java.util.*;

public class Container {
        public static <list4> void main(String[] args) {
            String[] ar = new String[]{"un", "dos", "tres"};

            List<String> list1 = new LinkedList<>();
            List<String> list2 = new ArrayList<>();

            list1.add("Liceu");
            list1.add("Taula");
            list1.add("Ordinador");
            list1.add("Taula");
            list1.add("Screen");
            list2.add("Escola");

            int i1 = list1.indexOf("Taula");
            int i2 = i1 + 1 + list1.subList(i1+1, list1.size()).indexOf("Taula");

            System.out.println(i1);
            System.out.println(i2);

            list1.remove("Taula"); // pot ser un numero per eliminar un index, un valor d'una posicio
            System.out.println(list1.get(3));
            System.out.println(list1);

            //list1.set(0 , "ABC"); // TODO: Canvia el valor, el substitueix
            //String s = list1.remove(1);
            //System.out.println(list1.get(3));
            //System.out.println(list1);
            //System.out.println(s);

//           LinkedList<String> list3 = new LinkedList<>();
//           list3.addFirst("liceu");
//           list3.addFirst("escola");
//           list3.addLast("prova");
//           System.out.println(list3);

            LinkedList<String> cua = new LinkedList<>();
            cua.addLast("Bill");
            cua.addLast("Tom");
            cua.addLast("Jack");
            cua.addLast("Mary");
            cua.addLast("Brad");
            cua.addLast("John");

            Iterator<String> it = cua.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            for (String s: cua){ // Es lo mateix que es while
                System.out.println(s);
            }

            int[] ar10 = {56, 85, 8, 9, 0, 85};
            for (int i: ar10){
                System.out.println(i);
            }

//            cua.toArray(); // TODO: Crea un array de objectes a patir de una llista

//            while(!cua.isEmpty()){ // FIFO
//                String torn = cua.removeFirst();
//                System.out.println("Torn de " + torn);
//            }
//            while(!cua.isEmpty()){ // LIFO
//                String torn = cua.removeLast();
//                System.out.println("Torn de " + torn);
//            }
            String [] ar3 = {"dilluns", "dimarts", "dimecret", "dijous", "divendres", "disabte", "diumenge"};
            List<String> dies = Arrays.asList(ar3);

//            Object[] ar4 = cua.toArray();
//            System.out.println(ar4[1]);

            String[] ar4 = cua.toArray(new String[cua.size()]); // TODO: Indica que vols un array de String no d'objectes
            System.out.println(ar4[1]);

            Set<String> conjunt = new HashSet<>();
            conjunt.add("hola");
            conjunt.add("abc");
            conjunt.add("adeu");
            conjunt.add("dfg");
            conjunt.add("jdk");
            System.out.println(conjunt);


            for (String s: conjunt){
                System.out.println(s);
            }

            Collection<String> colConjunt = conjunt;
            Collection<String> colCua = cua;

            imprimeixCollection(colConjunt);
            imprimeixCollection(colCua);

            ListIterator<String> listIterator = cua.listIterator();
            System.out.println(listIterator.next());
            System.out.println(listIterator.next());
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previous());

            String str = "adc asd aer acr gte fee www ffd";
            String[] paraules = str.split(" ");
            Set<String> paraulesSet = new HashSet<>();
            for (String s: paraules){
                paraulesSet.add(s);
            }
            System.out.println(paraulesSet);

            Stack<String> pila = new Stack<>();
            pila.push("abc");
            pila.push("dfg");
            System.out.println(pila.peek());
         //  pila.push();TODO: afegueix adalt
         //  pila.pop();TODO: agafa d'adalt
         //  pila.peek();TODO: mira el de adalt sense agafar
        }
        static void imprimeixCollection(Collection<String> col) {
            Iterator<String> itconjunt = col.iterator();
            while(itconjunt.hasNext()){
                System.out.println(itconjunt.next());
            }
        }
}

