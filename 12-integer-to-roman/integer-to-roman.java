class Solution {
    public String intToRoman(int num) {
        Map<String,Integer> m = new LinkedHashMap<>();
        StringBuilder sb= new StringBuilder();
        m.put("M",1000);
        m.put("CM",900);
        m.put("D",500);
        m.put("CD",400);
        m.put("C",100);
        m.put("XC",90);
        m.put("L",50);
        m.put("XL",40);
        m.put("X",10);
        m.put("IX",9);
        m.put("V",5);
        m.put("IV",4);
        m.put("I",1);

        for(Map.Entry<String,Integer> entry : m.entrySet()){
            while(num>=entry.getValue()){
                num-=entry.getValue();
                sb.append(entry.getKey());
            }
        }
return sb.toString();

    }
}