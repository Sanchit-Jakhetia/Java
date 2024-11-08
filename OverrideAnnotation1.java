class ParentClass {
    public void displayMsg(String msg) {
        System.out.println(msg);
    }
}

class SubClass extends ParentClass {
    @Override
    public void displayMsg(String msg) {
        System.out.println("Message is: " + msg);
    }
}

class OverrideAnnotation1 {
    public static void main(String arg[]) {
        SubClass obj = new SubClass();
        obj.displayMsg("Hello How are You");
    }
}