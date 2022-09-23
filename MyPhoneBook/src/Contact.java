public  class Contact  {
    public String   name;
    public String number;

    public String workNumber;


    public Contact(String name, String  number, String workNumber ) {
        this.name = name;
        this.number = number;
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }


    public String getNumber() {
        return number;
    }

    public void setName() {
        this.name = name;
    }

    public void setNumber() {
        this.number = number;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
}
