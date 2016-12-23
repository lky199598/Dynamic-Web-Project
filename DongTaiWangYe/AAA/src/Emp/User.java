package Emp;

public class User {
private short s;
private int i;
private long l;

private float f;
private double d;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(d);

	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + Float.floatToIntBits(f);
	result = prime * result + i;
	
	result = prime * result + (int) (l ^ (l >>> 32));
	result = prime * result + s;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
		return false;
	if (Float.floatToIntBits(f) != Float.floatToIntBits(other.f))
		return false;
	if (i != other.i)
		return false;
	if (l != other.l)
		return false;
	if (s != other.s)
		return false;
	return true;
}

public static void main(String[] args) {
	float f = 3.16f;
	double d = 36.88;
	System.out.println(Float.floatToIntBits(f));
	System.out.println(Double.doubleToLongBits(d));
}

}
