public class Professor {
    private String firstName;
    private String lastName;
    private int id;

    public static class Builder{
        private String firstName;
        private String lastName;
        private int id;

        public Builder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public Builder setId(int id){
            this.id=id;
            return this;
        }

        public Professor build(){
            return new Professor(firstName,lastName,id);
        }
    }

    public Professor(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
