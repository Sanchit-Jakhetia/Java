interface Printable
{
void print();
}

interface Showable
{
void show();
}
interface M extends Printable,Showable
{ 
void display();
}


class MultiInher implements M
{
public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}

public void display(){System.out.println("How R U");}
public static void main(String args[])
{
MultiInher obj = new MultiInher();
obj.print();
obj.show();
obj.display();
}
}