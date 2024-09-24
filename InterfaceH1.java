interface MountainParts {
    String TERRAIN = "off_road";
    void setSuspension(String a);
    String getSuspension();
    void setType(String b);
    String getType();
}
class MountainBike implements MountainParts {
    String suspension;
    String type;
    public String getSuspension() {
        return suspension;
    }
	public void setSuspension(String a) {
        suspension = a;
    }
    public String getType() {
        return type;
    }
	public void setType(String b) {
        type = b;
    }
    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        bike.setSuspension("hardtail");
        bike.setType("trail");
        System.out.println(bike.getSuspension());
        System.out.println(bike.getType());
    }
}
