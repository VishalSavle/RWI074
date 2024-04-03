class Static 
{  
    //non static method
void display()  
{  
System.out.println("A non-static function is called.");  
}  
    //static method
static void cube()  
{  
int x=7*7*7;  
System.out.println("Cube of 7 is: "+x);    
}  
     //main method
public static void main(String args[])  
{  
    Static obj = new Static();  
obj.display();  
   cube();    
}  
}

class mymain{
    void show(){
        System.out.println("This is non - static method");
    }
    static void display(){
        System.out.println("This is static method");
    }
    public static void main(String[] args) {
        mymain m=new mymain();
        m.show();
        m.display();
    }
}