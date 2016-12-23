package InitClass;

public class VarargType {
	
static void varCharacter(Character... args)
{
	for(Character c : args)
		System.out.print(c+" ");
	System.out.println();
}

static void varInt(int... args)
{
	for(int i :args)
		System.out.print(i+" ");
	System.out.println();
}
}
