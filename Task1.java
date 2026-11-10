public class Task1 {
    public static void main(String[] args) {
        Vector3D v1=new Vector3D(1,2,3,4,5,6);
        Vector3D v2=new Vector3D(1,1,1,3,3,3);
        System.out.println("Вектор 1: "+v1.toString());
        System.out.println("Вектор 2: "+v2.toString());
        Vector3D v3=v1.add(v2);
        System.out.println("Сумма: "+v3.toString());
        Vector3D v4=v1.multiply(2);
        System.out.println("Умножение на 2: "+v4.toString());
        System.out.println("Длина v1: "+v1.length());
        System.out.println("Скалярное произведение: "+v1.dotProduct(v2));
    }
}

class Vector3D {
    private double x1,y1,z1;
    private double x2,y2,z2;
    public Vector3D(double x1,double y1,double z1,double x2,double y2,double z2) {
        this.x1=x1; this.y1=y1; this.z1=z1;
        this.x2=x2; this.y2=y2; this.z2=z2;
    }
    public Vector3D add(Vector3D other) {
        return new Vector3D(x1,y1,z1,x2+other.x2,y2+other.y2,z2+other.z2);
    }
    public Vector3D multiply(double k) {
        return new Vector3D(x1,y1,z1,(x2-x1)*k+x1,(y2-y1)*k+y1,(z2-z1)*k+z1);
    }
    public double dotProduct(Vector3D other) {
        double dx1=x2-x1; double dy1=y2-y1; double dz1=z2-z1;
        double dx2=other.x2-other.x1; double dy2=other.y2-other.y1; double dz2=other.z2-other.z1;
        return dx1*dx2+dy1*dy2+dz1*dz2;
    }
    public double length() {
        double dx=x2-x1; double dy=y2-y1; double dz=z2-z1;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
    public String toString() {
        return "("+x1+","+y1+","+z1+") - ("+x2+","+y2+","+z2+")";
    }
}