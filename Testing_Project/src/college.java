public class college {
    String collegeName;
    String address;

    public college(String collegeName,String address){
        this.collegeName = collegeName;
        this.address = address;
    }
    public void displayCollegeInfo(){
        System.out.println("collegeName="+this.collegeName + "address="+this.address);
    }

    public static void main(String[] args) {
        college college1 = new college("JSS womens college","saraswathipuram,mysuru");
        college college2 = new college("Maharani college","ramaswamy circle,mysuru");
        college1.displayCollegeInfo();
        college2.displayCollegeInfo();

    }
}
