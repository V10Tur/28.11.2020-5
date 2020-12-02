private String company;

public Employee(String name, String company) {

        super(name);
        this.company=company;
        }
@Override
public void display(){

        super.display();
        System.out.printf("Works in %s \n", company);
        }
        }
