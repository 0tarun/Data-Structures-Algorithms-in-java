import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> Students = new HashMap<>();
        Students.put(101, "Tarun");
        Students.put(102, "Tanbir");
        Students.put(103, "Rashal");
        Students.put(104, "Arnob");
        Students.put(105, "Rakib");


        System.out.println(Students);
        System.out.println(Students.get(101));
        System.out.println(Students.size());
        for(Integer id:Students.keySet())
        {
            System.out.println(id+" "+Students.get(id));

        }

    }

}