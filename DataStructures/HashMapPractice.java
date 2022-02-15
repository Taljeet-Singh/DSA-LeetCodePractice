package DataStructures;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        // hash map is a list of keys and values and different keys have different values
        
        // <key, value>
        // example: HashMap<key, value> fun = new HashMap<key, value>();
        HashMap<String, String> fun = new HashMap<String, String>();
        // fun.put(key, value);
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("helloKittyFan21", "AloeVera?");
        fun.put("coolguyswag", "password123");

        // There are more functions you can use with the fun hashmap, examples in comments below
        // fun.remove("helloKittyFan21");
        // fun.containsValue("password123"); - ouput: true. it would give it true since it has a value of password123 in one of its key
        // fun.containValue("password124") - ouput: false.
        // fun.containValue("coolguyswag") - ouput: false. False since it's not a value... it's a key
        // fun.containKey("coolguyswag") - ouput: true. True because there's a key that is stored as coolguyswag.
        // fun.size(); - ouput: 3
        // fun.replace("bobbyJoe1996", "betterP@ssword!") - lets says that a user bobbyJoe1996 wants to change  password from FluffyP0nies to betterP@ssword!, this is 
        // how he will do it and replace the value for that bobbyJoe1996 key

        System.out.println(fun);
        System.out.println(fun.keySet());
        System.out.println(fun.values());
        
    }
}



// Tutorial: https://www.youtube.com/watch?v=70qy6_gw1Hc&ab_channel=AlexLee