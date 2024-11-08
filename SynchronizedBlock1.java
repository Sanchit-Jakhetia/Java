class Table {      
    void displayTable(int n) {    
        synchronized(this) {  
            for (int i = 1; i <= 10; i++) {    
                System.out.println(n * i);    
                try {    
                    Thread.sleep(1000);    
                } catch (Exception e) {    
                    System.out.println(e);    
                }    
            }    
        }    
    }  
}    
    
class Thread1 extends Thread {    
    Table t;    
    Thread1(Table t) {    
        this.t = t;    
    }    
    public void run() {    
        t.displayTable(4);    
    }    
}    
    
class Thread2 extends Thread {    
    Table t;    
    Thread2(Table t) {    
        this.t = t;    
    }    
    public void run() {    
        t.displayTable(8);    
    }    
} 

class Thread3 extends Thread {    
    Table t;    
    Thread3(Table t) {    
        this.t = t;    
    }    
    public void run() {    
        t.displayTable(12);    
    }    
}

class Thread4 extends Thread {    
    Table t;    
    Thread4(Table t) {    
        this.t = t;    
    }    
    public void run() {    
        t.displayTable(24);    
    }    
}              
    
class SynchronizedBlock1 {    
    public static void main(String args[]) {    
        Table obj = new Table();   
        Thread1 t1 = new Thread1(obj);    
        Thread2 t2 = new Thread2(obj); 
        Thread3 t3 = new Thread3(obj); 
        Thread4 t4 = new Thread4(obj);      
        t1.start();    
        t2.start(); 
        t3.start(); 
        t4.start();  
    }    
}
