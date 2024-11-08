import java.util.Date;

class Bar {
	Bar() {
	}
	public void currentDate() {
		System.out.println("Now is: "+ new Date());
	}
}
class GenericObject<T> {

    private T tobject;

    public GenericObject(Class<T> tclass) throws InstantiationException, IllegalAccessException {
        this.tobject = (T) tclass.newInstance();
    }
	public T getTObject() {
        return this.tobject;
	}
}
class GenericObjectInitialization {

    public static void main(String[] args) throws Exception {

        GenericObject<Bar> go = new GenericObject<>(Bar.class);

        Bar bar = go.getTObject();

        bar.currentDate();
    }
}