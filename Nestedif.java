class Nestedif{
public static void main(String args[ ]java ){
String address="Solapur,India";

if (address.endwith("India")){

if(address.contains("Mumbai")){
System.out.println("your city is Mumbai");
}
else if(address.contains("Pune")){
System.out.println("your city is Pune");
}
else{
      System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("your not living in India");
}
}
}