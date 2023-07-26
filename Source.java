class Source {
    public static void main(String[] args) {
     Person p1 = new Person("kishan");
        // Write code here
        System.out.println(p1.getName());
   
    }
 }
 
 class Person {
    private String name;
    public Person(String name) {       
        this.name = name;
    }
 
    // Declare a getter method here
    public String getName(){
        return this.name;
    }
    
 }
 