//    Question

// Group the passengers by age.for the given example

// (0-10,10-20,20-30,30-40,40-50,50+)

// Name            age
// John             5
// Doe              55
// Tim              41
// Max              19

// ===========  Code ============

import java.util.HashMap;
import java.util.Map.Entry;

class Question3{
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("john",5);
        hm.put("doe",55);
        hm.put("Tim",41);
        hm.put("Max",19);
        System.out.println("--------------------");

        System.out.println(hm);
        System.out.println("----------------------------------");
        for (Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue()<10 && entry.getValue()>0){
                System.out.println("the range is between 0 to 10");
                System.out.println(entry.getValue()+":"+entry.getKey()+"");
                System.out.println("----------------------------------");
            }

            if(entry.getValue()<=20 && entry.getValue()>10){
                System.out.println("the range is between 10 to 20");
                System.out.println(entry.getValue()+":"+entry.getKey()+"");
                System.out.println("----------------------------------");
            }

            if(entry.getValue()<=30 && entry.getValue()>40){
                System.out.println("the range is between 30 to 40");
                System.out.println(entry.getValue()+":"+entry.getKey()+"");
                System.out.println("----------------------------------");
            }

            if(entry.getValue()>40 && entry.getValue()<50){
                System.out.println("the range is between 40 to 50");
                System.out.println(entry.getValue()+":"+entry.getKey()+"");
                System.out.println("----------------------------------");
            }

            if(entry.getValue()>=50){
                System.out.println("the range is above 50");
                System.out.println(entry.getValue()+":"+entry.getKey()+"");
                System.out.println("----------------------------------");
            }
            
        }
        

    }
}



// -------------output-----------
// --------------------
// {Max=19, Tim=41, john=5, doe=55}
// ----------------------------------
// the range is between 10 to 20
// 19:Max
// ----------------------------------
// the range is between 40 to 50
// 41:Tim
// ----------------------------------
// the range is between 0 to 10
// 5:john
// ----------------------------------
// the range is above 50
// 55:doe
// ----------------------------------