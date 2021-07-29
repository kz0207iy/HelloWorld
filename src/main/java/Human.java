class Human{
    public String firstName;
    public int age;
    public static int numberOfLegs = 2;

    public String lastName;
    public static int numberOfFingers = 10;
    public void  setFirstName(String fName){
        this.firstName = fName;
    }

    public  String getLastName(){
        return lastName;
    }
    public static void main (String[]args) {
        Human hm = new Human();

        hm.setFirstName("Mandir");
        System.out.println(hm.firstName);
    }
}

